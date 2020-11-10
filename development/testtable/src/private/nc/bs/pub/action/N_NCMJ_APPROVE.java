
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nccloud.bs.development.testtable.aggbusi.plugin.bpplugin.MainEntityPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nccloud.itf.development.testtable.IMainentityMaintain;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_NCMJ_APPROVE extends AbstractPfAction<AggMainEntity> {

        public N_NCMJ_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggMainEntity> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMainEntity> processor = new CompareAroundProcesser<AggMainEntity>(
                                MainEntityPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggMainEntity[] processBP(Object userObj,
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills) {
                AggMainEntity[] bills = null;
                IMainentityMaintain operator = NCLocator.getInstance().lookup(
                                IMainentityMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
