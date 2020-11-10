
package nccloud.development.testtable.mainentity.action;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import nc.bs.logging.Logger;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.development.test02.AggMainEntity;
import nccloud.vo.development.testtable.MainEntityConst;
import nc.vo.pf.pub.util.SQLUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.uap.pf.PfProcessBatchRetObject;
import nccloud.base.exception.ExceptionUtils;
import nccloud.framework.core.json.IJson;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nccloud.development.testtable.mainentity.testtable.bean.BillOperatorParam;
import nccloud.development.testtable.mainentity.testtable.util.CommonUtil;
import nccloud.web.workflow.approve.util.NCCFlowUtils;

public abstract class AbstractUnCommitAssignAction<T extends AbstractBill>
        implements ICommonAction {

  public Object callAutoUnApproveActionScript(AggMainEntity[] commitVOs,
                                              String billType) throws BusinessException {

    Map<Object, Object> extParam = new HashMap<Object, Object>();
    extParam.put("IS_RELOADBILL", true);

    // �����ջؼ�����ӿ�
    CloudPFlowContext context = new CloudPFlowContext();
    context.seteParam(extParam);
    context.setActionName("UNSAVEBILL");
    context.setBillType(billType);
    context.setBillVos(commitVOs);

    Logger.debug("��ʼ���ö����ű� ActionName[" + "UNSAVEBILL" + "] BillType["
            + billType + "]...");
    ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();
    // �ջؼ�����
    Object[] result = service.exeScriptPFlow_UnSaveNoFlowBatch(context);

    if ((result == null) || (result.length == 0) || (result[0] == null)) {
      return null;
    }
    // �����ؽ��
    if (result[0] instanceof PfProcessBatchRetObject) {
      PfProcessBatchRetObject batchRetObject =
              (PfProcessBatchRetObject) result[0];
      String errMsg = batchRetObject.getExceptionMsg();
      // û���쳣��Ϣ�����ִ�гɹ�
      if ((errMsg != null) && !"".equals(errMsg)) {
        ExceptionUtils.wrapBusinessException(errMsg);
      }
      return batchRetObject.getRetObj();
    }
    Logger.debug(
            "���ö����ű� ActionName[" + "UNSAVEBILL" + "] BillType[" + billType + "]����");
    return result;
  }

  protected Object buildFontResult(BillOperatorParam operaParam,
                                   Object result) {
    AbstractBill[] resultVOs = (AbstractBill[]) result;
    if (resultVOs.length == 1) {
      BillCardOperator billCardOperator =
              new BillCardOperator(operaParam.getPageCode());
      BillCard card = billCardOperator.toCard(resultVOs[0]);
      return card;
    }
    return null;
  }

  protected Object callActionScript(AggMainEntity[] commitVOs,
                                    String billType) throws BusinessException {

    CloudPFlowContext context = new CloudPFlowContext();
    context.setActionName("UNSAVEBILL");
    context.setBillType(billType);
    context.setBillVos(commitVOs);

    Logger.debug("��ʼ���ö����ű� ActionName[" + "UNSAVEBILL" + "] BillType["
            + billType + "]...");
    ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();
    Object[] result = service.exeScriptPFlow(context);
    if ((result == null) || (result.length == 0) || (result[0] == null)) {
      return null;
    }

    if (result[0] instanceof PfProcessBatchRetObject) {
      PfProcessBatchRetObject batchRetObject =
              (PfProcessBatchRetObject) result[0];
      String errMsg = batchRetObject.getExceptionMsg();
      if ((errMsg != null) && !"".equals(errMsg)) {
        ExceptionUtils.wrapBusinessException(errMsg);
      }
      return batchRetObject.getRetObj();
    }

    Logger.debug(
            "���ö����ű� ActionName[" + "UNSAVEBILL" + "] BillType[" + billType + "]����");
    return result;
  }

  /**
   * ��ȡǰ���������
   *
   * @param request
   * @return
   */
  protected BillOperatorParam getRequestParam(IRequest request) {
    // ����request
    String str = request.read();
    IJson json = JsonFactory.create();
    BillOperatorParam operaParam = json.fromJson(str, BillOperatorParam.class);
    return operaParam;
  }

  protected AggMainEntity[] queryBillsByPks(BillOperatorParam operaParam)
          throws BusinessException {
    AggMainEntity[] vos = null;
    String[] pks = operaParam.getPks();
    if (pks.length != 0) {
      // ���ݲ�����ѯ���
      IMDPersistenceQueryService service =
              CommonUtil.getMDPersistenceQueryService();
      String wheresql = SQLUtil
              .buildSqlForIn(MainEntityConst.CONST_PARENT_PRIMARYKEY, pks);
      Collection<AggMainEntity> bills = service.queryBillOfVOByCond(
              AggMainEntity.class, wheresql, true, false);
      if ((bills == null) || (bills.size() != pks.length)) {
        ExceptionUtils.wrapBusinessException("�����ѱ��޸ģ���ˢ��ҳ�������");
      }
      vos = bills.toArray(new AggMainEntity[0]);
    }
    return vos;
  }

  protected Object unCommit(AggMainEntity[] commitVOs)
          throws BusinessException {
    Object result = null;
    // �ж��Ƿ���������
    boolean hasFlow = NCCFlowUtils.hasApproveflowDef(
            MainEntityConst.CONST_BILLTYPE_COST, commitVOs[0]);
    for (AggMainEntity vo : commitVOs) {
      Integer vbillstatus = (Integer) vo.getParent()
              .getAttributeValue(MainEntityConst.CONST_BILL_STATUS);
      if (hasFlow && (vbillstatus == BillStatusEnum.APPROVED.toIntValue())) {
        ExceptionUtils.wrapBusinessException("�˵�����������������ȥ�������� ȡ���������߲��غ��ٽ��в���");
      }
    }
    // �У������ύ�����ű�
    if (hasFlow) {
      result = this.callActionScript(commitVOs,
              MainEntityConst.CONST_BILLTYPE_COST);
    }
    // û�У����ջؼ�����
    else {
      result = this.callAutoUnApproveActionScript(commitVOs,
              MainEntityConst.CONST_BILLTYPE_COST);
    }
    return result;
  }

}
