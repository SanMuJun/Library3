package library3.library3.model.dao;

/**
 * Created by San on 2017/4/3.
 * 学生的表
 */
public class StudentTable {


    public static final String STUDENT_TABLE="create table StudentTable(" +
            "_studentId integer primary key autoincrement," +//学生id
            "studentNumber   vachar," + //学号
            "studentPassword vachar," + //密码
            "studentName     vachar," + //名字
            "studentMajor    vachar," + //专业
            "studentClass    vachar," + //班级
            "studentCollege    vachar," + //班级
            "studentSeatNumber   vachar )"; //学院
}
