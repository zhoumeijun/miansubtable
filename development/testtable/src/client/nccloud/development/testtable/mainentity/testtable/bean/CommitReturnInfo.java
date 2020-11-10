
package nccloud.development.testtable.mainentity.testtable.bean;

import java.util.Map;

import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.grid.Grid;

/**
 * ����������Ϣ
 *
 * @author weiyjc
 *
 */
public class CommitReturnInfo {

  // ָ�ɱ�־
  private boolean assignFlag;

  // ��Ƭ��Ϣ
  private BillCard billCard;

  // ������Ϣ
  private String errorMsg;

  // �б���Ϣ
  private Grid grid;

  // ǰ��̨������Ϣ
  private String interactMsg;

  // �ۺ�vo
  private Object[] objects;

  // �ύ��ָ�ɷ�����Ϣ
  private Map<String, Object> returnMsg;

  // �ɹ���Ϣ
  private String successMsg;

  // ������ʾ��Ϣ����Ԥ��Ԥ����
  private String warningMsg;

  public boolean getAssignFlag() {
    return this.assignFlag;
  }

  public BillCard getBillCard() {
    return this.billCard;
  }

  public String getErrorMsg() {
    return this.errorMsg;
  }

  public Grid getGrid() {
    return this.grid;
  }

  public String getInteractMsg() {
    return this.interactMsg;
  }

  public Object[] getObjects() {
    return this.objects;
  }

  public Map<String, Object> getReturnMsg() {
    return this.returnMsg;
  }

  public String getSuccessMsg() {
    return this.successMsg;
  }

  public String getWarningMsg() {
    return this.warningMsg;
  }

  public void setAssignFlag(boolean assignFlag) {
    this.assignFlag = assignFlag;
  }

  public void setBillCard(BillCard billCard) {
    this.billCard = billCard;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public void setGrid(Grid grid) {
    this.grid = grid;
  }

  public void setInteractMsg(String interactMsg) {
    this.interactMsg = interactMsg;
  }

  public void setObjects(Object[] objects) {
    this.objects = objects;
  }

  public void setReturnMsg(Map<String, Object> returnMsg) {
    this.returnMsg = returnMsg;
  }

  public void setSuccessMsg(String successMsg) {
    this.successMsg = successMsg;
  }

  public void setWarningMsg(String warningMsg) {
    this.warningMsg = warningMsg;
  }

}
