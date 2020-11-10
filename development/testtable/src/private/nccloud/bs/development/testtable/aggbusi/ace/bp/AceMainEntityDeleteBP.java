
package nccloud.bs.development.testtable.aggbusi.ace.bp;


import nccloud.bs.development.testtable.aggbusi.plugin.bpplugin.MainEntityPluginPoint;
import nc.vo.development.test02.AggMainEntity;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceMainEntityDeleteBP {

        public void delete(AggMainEntity[] bills) {

                DeleteBPTemplate<AggMainEntity> bp = new DeleteBPTemplate<AggMainEntity>(
MainEntityPluginPoint.DELETE);
                // ����ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ����ִ�к�ҵ�����
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggMainEntity> processer) {
                // TODO ǰ����
//              IRule<AggMainEntity> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * ɾ����ҵ�����
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggMainEntity> processer) {
                // TODO �����

        }
}
