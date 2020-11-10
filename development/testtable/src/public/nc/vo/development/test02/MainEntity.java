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
public class MainEntity extends nc.vo.pub.SuperVO{
	
    private java.lang.String pk_m;
    private java.lang.String code;
    private java.lang.String pk_group;
    private java.lang.String pk_org;
    private java.lang.String pk_org_v;
    private java.lang.String creator;
    private nc.vo.pub.lang.UFDateTime creationtime;
    private java.lang.String modifier;
    private nc.vo.pub.lang.UFDateTime modifiedtime;
    private java.lang.String billid;
    private java.lang.String billno;
    private java.lang.String pkorg;
    private java.lang.String busitype;
    private java.lang.String billmaker;
    private java.lang.String approver;
    private java.lang.Integer approvestatus;
    private java.lang.String approvenote;
    private nc.vo.pub.lang.UFDateTime approvedate;
    private java.lang.String transtype;
    private java.lang.String billtype;
    private java.lang.String transtypepk;
    private java.lang.String srcbilltype;
    private java.lang.String srcbillid;
    private java.lang.Integer emendenum;
    private java.lang.String billversionpk;
    private java.lang.String id;
    private java.lang.String name;
    private nc.vo.pub.lang.UFDateTime maketime;
    private nc.vo.pub.lang.UFDateTime lastmaketime;
    private java.lang.String rowno;
    private java.lang.Integer dr = 0;
    private nc.vo.pub.lang.UFDateTime ts;    
	
    private nc.vo.development.test02.SubEntity[] id_subentity;
	
    public static final String PK_M = "pk_m";
    public static final String CODE = "code";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String CREATOR = "creator";
    public static final String CREATIONTIME = "creationtime";
    public static final String MODIFIER = "modifier";
    public static final String MODIFIEDTIME = "modifiedtime";
    public static final String BILLID = "billid";
    public static final String BILLNO = "billno";
    public static final String PKORG = "pkorg";
    public static final String BUSITYPE = "busitype";
    public static final String BILLMAKER = "billmaker";
    public static final String APPROVER = "approver";
    public static final String APPROVESTATUS = "approvestatus";
    public static final String APPROVENOTE = "approvenote";
    public static final String APPROVEDATE = "approvedate";
    public static final String TRANSTYPE = "transtype";
    public static final String BILLTYPE = "billtype";
    public static final String TRANSTYPEPK = "transtypepk";
    public static final String SRCBILLTYPE = "srcbilltype";
    public static final String SRCBILLID = "srcbillid";
    public static final String EMENDENUM = "emendenum";
    public static final String BILLVERSIONPK = "billversionpk";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String MAKETIME = "maketime";
    public static final String LASTMAKETIME = "lastmaketime";
    public static final String ROWNO = "rowno";

	/**
	 * 属性 pk_m的Getter方法.属性名：主键
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_m () {
		return pk_m;
	}   
	/**
	 * 属性pk_m的Setter方法.属性名：主键
	 * 创建日期:2020-11-9
	 * @param newPk_m java.lang.String
	 */
	public void setPk_m (java.lang.String newPk_m ) {
	 	this.pk_m = newPk_m;
	} 	 
	
	/**
	 * 属性 code的Getter方法.属性名：编码
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getCode () {
		return code;
	}   
	/**
	 * 属性code的Setter方法.属性名：编码
	 * 创建日期:2020-11-9
	 * @param newCode java.lang.String
	 */
	public void setCode (java.lang.String newCode ) {
	 	this.code = newCode;
	} 	 
	
	/**
	 * 属性 id_subentity的Getter方法.属性名：id_subEntity
	 *  创建日期:2020-11-9
	 * @return nc.vo.development.test02.SubEntity[]
	 */
	public nc.vo.development.test02.SubEntity[] getId_subentity () {
		return id_subentity;
	}   
	/**
	 * 属性id_subentity的Setter方法.属性名：id_subEntity
	 * 创建日期:2020-11-9
	 * @param newId_subentity nc.vo.development.test02.SubEntity[]
	 */
	public void setId_subentity (nc.vo.development.test02.SubEntity[] newId_subentity ) {
	 	this.id_subentity = newId_subentity;
	} 	 
	
