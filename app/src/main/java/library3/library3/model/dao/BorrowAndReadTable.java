package library3.library3.model.dao;

/**
 * Created by San on 2017/4/8.
 * 借阅的表的bean類
 */
public class BorrowAndReadTable {

    public static final String BORROWANDREAD_TABLE="create table BorrowAndReadTable(" +
            "_borrowAndReadId integer primary key autoincrement," +//借阅的id
            "borrowAndReadBookName        vachar," + //书名
            "borrowAndReadBookAuthor      vachar," + //书作者
            "borrowAndReadBookImageUrl     vachar," + //作者
            "borrowAndReadBookBorrowDate  vachar," + //借书日期
            "borrowAndReadBookBackDate    vachar," + //归还日期
            "borrowAndReadBookRemainDate  vachar )";//剩余日期

}
