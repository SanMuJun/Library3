package library3.library3.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import library3.library3.model.bean.SubscribeSeatInfo;
import library3.library3.model.db.DBHelper;
import library3.library3.utils.CacheUtils;


/**
 * Created by San on 2017/4/9.
 */
public class SubscribeSeatTableDAO {

    public static final String JSON_SUBSCRIBE_SEAT = "json_SubscribeSeat";
    private Context context;
    private Connection conn;
    DBHelper dbHelper;
    private SQLiteDatabase database;
    private final List<SubscribeSeatInfo> listSubscribeSeat;
    private List<SubscribeSeatInfo> adminInfos;

    public SubscribeSeatTableDAO(Context context) {
        dbHelper=new DBHelper(context);

        this.context=context;
        listSubscribeSeat = new ArrayList<>();
        adminInfos = new ArrayList<>();
    }

    public void insertSubscribeSeatTable(final SubscribeSeatInfo subscribeSeatInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("subscribeSeatNumberAndStudentNumber",subscribeSeatInfo.getSubscribeSeatNumberAndStudentNumber());
        values.put("subscribeSeatStudentName",subscribeSeatInfo.getSubscribeSeatStudentName());
        values.put("subscribeSeatStudentAccount",subscribeSeatInfo.getSubscribeSeatStudentAccount());
        values.put("subscribeSeatStudentId",subscribeSeatInfo.getSubscribeSeatStudentId());
        values.put("subscribeSeatStartTime",subscribeSeatInfo.getSubscribeSeatStartTime());
        values.put("subscribeSeatEndTime",subscribeSeatInfo.getSubscribeSeatEndTime());

        long insert = database.insert("SubscribeSeatTable", null, values);
        subscribeSeatInfo.setSubscribeSeatId((int) insert);

        Log.e("SubscribeSeatTableDAO","SubscribeSeatTableDAO添加的預約座位id为："+insert);
        Log.e("SubscribeSeatTableDAO","SubscribeSeatTableDAO添加的values初始化数据："+values.toString());


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
//                    String sql = "INSERT INTO SubscribeSeatTable (subscribeSeatId, subscribeSeatNumberAndStudentNumber, " +
//                            "subscribeSeatStudentName, subscribeSeatStudentAccount, subscribeSeatStudentId,subscribeSeatStartTime," +
//                            "subscribeSeatEndTime) VALUES (NULL, '"
////                            + subscribeSeatInfo.getSubscribeSeatId() + "', '"
//                            + subscribeSeatInfo.getSubscribeSeatNumberAndStudentNumber() + "', '"
//                            + subscribeSeatInfo.getSubscribeSeatStudentName() + "', '"
//                            + subscribeSeatInfo.getSubscribeSeatStudentAccount()+ "', '"
//                            + subscribeSeatInfo.getSubscribeSeatStudentId() + "', '"
//                            + subscribeSeatInfo.getSubscribeSeatStartTime() + "', '"
//                            + subscribeSeatInfo.getSubscribeSeatEndTime() + "')";
//
//                    Log.e("TAG","SubscribeSeatTable:"+ sql);
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

    }


    public void updateSubscribeSeatTable(SubscribeSeatInfo subscribeSeatInfo){
//        database = dbHelper.getReadableDatabase();
//        ContentValues values=new ContentValues();
//
//        values.put("subscribeSeatNumberAndStudentNumber",subscribeSeatInfo.getSubscribeSeatNumberAndStudentNumber());
//        values.put("subscribeSeatStudentName",subscribeSeatInfo.getSubscribeSeatStudentName());
//        values.put("subscribeSeatStudentAccount",subscribeSeatInfo.getSubscribeSeatStudentAccount());
//        values.put("subscribeSeatStudentId",subscribeSeatInfo.getSubscribeSeatStudentId());
//        values.put("subscribeSeatStartTime",subscribeSeatInfo.getSubscribeSeatStartTime());
//        values.put("subscribeSeatEndTime",subscribeSeatInfo.getSubscribeSeatEndTime());
//
//        int update = database.update("SubscribeSeatTable", values, "_subscribeSeatId= " + subscribeSeatInfo.getSubscribeSeatId(), null);
//
//        Log.e("SubscribeSeatTableDAO","更改的預約座位id为："+update);
    }

    public void deleteSubscribeSeatTable(final int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("SubscribeSeatTable", "_subscribeSeatId= " +id, null);

        Log.e("SubscribeSeatTableDAO","删除的預約座位id为："+delete);

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
//                    String sql = "DELETE FROM SubscribeSeatTable WHERE subscribeSeatId = " + id + "";
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

    }


    public List<SubscribeSeatInfo> querySubscribeSeatTable(){

        database = dbHelper.getReadableDatabase();
        List<SubscribeSeatInfo> list =new ArrayList<>();
        Cursor cursor = database.query("SubscribeSeatTable", null, null, null, null, null, null);
        while(cursor.moveToNext()){

            int      subscribeSeatId = cursor.getInt(0);
            String subscribeSeatNumberAndStudentNumber = cursor.getString(1);
            String subscribeSeatStudentName = cursor.getString(2);
            String subscribeSeatStudentAccount = cursor.getString(3);
            int subscribeSeatStudentId = cursor.getInt(4);
            String subscribeSeatStartTime = cursor.getString(5);
            String subscribeSeatEndTime = cursor.getString(6);

            list.add(new SubscribeSeatInfo(
                    subscribeSeatId,
                    subscribeSeatNumberAndStudentNumber,
                    subscribeSeatStudentName,
                    subscribeSeatStudentAccount,
                    subscribeSeatStudentId,
                    subscribeSeatStartTime,
                    subscribeSeatEndTime));
        }
        Log.e("SubscribeSeatTableDAO","SubscribeSeatTableDAO查询的vlist的数据为："+list.toString());
        return list;
//        getDataFromVolley();
//
//        String getJson = CacheUtils.getString(context, JSON_SUBSCRIBE_SEAT);
//        if (!getJson.equals("")){
//
//            processData(getJson);
//        }
//        Log.e("TAG","List<SubscribeSeatInfo>:"+ adminInfos);
//
//
//        return adminInfos;

    }


    private void getDataFromVolley() {

        String bookUrl = "http://robot7sun.cn:7777/L05_Web/SubscribeSeatServlet";
        RequestQueue mQueue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(bookUrl, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String jsonString) {

                CacheUtils.putString(context, JSON_SUBSCRIBE_SEAT,jsonString);

                processData(jsonString);
            }


        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }) {

            //将数据转换为非乱码的文字
            @Override
            protected com.android.volley.Response<String> parseNetworkResponse(NetworkResponse response) {
                try {
                    String parsed = new String(response.data, "UTF-8");
                    return com.android.volley.Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return super.parseNetworkResponse(response);
            }

        };
        mQueue.add(stringRequest);


    }

    private void processData(String json) {

        adminInfos = getGson(json);
        listSubscribeSeat.addAll(adminInfos);

    }

    private List<SubscribeSeatInfo> getGson(String json) {
        return new Gson().fromJson(json,new TypeToken<List<SubscribeSeatInfo>>(){}.getType());
    }


}
