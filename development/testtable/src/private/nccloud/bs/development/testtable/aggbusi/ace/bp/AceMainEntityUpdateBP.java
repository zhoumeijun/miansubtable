
package nccloud.bs.development.testtable.aggbusi.ace.bp;

import nccloud.bs.development.testtable.aggbusi.plugin.bpplugin.MainEntityPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.development.test02.AggMainEntity;

/**
 * �޸ı����BP
 *
 */
public class AceMainEntityUpdateBP {

        public AggMainEntity[] update(AggMainEntity[] bills,
                        AggMainEntity[] originBills) {
                // �����޸�ģ��
                UpdateBPTemplate<AggMainEntity> bp = new UpdateBPTemplate<AggMainEntity>(
MainEntityPluginPoint.UPDATE);
                // ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ִ�к����
                this.addAfterRule(bp.getAroundProcesser());
                return bp.update(bills, originBills);
        }

        private void addAfterRule(CompareAroundProcesser<AggMainEntity> processer) {
                // TODO �����
                IRule<AggMainEntity> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("NCMJ");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
                processer.addAfterRule(rule);

        }

        private void addBeforeRule(CompareAroundProcesser<AggMainEntity> processer) {
                // TODO ǰ����
                IRule<AggMainEntity> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
                processer.addBeforeRule(rule);
                nc.impl.pubapp.pattern.rule.ICompareRule<AggMainEntity> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCbilltype("NCMJ");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCodeItem("");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setOrgItem("pk_org");
                processer.addBeforeRule(ruleCom);
        }

}