	/**
	 * 属性 pk_group的Getter方法.属性名：集团
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}   
	/**
	 * 属性pk_group的Setter方法.属性名：集团
	 * 创建日期:2020-11-9
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	 
	
	/**
	 * 属性 pk_org的Getter方法.属性名：组织
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}   
	/**
	 * 属性pk_org的Setter方法.属性名：组织
	 * 创建日期:2020-11-9
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	 
	
	/**
	 * 属性 pk_org_v的Getter方法.属性名：组织版本
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v () {
		return pk_org_v;
	}   
	/**
	 * 属性pk_org_v的Setter方法.属性名：组织版本
	 * 创建日期:2020-11-9
	 * @param newPk_org_v java.lang.String
	 */
	public void setPk_org_v (java.lang.String newPk_org_v ) {
	 	this.pk_org_v = newPk_org_v;
	} 	 
	
	/**
	 * 属性 creator的Getter方法.属性名：创建人
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getCreator () {
		return creator;
	}   
	/**
	 * 属性creator的Setter方法.属性名：创建人
	 * 创建日期:2020-11-9
	 * @param newCreator java.lang.String
	 */
	public void setCreator (java.lang.String newCreator ) {
	 	this.creator = newCreator;
	} 	 
	
	/**
	 * 属性 creationtime的Getter方法.属性名：创建时间
	 *  创建日期:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getCreationtime () {
		return creationtime;
	}   
	/**
	 * 属性creationtime的Setter方法.属性名：创建时间
	 * 创建日期:2020-11-9
	 * @param newCreationtime nc.vo.pub.lang.UFDateTime
	 */
	public void setCreationtime (nc.vo.pub.lang.UFDateTime newCreationtime ) {
	 	this.creationtime = newCreationtime;
	} 	 
	
	/**
	 * 属性 modifier的Getter方法.属性名：修改人
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getModifier () {
		return modifier;
	}   
	/**
	 * 属性modifier的Setter方法.属性名：修改人
	 * 创建日期:2020-11-9
	 * @param newModifier java.lang.String
	 */
	public void setModifier (java.lang.String newModifier ) {
	 	this.modifier = newModifier;
	} 	 
	
	/**
	 * 属性 modifiedtime的Getter方法.属性名：修改时间
	 *  创建日期:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getModifiedtime () {
		return modifiedtime;
	}   
	/**
	 * 属性modifiedtime的Setter方法.属性名：修改时间
	 * 创建日期:2020-11-9
	 * @param newModifiedtime nc.vo.pub.lang.UFDateTime
	 */
	public void setModifiedtime (nc.vo.pub.lang.UFDateTime newModifiedtime ) {
	 	this.modifiedtime = newModifiedtime;
	} 	 
	
	/**
	 * 属性 billid的Getter方法.属性名：单据ID
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillid () {
		return billid;
	}   
	/**
	 * 属性billid的Setter方法.属性名：单据ID
	 * 创建日期:2020-11-9
	 * @param newBillid java.lang.String
	 */
	public void setBillid (java.lang.String newBillid ) {
	 	this.billid = newBillid;
	} 	 
	
	/**
	 * 属性 billno的Getter方法.属性名：单据号
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillno () {
		return billno;
	}   
	/**
	 * 属性billno的Setter方法.属性名：单据号
	 * 创建日期:2020-11-9
	 * @param newBillno java.lang.String
	 */
	public void setBillno (java.lang.String newBillno ) {
	 	this.billno = newBillno;
	} 	 
	
	/**
	 * 属性 pkorg的Getter方法.属性名：所属组织
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPkorg () {
		return pkorg;
	}   
	/**
	 * 属性pkorg的Setter方法.属性名：所属组织
	 * 创建日期:2020-11-9
	 * @param newPkorg java.lang.String
	 */
	public void setPkorg (java.lang.String newPkorg ) {
	 	this.pkorg = newPkorg;
	} 	 
	
