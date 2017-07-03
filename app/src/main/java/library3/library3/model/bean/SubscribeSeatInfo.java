package library3.library3.model.bean;

/**
 * Created by San on 2017/4/9.
 *预约座位的bean类
 */
public class SubscribeSeatInfo {

    //id
    private int subscribeSeatId;

    //座位号
    private String subscribeSeatNumberAndStudentNumber;

    //预约的学生的姓名
    private String subscribeSeatStudentName;

    //预约的学生的账号
    private String subscribeSeatStudentAccount;

    //预约的学生id
    private int subscribeSeatStudentId;

    //开始时间
    private String subscribeSeatStartTime;

    //结束的时间
    private String subscribeSeatEndTime;

    public SubscribeSeatInfo(int subscribeSeatId,
                             String subscribeSeatNumberAndStudentNumber,
                             String subscribeSeatStudentName,
                             String subscribeSeatStudentAccount,
                             int subscribeSeatStudentId,
                             String subscribeSeatStartTime,
                             String subscribeSeatEndTime) {
        this.subscribeSeatId = subscribeSeatId;
        this.subscribeSeatNumberAndStudentNumber = subscribeSeatNumberAndStudentNumber;
        this.subscribeSeatStudentName = subscribeSeatStudentName;
        this.subscribeSeatStudentAccount = subscribeSeatStudentAccount;
        this.subscribeSeatStudentId = subscribeSeatStudentId;
        this.subscribeSeatStartTime = subscribeSeatStartTime;
        this.subscribeSeatEndTime = subscribeSeatEndTime;
    }


    public int getSubscribeSeatId() {
        return subscribeSeatId;
    }

    public void setSubscribeSeatId(int subscribeSeatId) {
        this.subscribeSeatId = subscribeSeatId;
    }

    public String getSubscribeSeatNumberAndStudentNumber() {
        return subscribeSeatNumberAndStudentNumber;
    }

    public void setSubscribeSeatNumberAndStudentNumber(String subscribeSeatNumberAndStudentNumber) {
        this.subscribeSeatNumberAndStudentNumber = subscribeSeatNumberAndStudentNumber;
    }

    public String getSubscribeSeatStudentName() {
        return subscribeSeatStudentName;
    }

    public void setSubscribeSeatStudentName(String subscribeSeatStudentName) {
        this.subscribeSeatStudentName = subscribeSeatStudentName;
    }

    public String getSubscribeSeatStudentAccount() {
        return subscribeSeatStudentAccount;
    }

    public void setSubscribeSeatStudentAccount(String subscribeSeatStudentAccount) {
        this.subscribeSeatStudentAccount = subscribeSeatStudentAccount;
    }

    public int getSubscribeSeatStudentId() {
        return subscribeSeatStudentId;
    }

    public void setSubscribeSeatStudentId(int subscribeSeatStudentId) {
        this.subscribeSeatStudentId = subscribeSeatStudentId;
    }

    public String getSubscribeSeatStartTime() {
        return subscribeSeatStartTime;
    }

    public void setSubscribeSeatStartTime(String subscribeSeatStartTime) {
        this.subscribeSeatStartTime = subscribeSeatStartTime;
    }

    public String getSubscribeSeatEndTime() {
        return subscribeSeatEndTime;
    }

    public void setSubscribeSeatEndTime(String subscribeSeatEndTime) {
        this.subscribeSeatEndTime = subscribeSeatEndTime;
    }

    @Override
    public String toString() {
        return "SubscribeSeatInfo{" +
                "subscribeSeatId=" + subscribeSeatId +
                ", subscribeSeatNumberAndStudentNumber='" + subscribeSeatNumberAndStudentNumber + '\'' +
                ", subscribeSeatStudentName='" + subscribeSeatStudentName + '\'' +
                ", subscribeSeatStudentAccount='" + subscribeSeatStudentAccount + '\'' +
                ", subscribeSeatStudentId='" + subscribeSeatStudentId + '\'' +
                ", subscribeSeatStartTime='" + subscribeSeatStartTime + '\'' +
                ", subscribeSeatEndTime='" + subscribeSeatEndTime + '\'' +
                '}';
    }
}
