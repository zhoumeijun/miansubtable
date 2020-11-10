
package nccloud.impl.pub.ace;

import nccloud.bs.development.testtable.aggbusi.ace.bp.AceMainEntityApproveBP;
import nccloud.bs.development.testtable.aggbusi.ace.bp.AceMainEntityDeleteBP;
import nccloud.bs.development.testtable.aggbusi.ace.bp.AceMainEntityInsertBP;
import nccloud.bs.development.testtable.aggbusi.ace.bp.AceMainEntitySendApproveBP;
import nccloud.bs.development.testtable.aggbusi.ace.bp.AceMainEntityUnApproveBP;
import nccloud.bs.development.testtable.aggbusi.ace.bp.AceMainEntityUnSendApproveBP;
import nccloud.bs.development.testtable.aggbusi.ace.bp.AceMainEntityUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiMainEntityPubServiceImpl {
        // ����
        public AggMainEntity[] pubinsertBills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggMainEntity> transferTool = new BillTransferTool<AggMainEntity>(
                                                clientFullVOs);
                                // ����BP
                                AceMainEntityInsertBP action = new AceMainEntityInsertBP();
                                AggMainEntity[] retvos = action.insert(clientFullVOs);
                                // ���췵������
        //                      return transferTool.getBillForToClient(retvos);
                                return retvos;
                        }
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        // ɾ��
        public void pubdeleteBills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                        // ����BP
                        new AceMainEntityDeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggMainEntity[] pubupdateBills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggMainEntity> transferTool = new BillTransferTool<AggMainEntity>(
                                        clientFullVOs);
                        AceMainEntityUpdateBP bp = new AceMainEntityUpdateBP();
                        AggMainEntity[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggMainEntity[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggMainEntity[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggMainEntity> query = new BillLazyQuery<AggMainEntity>(
                                        AggMainEntity.class);
                        bills = query.query(queryScheme, null);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return bills;
        }

        /**
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggMainEntity[] pubsendapprovebills(
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggMainEntity> transferTool =
                new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntitySendApproveBP bp = new AceMainEntitySendApproveBP();
                AggMainEntity[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggMainEntity[] pubunsendapprovebills(
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntityUnSendApproveBP bp = new AceMainEntityUnSendApproveBP();
                AggMainEntity[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggMainEntity[] pubapprovebills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntityApproveBP bp = new AceMainEntityApproveBP();
                AggMainEntity[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggMainEntity[] pubunapprovebills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntityUnApproveBP bp = new AceMainEntityUnApproveBP();
                AggMainEntity[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}