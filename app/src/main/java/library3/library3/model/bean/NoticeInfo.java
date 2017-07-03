package library3.library3.model.bean;

/**
 * Created by San on 2017/4/8.
 * 公告的bean类
 */
public class NoticeInfo {

    //公告的id
    private int noticeId;
    //标题
    private String noticeTitle;
    //内容
    private String noticeContent;
    //时间
    private String noticeTime;
    //管理员名字
    private String noticeAdminName;

    public NoticeInfo(
            int noticeId,
            String noticeTitle,
            String noticeContent,
            String noticeTime,
            String noticeAdminName) {
        this.noticeId = noticeId;
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
        this.noticeTime = noticeTime;
        this.noticeAdminName = noticeAdminName;
    }

    @Override
    public String toString() {
        return "NoticeInfo{" +
                "noticeId=" + noticeId +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeTime='" + noticeTime + '\'' +
                ", noticeAdminName='" + noticeAdminName + '\'' +
                '}';
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticeAdminName() {
        return noticeAdminName;
    }

    public void setNoticeAdminName(String noticeAdminName) {
        this.noticeAdminName = noticeAdminName;
    }
}
