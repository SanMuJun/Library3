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
//import library3.library3.model.bean.StudentInfo;
//import library3.library3.model.db.DBHelper;
//import library3.library3.utils.CacheUtils;
//import library3.library3.utils.JDBCUtils;
//
//
///**
// * Created by San on 2017/4/9.
// *
// * 學生的表的操作類
// */
//public class StudentTableDAO {
//
//    public static final String JSON_STUDENT = "json_Student";
//    private Context context;
//    private Connection conn;
//    DBHelper dbHelper;
//    private SQLiteDatabase database;
//    private  List<StudentInfo> listStudent;
//    private List<StudentInfo> adminInfos;
//
//    public StudentTableDAO(Context context) {
////        dbHelper=new DBHelper(context);
//
//        this.context=context;
//        listStudent = new ArrayList<>();
//        adminInfos = new ArrayList<>();
//
//    }
//
//    public void insertStudentTable(final StudentInfo studentInfo){
//
////        database = dbHelper.getReadableDatabase();
////        ContentValues values=new ContentValues();
////
////        values.put("studentNumber",studentInfo.getStudentNumber());
////        values.put("studentPassword",studentInfo.getStudentPassword());
////        values.put("studentName",studentInfo.getStudentName());
////        values.put("studentMajor",studentInfo.getStudentMajor());
////        values.put("studentClass",studentInfo.getStudentClass());
////        values.put("studentCollege",studentInfo.getStudentCollege());
////        values.put("studentSeatNumber",studentInfo.getStudentSeatNumber());
////
////
////        long insert = database.insert("StudentTable", null, values);
////        studentInfo.setStudentId((int) insert);
////
////        Log.e("Tag","StudentTableDAO添加的學生id为："+insert);
////        Log.e("Tag","StudentTableDAO添加的學生values数据为："+values);
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
//                    String sql = "INSERT INTO StudentTable (studentId, studentNumber, " +
//                            "studentPassword, studentName, studentMajor,studentClass," +
//                            "studentCollege,studentSeatNumber) VALUES (NULL, '"
//                            + studentInfo.getStudentNumber() + "', '"
//                            + studentInfo.getStudentPassword() + "', '"
//                            + studentInfo.getStudentName() + "', '"
//                            + studentInfo.getStudentMajor()+ "', '"
//                            + studentInfo.getStudentClass() + "', '"
//                            + studentInfo.getStudentCollege() + "', '"
//                            + studentInfo.getStudentSeatNumber() + "')";
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
//    }
//
//
//    public void updateStudentTable(StudentInfo studentInfo){
////        database = dbHelper.getReadableDatabase();
////        ContentValues values=new ContentValues();
////
////        values.put("studentNumber",studentInfo.getStudentNumber());
////        values.put("studentPassword",studentInfo.getStudentPassword());
////        values.put("studentName",studentInfo.getStudentName());
////        values.put("studentMajor",studentInfo.getStudentMajor());
////        values.put("studentClass",studentInfo.getStudentClass());
////        values.put("studentCollege",studentInfo.getStudentCollege());
////        values.put("studentSeatNumber",studentInfo.getStudentSeatNumber());
////
////        int update = database.update("StudentTable", values, "_studentId= " + studentInfo.getStudentId(), null);
////
////        Log.e("Tag","StudentTableDAO添加的學生id为："+update);
////        Log.e("Tag","StudentTableDAO添加的學生values数据为："+values);
//
//
//    }
//
//    public void deleteStudentTable(int id){
////        database = dbHelper.getReadableDatabase();
////        int delete = database.delete("StudentTable", "_studentId= " +id, null);
////
////        Log.e("Tag","删除的學生id为："+delete);
//
//    }
//
//
//    public List<StudentInfo> queryStudentTable(){
////        database = dbHelper.getReadableDatabase();
////        List<StudentInfo> list =new ArrayList<>();
////        Cursor cursor = database.query("StudentTable", null, null, null, null, null, null);
////        while(cursor.moveToNext()){
////
////            int      studentId = cursor.getInt(0);
////            String studentNumber = cursor.getString(1);
////            String studentPassword = cursor.getString(2);
////            String studentName = cursor.getString(3);
////            String studentMajor = cursor.getString(4);
////            String studentClass = cursor.getString(5);
////            String studentCollege = cursor.getString(6);
////            String  studentSeatNumber = cursor.getString(7);
////
////            list.add(new StudentInfo(
////                    studentId,
////                    studentNumber,
////                    studentPassword,
////                    studentName,
////                    studentMajor,
////                    studentClass,
////                    studentCollege,
////                    studentSeatNumber));
////        }
////        Log.e("Tag","StudentTableDAO查询的List的数据为："+list.toString());
//
//
//        getDataFromVolley();
//
//        String getJson = CacheUtils.getString(context, JSON_STUDENT);
//        if (!getJson.equals("")){
//
//            processData(getJson);
//        }
//        Log.e("TAG","adminInfossssssssssss:"+ adminInfos);
//
//
//
//        return adminInfos;
//
//
//
//    }
//
//    private void getDataFromVolley() {
//
//        String bookUrl = "http://robot7sun.cn:7777/L05_Web/StudentServlet";
//        RequestQueue mQueue = Volley.newRequestQueue(context);
//
//        StringRequest stringRequest = new StringRequest(bookUrl, new com.android.volley.Response.Listener<String>() {
//            @Override
//            public void onResponse(String jsonString) {
//
//                CacheUtils.putString(context, JSON_STUDENT,jsonString);
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
//        listStudent.addAll(adminInfos);
//
//    }
//
//    private List<StudentInfo> getGson(String json) {
//        return new Gson().fromJson(json,new TypeToken<List<StudentInfo>>(){}.getType());
//    }
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

