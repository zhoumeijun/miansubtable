
package nccloud.development.testtable.mainentity.testtable.bean;

import java.util.Arrays;
import java.util.Map;

import nc.vo.pub.lang.UFDate;

public class BillOperatorParam {

  /**
   * ��������
   */
  private UFDate endDate;

  /**
   * ҳ�����
   */
  private String pageCode;

  /**
   * ����
   */
  private String pk;

  /**
   * �������к�ӳ���ϵ
   */
  private Map<String, Integer> pkMapRowIndex;

  /**
   * ������ʱ�����ӳ���ϵ �ش�
   */
  private Map<String, String> pkMapTs;

  /**
   * �����뵥�ݱ�ŵ�ӳ���ϵ �ش�
   */
  private Map<String, String> pkMapVbillno;

  /**
   * ��������
   */
  private String[] pks;

  /**
   * ��ʼ����
   */
  private UFDate startDate;

  /**
   * ʱ���
   */
  private String ts;

  // �ύָ��
  private Object userObj;

  public UFDate getEndDate() {
    return this.endDate;
  }

  public String getPageCode() {
    return this.pageCode;
  }

  public String getPk() {
    return this.pk;
  }

  public Map<String, Integer> getPkMapRowIndex() {
    return this.pkMapRowIndex;
  }

  public Map<String, String> getPkMapTs() {
    return this.pkMapTs;
  }

  public Map<String, String> getPkMapVbillno() {
    return this.pkMapVbillno;
  }

  public String[] getPks() {
    return this.pks;
  }

  public UFDate getStartDate() {
    return this.startDate;
  }

  public String getTs() {
    return this.ts;
  }

  public Object getUserObj() {
    return this.userObj;
  }

  public void setEndDate(UFDate endDate) {
    this.endDate = endDate;
  }

  public void setPageCode(String pageCode) {
    this.pageCode = pageCode;
  }

  public void setPk(String pk) {
    this.pk = pk;
  }

  public void setPkMapRowIndex(Map<String, Integer> pkMapRowIndex) {
    this.pkMapRowIndex = pkMapRowIndex;
  }

  public void setPkMapTs(Map<String, String> pkMapTs) {
    this.pkMapTs = pkMapTs;
  }

  public void setPkMapVbillno(Map<String, String> pkMapVbillno) {
    this.pkMapVbillno = pkMapVbillno;
  }

  public void setPks(String[] pks) {
    this.pks = pks;
  }

  public void setStartDate(UFDate startDate) {
    this.startDate = startDate;
  }

  public void setTs(String ts) {
    this.ts = ts;
  }

  public void setUserObj(Object userObj) {
    this.userObj = userObj;
  }

  @Override
  public String toString() {
    return "CardOperatorParam [pk=" + this.pk + ", pks="
            + Arrays.toString(this.pks) + ", ts=" + this.ts + ", pageCode="
            + this.pageCode + "]";
  }

}
