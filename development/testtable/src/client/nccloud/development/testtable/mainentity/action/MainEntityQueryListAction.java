
package nccloud.development.testtable.mainentity.action;

import java.util.ArrayList;
import java.util.List;

import nc.bs.logging.Logger;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nccloud.framework.web.ui.model.PageInfo;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.pub.Constructor;
import nccloud.base.exception.ExceptionUtils;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.querytemplet.QueryUtil4NCC;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nccloud.development.testtable.mainentity.testtable.bean.PageQueryVO;
import nccloud.development.testtable.mainentity.testtable.util.CommonUtil;

/**
 * �б��ѯ����ѯ����������
 * @version  @since v3.5.6-1903
 */
public class MainEntityQueryListAction implements ICommonAction {

  @Override
  public Object doAction(IRequest paramIRequest) {
    PageQueryVO page = null;
    QueryTreeFormatVO queryParam = this.getQueryParam(paramIRequest);
    try {

      // 1�� ��ȡscheme
      IQueryScheme scheme = this.getScheme(queryParam);
      // 2�����÷���,��ȡVO��Ϣ(ƽ̨Ĭ�����ɷ�������Ч�����⣬���ʵ��Ҫ�ĵ�)
      AggMainEntity[] aggvos =
          CommonUtil.getFinancingcostMaintainService().query(scheme);
      // ��ѯ����(scheme);
      if ((aggvos != null) && (aggvos.length > 0)) {
        // 3�������ҳ
        String[] pks = this.getPks(aggvos);
        AggMainEntity[] bills =
            this.getDefaulePageBill(queryParam, aggvos);
        page = new PageQueryVO(pks, bills);
      }
      else {
        page = this.createNullPage();
      }
      // 4��ת��grid��Ϣ������ǰ��
      return this.transPageInfoToGrid(page, queryParam,
          queryParam.getPageCode());
    }
    catch (BusinessException ex) {
      // �����쳣��Ϣ
      Logger.error(ex);
      ExceptionUtils.wrapException(ex);
    }
    return null;
  }

  /**
   * ת��Grid��Ϣ
   *
   * @param pagevo
   * @param pageSize
   * @param pagecode
   * @return
   */
  private Grid covert(PageQueryVO pagevo, int pageSize, String pagecode) {
    AggMainEntity[] bills =
        (AggMainEntity[]) pagevo.getCurrentPageBills();

    Grid grid = null;
    if (bills != null) {
      int size = bills.length > pageSize ? pageSize : bills.length;
      Object[] heads = new Object[size];

      for (int i = 0; i < size; i++) {
        heads[i] = bills[i].getParent();
      }
      GridOperator operator = new GridOperator(pagecode);
      grid = operator.toGrid(heads);
      grid.getModel().setAllpks(pagevo.getPks());
    }
    return grid;
  }

  /**
   * ������ҳ����Ϣ
   *
   * @return
   */
  private PageQueryVO createNullPage() {
    String[] ids = new String[0];
    AggMainEntity[] bills =
        Constructor.construct(AggMainEntity.class, 0);
    PageQueryVO page = new PageQueryVO(ids, bills);
    return page;
  }

  /**
   * ����Ĭ��ҳ��
   *
   * @param info
   * @param aggvos
   * @return
   */
  private AggMainEntity[] getDefaulePageBill(QueryTreeFormatVO info,
      AggMainEntity... aggvos) {
    String pageSizeStr = info.getPageInfo().getPageSize();
    int pageSize = 10;
    if ((pageSizeStr != null) && (pageSizeStr.length() > 0)) {
      pageSize = Integer.parseInt(pageSizeStr);
    }
    info.getPageInfo().setPageIndex("0");
    List<AggMainEntity> billLst = new ArrayList<AggMainEntity>();
    for (int i = 0; (i < aggvos.length) && (i < pageSize); i++) {
      AggMainEntity bill = new AggMainEntity();

      bill.setParent(aggvos[i].getParent());
      billLst.add(bill);
    }
    return billLst.toArray(new AggMainEntity[0]);
  }

  /**
   * ��ȡ������Ϣ
   *
   * @param aggvos
   * @return
   */
  private String[] getPks(AggMainEntity... aggvos) {
    List<String> pks = new ArrayList<String>();
    for (AggMainEntity bill : aggvos) {
      pks.add(bill.getPrimaryKey());
    }
    return pks.toArray(new String[0]);
  }

  /**
   * ��ȡ��ѯ����
   *
   * @param paramIRequest
   * @return
   */
  private QueryTreeFormatVO getQueryParam(IRequest paramIRequest) {
    String strRead = paramIRequest.read();
    QueryTreeFormatVO queryParam =
        JsonFactory.create().fromJson(strRead, QueryTreeFormatVO.class);
    return queryParam;
  }

  /**
   * ��ȡ��ѯ����
   *
   * @param queryParam
   * @return
   */
  private IQueryScheme getScheme(QueryTreeFormatVO queryParam) {
    QueryUtil4NCC queryutil = new QueryUtil4NCC(queryParam);
    IQueryScheme scheme = queryutil.convertCondition();
    return scheme;
  }

  /**
   * ��ҳ��
   *
   * @param pageInfo
   * @param length
   * @return
   */
  private int getTotalPage(nccloud.framework.web.ui.model.PageInfo pageInfo,
      int length) {
    int size = pageInfo.getPageSize();
    int total = 0;
    if ((length % size) == 0) {
      total = length / size;
    }
    else {
      total = (length / size) + 1;
    }
    return total;
  }

  /**
   * ҳ������
   *
   * @param retObj
   * @param pagevo
   * @param pageSize
   * @param pageIndex
   * @return
   */
    private void pageSet(Grid grid, PageQueryVO pagevo, int pageSize,
    int pageIndex) {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setTotal(pagevo.getPks().length);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageIndex(pageIndex);
        pageInfo.setTotalPage(this.getTotalPage(pageInfo, pagevo.getPks().length));

        grid.getModel().setPageinfo(pageInfo);
    }

  /**
   * page��Ϣתǰ����Ҫ��gridģ��
   *
   * @param pagevo
   * @param info
   * @param pagecode
   * @return
   */
  private Object transPageInfoToGrid(PageQueryVO pagevo,
      QueryTreeFormatVO info, String pagecode) {
        Grid grid = null;
    int pageSize = Integer.parseInt(info.getPageInfo().getPageSize());
    int pageIndex = Integer.parseInt(info.getPageInfo().getPageIndex());
    if (pagevo != null) {
      if (pagevo.getCurrentPageBills().length == 0) {
        return null;
      }
      grid = this.covert(pagevo, pageSize, pagecode);

      this.pageSet(grid, pagevo, pageSize, pageIndex);
    }
    return grid;
  }
}
