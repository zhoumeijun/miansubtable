
package nccloud.development.testtable.mainentity.action;

import nc.bs.logging.Logger;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nccloud.development.testtable.mainentity.testtable.bean.BillOperatorParam;
import nccloud.development.testtable.mainentity.testtable.util.CommonUtil;

public class MainEntityUnCommitAssignAction
    extends AbstractUnCommitAssignAction<AggMainEntity> {

  @Override
  public Object doAction(IRequest request) {
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
  AggMainEntity[] operaVOs = this.queryBillsByPks(operaParam);
      CommonUtil.setBillsTs(operaParam.getPkMapTs(), operaVOs);
      Object resultVOs = this.unCommit(operaVOs);
      result = this.buildFontResult(operaParam, resultVOs);
    }
    catch (BusinessException ex) {
      Logger.error(ex.getMessage(), ex);
      ExceptionUtils.wrapException(ex);
    }
    return result;
  }

}