	/**
	 * 属性 busitype的Getter方法.属性名：业务类型
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBusitype () {
		return busitype;
	}   
	/**
	 * 属性busitype的Setter方法.属性名：业务类型
	 * 创建日期:2020-11-9
	 * @param newBusitype java.lang.String
	 */
	public void setBusitype (java.lang.String newBusitype ) {
	 	this.busitype = newBusitype;
	} 	 
	
	/**
	 * 属性 billmaker的Getter方法.属性名：制单人
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillmaker () {
		return billmaker;
	}   
	/**
	 * 属性billmaker的Setter方法.属性名：制单人
	 * 创建日期:2020-11-9
	 * @param newBillmaker java.lang.String
	 */
	public void setBillmaker (java.lang.String newBillmaker ) {
	 	this.billmaker = newBillmaker;
	} 	 
	
	/**
	 * 属性 approver的Getter方法.属性名：审批人
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getApprover () {
		return approver;
	}   
	/**
	 * 属性approver的Setter方法.属性名：审批人
	 * 创建日期:2020-11-9
	 * @param newApprover java.lang.String
	 */
	public void setApprover (java.lang.String newApprover ) {
	 	this.approver = newApprover;
	} 	 
	
	/**
	 * 属性 approvestatus的Getter方法.属性名：审批状态
	 *  创建日期:2020-11-9
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getApprovestatus () {
		return approvestatus;
	}   
	/**
	 * 属性approvestatus的Setter方法.属性名：审批状态
	 * 创建日期:2020-11-9
	 * @param newApprovestatus java.lang.Integer
	 */
	public void setApprovestatus (java.lang.Integer newApprovestatus ) {
	 	this.approvestatus = newApprovestatus;
	} 	 
	
	/**
	 * 属性 approvenote的Getter方法.属性名：审批批语
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getApprovenote () {
		return approvenote;
	}   
	/**
	 * 属性approvenote的Setter方法.属性名：审批批语
	 * 创建日期:2020-11-9
	 * @param newApprovenote java.lang.String
	 */
	public void setApprovenote (java.lang.String newApprovenote ) {
	 	this.approvenote = newApprovenote;
	} 	 
	
	/**
	 * 属性 approvedate的Getter方法.属性名：审批时间
	 *  创建日期:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getApprovedate () {
		return approvedate;
	}   
	/**
	 * 属性approvedate的Setter方法.属性名：审批时间
	 * 创建日期:2020-11-9
	 * @param newApprovedate nc.vo.pub.lang.UFDateTime
	 */
	public void setApprovedate (nc.vo.pub.lang.UFDateTime newApprovedate ) {
	 	this.approvedate = newApprovedate;
	} 	 
	
	/**
	 * 属性 transtype的Getter方法.属性名：交易类型
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTranstype () {
		return transtype;
	}   
	/**
	 * 属性transtype的Setter方法.属性名：交易类型
	 * 创建日期:2020-11-9
	 * @param newTranstype java.lang.String
	 */
	public void setTranstype (java.lang.String newTranstype ) {
	 	this.transtype = newTranstype;
	} 	 
	
	/**
	 * 属性 billtype的Getter方法.属性名：单据类型
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBilltype () {
		return billtype;
	}   
	/**
	 * 属性billtype的Setter方法.属性名：单据类型
	 * 创建日期:2020-11-9
	 * @param newBilltype java.lang.String
	 */
	public void setBilltype (java.lang.String newBilltype ) {
	 	this.billtype = newBilltype;
	} 	 
	
	/**
	 * 属性 transtypepk的Getter方法.属性名：交易类型pk
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTranstypepk () {
		return transtypepk;
	}   
	/**
	 * 属性transtypepk的Setter方法.属性名：交易类型pk
	 * 创建日期:2020-11-9
	 * @param newTranstypepk java.lang.String
	 */
	public void setTranstypepk (java.lang.String newTranstypepk ) {
	 	this.transtypepk = newTranstypepk;
	} 	 
	
	/**
	 * 属性 srcbilltype的Getter方法.属性名：来源单据类型
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getSrcbilltype () {
		return srcbilltype;
	}   
	/**
	 * 属性srcbilltype的Setter方法.属性名：来源单据类型
	 * 创建日期:2020-11-9
	 * @param newSrcbilltype java.lang.String
	 */
	public void setSrcbilltype (java.lang.String newSrcbilltype ) {
	 	this.srcbilltype = newSrcbilltype;
	} 	 
	
