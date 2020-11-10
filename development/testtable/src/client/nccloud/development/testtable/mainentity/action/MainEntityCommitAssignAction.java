
package nccloud.development.testtable.mainentity.action;


import nc.bs.logging.Logger;
import nc.vo.development.test02.AggMainEntity;
import nccloud.vo.development.testtable.MainEntityConst;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nccloud.development.testtable.mainentity.testtable.bean.BillOperatorParam;
import nccloud.development.testtable.mainentity.testtable.util.CommonUtil;

public class MainEntityCommitAssignAction
    extends AbstractCommitAssignAction<AggMainEntity> {

    @Override
    public Object doAction(IRequest request) {
    // ��ȡǰ���������
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
    // ����pk��ѯ����������
    AggMainEntity[] operaVOs = this.queryBillsByPks(operaParam);
    // ts��ֵ
    CommonUtil.setBillsTs(operaParam.getPkMapTs(), operaVOs);
    // �Բ�ѯ���ִ�о���ҵ����
    Object resultVOs = this.doCommit(operaVOs, operaParam.getUserObj(),
    MainEntityConst.CONST_BILLTYPE_COST);
    // ��Ƭҳ����Ҫ���ز���������ݵ�ǰ�ˣ��б���������ǰ�����µ����б��ѯ�������践�ز��������ݣ����Դ˴����տ�Ƭ�����ؽ��
    if (operaVOs.length < 2) {
    result = this.buildFontResult(operaParam, resultVOs);
    }
    else {
    result = resultVOs;
    }
    }
    catch (BusinessException ex) {
    Logger.error(ex.getMessage(), ex);
    ExceptionUtils.wrapException(ex);
    }
    return result;
    }

    }