package library3.library3.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import library3.library3.model.dao.AdminTable;
import library3.library3.model.dao.BookTable;
import library3.library3.model.dao.BorrowAndReadTable;
import library3.library3.model.dao.CollectionTable;
import library3.library3.model.dao.NoticeTable;
import library3.library3.model.dao.RecommendationTable;
import library3.library3.model.dao.StudentTable;
import library3.library3.model.dao.SubscribeSeatTable;
import library3.library3.model.dao.SuggestionTable;


/**
 * Created by San on 2017/4/3.
 *
 * 创建数据库和表
 */
public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "Library", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //创建学生的表
        sqLiteDatabase.execSQL(StudentTable.STUDENT_TABLE);

        //创建管理员的表
        sqLiteDatabase.execSQL(AdminTable.ADMIN_TABLE);

        //创建书的表
        sqLiteDatabase.execSQL(BookTable.Book_TABLE);

        //创建公告的表
        sqLiteDatabase.execSQL(NoticeTable.NOTICE_TABLE);

        //创建推荐的表
        sqLiteDatabase.execSQL(RecommendationTable.Recommendation_Table);

        //创建建议箱的表
        sqLiteDatabase.execSQL(SuggestionTable.SUGGESTION_TABLE);

        //创建借阅的表
        sqLiteDatabase.execSQL(BorrowAndReadTable.BORROWANDREAD_TABLE);

        //创建座位预约的表
        sqLiteDatabase.execSQL(SubscribeSeatTable.SUBSCRIBESEAT_TABLE);

        //创建收藏的表
        sqLiteDatabase.execSQL(CollectionTable.COLLECTION_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
