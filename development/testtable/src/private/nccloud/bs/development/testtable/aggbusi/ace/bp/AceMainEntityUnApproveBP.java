
package nccloud.bs.development.testtable.aggbusi.ace.bp;
import nc.vo.development.test02.AggMainEntity;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceMainEntityUnApproveBP {

        public AggMainEntity[] unApprove(AggMainEntity[] clientBills,
                        AggMainEntity[] originBills) {
                for (AggMainEntity clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggMainEntity> update = new BillUpdate<AggMainEntity>();
                AggMainEntity[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
