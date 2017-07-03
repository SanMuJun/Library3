package library3.library3.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import library3.library3.model.bean.RecommendationInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 *
 * 個性推薦的表的操作類
 */
public class RecommendationTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public RecommendationTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertRecommendationTable(RecommendationInfo recommendationInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("recommendationBookName",recommendationInfo.getRecommendationBookName());
        values.put("recommendationBookAuthor",recommendationInfo.getRecommendationBookAuthor());
        values.put("recommendationBookReason",recommendationInfo.getRecommendationBookReason());
        values.put("recommendationBookDate",recommendationInfo.getRecommendationBookDate());
        values.put("recommendationPerson",recommendationInfo.getRecommendationPerson());


        long insert = database.insert("RecommendationTable", null, values);
        recommendationInfo.setRecommendationId((int) insert);

        Log.e("Tag","添加的個性推薦id为："+insert);
    }


    public void updateRecommendationTable(RecommendationInfo recommendationInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("recommendationBookName",recommendationInfo.getRecommendationBookName());
        values.put("recommendationBookAuthor",recommendationInfo.getRecommendationBookAuthor());
        values.put("recommendationBookReason",recommendationInfo.getRecommendationBookReason());
        values.put("recommendationBookDate",recommendationInfo.getRecommendationBookDate());
        values.put("recommendationPerson",recommendationInfo.getRecommendationPerson());


        int update = database.update("RecommendationTable", values, "_recommendationId= " + recommendationInfo.getRecommendationId(), null);

        Log.e("Tag","添加的個性推薦id为："+update);
    }

    public void deleteRecommendationTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("RecommendationTable", "_recommendationId= " +id, null);

        Log.e("Tag","删除的個性推薦id为："+delete);

    }


    public List<RecommendationInfo> queryRecommendationTable(){
        database = dbHelper.getReadableDatabase();
        List<RecommendationInfo> list =new ArrayList<>();
        Cursor cursor = database.query("RecommendationTable", null, null, null, null, null, "_recommendationId desc");
        while(cursor.moveToNext()){

            int recommendationId = cursor.getInt(0);
            String recommendationBookName = cursor.getString(1);
            String recommendationBookAuthor = cursor.getString(2);
            String recommendationBookReason = cursor.getString(3);
            String recommendationBookDate = cursor.getString(4);
            String recommendationPerson = cursor.getString(5);


            list.add(new RecommendationInfo(
                    recommendationId,
                    recommendationBookName,
                    recommendationBookAuthor,
                    recommendationBookReason,
                    recommendationBookDate,
                    recommendationPerson));
        }
        Log.e("Tag","RecommendationTableDAO查询的List的数据为："+list.toString());
        return list;
    }

}
