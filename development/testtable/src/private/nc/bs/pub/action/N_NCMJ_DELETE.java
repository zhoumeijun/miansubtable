
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nccloud.bs.development.testtable.aggbusi.plugin.bpplugin.MainEntityPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nccloud.itf.development.testtable.IMainentityMaintain;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_NCMJ_DELETE extends AbstractPfAction<AggMainEntity> {

        @Override
        protected CompareAroundProcesser<AggMainEntity> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMainEntity> processor = new CompareAroundProcesser<AggMainEntity>(
                                MainEntityPluginPoint.SCRIPT_DELETE);
                // TODO 在此处添加前后规则
                return processor;
        }

        @Override
        protected AggMainEntity[] processBP(Object userObj,
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills) {
                IMainentityMaintain operator = NCLocator.getInstance().lookup(
                                IMainentityMaintain.class);
                try {
                        operator.delete(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return clientFullVOs;
        }

}
