package nc.vo.development.test02;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�������������Ϣ
 * </p>
 *  ��������:2020-11-9
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
	 * ���� pk_m��Getter����.��������parentPK
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_m () {
		return pk_m;
	}   
	/**
	 * ����pk_m��Setter����.��������parentPK
	 * ��������:2020-11-9
	 * @param newPk_m java.lang.String
	 */
	public void setPk_m (java.lang.String newPk_m ) {
	 	this.pk_m = newPk_m;
	} 	 
	
	/**
	 * ���� pk_sub��Getter����.������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_sub () {
		return pk_sub;
	}   
	/**
	 * ����pk_sub��Setter����.������������
	 * ��������:2020-11-9
	 * @param newPk_sub java.lang.String
	 */
	public void setPk_sub (java.lang.String newPk_sub ) {
	 	this.pk_sub = newPk_sub;
	} 	 
	
	/**
	 * ���� amount��Getter����.���������ܽ��
	 *  ��������:2020-11-9
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getAmount () {
		return amount;
	}   
	/**
	 * ����amount��Setter����.���������ܽ��
	 * ��������:2020-11-9
	 * @param newAmount nc.vo.pub.lang.UFDouble
	 */
	public void setAmount (nc.vo.pub.lang.UFDouble newAmount ) {
	 	this.amount = newAmount;
	} 	 
	
	/**
	 * ���� dr��Getter����.��������dr
	 *  ��������:2020-11-9
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}   
	/**
	 * ����dr��Setter����.��������dr
	 * ��������:2020-11-9
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * ���� ts��Getter����.��������ts
	 *  ��������:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs () {
		return ts;
	}   
	/**
	 * ����ts��Setter����.��������ts
	 * ��������:2020-11-9
	 * @param newTs nc.vo.pub.lang.UFDateTime
	 */
	public void setTs (nc.vo.pub.lang.UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	 
	
	
	/**
	  * <p>ȡ�ø�VO�����ֶ�.
	  * <p>
	  * ��������:2020-11-9
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {		
		return "pk_m";
	}   
    
	/**
	  * <p>ȡ�ñ�����.
	  * <p>
	  * ��������:2020-11-9
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
			
		return "pk_sub";
	}
    
	/**
	 * <p>���ر�����
	 * <p>
	 * ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "development_subEntity";
	}    
	
	/**
	 * <p>���ر�����.
	 * <p>
	 * ��������:2020-11-9
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "development_subEntity";
	}    
    
    /**
	  * ����Ĭ�Ϸ�ʽ����������.
	  *
	  * ��������:2020-11-9
	  */
     public SubEntity() {
		super();	
	}    
	
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.development.test02.SubEntity" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("development.subEntity");
		
   	}
     
}