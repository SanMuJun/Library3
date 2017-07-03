package library3.library3.model.dao;

/**
 * Created by San on 2017/4/3.
 * 书的表
 */
public class BookTable {

    public static final String Book_TABLE="create table BookTable(" +
            "_bookId integer primary key autoincrement," +//书id
            "bookNumber          integer," + //编号
            "bookName            vachar," + //书名字
            "bookSort            vachar," + //书种类
            "bookFloor           vachar," + //书所在的楼层
            "bookIsBorrow        vachar," + //是否被借出
            "bookAuthor          vachar," + //书的作者
            "bookPulish          vachar," + //书的出版社
            "bookPublicationTime vachar," + //书的出版时间
            "bookImageUrl        vachar," + //书的图片地址
            "bookInternetUrl     vachar," + //书的网络地址
            "bookISBN            vachar," + //书的ISBN
            "bookContent         vachar," + //书的简介
            "bookRemainNumber    integer )";//书的剩余本数

}
