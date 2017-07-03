package library3.library3.model.dao;

/**
 * Created by San on 2017/4/9.
 *
 * 坐位预约的表
 */
public class SubscribeSeatTable {

    public static final String SUBSCRIBESEAT_TABLE="create table SubscribeSeatTable(" +
            "_subscribeSeatId integer primary key autoincrement," +//预约座位的id
            "subscribeSeatNumberAndStudentNumber     vachar," + //座位号
            "subscribeSeatStudentName    vachar," + //预约的人
            "subscribeSeatStudentAccount    vachar," + //预约的人
            "subscribeSeatStudentId    integer," + //预约的人
            "subscribeSeatStartTime  vachar," + //开始时间
            "subscribeSeatEndTime    vachar )"; //结束时间




}
