
package nccloud.itf.development.testtable;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;

public interface IMainentityMaintain {

        public void delete(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException;

        public AggMainEntity[] insert(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException;

        public AggMainEntity[] update(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException;

        public AggMainEntity[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggMainEntity[] save(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException;

        public AggMainEntity[] unsave(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException;

        public AggMainEntity[] approve(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException;

        public AggMainEntity[] unapprove(AggMainEntity[] clientFullVOs,
                        AggMainEntity[] originBills) throws BusinessException;
}
