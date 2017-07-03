package library3.library3.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by San on 2017/5/9.
 *
 * jdbc的工具类
 */
public class JDBCUtils {

    //用户的名称
    public static final String  USER="root";
    //用户的密码
    public static final String  PASSWORD="newpassword";
    //地址
    public static final String  JDBCURL="jdbc:mysql://123.207.101.128:3306/Library";
    //驱动
    public static final String  DRIVER="com.mysql.jdbc.Driver";

    //关闭连接
    public static void realease(Statement statement, Connection conn, ResultSet rs){

        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }


    }

   //获取数据库连接
    public static Connection getConnection() throws Exception{

        Class.forName(DRIVER);

        // 通过 DriverManager 的 getConnection() 方法获取数据库连接.
        return DriverManager.getConnection(JDBCURL,USER, PASSWORD);
    }



}

