package library3.library3.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 *
 * 借閱的表的操作類
 */
public class BorrowAndReadTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public BorrowAndReadTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertBorrowAndReadTable(BorrowAndReadInfo borrowAndReadInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("borrowAndReadBookName",borrowAndReadInfo.getBorrowAndReadBookName());
        values.put("borrowAndReadBookAuthor",borrowAndReadInfo.getBorrowAndReadBookAuthor());
        values.put("borrowAndReadBookImageUrl",borrowAndReadInfo.getBorrowAndReadBookImageUrl());
        values.put("borrowAndReadBookBorrowDate",borrowAndReadInfo.getBorrowAndReadBookBorrowDate());
        values.put("borrowAndReadBookBackDate",borrowAndReadInfo.getBorrowAndReadBookBackDate());
        values.put("borrowAndReadBookRemainDate",borrowAndReadInfo.getBorrowAndReadBookRemainDate());

        long insert = database.insert("BorrowAndReadTable", null, values);
//        borrowAndReadInfo.setBorrowAndReadId((int) insert);

        Log.e("Tag","添加的借阅图书id为："+insert);
    }


    public void updateBorrowAndReadTable(BorrowAndReadInfo borrowAndReadInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("borrowAndReadBookName",borrowAndReadInfo.getBorrowAndReadBookName());
        values.put("borrowAndReadBookAuthor",borrowAndReadInfo.getBorrowAndReadBookAuthor());
        values.put("borrowAndReadBookImageUrl",borrowAndReadInfo.getBorrowAndReadBookImageUrl());
        values.put("borrowAndReadBookBorrowDate",borrowAndReadInfo.getBorrowAndReadBookBorrowDate());
        values.put("borrowAndReadBookBackDate",borrowAndReadInfo.getBorrowAndReadBookBackDate());
        values.put("borrowAndReadBookRemainDate",borrowAndReadInfo.getBorrowAndReadBookRemainDate());

        int update = database.update("BorrowAndReadTable", values, "_borrowAndReadId= " + borrowAndReadInfo.getBorrowAndReadId(), null);

        Log.e("Tag","添加的借阅图书id为："+update);
    }

    public void deleteBorrowAndReadTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("BorrowAndReadTable", "_borrowAndReadId= " +id, null);

        Log.e("Tag","删除的借阅图书id为："+delete);

    }


    public List<BorrowAndReadInfo> queryBorrowAndReadTable(){
        database = dbHelper.getReadableDatabase();
        List<BorrowAndReadInfo> list =new ArrayList<>();
        Cursor cursor = database.query("BorrowAndReadTable", null, null, null, null, null,null);
        while(cursor.moveToNext()){

            int borrowAndReadId = cursor.getInt(0);
            String borrowAndReadBookName = cursor.getString(1);
            String borrowAndReadBookAuthor = cursor.getString(2);
            String borrowAndReadBookImageUrl = cursor.getString(3);
            String borrowAndReadBookBorrowDate = cursor.getString(4);
            String borrowAndReadBookBackDate = cursor.getString(5);
            String borrowAndReadBookRemainDate = cursor.getString(6);

            list.add(new BorrowAndReadInfo(
                    borrowAndReadId,
                    borrowAndReadBookName,
                    borrowAndReadBookAuthor,
                    borrowAndReadBookImageUrl,
                    borrowAndReadBookBorrowDate,
                    borrowAndReadBookBackDate,
                    borrowAndReadBookRemainDate));
        }
        Log.e("Tag","BorrowAndReadTableDAO查询的List的数据为："+list.toString());
        return list;
    }


}
