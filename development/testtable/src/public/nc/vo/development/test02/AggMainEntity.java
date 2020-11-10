
package nc.vo.development.test02;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.development.test02.MainEntity;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.development.test02.MainEntity")
public class AggMainEntity extends AbstractBill {

        @Override
        public IBillMeta getMetaData() {
                IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
                                AggMainEntityMeta.class);
                return billMeta;
        }

        @Override
        public MainEntity getParentVO() {
                return (MainEntity) this.getParent();
        }

        @Override
        public String getPrimaryKey() {
                return super.getPrimaryKey();
        }
}