
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nccloud.bs.development.testtable.aggbusi.plugin.bpplugin.MainEntityPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nccloud.itf.development.testtable.IMainentityMaintain;
import nc.vo.development.test02.AggMainEntity;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_NCMJ_SAVEBASE extends AbstractPfAction<AggMainEntity> {

        @Override
        protected CompareAroundProcesser<AggMainEntity> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMainEntity> processor = null;
                AggMainEntity[] clientFullVOs = (AggMainEntity[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggMainEntity>(
                                        MainEntityPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggMainEntity>(
                                        MainEntityPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggMainEntity> rule = null;

                return processor;
        }

        @Override
        protected AggMainEntity[] processBP(Object userObj,
                        AggMainEntity[] clientFullVOs, AggMainEntity[] originBills) {

                AggMainEntity[] bills = null;
            try {
              IMainentityMaintain operator =
                  NCLocator.getInstance().lookup(IMainentityMaintain.class);
              if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                  .getPrimaryKey())) {
                bills = operator.update(clientFullVOs, originBills);
              }
              else {
                bills = operator.insert(clientFullVOs, originBills);
              }
            }
            catch (BusinessException e) {
              ExceptionUtils.wrappBusinessException(e.getMessage());
            }
            return bills;
        }
}
