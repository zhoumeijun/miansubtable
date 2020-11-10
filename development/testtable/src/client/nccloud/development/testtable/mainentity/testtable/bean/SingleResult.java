
package nccloud.development.testtable.mainentity.testtable.bean;

/**
 * @Description: �����������
 * @author wangjias
 * @date 2018-08-28
 * @version V1.0
 */
public class SingleResult {

  /**
   * ��Ϣ
   */
  private String msg;

  /**
   * ����
   */
  private String pk;

  /**
   * ������
   */
  private Object result;

  /**
   * �к�
   */
  private Integer rowIndex;

  /**
   * ִ�б�־
   */
  private int state;

  /**
   * ���ݱ��
   */
  private String vbillno;

  public SingleResult() {
    super();
  }

  private SingleResult(MultipleResult.ResultState state, String msg,
                       Object result, String pk, String vbillno, Integer rowIndex) {
    super();
    this.state = state.getValue();
    this.msg = msg;
    this.result = result;
    this.pk = pk;
    this.vbillno = vbillno;
    this.rowIndex = rowIndex;
  }

  /**
   * ����ʧ�ܵĵ��ʲ������
   *
   * @param pk
   *          ����
   * @param vbillno
   *          ���ݱ��
   * @param rowIndex
   *          �к�
   * @param msg
   *          ������Ϣ
   * @return
   */
  public static SingleResult buildErrResult(String pk, String vbillno,
                                            Integer rowIndex, String msg) {
    return new SingleResult(MultipleResult.ResultState.FAIL, msg, null, pk,
            vbillno, rowIndex);
  }

  /**
   * �����ɹ��ĵ��ʲ������
   *
   * @param pk
   *          ����
   * @param vbillno
   *          ���ݱ��
   * @param rowIndex
   *          �к�
   * @param result
   *          �������
   * @return
   */
  public static SingleResult buildSuccessResult(String pk, String vbillno,
                                                Integer rowIndex, Object result) {
    return new SingleResult(MultipleResult.ResultState.SUCCESS,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
                    "tm_tmpub_ncc003_0", "0tm_tmpub_ncc003-0010")/*@res �ɹ�*/,
            result, pk, vbillno, rowIndex);
  }

  public String getMsg() {
    return this.msg;
  }

  public String getPk() {
    return this.pk;
  }

  public Object getResult() {
    return this.result;
  }

  public Integer getRowIndex() {
    return this.rowIndex;
  }

  public int getState() {
    return this.state;
  }

  public String getVbillno() {
    return this.vbillno;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public void setPk(String pk) {
    this.pk = pk;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public void setState(int state) {
    this.state = state;
  }

  public void setVbillno(String vbillno) {
    this.vbillno = vbillno;
  }

}
