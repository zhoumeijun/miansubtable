
package nccloud.development.testtable.mainentity.action;

import java.util.Collection;

import nc.bs.logging.Logger;
import nccloud.vo.development.testtable.MainEntityConst;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.development.test02.MainEntity;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nccloud.development.testtable.mainentity.testtable.util.CommonUtil;

/**
 * ���ӱ���
 * @version  @since v3.5.6-1903
 */
public class MainEntitySaveAction implements ICommonAction {

  @Override
  public Object doAction(IRequest paramIRequest) {
    try {
      BillCardOperator billCardOperator = new BillCardOperator();
      // 1����ȡAGGVO ��requestת������VO��
AggMainEntity vo = billCardOperator.toBill(paramIRequest);
      this.doBefore(vo);
      // 2�����õ��ݵı��涯���ű���savebase�����õ��������
AggMainEntity rtnObj = this.callActionScript(vo);
      // 3�������ؽ�����������ܣ�����ģ��ת��ǰ��BillCard�����շ��룬��ʾ��ʽ����
      Object billcard = billCardOperator.toCard(rtnObj);
      // 4�����ؽ����ǰ��
      return billcard;
    }
    catch (BusinessException ex) {
      // �����쳣��Ϣ
      Logger.error(ex);
      ExceptionUtils.wrapException(ex);
    }
    return null;
  }

  /**
   * ��������
   *
   * @return
   */
  protected String getActionCode() {
    return MainEntityConst.CONST_ACTION_SAVEBASE;
  }

  /**
   * ���ö����ű�
   *
   * @param actionCode
   * @param aggVOs
   * @return
   * @throws BusinessException
   */
  private AggMainEntity callActionScript(AggMainEntity... aggVOs)
      throws BusinessException {

    String actionCode = this.getActionCode();
    String billType = MainEntityConst.CONST_BILLTYPE_COST;

    CloudPFlowContext context = new CloudPFlowContext();
    context.setActionName(actionCode);
    context.setBillType(billType);
    context.setBillVos(aggVOs);
    Logger.debug("��ʼ���ö����ű� ActionName[" + actionCode + "] BillType[" + billType
        + "]...");

    ICloudScriptPFlowService service =
        CommonUtil.getCloudScriptPFlowService();

    Object[] result = service.exeScriptPFlow(context);

    Logger.debug("���ö����ű� ActionName[" + actionCode + "] BillType[" + billType
        + "]����");

    String wheresql =
        "pk_m" + "='"
            + ((AggMainEntity) result[0]).getPrimaryKey() + "'";
    Collection<AggMainEntity> bills =
        CommonUtil.getMDPersistenceQueryService().queryBillOfVOByCond(
            AggMainEntity.class, wheresql, true, false);
    return bills.toArray(new AggMainEntity[0])[0];
  }

  /**
   * �ж��������޸�
   *
   * @param vo
   */
  private void doBefore(AggMainEntity vo) {
    String parentPk = vo.getPrimaryKey();
    // �����Ƿ���������Ϣ�ж����������滹���޸ı���
    if ((parentPk != null) && !"".equals(parentPk)) {
      // ���õ���Ĭ��ֵ
      CircularlyAccessibleValueObject[] allchildren = vo.getAllChildrenVO();
      if (allchildren != null) {
        for (CircularlyAccessibleValueObject obj : allchildren) {
          obj.setAttributeValue("pk_m", parentPk);
        }
      }
    }
  }
}
