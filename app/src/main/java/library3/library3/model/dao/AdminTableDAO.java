//package library3.library3.model.dao;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.util.Log;
//
//import com.android.volley.NetworkResponse;
//import com.android.volley.RequestQueue;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.HttpHeaderParser;
//import com.android.volley.toolbox.StringRequest;
//import com.android.volley.toolbox.Volley;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.UnsupportedEncodingException;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//import library3.library3.model.bean.AdminInfo;
//import library3.library3.model.db.DBHelper;
//import library3.library3.utils.CacheUtils;
//import library3.library3.utils.JDBCUtils;
//
//
///**
// * Created by San on 2017/4/9.
// *
// * 管理員的表的操作類
// */
//public class AdminTableDAO {
//    private Connection conn;
//    private Context context;
//    public static final String JSON_STRING = "jsonString";
//    DBHelper dbHelper;
//    private SQLiteDatabase database;
//    private final List<AdminInfo> list;
//    private List<AdminInfo> adminInfos;
//
//
//    public AdminTableDAO(Context context) {
//        this.context=context;
//        dbHelper=new DBHelper(context);
//        list = new ArrayList<>();
//        adminInfos = new ArrayList<>();
//    }
//
////    public void insertAdminTable(AdminInfo adminInfo){
////        database = dbHelper.getReadableDatabase();
////        ContentValues values=new ContentValues();
////
////        values.put("adminNumber",adminInfo.getAdminNumber());
////        values.put("adminPassword",adminInfo.getAdminPassword());
////        values.put("adminName",adminInfo.getAdminName());
////        values.put("adminJob",adminInfo.getAdminJob());
////
////        long insert = database.insert("AdminTable", null, values);
////        adminInfo.setAdminId((int) insert);
////
////        Log.e("AdminTableDAO","添加的管理员的id为："+insert);
////    }
////
////
////    public void updateAdminTable(AdminInfo adminInfo){
////        database = dbHelper.getReadableDatabase();
////        ContentValues values=new ContentValues();
////
////        values.put("adminNumber",adminInfo.getAdminNumber());
////        values.put("adminPassword",adminInfo.getAdminPassword());
////        values.put("adminName",adminInfo.getAdminName());
////        values.put("adminJob",adminInfo.getAdminJob());
////
////        int update = database.update("AdminTable", values, "_adminId= " + adminInfo.getAdminId(), null);
////
////        Log.e("AdminTableDAO","更改的管理员的id为："+update);
////    }
////
////    public void deleteAdminTable(int id){
////        database = dbHelper.getReadableDatabase();
////        int delete = database.delete("AdminTable", "_adminId= " +id, null);
////
////        Log.e("AdminTableDAO","删除的管理员的id为："+delete);
////
////    }
//
//    public void insertAdminTable(final AdminInfo adminInfo) {
//
////1. 获取数据库连接
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                Statement statement = null;
//
//                try {
//
//                    conn = JDBCUtils.getConnection();
//                    //3. 准备插入的 SQL 语句
//
//
//                    String sql = "INSERT INTO AdminTable (adminId, adminNumber, " +
//                            "adminPassword, adminName, adminJob) VALUES (NULL, '"
//                            + adminInfo.getAdminNumber() + "', '"
//                            + adminInfo.getAdminPassword() + "', '"
//                            + adminInfo.getAdminName() + "', '"
//                            + adminInfo.getAdminJob() + "')";
//
//                    Log.e("TAG","sql:"+ sql);
//
//                    statement = conn.createStatement();
//
//                    statement.executeUpdate(sql);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    try {
//                        //5. 关闭 Statement 对象.
//                        if (statement != null)
//                            statement.close();
//                    } catch (Exception e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    } finally {
//                        //2. 关闭连接
////                if(conn != null)
////                    conn.close();
//                    }
//                }
//
//
//            }
//        }).start();
//
//
//    }
//
//
//    public void updateAdminTable(final AdminInfo adminInfo) {
//
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                Statement statement = null;
//
//                try {
//
//                    conn = JDBCUtils.getConnection();
//
//                    String sql = "UPDATE AdminTable SET "
//                            + "adminNumber = '" + adminInfo.getAdminNumber() + "',"
//                            + "adminPassword='" + adminInfo.getAdminPassword() + "',"
//                            + "adminName='" + adminInfo.getAdminName() + "',"
//                            + "adminJob='" + adminInfo.getAdminJob() + "'"
//                            + " WHERE adminId = " + adminInfo.getAdminId() + "";
//
//                    statement = conn.createStatement();
//
//                    statement.executeUpdate(sql);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    try {
//                        //5. 关闭 Statement 对象.
//                        if (statement != null)
//                            statement.close();
//                    } catch (Exception e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    } finally {
//                        //2. 关闭连接
////                if(conn != null)
////                    conn.close();
//                    }
//                }
//
//
//            }
//        }).start();
//
//
//    }
//
//    public void deleteAdminTable(final int id) {
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                Statement statement = null;
//
//                try {
//
//                    conn = JDBCUtils.getConnection();
//
//                    String sql = "DELETE FROM AdminTable WHERE adminId = " + id + "";
//
//                    statement = conn.createStatement();
//
//                    statement.executeUpdate(sql);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    try {
//                        //5. 关闭 Statement 对象.
//                        if (statement != null)
//                            statement.close();
//                    } catch (Exception e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    } finally {
//                        //2. 关闭连接
////                if(conn != null)
////                    conn.close();
//                    }
//                }
//
//
//            }
//        }).start();
//
//
//    }
//
//    public List<AdminInfo> queryAdminTable() {
//
//        getDataFromVolley();
//
//        String getJson = CacheUtils.getString(context, JSON_STRING);
//        if (!getJson.equals("")){
//
//            processData(getJson);
//        }
//        Log.e("TAG","adminInfossssssssssss:"+ adminInfos);
//
//
//        return adminInfos;
//
//
//    }
//
//    private void getDataFromVolley() {
//
//        String bookUrl = "http://robot7sun.cn:7777/L05_Web/ShopInfoListServlet";
//        RequestQueue mQueue = Volley.newRequestQueue(context);
//
//        StringRequest stringRequest = new StringRequest(bookUrl, new com.android.volley.Response.Listener<String>() {
//            @Override
//            public void onResponse(String jsonString) {
//
//                CacheUtils.putString(context, JSON_STRING,jsonString);
//
//                processData(jsonString);
//            }
//
//
//        }, new com.android.volley.Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError volleyError) {
//
//            }
//        }) {
//
//            //将数据转换为非乱码的文字
//            @Override
//            protected com.android.volley.Response<String> parseNetworkResponse(NetworkResponse response) {
//                try {
//                    String parsed = new String(response.data, "UTF-8");
//                    return com.android.volley.Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
//                } catch (UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                }
//                return super.parseNetworkResponse(response);
//            }
//
//        };
//        mQueue.add(stringRequest);
//
//
//    }
//
//    private void processData(String json) {
//
//        adminInfos = getGson(json);
//        list.addAll(adminInfos);
//
//    }
//
//    private List<AdminInfo> getGson(String json) {
//        return new Gson().fromJson(json,new TypeToken<List<AdminInfo>>(){}.getType());
//    }
//
//
//
//
//
//
//
//
//
//
////    public List<AdminInfo> queryAdminTable(){
////        database = dbHelper.getReadableDatabase();
////        List<AdminInfo> list =new ArrayList<>();
////        Cursor cursor = database.query("AdminTable", null, null, null, null, null, null);
////        while(cursor.moveToNext()){
////
////            int adminId = cursor.getInt(0);
////            String adminNumber = cursor.getString(1);
////            String adminPassword = cursor.getString(2);
////            String adminName = cursor.getString(3);
////            String adminJob = cursor.getString(4);
////
////            list.add(new AdminInfo(
////                    adminId,
////                    adminNumber,
////                    adminPassword,
////                    adminName,
////                    adminJob));
////        }
////        Log.e("AdminTableDAO","AdminTableDAO查询的List的数据为："+list.toString());
////        return list;
////    }
//
//}
package library3.library3.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import library3.library3.model.bean.AdminInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 *
 * 管理員的表的操作類
 */
