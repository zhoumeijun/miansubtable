
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
        // 新增
        public AggMainEntity[] pubinsertBills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggMainEntity> transferTool = new BillTransferTool<AggMainEntity>(
                                                clientFullVOs);
                                // 调用BP
                                AceMainEntityInsertBP action = new AceMainEntityInsertBP();
                                AggMainEntity[] retvos = action.insert(clientFullVOs);
                                // 构造返回数据
        //                      return transferTool.getBillForToClient(retvos);
                                return retvos;
                        }
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        // 删除
        public void pubdeleteBills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                        // 调用BP
                        new AceMainEntityDeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggMainEntity[] pubupdateBills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggMainEntity> transferTool = new BillTransferTool<AggMainEntity>(
                                        clientFullVOs);
                        AceMainEntityUpdateBP bp = new AceMainEntityUpdateBP();
                        AggMainEntity[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
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
         * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // 查询之前对queryScheme进行加工，加入自己的逻辑
        }

        // 提交
        public AggMainEntity[] pubsendapprovebills(
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggMainEntity> transferTool =
                new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntitySendApproveBP bp = new AceMainEntitySendApproveBP();
                AggMainEntity[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggMainEntity[] pubunsendapprovebills(
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntityUnSendApproveBP bp = new AceMainEntityUnSendApproveBP();
                AggMainEntity[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggMainEntity[] pubapprovebills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntityApproveBP bp = new AceMainEntityApproveBP();
                AggMainEntity[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggMainEntity[] pubunapprovebills(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggMainEntity> transferTool =
                        new BillTransferTool<AggMainEntity>(clientFullVOs);
                AceMainEntityUnApproveBP bp = new AceMainEntityUnApproveBP();
                AggMainEntity[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}