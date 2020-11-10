
package nccloud.development.testtable.mainentity.testtable.util;


import java.util.HashMap;
import java.util.Map;

import nccloud.itf.development.testtable.IMainentityMaintain;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.pubitf.org.cache.IOrgUnitPubService_C;
import nccloud.vo.development.testtable.MainEntityConst;
import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nccloud.base.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.SessionContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;

public class CommonUtil {

  private static IMainentityMaintain maintain = null;

  private static IMDPersistenceQueryService persistenceQueryService = null;

  private static ICloudScriptPFlowService cloudScriptPFlowService = null;

  /**
   * �������ͱ���
   *
   * @return
   */
  public static String getBillTypeCode() {
    return MainEntityConst.CONST_BILLTYPE_COST;
  }


  /**
   * ��ȡ��ǰҵ��ʱ��
   *
   * @return
   */
  public static UFDate getBusiDate() {
    return new UFDate(SessionContext.getInstance().getClientInfo()
        .getBizDateTime());
  }

  /**
   * ��ȡ��ǰҵ������ʱ��
   *
   * @return
   */
  public static UFDateTime getBusiDateTime() {
    return new UFDateTime(SessionContext.getInstance().getClientInfo()
        .getBizDateTime());
  }


  /**
   * ƽ̨�ű�������
   *
   * @return
   */
  public static synchronized ICloudScriptPFlowService getCloudScriptPFlowService() {
    if (CommonUtil.cloudScriptPFlowService == null) {
      CommonUtil.cloudScriptPFlowService =
          ServiceLocator.find(ICloudScriptPFlowService.class);
    }
    return CommonUtil.cloudScriptPFlowService;
  }

/**
   * ��ѯ������֯���ڼ���
   *
   * @param pk_org
   * @return
   * @throws BusinessException
   */
  public static String getGroupByOrg(String pk_org) throws BusinessException {
    IOrgUnitPubService_C orgUnitQryService =
        ServiceLocator.find(IOrgUnitPubService_C.class);
    OrgVO[] orgVOs = orgUnitQryService.getOrgs(new String[] {
      pk_org
    }, new String[] {
      OrgVO.PK_GROUP
    });
    if ((orgVOs == null) || (orgVOs.length <= 0)) {
      return null;
    }
    return (String) orgVOs[0].getAttributeValue(OrgVO.PK_GROUP);
  }

  /**
   * ��ѯ������֯���°汾
   *
   * @param pk_org
   * @return
   */
  public static String getOrgVByOrg(String pk_org) throws BusinessException {
    IOrgUnitPubService_C orgUnitQryService =
        ServiceLocator.find(IOrgUnitPubService_C.class);
    HashMap<String, String> org_vs =
        orgUnitQryService.getNewVIDSByOrgIDS(new String[] {
          pk_org
        });
    if ((org_vs == null) || (org_vs.size() <= 0)) {
      return null;
    }
    return org_vs.get(pk_org);
  }

  /**
   * �������
   *
   * @return
   */
  public static synchronized IMainentityMaintain getFinancingcostMaintainService() {
    if (CommonUtil.maintain == null) {
      CommonUtil.maintain = ServiceLocator.find(IMainentityMaintain.class);
    }
    return CommonUtil.maintain;
  }

  /**
   * Ԫ���ݲ�ѯ����
   *
   * @return
   */
  public static synchronized IMDPersistenceQueryService getMDPersistenceQueryService() {
    if (CommonUtil.persistenceQueryService == null) {
      CommonUtil.persistenceQueryService =
          ServiceLocator.find(IMDPersistenceQueryService.class);
    }
    return CommonUtil.persistenceQueryService;
  }

  /**
   * ��̨VO��ֵǰ̨��ʱ���
   *
   * @param pk_org
   * @return
   */
  public static void setBillsTs(Map<String, String> pkMapTs,
      AbstractBill[] bills) {
    if (pkMapTs == null) {
      return;
    }
    for (AbstractBill bill : bills) {
      String ts = pkMapTs.get(bill.getParent().getPrimaryKey());
      if ((ts == null) || ts.equals("")) {
        break;
      }
      bill.getParent().setAttributeValue(MainEntityConst.CONST_TS, ts);
    }
  }


}
