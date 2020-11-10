
package nccloud.bs.development.testtable.aggbusi.ace.bp;


import nccloud.bs.development.testtable.aggbusi.plugin.bpplugin.MainEntityPluginPoint;
import nc.vo.development.test02.AggMainEntity;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceMainEntityDeleteBP {

        public void delete(AggMainEntity[] bills) {

                DeleteBPTemplate<AggMainEntity> bp = new DeleteBPTemplate<AggMainEntity>(
MainEntityPluginPoint.DELETE);
                // 增加执行前规则
                this.addBeforeRule(bp.getAroundProcesser());
                // 增加执行后业务规则
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggMainEntity> processer) {
                // TODO 前规则
//              IRule<AggMainEntity> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * 删除后业务规则
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggMainEntity> processer) {
                // TODO 后规则

        }
}
