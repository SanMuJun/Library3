package library3.library3.model.bean;

/**
 * Created by San on 2017/4/3.
 * 管理员的bean类
 */
public class AdminInfo {

    //管理员id
    private int adminId;
    //管理员账号
    private String adminNumber;
    //密码
    private String adminPassword;
    //名字
    private String adminName;
    //职务
    private String adminJob;


    public AdminInfo(int adminId, String adminNumber, String adminPassword, String adminName, String adminJob) {
        this.adminId = adminId;
        this.adminNumber = adminNumber;
        this.adminPassword = adminPassword;
        this.adminName = adminName;
        this.adminJob = adminJob;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(String adminNumber) {
        this.adminNumber = adminNumber;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminJob() {
        return adminJob;
    }

    public void setAdminJob(String adminJob) {
        this.adminJob = adminJob;
    }


    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminId=" + adminId +
                ", adminNumber='" + adminNumber + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminJob='" + adminJob + '\'' +
                '}';
    }
}
