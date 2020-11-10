
package nc.vo.development.test02;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggMainEntityMeta extends AbstractBillMeta{
        
        public AggMainEntityMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.development.test02.MainEntity.class);
                this.addChildren(nc.vo.development.test02.SubEntity.class);
        }
}