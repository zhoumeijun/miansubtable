
package nccloud.development.testtable.mainentity.action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.development.test02.MainEntity;
import nc.vo.development.test02.SubEntity;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.development.testtable.mainentity.testtable.bean.PageQueryInfo;
import nccloud.development.testtable.mainentity.testtable.util.CommonUtil;

/**
* 卡片查询（查询方案）操作
* @version  @since v3.5.6-1903
*/
public class MainEntityQueryCardAction implements ICommonAction {

@Override
public Object doAction(IRequest paramIRequest) {
PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
try {
// 查询数据
Collection<AggMainEntity> bills = this.queryBills(queryParam);


List<AggMainEntity> billsList = new ArrayList<>(bills);
if (!billsList.isEmpty()) {
for (AggMainEntity vo : billsList) {
if (vo.getChildren(SubEntity.class) == null) {
String con = "pk_m='" + vo.getParentVO().getPk_m() + "'";
Collection<SubEntity> result = new BaseDAO().retrieveByClause(SubEntity.class, con);
List<SubEntity> childs = new ArrayList<>(result);
if (!childs.isEmpty()) {
SubEntity[] childArray = new SubEntity[childs.size()];
childs.toArray(childArray);
vo.setChildren(SubEntity.class, childArray);
}
}
}
}
return this.transBillCard(queryParam, bills);
}
catch (BusinessException ex) {
// 处理异常信息
Logger.error(ex);
ExceptionUtils.wrapException(ex);
}
return null;
}

/**
* 获取查询参数
*
* @param paramIRequest
* @return
*/
private PageQueryInfo getQueryParam(IRequest paramIRequest) {
String strRead = paramIRequest.read();
PageQueryInfo queryParam =
JsonFactory.create().fromJson(strRead, PageQueryInfo.class);
return queryParam;
}

/**
* 查询业务数据
*
* @param queryParam
* @return
* @throws MetaDataException
*/
private Collection<AggMainEntity> queryBills(PageQueryInfo queryParam)
throws MetaDataException {
IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// 注意：业务提供查询方法（元数据查询默认查询到dr=1的数据了）
String wheresql =
"pk_m" + "='" + queryParam.getPk() + "'";
Collection<AggMainEntity> bills =
service.queryBillOfVOByCond(AggMainEntity.class, wheresql, true,
false);
return bills;
}

/**
* VO 转换
*
* @param queryParam
* @param bill
* @return
*/
private BillCard transBillCard(PageQueryInfo queryParam,
Collection<AggMainEntity> bills) {
if (bills == null) {
return null;
}
AggMainEntity bill = bills.toArray(new AggMainEntity[0])[0];
BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
return operator.toCard(bill);
}
}
