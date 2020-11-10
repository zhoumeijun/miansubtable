
package nccloud.development.testtable.mainentity.testtable.bean;

import java.util.List;

/**
 * @Description: �����������
 * @author wangjias
 * @date 2018-08-28
 * @version V1.0
 */
public class MultipleResult {

  /**
   * ���ö��
   *
   */
  public static enum ResultState {
    /**
     * ʧ��
     */
    FAIL(1),
    /**
     * ���ֳɹ�
     */
    PARTSUCCESS(2),
    /**
     * �ɹ�
     */
    SUCCESS(0);

    private int value;

    private ResultState(int value) {
      this.value = value;
    }

    public int getValue() {
      return this.value;
    }

  }

  /**
   * ��������
   */
  private SingleResult[] data;

  /**
   * ʧ������
   */
  private int errorNum;

  /**
   * ʧ������ �� �������ʧ�������ֶθ�ֵerrorNum(������errorNum)��
   */
  private int failNum;

  /**
   * ��Ϣ
   */
  private String msg;

  /**
   * ��Ϣ����
   */
  private String[] msgDetail;

  /**
   * ״̬��ʶ
   */
  private int status;

  /**
   * �ɹ�����
   */
  private int successNum;

  /**
   * ����
   */
  private int total;

  public MultipleResult(ResultState state, String msg, String[] msgDetail,
                        SingleResult[] data, int total, int errorNum, int successNum,
                        int failNum) {
    super();
    this.status = state.getValue();
    this.msg = msg;
    this.msgDetail = msgDetail;
    this.data = data;
    this.total = total;
    this.errorNum = errorNum;
    this.successNum = successNum;
    this.failNum = failNum;
  }

  private MultipleResult(ResultState state, String msg, String[] msgDetail,
                         SingleResult[] data) {
    super();
    this.status = state.getValue();
    this.msg = msg;
    this.msgDetail = msgDetail;
    this.data = data;
  }

  /**
   * �����������
   *
   * @param hasSuccFlag
   *          �Ƿ��гɹ�
   * @param hasErrFlag
   *          �Ƿ���ʧ��
   * @param list
   *          ִ�н�������б�
   * @return
   */
  public static MultipleResult buildResult(boolean hasSuccFlag,
                                           boolean hasErrFlag, List<SingleResult> list, List<String> errMsgDetail) {
    String msg = null;
    ResultState status = ResultState.FAIL;
    if (hasSuccFlag && hasErrFlag) {
      msg = nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
              "tm_tmpub_ncc003_0", "0tm_tmpub_ncc003-0004")/*@res ���ֳɹ���*/;
      status = ResultState.PARTSUCCESS;
    }
    else if (hasSuccFlag && !hasErrFlag) {
      msg = nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
              "tm_tmpub_ncc003_0", "0tm_tmpub_ncc003-0005")/*@res ȫ���ɹ���*/;
      status = ResultState.SUCCESS;
    }
    else if (!hasSuccFlag && hasErrFlag) {
      msg = nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
              "tm_tmpub_ncc003_0", "0tm_tmpub_ncc003-0006")/*@res ȫ��ʧ�ܣ�*/;
      status = ResultState.FAIL;
    }
    SingleResult[] results =
            list.isEmpty() ? null : list.toArray(new SingleResult[0]);
    String[] msgDetail = errMsgDetail.isEmpty() ? null
            : errMsgDetail.toArray(new String[errMsgDetail.size()]);
    return new MultipleResult(status, msg, msgDetail, results);
  }

  /**
   * �����������
   *
   * @param hasSuccFlag
   *          �Ƿ��гɹ�
   * @param hasErrFlag
   *          �Ƿ���ʧ��
   * @param list
   *          ִ�н�������б�
   * @return
   */
  public static MultipleResult buildResult(boolean hasSuccFlag,
                                           boolean hasErrFlag, List<SingleResult> list, List<String> errMsgDetail,
                                           int total, int errorNum, int successNum) {
    String msg = null;
    ResultState status = ResultState.FAIL;
    if (hasSuccFlag && hasErrFlag) {
      msg = nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
              "tm_tmpub_ncc003_0", "0tm_tmpub_ncc003-0004")/*@res ���ֳɹ���*/;
      status = ResultState.PARTSUCCESS;
    }
    else if (hasSuccFlag && !hasErrFlag) {
      msg = nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
              "tm_tmpub_ncc003_0", "0tm_tmpub_ncc003-0005")/*@res ȫ���ɹ���*/;
      status = ResultState.SUCCESS;
    }
    else if (!hasSuccFlag && hasErrFlag) {
      msg = nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
              "tm_tmpub_ncc003_0", "0tm_tmpub_ncc003-0006")/*@res ȫ��ʧ�ܣ�*/;
      status = ResultState.FAIL;
    }
    SingleResult[] results =
            list.isEmpty() ? null : list.toArray(new SingleResult[0]);
    String[] msgDetail = errMsgDetail.isEmpty() ? null
            : errMsgDetail.toArray(new String[errMsgDetail.size()]);
    return new MultipleResult(status, msg, msgDetail, results, total, errorNum,
            successNum, errorNum);
  }

  public SingleResult[] getData() {
    return this.data;
  }

  public int getErrorNum() {
    return this.errorNum;
  }

  public int getFailNum() {
    return this.failNum;
  }

  public String getMsg() {
    return this.msg;
  }

  public String[] getMsgDetail() {
    return this.msgDetail;
  }

  public int getStatus() {
    return this.status;
  }

  public int getSuccessNum() {
    return this.successNum;
  }

  public int getTotal() {
    return this.total;
  }

  public void setData(SingleResult[] data) {
    this.data = data;
  }

  public void setErrorNum(int errorNum) {
    this.errorNum = errorNum;
  }

  public void setFailNum(int failNum) {
    this.failNum = failNum;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public void setMsgDetail(String[] msgDetail) {
    this.msgDetail = msgDetail;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public void setSuccessNum(int successNum) {
    this.successNum = successNum;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}
