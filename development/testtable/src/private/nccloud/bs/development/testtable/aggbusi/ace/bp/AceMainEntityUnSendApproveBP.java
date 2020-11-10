
package nccloud.bs.development.testtable.aggbusi.ace.bp;
import nc.vo.development.test02.AggMainEntity;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceMainEntityUnSendApproveBP {

        public AggMainEntity[] unSend(AggMainEntity[] clientBills,
                        AggMainEntity[] originBills) {
                // 把VO持久化到数据库中
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
