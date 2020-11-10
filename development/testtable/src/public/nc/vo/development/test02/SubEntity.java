package nc.vo.development.test02;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加类的描述信息
 * </p>
 *  创建日期:2020-11-9
 * @author yonyouBQ
 * @version NCPrj ??
 */
public class SubEntity extends nc.vo.pub.SuperVO{
	
    private java.lang.String pk_m;
    private java.lang.String pk_sub;
    private nc.vo.pub.lang.UFDouble amount;
    private java.lang.Integer dr = 0;
    private nc.vo.pub.lang.UFDateTime ts;    
	
	
    public static final String PK_M = "pk_m";
    public static final String PK_SUB = "pk_sub";
    public static final String AMOUNT = "amount";

	/**
	 * 属性 pk_m的Getter方法.属性名：parentPK
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_m () {
		return pk_m;
	}   
	/**
	 * 属性pk_m的Setter方法.属性名：parentPK
	 * 创建日期:2020-11-9
	 * @param newPk_m java.lang.String
	 */
	public void setPk_m (java.lang.String newPk_m ) {
	 	this.pk_m = newPk_m;
	} 	 
	
	/**
	 * 属性 pk_sub的Getter方法.属性名：主键
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_sub () {
		return pk_sub;
	}   
	/**
	 * 属性pk_sub的Setter方法.属性名：主键
	 * 创建日期:2020-11-9
	 * @param newPk_sub java.lang.String
	 */
	public void setPk_sub (java.lang.String newPk_sub ) {
	 	this.pk_sub = newPk_sub;
	} 	 
	
	/**
	 * 属性 amount的Getter方法.属性名：总金额
	 *  创建日期:2020-11-9
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getAmount () {
		return amount;
	}   
	/**
	 * 属性amount的Setter方法.属性名：总金额
	 * 创建日期:2020-11-9
	 * @param newAmount nc.vo.pub.lang.UFDouble
	 */
	public void setAmount (nc.vo.pub.lang.UFDouble newAmount ) {
	 	this.amount = newAmount;
	} 	 
	
	/**
	 * 属性 dr的Getter方法.属性名：dr
	 *  创建日期:2020-11-9
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:2020-11-9
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * 属性 ts的Getter方法.属性名：ts
	 *  创建日期:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs () {
		return ts;
	}   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:2020-11-9
	 * @param newTs nc.vo.pub.lang.UFDateTime
	 */
	public void setTs (nc.vo.pub.lang.UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	 
	
	
	/**
	  * <p>取得父VO主键字段.
	  * <p>
	  * 创建日期:2020-11-9
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {		
		return "pk_m";
	}   
    
	/**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:2020-11-9
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
			
		return "pk_sub";
	}
    
	/**
	 * <p>返回表名称
	 * <p>
	 * 创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "development_subEntity";
	}    
	
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "development_subEntity";
	}    
    
    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:2020-11-9
	  */
     public SubEntity() {
		super();	
	}    
	
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.development.test02.SubEntity" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("development.subEntity");
		
   	}
     
}