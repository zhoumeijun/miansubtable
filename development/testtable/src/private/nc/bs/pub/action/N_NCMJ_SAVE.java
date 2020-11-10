
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nccloud.bs.development.testtable.aggbusi.plugin.bpplugin.MainEntityPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nccloud.itf.development.testtable.IMainentityMaintain;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_NCMJ_SAVE extends AbstractPfAction<AggMainEntity> {

        protected CompareAroundProcesser<AggMainEntity> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMainEntity> processor = new CompareAroundProcesser<AggMainEntity>(
                MainEntityPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggMainEntity> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggMainEntity[] processBP(Object userObj,
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills) {
                IMainentityMaintain operator = NCLocator.getInstance().lookup(
                                IMainentityMaintain.class);
                AggMainEntity[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
