
package nccloud.bs.development.testtable.aggbusi.ace.bp;

import nc.vo.development.test02.AggMainEntity;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceMainEntitySendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggMainEntity[] sendApprove(AggMainEntity[] clientBills,
                        AggMainEntity[] originBills) {
                for (AggMainEntity clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggMainEntity[] returnVos = new BillUpdate<AggMainEntity>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
