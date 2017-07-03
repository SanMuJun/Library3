package library3.library3.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import library3.library3.model.bean.SuggestionInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 * 意見箱的表的操作類
 */
public class SuggestionTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public SuggestionTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertSuggestionTable(SuggestionInfo suggestionInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("suggestionName",suggestionInfo.getSuggestionName());
        values.put("suggestionContent",suggestionInfo.getSuggestionContent());
        values.put("suggestionDate",suggestionInfo.getSuggestionDate());


        long insert = database.insert("SuggestionTable", null, values);
        suggestionInfo.setSuggestionId((int) insert);

        Log.e("Tag","添加的id为："+insert);
    }


    public void updateSuggestionTable(SuggestionInfo suggestionInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("suggestionName",suggestionInfo.getSuggestionName());
        values.put("suggestionContent",suggestionInfo.getSuggestionContent());
        values.put("suggestionDate",suggestionInfo.getSuggestionDate());

        int update = database.update("SuggestionTable", values, "_suggestionId= " + suggestionInfo.getSuggestionId(), null);

        Log.e("Tag","添加的id为："+update);
    }

    public void deleteSuggestionTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("SuggestionTable", "_suggestionId= " +id, null);

        Log.e("Tag","删除的id为："+delete);

    }


    public List<SuggestionInfo> querySuggestionTable(){
        database = dbHelper.getReadableDatabase();
        List<SuggestionInfo> list =new ArrayList<>();
        Cursor cursor = database.query("SuggestionTable", null, null, null, null, null, "_suggestionId desc");
        while(cursor.moveToNext()){

            int      suggestionId = cursor.getInt(0);
            String suggestionName = cursor.getString(1);
            String suggestionContent = cursor.getString(2);
            String suggestionDate = cursor.getString(3);

            list.add(new SuggestionInfo(
                    suggestionId,
                    suggestionName,
                    suggestionContent,
                    suggestionDate
              ));
        }
        Log.e("Tag","SuggestionTableDAO查询的List的数据为："+list.toString());
        return list;
    }

}
