package library3.library3.model.dao;

/**
 * Created by San on 2017/4/8.
 * 推荐的表
 */
public class RecommendationTable {

    public static final String Recommendation_Table="create table RecommendationTable(" +
            "_recommendationId integer primary key autoincrement," +//推荐的id
            "recommendationBookName    vachar," + //书名
            "recommendationBookAuthor  vachar," + //作者
            "recommendationBookReason  vachar," + //原因
            "recommendationBookDate  vachar," + //原因
            "recommendationPerson    vachar )"; //时间

}
