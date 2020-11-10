
package nccloud.bs.development.testtable.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.development.test02.AggMainEntity;

/**
 * ��׼������˵�BP
 */
public class AceMainEntityApproveBP {

        /**
         * ��˶���
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
