package library3.library3.model.bean;

/**
 * Created by San on 2017/4/8.
 * 意见箱的bean类
 */
public class SuggestionInfo {

    //id
    private int suggestionId;
    //提建议者
    private String suggestionName;
    //内容
    private String suggestionContent;
    //时间
    private String suggestionDate;


    public SuggestionInfo(
            int suggestionId,
            String suggestionName,
            String suggestionContent,
            String suggestionDate) {
        this.suggestionId = suggestionId;
        this.suggestionName = suggestionName;
        this.suggestionContent = suggestionContent;
        this.suggestionDate = suggestionDate;
    }

    @Override
    public String toString() {
        return "SuggestionInfo{" +
                "suggestionId=" + suggestionId +
                ", suggestionName='" + suggestionName + '\'' +
                ", suggestionContent='" + suggestionContent + '\'' +
                ", suggestionDate='" + suggestionDate + '\'' +
                '}';
    }

    public int getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(int suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getSuggestionName() {
        return suggestionName;
    }

    public void setSuggestionName(String suggestionName) {
        this.suggestionName = suggestionName;
    }

    public String getSuggestionContent() {
        return suggestionContent;
    }

    public void setSuggestionContent(String suggestionContent) {
        this.suggestionContent = suggestionContent;
    }

    public String getSuggestionDate() {
        return suggestionDate;
    }

    public void setSuggestionDate(String suggestionDate) {
        this.suggestionDate = suggestionDate;
    }
}