import library3.library3.model.bean.StudentInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 *
 * 學生的表的操作類
 */
public class StudentTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public StudentTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertStudentTable(StudentInfo studentInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("studentNumber",studentInfo.getStudentNumber());
        values.put("studentPassword",studentInfo.getStudentPassword());
        values.put("studentName",studentInfo.getStudentName());
        values.put("studentMajor",studentInfo.getStudentMajor());
        values.put("studentClass",studentInfo.getStudentClass());
        values.put("studentCollege",studentInfo.getStudentCollege());
        values.put("studentSeatNumber",studentInfo.getStudentSeatNumber());


        long insert = database.insert("StudentTable", null, values);
        studentInfo.setStudentId((int) insert);

        Log.e("Tag","StudentTableDAO添加的學生id为："+insert);
        Log.e("Tag","StudentTableDAO添加的學生values数据为："+values);
    }


    public void updateStudentTable(StudentInfo studentInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("studentNumber",studentInfo.getStudentNumber());
        values.put("studentPassword",studentInfo.getStudentPassword());
        values.put("studentName",studentInfo.getStudentName());
        values.put("studentMajor",studentInfo.getStudentMajor());
        values.put("studentClass",studentInfo.getStudentClass());
        values.put("studentCollege",studentInfo.getStudentCollege());
        values.put("studentSeatNumber",studentInfo.getStudentSeatNumber());

        int update = database.update("StudentTable", values, "_studentId= " + studentInfo.getStudentId(), null);

        Log.e("Tag","StudentTableDAO添加的學生id为："+update);
        Log.e("Tag","StudentTableDAO添加的學生values数据为："+values);
    }

    public void deleteStudentTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("StudentTable", "_studentId= " +id, null);

        Log.e("Tag","删除的學生id为："+delete);

    }


    public List<StudentInfo> queryStudentTable(){
        database = dbHelper.getReadableDatabase();
        List<StudentInfo> list =new ArrayList<>();
        Cursor cursor = database.query("StudentTable", null, null, null, null, null, null);
        while(cursor.moveToNext()){

            int      studentId = cursor.getInt(0);
            String studentNumber = cursor.getString(1);
            String studentPassword = cursor.getString(2);
            String studentName = cursor.getString(3);
            String studentMajor = cursor.getString(4);
            String studentClass = cursor.getString(5);
            String studentCollege = cursor.getString(6);
            String  studentSeatNumber = cursor.getString(7);

            list.add(new StudentInfo(
                    studentId,
                    studentNumber,
                    studentPassword,
                    studentName,
                    studentMajor,
                    studentClass,
                    studentCollege,
                    studentSeatNumber));
        }
        Log.e("Tag","StudentTableDAO查询的List的数据为："+list.toString());
        return list;
    }

}