public class AdminTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public AdminTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertAdminTable(AdminInfo adminInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("adminNumber",adminInfo.getAdminNumber());
        values.put("adminPassword",adminInfo.getAdminPassword());
        values.put("adminName",adminInfo.getAdminName());
        values.put("adminJob",adminInfo.getAdminJob());

        long insert = database.insert("AdminTable", null, values);
        adminInfo.setAdminId((int) insert);

        Log.e("AdminTableDAO","添加的管理员的id为："+insert);
    }


    public void updateAdminTable(AdminInfo adminInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("adminNumber",adminInfo.getAdminNumber());
        values.put("adminPassword",adminInfo.getAdminPassword());
        values.put("adminName",adminInfo.getAdminName());
        values.put("adminJob",adminInfo.getAdminJob());

        int update = database.update("AdminTable", values, "_adminId= " + adminInfo.getAdminId(), null);

        Log.e("AdminTableDAO","更改的管理员的id为："+update);
    }

    public void deleteAdminTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("AdminTable", "_adminId= " +id, null);

        Log.e("AdminTableDAO","删除的管理员的id为："+delete);

    }


    public List<AdminInfo> queryAdminTable(){
        database = dbHelper.getReadableDatabase();
        List<AdminInfo> list =new ArrayList<>();
        Cursor cursor = database.query("AdminTable", null, null, null, null, null, null);
        while(cursor.moveToNext()){

            int adminId = cursor.getInt(0);
            String adminNumber = cursor.getString(1);
            String adminPassword = cursor.getString(2);
            String adminName = cursor.getString(3);
            String adminJob = cursor.getString(4);

            list.add(new AdminInfo(
                    adminId,
                    adminNumber,
                    adminPassword,
                    adminName,
                    adminJob));
        }
        Log.e("AdminTableDAO","AdminTableDAO查询的List的数据为："+list.toString());
        return list;
    }

}
