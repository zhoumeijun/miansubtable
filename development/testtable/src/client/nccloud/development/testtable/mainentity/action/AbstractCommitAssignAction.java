
package nccloud.development.testtable.mainentity.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.vo.development.test02.AggMainEntity;


import nc.bs.logging.Logger;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nccloud.vo.development.testtable.MainEntityConst;
import nc.vo.pf.change.PfUtilBaseTools;
import nc.vo.pf.pub.util.SQLUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.CarrierRuntimeException;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.uap.pf.PfProcessBatchRetObject;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.core.json.IJson;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nccloud.development.testtable.mainentity.testtable.bean.BillOperatorParam;
import nccloud.development.testtable.mainentity.testtable.bean.CommitReturnInfo;
import nccloud.development.testtable.mainentity.testtable.bean.MultipleResult;
import nccloud.development.testtable.mainentity.testtable.bean.SingleResult;
import nccloud.development.testtable.mainentity.testtable.util.CommonUtil;
import nccloud.web.workflow.approve.util.NCCFlowUtils;

public abstract class AbstractCommitAssignAction<T extends AbstractBill>
        implements ICommonAction {

  /**
   * ���쳣�л�ȡ������Ϣ���쳣���ܰ��˺ܶ�㣬��Ҫһֱ�����Ҿ��������Ϣ
   *
   * @param e
   * @return
   */
  public String getExceptionMsg(Throwable e) {
    String errMsg = (e.getMessage() == null ? "" : e.getMessage());
    if ("".equals(errMsg)) {
      if (e instanceof BusinessException) {
        return "";
      }
      else if (e instanceof CarrierRuntimeException) {
        return e.getMessage();
      }
      else {
        if (e.getCause() != null) {
          return this.getExceptionMsg(e.getCause());
        }
        return "";
      }
    }
    return errMsg;
  }

  protected Object buildFontResult(BillOperatorParam operaParam,
                                   Object result) {
    // ָ�ɴ���
    if (result instanceof CommitReturnInfo) {
      CommitReturnInfo returnvo = (CommitReturnInfo) result;
      return returnvo.getReturnMsg();
    }
    AbstractBill[] resultVOs = (AbstractBill[]) result;
    resultVOs = (T[]) result;
    if (resultVOs.length == 1) {
      BillCardOperator billCardOperator =
              new BillCardOperator(operaParam.getPageCode());
      BillCard card = billCardOperator.toCard(resultVOs[0]);
      return card;
    }
    return null;
  }

  protected Object callActionScript(T[] aggVOs, Object content, String billType)
          throws BusinessException {

    CloudPFlowContext context = new CloudPFlowContext();
    context.setActionName("SAVE");
    context.setBillType(billType);
    context.setBillVos(aggVOs);
    // ָ����Ϣ��Ϊ�գ������ָ����Ϣ
    if (content != null) {
      Map<Object, Object> contentParam = new HashMap<>();
      contentParam.put("content", content);
      context.seteParam(contentParam);
    }

    Logger.debug(
            "��ʼ���ö����ű� ActionName[" + "SAVE" + "] BillType[" + billType + "]...");
    ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();
    Object[] result = service.exeScriptPFlow(context);

    if ((result == null) || (result.length == 0) || (result[0] == null)) {
      return null;
    }

    // begin ���ύָ�ɹ���
    if (result[0] instanceof Map) {
      Map map = (Map) result[0];
      String type = String.valueOf(map.get(PfUtilBaseTools.PARAM_WORKFLOWTYPE));
      if (PfUtilBaseTools.PARAM_APPROVEFLOW.equals(type)
              || PfUtilBaseTools.PARAM_WORKFLOW.equals(type)) {
        CommitReturnInfo returnInfo = new CommitReturnInfo();
        returnInfo.setReturnMsg(map);
        returnInfo.setAssignFlag(true);
        return returnInfo;
      }
    }
    // end ���ύָ�ɹ���

    // ���ύ�쳣
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
            "���ö����ű� ActionName[" + "SAVE" + "] BillType[" + billType + "]����");
    return result;
  }

  /**
   * �ύ������
   *
   * @param aggVO
   * @return
   * @throws BusinessException
   */
  protected Object callAutoApproveActionScript(T[] aggVOs, String billType)
          throws BusinessException {

    Map<Object, Object> extParam = new HashMap<Object, Object>();
    extParam.put("IS_RELOADBILL", true);

    // �����ύ�������ӿ�
    CloudPFlowContext context = new CloudPFlowContext();
    context.seteParam(extParam);
    context.setActionName("SAVE");
    context.setBillType(billType);
    context.setBillVos(aggVOs);

    Logger.debug(
            "��ʼ���ö����ű� ActionName[" + "SAVE" + "] BillType[" + billType + "]...");
    ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();
    Object[] result = service.exeScriptPFlow_CommitNoFlowBatch(context);

    if ((result == null) || (result.length == 0) || (result[0] == null)) {
      return null;
    }
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
            "���ö����ű� ActionName[" + "SAVE" + "] BillType[" + billType + "]����");
    return result;
  }

  /**
   * ���ύָ�ɴ���
   *
   * @param commitVOs
   * @param userobj ָ����Ϣ
   * @return
   * @throws BusinessException
   */
  protected Object commit(T vo, Object userobj, String billType)
          throws BusinessException {
    Object result = null;
    // �ж��Ƿ���������
    boolean hasFlow = NCCFlowUtils.hasApproveflowDef(billType, vo);
    // �У������ύ�����ű�
    if (hasFlow) {
      result = this.callActionScript((T[]) new AbstractBill[] {
              vo
      }, userobj, billType);
    }
    // û�У����ύ������
    else {
      result = this.callAutoApproveActionScript((T[]) new AbstractBill[] {
              vo
      }, billType);
    }
    return result;
  }

  /**
   * �������������ύ
   *
   * @param vos
   * @return
   * @throws BusinessException
   */
  protected MultipleResult doBatchService(T[] aggVOs, Object userobj,
                                          String billType) throws BusinessException {
    // ��������
    int total = aggVOs.length;
    // ʧ������
    int errorNum = 0;
    // �ɹ�����
    int successNum = 0;
    // �Ƿ��д���ɹ�
    boolean hasSuccFlag = false;
    // �Ƿ��д���ʧ��
    boolean hasErrFlag = false;
    // �ύָ�ɸ���
    int assignNum = 0;
    // ���ʴ���ɹ����ؽ��
    Object result;
    // ��������
    List<String> errMsgDetail = new ArrayList<String>();
    // ����������
    List<SingleResult> resultList = new ArrayList<>();
    // �����ջ�
    for (T vo : aggVOs) {
      // ���ʴ�����
      SingleResult singleResult;

      try {
        // �����к����ύָ�ɵĵ����ݲ�֧������
        if (assignNum > 0) {
          break;
        }
        // ִ��ҵ�����
        result = this.commit(vo, userobj, billType);
        // �ж��Ƿ��Ǵ���ָ�ɹ���
        if (result instanceof CommitReturnInfo) {
          CommitReturnInfo returnInfo = (CommitReturnInfo) result;
          if (returnInfo.getAssignFlag() == true) {
            assignNum++;
            break;
          }
        }
        // �����ɹ����
        singleResult = SingleResult.buildSuccessResult(vo.getPrimaryKey(), null,
                null, null);
        // �����ɹ��Ľ��
        hasSuccFlag = true;
        // �ɹ�����+1
        successNum++;
      }
      catch (Exception e) {
        // ��ʧ��
        hasErrFlag = true;
        // ʧ������+1
        errorNum++;
        // ��ȡ�쳣��Ϣ
        String errMess = this.getExceptionMsg(e);
        errMsgDetail.add(errMess);
        Logger.error(e.getMessage(), e);
        // ����ʧ�ܽ��
        singleResult = SingleResult.buildErrResult(vo.getPrimaryKey(), null,
                null, errMess);
      }
      // ���ܴ�����
      resultList.add(singleResult);
    }
    // �����к����ύָ�ɵĵ����ݲ�֧������
    if (assignNum > 0) {
      throw new BusinessException(
              "���������к����ύָ�ɵĵ��ݣ���֧������������������ѡ���������ݲ���");/*@res ���������к����ύָ�ɵĵ��ݣ���֧������������������ѡ���������ݲ���  */
    }
    // ���������������
    MultipleResult multipleResult = MultipleResult.buildResult(hasSuccFlag,
            hasErrFlag, resultList, errMsgDetail, total, errorNum, successNum);
    return multipleResult;
  }

  /**
   * �����ύָ�ɴ���
   *
   * @param commitVOs
   * @param userobj ָ����Ϣ
   * @return
   * @throws BusinessException
   */

  protected Object doCommit(T[] commitVOs, Object userobj, String billType)
          throws BusinessException {
    Object result = null;
    if ((commitVOs == null) || (commitVOs.length == 0)) {
      return commitVOs;
    }
    if (commitVOs.length < 2) {
      result = this.commit(commitVOs[0], userobj, billType);
    }
    else {
      return this.doBatchService(commitVOs, userobj, billType);
    }
    return result;
  }

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

}
