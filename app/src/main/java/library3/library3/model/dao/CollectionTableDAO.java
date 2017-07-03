package library3.library3.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import library3.library3.model.bean.CollectionInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 *
 * 收藏的表的操作類
 */
public class CollectionTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public CollectionTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertCollectionTable(CollectionInfo collectionInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("collectionBookName",collectionInfo.getCollectionBookName());
        values.put("collectionBookAuthor",collectionInfo.getCollectionBookAuthor());
        values.put("collectionBookLocation",collectionInfo.getCollectionBookLocation());
        values.put("collectionBookContent",collectionInfo.getCollectionBookContent());

        long insert = database.insert("CollectionTable", null, values);
        collectionInfo.setCollectionId((int) (insert-1));

        Log.e("Tag","添加的收藏id为："+insert);
    }


    public void updateCollectionTable(CollectionInfo collectionInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("collectionBookName",collectionInfo.getCollectionBookName());
        values.put("collectionBookAuthor",collectionInfo.getCollectionBookAuthor());
        values.put("collectionBookLocation",collectionInfo.getCollectionBookLocation());
        values.put("collectionBookContent",collectionInfo.getCollectionBookContent());


        int update = database.update("CollectionTable", values, "_collectionId= " + collectionInfo.getCollectionId(), null);

        Log.e("Tag","添加的收藏id为："+update);
    }

    public void deleteCollectionTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("CollectionTable", "_collectionId= " +id, null);

        Log.e("Tag","删除的收藏id为："+delete);

    }


    public List<CollectionInfo> queryCollectionTable(){
        database = dbHelper.getReadableDatabase();
        List<CollectionInfo> list =new ArrayList<>();
        Cursor cursor = database.query("CollectionTable", null, null, null, null, null, "_collectionId desc");
        while(cursor.moveToNext()){

            int collectionId = cursor.getInt(0);
            String collectionBookName = cursor.getString(1);
            String collectionBookAuthor = cursor.getString(2);
            String collectionBookLocation = cursor.getString(3);
            String collectionBookContent = cursor.getString(4);

            list.add(new CollectionInfo(
                    collectionId,
                    collectionBookName,
                    collectionBookAuthor,
                    collectionBookLocation,
                    collectionBookContent));
        }
        Log.e("Tag","CollectionTableDAO查询的List的数据为："+list.toString());
        return list;
    }


}
