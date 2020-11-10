
package nccloud.bs.development.testtable.aggbusi.ace.bp;
import nc.vo.development.test02.AggMainEntity;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AceMainEntityUnSendApproveBP {

        public AggMainEntity[] unSend(AggMainEntity[] clientBills,
                        AggMainEntity[] originBills) {
                // ��VO�־û������ݿ���
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggMainEntity> update = new BillUpdate<AggMainEntity>();
                AggMainEntity[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggMainEntity[] clientBills) {
                for (AggMainEntity clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