	/**
	 * 属性 srcbillid的Getter方法.属性名：来源单据id
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getSrcbillid () {
		return srcbillid;
	}   
	/**
	 * 属性srcbillid的Setter方法.属性名：来源单据id
	 * 创建日期:2020-11-9
	 * @param newSrcbillid java.lang.String
	 */
	public void setSrcbillid (java.lang.String newSrcbillid ) {
	 	this.srcbillid = newSrcbillid;
	} 	 
	
	/**
	 * 属性 emendenum的Getter方法.属性名：修订枚举
	 *  创建日期:2020-11-9
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getEmendenum () {
		return emendenum;
	}   
	/**
	 * 属性emendenum的Setter方法.属性名：修订枚举
	 * 创建日期:2020-11-9
	 * @param newEmendenum java.lang.Integer
	 */
	public void setEmendenum (java.lang.Integer newEmendenum ) {
	 	this.emendenum = newEmendenum;
	} 	 
	
	/**
	 * 属性 billversionpk的Getter方法.属性名：单据版本pk
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillversionpk () {
		return billversionpk;
	}   
	/**
	 * 属性billversionpk的Setter方法.属性名：单据版本pk
	 * 创建日期:2020-11-9
	 * @param newBillversionpk java.lang.String
	 */
	public void setBillversionpk (java.lang.String newBillversionpk ) {
	 	this.billversionpk = newBillversionpk;
	} 	 
	
	/**
	 * 属性 id的Getter方法.属性名：id
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getId () {
		return id;
	}   
	/**
	 * 属性id的Setter方法.属性名：id
	 * 创建日期:2020-11-9
	 * @param newId java.lang.String
	 */
	public void setId (java.lang.String newId ) {
	 	this.id = newId;
	} 	 
	
	/**
	 * 属性 name的Getter方法.属性名：name
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getName () {
		return name;
	}   
	/**
	 * 属性name的Setter方法.属性名：name
	 * 创建日期:2020-11-9
	 * @param newName java.lang.String
	 */
	public void setName (java.lang.String newName ) {
	 	this.name = newName;
	} 	 
	
	/**
	 * 属性 maketime的Getter方法.属性名：制单时间
	 *  创建日期:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getMaketime () {
		return maketime;
	}   
	/**
	 * 属性maketime的Setter方法.属性名：制单时间
	 * 创建日期:2020-11-9
	 * @param newMaketime nc.vo.pub.lang.UFDateTime
	 */
	public void setMaketime (nc.vo.pub.lang.UFDateTime newMaketime ) {
	 	this.maketime = newMaketime;
	} 	 
	
	/**
	 * 属性 lastmaketime的Getter方法.属性名：最后修改时间
	 *  创建日期:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getLastmaketime () {
		return lastmaketime;
	}   
	/**
	 * 属性lastmaketime的Setter方法.属性名：最后修改时间
	 * 创建日期:2020-11-9
	 * @param newLastmaketime nc.vo.pub.lang.UFDateTime
	 */
	public void setLastmaketime (nc.vo.pub.lang.UFDateTime newLastmaketime ) {
	 	this.lastmaketime = newLastmaketime;
	} 	 
	
	/**
	 * 属性 rowno的Getter方法.属性名：行号
	 *  创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getRowno () {
		return rowno;
	}   
	/**
	 * 属性rowno的Setter方法.属性名：行号
	 * 创建日期:2020-11-9
	 * @param newRowno java.lang.String
	 */
	public void setRowno (java.lang.String newRowno ) {
	 	this.rowno = newRowno;
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
	    return null;
	}   
    
	/**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:2020-11-9
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
			
		return "pk_m";
	}
    
	/**
	 * <p>返回表名称
	 * <p>
	 * 创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "development_mainEntity";
	}    
	
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:2020-11-9
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "development_mainEntity";
	}    
    
    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:2020-11-9
	  */
     public MainEntity() {
		super();	
	}    
	
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.development.test02.MainEntity" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("development.mainEntity");
		
   	}
     
}