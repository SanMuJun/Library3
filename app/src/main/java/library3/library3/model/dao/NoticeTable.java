package library3.library3.model.dao;

/**
 * Created by San on 2017/4/8.
 */
public class NoticeTable {

    public static final String NOTICE_TABLE="create table NoticeTable(" +
            "_noticeId integer primary key autoincrement," +//公告id
            "noticeTitle      vachar," + //标题
            "noticeContent    vachar," + //内容
            "noticeTime       vachar," + //时间
            "noticeAdminName  vachar )";//管理员名字

}
