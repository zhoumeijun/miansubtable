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
	 * ���� pk_m��Getter����.������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_m () {
		return pk_m;
	}   
	/**
	 * ����pk_m��Setter����.������������
	 * ��������:2020-11-9
	 * @param newPk_m java.lang.String
	 */
	public void setPk_m (java.lang.String newPk_m ) {
	 	this.pk_m = newPk_m;
	} 	 
	
	/**
	 * ���� code��Getter����.������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getCode () {
		return code;
	}   
	/**
	 * ����code��Setter����.������������
	 * ��������:2020-11-9
	 * @param newCode java.lang.String
	 */
	public void setCode (java.lang.String newCode ) {
	 	this.code = newCode;
	} 	 
	
	/**
	 * ���� id_subentity��Getter����.��������id_subEntity
	 *  ��������:2020-11-9
	 * @return nc.vo.development.test02.SubEntity[]
	 */
	public nc.vo.development.test02.SubEntity[] getId_subentity () {
		return id_subentity;
	}   
	/**
	 * ����id_subentity��Setter����.��������id_subEntity
	 * ��������:2020-11-9
	 * @param newId_subentity nc.vo.development.test02.SubEntity[]
	 */
	public void setId_subentity (nc.vo.development.test02.SubEntity[] newId_subentity ) {
	 	this.id_subentity = newId_subentity;
	} 	 
	
	/**
	 * ���� pk_group��Getter����.������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}   
	/**
	 * ����pk_group��Setter����.������������
	 * ��������:2020-11-9
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	 
	
	/**
	 * ���� pk_org��Getter����.����������֯
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}   
	/**
	 * ����pk_org��Setter����.����������֯
	 * ��������:2020-11-9
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	 
	
	/**
	 * ���� pk_org_v��Getter����.����������֯�汾
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v () {
		return pk_org_v;
	}   
	/**
	 * ����pk_org_v��Setter����.����������֯�汾
	 * ��������:2020-11-9
	 * @param newPk_org_v java.lang.String
	 */
	public void setPk_org_v (java.lang.String newPk_org_v ) {
	 	this.pk_org_v = newPk_org_v;
	} 	 
	
	/**
	 * ���� creator��Getter����.��������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getCreator () {
		return creator;
	}   
	/**
	 * ����creator��Setter����.��������������
	 * ��������:2020-11-9
	 * @param newCreator java.lang.String
	 */
	public void setCreator (java.lang.String newCreator ) {
	 	this.creator = newCreator;
	} 	 
	
	/**
	 * ���� creationtime��Getter����.������������ʱ��
	 *  ��������:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getCreationtime () {
		return creationtime;
	}   
	/**
	 * ����creationtime��Setter����.������������ʱ��
	 * ��������:2020-11-9
	 * @param newCreationtime nc.vo.pub.lang.UFDateTime
	 */
	public void setCreationtime (nc.vo.pub.lang.UFDateTime newCreationtime ) {
	 	this.creationtime = newCreationtime;
	} 	 
	
	/**
	 * ���� modifier��Getter����.���������޸���
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getModifier () {
		return modifier;
	}   
	/**
	 * ����modifier��Setter����.���������޸���
	 * ��������:2020-11-9
	 * @param newModifier java.lang.String
	 */
	public void setModifier (java.lang.String newModifier ) {
	 	this.modifier = newModifier;
	} 	 
	
	/**
	 * ���� modifiedtime��Getter����.���������޸�ʱ��
	 *  ��������:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getModifiedtime () {
		return modifiedtime;
	}   
	/**
	 * ����modifiedtime��Setter����.���������޸�ʱ��
	 * ��������:2020-11-9
	 * @param newModifiedtime nc.vo.pub.lang.UFDateTime
	 */
	public void setModifiedtime (nc.vo.pub.lang.UFDateTime newModifiedtime ) {
	 	this.modifiedtime = newModifiedtime;
	} 	 
	
	/**
	 * ���� billid��Getter����.������������ID
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillid () {
		return billid;
	}   
	/**
	 * ����billid��Setter����.������������ID
	 * ��������:2020-11-9
	 * @param newBillid java.lang.String
	 */
	public void setBillid (java.lang.String newBillid ) {
	 	this.billid = newBillid;
	} 	 
	
	/**
	 * ���� billno��Getter����.�����������ݺ�
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillno () {
		return billno;
	}   
	/**
	 * ����billno��Setter����.�����������ݺ�
	 * ��������:2020-11-9
	 * @param newBillno java.lang.String
	 */
	public void setBillno (java.lang.String newBillno ) {
	 	this.billno = newBillno;
	} 	 
	
	/**
	 * ���� pkorg��Getter����.��������������֯
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getPkorg () {
		return pkorg;
	}   
	/**
	 * ����pkorg��Setter����.��������������֯
	 * ��������:2020-11-9
	 * @param newPkorg java.lang.String
	 */
	public void setPkorg (java.lang.String newPkorg ) {
	 	this.pkorg = newPkorg;
	} 	 
	
	/**
	 * ���� busitype��Getter����.��������ҵ������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBusitype () {
		return busitype;
	}   
	/**
	 * ����busitype��Setter����.��������ҵ������
	 * ��������:2020-11-9
	 * @param newBusitype java.lang.String
	 */
	public void setBusitype (java.lang.String newBusitype ) {
	 	this.busitype = newBusitype;
	} 	 
	
	/**
	 * ���� billmaker��Getter����.���������Ƶ���
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillmaker () {
		return billmaker;
	}   
	/**
	 * ����billmaker��Setter����.���������Ƶ���
	 * ��������:2020-11-9
	 * @param newBillmaker java.lang.String
	 */
	public void setBillmaker (java.lang.String newBillmaker ) {
	 	this.billmaker = newBillmaker;
	} 	 
	
	/**
	 * ���� approver��Getter����.��������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getApprover () {
		return approver;
	}   
	/**
	 * ����approver��Setter����.��������������
	 * ��������:2020-11-9
	 * @param newApprover java.lang.String
	 */
	public void setApprover (java.lang.String newApprover ) {
	 	this.approver = newApprover;
	} 	 
	
	/**
	 * ���� approvestatus��Getter����.������������״̬
	 *  ��������:2020-11-9
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getApprovestatus () {
		return approvestatus;
	}   
	/**
	 * ����approvestatus��Setter����.������������״̬
	 * ��������:2020-11-9
	 * @param newApprovestatus java.lang.Integer
	 */
	public void setApprovestatus (java.lang.Integer newApprovestatus ) {
	 	this.approvestatus = newApprovestatus;
	} 	 
	
	/**
	 * ���� approvenote��Getter����.����������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getApprovenote () {
		return approvenote;
	}   
	/**
	 * ����approvenote��Setter����.����������������
	 * ��������:2020-11-9
	 * @param newApprovenote java.lang.String
	 */
	public void setApprovenote (java.lang.String newApprovenote ) {
	 	this.approvenote = newApprovenote;
	} 	 
	
	/**
	 * ���� approvedate��Getter����.������������ʱ��
	 *  ��������:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getApprovedate () {
		return approvedate;
	}   
	/**
	 * ����approvedate��Setter����.������������ʱ��
	 * ��������:2020-11-9
	 * @param newApprovedate nc.vo.pub.lang.UFDateTime
	 */
	public void setApprovedate (nc.vo.pub.lang.UFDateTime newApprovedate ) {
	 	this.approvedate = newApprovedate;
	} 	 
	
	/**
	 * ���� transtype��Getter����.����������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTranstype () {
		return transtype;
	}   
	/**
	 * ����transtype��Setter����.����������������
	 * ��������:2020-11-9
	 * @param newTranstype java.lang.String
	 */
	public void setTranstype (java.lang.String newTranstype ) {
	 	this.transtype = newTranstype;
	} 	 
	
	/**
	 * ���� billtype��Getter����.����������������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBilltype () {
		return billtype;
	}   
	/**
	 * ����billtype��Setter����.����������������
	 * ��������:2020-11-9
	 * @param newBilltype java.lang.String
	 */
	public void setBilltype (java.lang.String newBilltype ) {
	 	this.billtype = newBilltype;
	} 	 
	
	/**
	 * ���� transtypepk��Getter����.����������������pk
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTranstypepk () {
		return transtypepk;
	}   
	/**
	 * ����transtypepk��Setter����.����������������pk
	 * ��������:2020-11-9
	 * @param newTranstypepk java.lang.String
	 */
	public void setTranstypepk (java.lang.String newTranstypepk ) {
	 	this.transtypepk = newTranstypepk;
	} 	 
	
	/**
	 * ���� srcbilltype��Getter����.����������Դ��������
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getSrcbilltype () {
		return srcbilltype;
	}   
	/**
	 * ����srcbilltype��Setter����.����������Դ��������
	 * ��������:2020-11-9
	 * @param newSrcbilltype java.lang.String
	 */
	public void setSrcbilltype (java.lang.String newSrcbilltype ) {
	 	this.srcbilltype = newSrcbilltype;
	} 	 
	
	/**
	 * ���� srcbillid��Getter����.����������Դ����id
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getSrcbillid () {
		return srcbillid;
	}   
	/**
	 * ����srcbillid��Setter����.����������Դ����id
	 * ��������:2020-11-9
	 * @param newSrcbillid java.lang.String
	 */
	public void setSrcbillid (java.lang.String newSrcbillid ) {
	 	this.srcbillid = newSrcbillid;
	} 	 
	
	/**
	 * ���� emendenum��Getter����.���������޶�ö��
	 *  ��������:2020-11-9
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getEmendenum () {
		return emendenum;
	}   
	/**
	 * ����emendenum��Setter����.���������޶�ö��
	 * ��������:2020-11-9
	 * @param newEmendenum java.lang.Integer
	 */
	public void setEmendenum (java.lang.Integer newEmendenum ) {
	 	this.emendenum = newEmendenum;
	} 	 
	
	/**
	 * ���� billversionpk��Getter����.�����������ݰ汾pk
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getBillversionpk () {
		return billversionpk;
	}   
	/**
	 * ����billversionpk��Setter����.�����������ݰ汾pk
	 * ��������:2020-11-9
	 * @param newBillversionpk java.lang.String
	 */
	public void setBillversionpk (java.lang.String newBillversionpk ) {
	 	this.billversionpk = newBillversionpk;
	} 	 
	
	/**
	 * ���� id��Getter����.��������id
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getId () {
		return id;
	}   
	/**
	 * ����id��Setter����.��������id
	 * ��������:2020-11-9
	 * @param newId java.lang.String
	 */
	public void setId (java.lang.String newId ) {
	 	this.id = newId;
	} 	 
	
	/**
	 * ���� name��Getter����.��������name
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getName () {
		return name;
	}   
	/**
	 * ����name��Setter����.��������name
	 * ��������:2020-11-9
	 * @param newName java.lang.String
	 */
	public void setName (java.lang.String newName ) {
	 	this.name = newName;
	} 	 
	
	/**
	 * ���� maketime��Getter����.���������Ƶ�ʱ��
	 *  ��������:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getMaketime () {
		return maketime;
	}   
	/**
	 * ����maketime��Setter����.���������Ƶ�ʱ��
	 * ��������:2020-11-9
	 * @param newMaketime nc.vo.pub.lang.UFDateTime
	 */
	public void setMaketime (nc.vo.pub.lang.UFDateTime newMaketime ) {
	 	this.maketime = newMaketime;
	} 	 
	
	/**
	 * ���� lastmaketime��Getter����.������������޸�ʱ��
	 *  ��������:2020-11-9
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getLastmaketime () {
		return lastmaketime;
	}   
	/**
	 * ����lastmaketime��Setter����.������������޸�ʱ��
	 * ��������:2020-11-9
	 * @param newLastmaketime nc.vo.pub.lang.UFDateTime
	 */
	public void setLastmaketime (nc.vo.pub.lang.UFDateTime newLastmaketime ) {
	 	this.lastmaketime = newLastmaketime;
	} 	 
	
	/**
	 * ���� rowno��Getter����.���������к�
	 *  ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getRowno () {
		return rowno;
	}   
	/**
	 * ����rowno��Setter����.���������к�
	 * ��������:2020-11-9
	 * @param newRowno java.lang.String
	 */
	public void setRowno (java.lang.String newRowno ) {
	 	this.rowno = newRowno;
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
	    return null;
	}   
    
	/**
	  * <p>ȡ�ñ�����.
	  * <p>
	  * ��������:2020-11-9
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
			
		return "pk_m";
	}
    
	/**
	 * <p>���ر�����
	 * <p>
	 * ��������:2020-11-9
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "development_mainEntity";
	}    
	
	/**
	 * <p>���ر�����.
	 * <p>
	 * ��������:2020-11-9
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "development_mainEntity";
	}    
    
    /**
	  * ����Ĭ�Ϸ�ʽ����������.
	  *
	  * ��������:2020-11-9
	  */
     public MainEntity() {
		super();	
	}    
	
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.development.test02.MainEntity" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("development.mainEntity");
		
   	}
     
}