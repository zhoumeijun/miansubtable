
package nccloud.impl.development.testtable;

import nccloud.impl.pub.ace.AceAggbusiMainEntityPubServiceImpl;
import nccloud.itf.development.testtable.IMainentityMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;

public class MainentityMaintainImpl extends AceAggbusiMainEntityPubServiceImpl implements IMainentityMaintain  {

        @Override
        public void delete(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggMainEntity[] insert(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggMainEntity[] update(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggMainEntity[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggMainEntity[] save(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMainEntity[] unsave(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMainEntity[] approve(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMainEntity[] unapprove(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
