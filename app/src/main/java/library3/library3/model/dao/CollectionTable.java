package library3.library3.model.dao;

/**
 * Created by San on 2017/4/8.
 * 收藏的表
 */
public class CollectionTable {

    public static final String COLLECTION_TABLE="create table CollectionTable(" +
            "_collectionId integer primary key autoincrement," +//收藏的id
            "collectionBookName      vachar," + //书的名字
            "collectionBookAuthor    vachar," + //书的作者
            "collectionBookLocation  vachar," + //书所在的位置
            "collectionBookContent   vachar )"; //书的简介

}
