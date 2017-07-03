package library3.library3.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import library3.library3.model.bean.BookInfo;
import library3.library3.model.db.DBHelper;


/**
 * Created by San on 2017/4/9.
 *
 * 書本的表的操作類
 */
public class BookTableDAO {

    private Context context;

    DBHelper dbHelper;
    private SQLiteDatabase database;

    public BookTableDAO(Context context) {
        dbHelper=new DBHelper(context);
    }

    public void insertBookTable(BookInfo bookInfo){

        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("bookNumber",bookInfo.getBookNumber());
        values.put("bookName",bookInfo.getBookName());
        values.put("bookSort",bookInfo.getBookSort());
        values.put("bookFloor",bookInfo.getBookFloor());
        values.put("bookIsBorrow",bookInfo.getBookIsBorrow());
        values.put("bookAuthor",bookInfo.getBookAuthor());
        values.put("bookPulish",bookInfo.getBookPulish());
        values.put("bookPublicationTime",bookInfo.getBookPublicationTime());
        values.put("bookImageUrl",bookInfo.getBookImageUrl());
        values.put("bookInternetUrl",bookInfo.getBookInternetUrl());
        values.put("bookISBN",bookInfo.getBookISBN());
        values.put("bookContent",bookInfo.getBookContent());
        values.put("bookRemainNumber",bookInfo.getBookRemainNumber());

        long insert = database.insert("BookTable", null, values);
        bookInfo .setBookId((int) insert);

        Log.e("Tag","添加的書本id为："+insert);
    }


    public void updateBookTable(BookInfo bookInfo){
        database = dbHelper.getReadableDatabase();
        ContentValues values=new ContentValues();

        values.put("bookNumber",bookInfo.getBookNumber());
        values.put("bookName",bookInfo.getBookName());
        values.put("bookSort",bookInfo.getBookSort());
        values.put("bookFloor",bookInfo.getBookFloor());
        values.put("bookIsBorrow",bookInfo.getBookIsBorrow());
        values.put("bookAuthor",bookInfo.getBookAuthor());
        values.put("bookPulish",bookInfo.getBookPulish());
        values.put("bookPublicationTime",bookInfo.getBookPublicationTime());
        values.put("bookImageUrl",bookInfo.getBookImageUrl());
        values.put("bookInternetUrl",bookInfo.getBookInternetUrl());
        values.put("bookISBN",bookInfo.getBookISBN());
        values.put("bookContent",bookInfo.getBookContent());
        values.put("bookRemainNumber",bookInfo.getBookRemainNumber());


        int update = database.update("BookTable", values, "_bookId= " + bookInfo.getBookId(), null);

        Log.e("Tag","添加的書本id为："+update);
    }

    public void deleteBookTable(int id){
        database = dbHelper.getReadableDatabase();
        int delete = database.delete("BookTable", "_bookId= " +id, null);

        Log.e("Tag","删除的書本id为："+delete);

    }


    public List<BookInfo> queryBookTable(){
        database = dbHelper.getReadableDatabase();
        List<BookInfo> list =new ArrayList<>();
        Cursor cursor = database.query("BookTable", null, null, null, null, null,null);
        while(cursor.moveToNext()){

            int bookId = cursor.getInt(0);
            int bookNumber = cursor.getInt(1);
            String bookName = cursor.getString(2);
            String bookSort = cursor.getString(3);
            String bookFloor = cursor.getString(4);
            String bookIsBorrow = cursor.getString(5);
            String bookAuthor = cursor.getString(6);
            String bookPulish = cursor.getString(7);
            String bookPublicationTime = cursor.getString(8);
            String bookImageUrl = cursor.getString(9);
            String bookInternetUrl = cursor.getString(10);
            String bookISBN = cursor.getString(11);
            String bookContent = cursor.getString(12);
            int bookRemainNumber = cursor.getInt(13);

            list.add(new BookInfo(
                    bookId,
                    bookNumber,
                    bookName,
                    bookSort,
                    bookFloor,
                    bookIsBorrow,
                    bookAuthor,
                    bookPulish,
                    bookPublicationTime,
                    bookImageUrl,
                    bookInternetUrl,
                    bookISBN,
                    bookContent,
                    bookRemainNumber));
        }
        Log.e("Tag","BookTableDAO查询的List的数据为："+list.toString());
        return list;
    }


}
