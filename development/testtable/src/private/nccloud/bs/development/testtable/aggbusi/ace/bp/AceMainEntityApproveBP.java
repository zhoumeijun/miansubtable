
package nccloud.bs.development.testtable.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.development.test02.AggMainEntity;

/**
 * 标准单据审核的BP
 */
public class AceMainEntityApproveBP {

        /**
         * 审核动作
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggMainEntity[] approve(AggMainEntity[] clientBills,
                        AggMainEntity[] originBills) {
                for (AggMainEntity clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggMainEntity> update = new BillUpdate<AggMainEntity>();
                AggMainEntity[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
