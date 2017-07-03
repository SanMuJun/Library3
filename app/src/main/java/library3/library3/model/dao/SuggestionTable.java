package library3.library3.model.dao;

/**
 * Created by San on 2017/4/8.
 * 建议箱的表
 */
public class SuggestionTable {

    public static final String SUGGESTION_TABLE="create table SuggestionTable(" +
            "_suggestionId integer primary key autoincrement," +//建议箱的id
            "suggestionName     vachar," + //提建议者
            "suggestionContent     vachar," + //提建时间
            "suggestionDate  vachar )";//内容

}
