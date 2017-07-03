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
//import library3.library3.model.bean.NoticeInfo;
//import library3.library3.model.db.DBHelper;
//import library3.library3.utils.CacheUtils;
//import library3.library3.utils.JDBCUtils;
//
//
///**
// * Created by San on 2017/4/9.
// *
// * 公告的表的操作類
// */
//public class NoticeTableDAO {
//
//    public static final String JSON_NOTICE = "json_notice";
//    private Context context;
//
//    DBHelper dbHelper;
//    private SQLiteDatabase database;
//    private List<NoticeInfo> adminInfos;
//    private final List<NoticeInfo> listNotice;
//
//    public NoticeTableDAO(Context context) {
////        dbHelper=new DBHelper(context);
//
//        this.context=context;
//        listNotice = new ArrayList<>();
//        adminInfos = new ArrayList<>();
//
//    }
//
//
//    public void insertNoticeTable(final NoticeInfo noticeInfo){
//
////        database = dbHelper.getReadableDatabase();
////        ContentValues values=new ContentValues();
////
////        values.put("noticeTitle",noticeInfo.getNoticeTitle());
////        values.put("noticeContent",noticeInfo.getNoticeContent());
////        values.put("noticeTime",noticeInfo.getNoticeTime());
////        values.put("noticeAdminName",noticeInfo.getNoticeAdminName());
////
////
////        long insert = database.insert("NoticeTable", null, values);
////        noticeInfo.setNoticeId((int) insert);
////
////        Log.e("Tag","添加的id为："+insert);
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                Statement statement = null;
//
//                try {
//
//                    Connection conn = JDBCUtils.getConnection();
//                    //3. 准备插入的 SQL 语句
//
//
//                    String sql = "INSERT INTO NoticeTable (noticeId, " +
//                            "noticeTitle, noticeContent, noticeTime,noticeAdminName) VALUES (NULL, '"
//                            + noticeInfo.getNoticeTitle() + "', '"
//                            + noticeInfo.getNoticeContent() + "', '"
//                            + noticeInfo.getNoticeTime() + "', '"
//                            + noticeInfo.getNoticeAdminName() + "')";
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
//    public void updateNoticeTable(NoticeInfo noticeInfo){
////        database = dbHelper.getReadableDatabase();
////        ContentValues values=new ContentValues();
////
////        values.put("noticeTitle",noticeInfo.getNoticeTitle());
////        values.put("noticeContent",noticeInfo.getNoticeContent());
////        values.put("noticeTime",noticeInfo.getNoticeTime());
////        values.put("noticeAdminName",noticeInfo.getNoticeAdminName());
////
////        int update = database.update("NoticeTable", values, "_noticeId= " + noticeInfo.getNoticeId(), null);
////
////        Log.e("Tag","添加的id为："+update);
//    }
//
//    public void deleteNoticeTable(final int id){
////        database = dbHelper.getReadableDatabase();
//
////        int delete = database.delete("NoticeTable", "_noticeId= " +id, null);
////
////        Log.e("Tag","删除的id为："+delete);
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
//                    Connection conn = JDBCUtils.getConnection();
//                    String sql = "DELETE FROM NoticeTable WHERE noticeId = " + id + "";
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
//    }
//
//
//    public List<NoticeInfo> queryNoticeTable(){
////        database = dbHelper.getReadableDatabase();
////        List<NoticeInfo> list =new ArrayList<>();
////        Cursor cursor = database.query("NoticeTable", null, null, null, null, null, "_noticeId desc");
////        while(cursor.moveToNext()){
////
////            int noticeId = cursor.getInt(0);
////            String noticeTitle = cursor.getString(1);
////            String noticeContent = cursor.getString(2);
////            String noticeTime = cursor.getString(3);
////            String noticeAdminName = cursor.getString(4);
////
////            list.add(new NoticeInfo(
////                    noticeId,
////                    noticeTitle,
////                    noticeContent,
////                    noticeTime,
////                    noticeAdminName));
////        }
////        Log.e("Tag","NoticeTableDAO查询的List的数据为："+list.toString());
//
//        getDataFromVolley();
//
//        String getJson = CacheUtils.getString(context, JSON_NOTICE);
//        if (!getJson.equals("")){
//
//            processData(getJson);
//        }
//        Log.e("TAG","List<NoticeInfo>:"+ adminInfos);
//
//
//        return adminInfos;
//    }
//
//    private void getDataFromVolley() {
//
//        String bookUrl = "http://robot7sun.cn:7777/L05_Web/NoticeServlet";
//        RequestQueue mQueue = Volley.newRequestQueue(context);
//
//        StringRequest stringRequest = new StringRequest(bookUrl, new com.android.volley.Response.Listener<String>() {
//            @Override
//            public void onResponse(String jsonString) {
//
//                CacheUtils.putString(context, JSON_NOTICE,jsonString);
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
//        listNotice.addAll(adminInfos);
//
//    }
//
//    private List<NoticeInfo> getGson(String json) {
//        return new Gson().fromJson(json,new TypeToken<List<NoticeInfo>>(){}.getType());
//    }
//
//
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

import library3.library3.model.bean.NoticeInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 *
 * 公告的表的操作類
 */
public class NoticeTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public NoticeTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertNoticeTable(NoticeInfo noticeInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("noticeTitle",noticeInfo.getNoticeTitle());
        values.put("noticeContent",noticeInfo.getNoticeContent());
        values.put("noticeTime",noticeInfo.getNoticeTime());
        values.put("noticeAdminName",noticeInfo.getNoticeAdminName());


        long insert = database.insert("NoticeTable", null, values);
        noticeInfo.setNoticeId((int) insert);

        Log.e("Tag","添加的id为："+insert);
    }


    public void updateNoticeTable(NoticeInfo noticeInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("noticeTitle",noticeInfo.getNoticeTitle());
        values.put("noticeContent",noticeInfo.getNoticeContent());
        values.put("noticeTime",noticeInfo.getNoticeTime());
        values.put("noticeAdminName",noticeInfo.getNoticeAdminName());

        int update = database.update("NoticeTable", values, "_noticeId= " + noticeInfo.getNoticeId(), null);

        Log.e("Tag","添加的id为："+update);
    }

    public void deleteNoticeTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("NoticeTable", "_noticeId= " +id, null);

        Log.e("Tag","删除的id为："+delete);

    }


    public List<NoticeInfo> queryNoticeTable(){
        database = dbHelper.getReadableDatabase();
        List<NoticeInfo> list =new ArrayList<>();
        Cursor cursor = database.query("NoticeTable", null, null, null, null, null, "_noticeId desc");
        while(cursor.moveToNext()){

            int noticeId = cursor.getInt(0);
            String noticeTitle = cursor.getString(1);
            String noticeContent = cursor.getString(2);
            String noticeTime = cursor.getString(3);
            String noticeAdminName = cursor.getString(4);

            list.add(new NoticeInfo(
                    noticeId,
                    noticeTitle,
                    noticeContent,
                    noticeTime,
                    noticeAdminName));
        }
        Log.e("Tag","NoticeTableDAO查询的List的数据为："+list.toString());
        return list;
    }

}
