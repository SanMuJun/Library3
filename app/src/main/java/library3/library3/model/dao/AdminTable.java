package library3.library3.model.dao;

/**
 * Created by San on 2017/4/3.
 * 管理员的表
 */
public class AdminTable {

    public static final String ADMIN_TABLE="create table AdminTable(" +
            "_adminId integer primary key autoincrement," +//学生id
            "adminNumber   vachar," + //账号
            "adminPassword vachar," + //密码
            "adminName     vachar," + //名字
            "adminJob      vachar )"; //工作

}
