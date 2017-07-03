package library3.library3.model.bean;

/**
 * Created by San on 2017/4/8.
 * 个性推荐的bean类
 */
public class RecommendationInfo {

    //id
    private int recommendationId;
    //书名
    private String recommendationBookName;
    //书的作者
    private String recommendationBookAuthor;
    //推荐的原因
    private String recommendationBookReason;
    //推荐的时间
    private String recommendationBookDate;
    //推荐人
    private String recommendationPerson;


    public RecommendationInfo(
            int recommendationId,
            String recommendationBookName,
            String recommendationBookAuthor,
            String recommendationBookReason,
            String recommendationBookDate,
            String recommendationPerson) {
        this.recommendationId = recommendationId;
        this.recommendationBookName = recommendationBookName;
        this.recommendationBookAuthor = recommendationBookAuthor;
        this.recommendationBookReason = recommendationBookReason;
        this.recommendationBookDate = recommendationBookDate;
        this.recommendationPerson = recommendationPerson;
    }


    public int getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(int recommendationId) {
        this.recommendationId = recommendationId;
    }

    public String getRecommendationBookName() {
        return recommendationBookName;
    }

    public void setRecommendationBookName(String recommendationBookName) {
        this.recommendationBookName = recommendationBookName;
    }

    public String getRecommendationBookAuthor() {
        return recommendationBookAuthor;
    }

    public void setRecommendationBookAuthor(String recommendationBookAuthor) {
        this.recommendationBookAuthor = recommendationBookAuthor;
    }

    public String getRecommendationBookReason() {
        return recommendationBookReason;
    }

    public void setRecommendationBookReason(String recommendationBookReason) {
        this.recommendationBookReason = recommendationBookReason;
    }

    public String getRecommendationBookDate() {
        return recommendationBookDate;
    }

    public void setRecommendationBookDate(String recommendationBookDate) {
        this.recommendationBookDate = recommendationBookDate;
    }

    public String getRecommendationPerson() {
        return recommendationPerson;
    }

    public void setRecommendationPerson(String recommendationPerson) {
        this.recommendationPerson = recommendationPerson;
    }

    @Override
    public String toString() {
        return "RecommendationInfo{" +
                "recommendationId=" + recommendationId +
                ", recommendationBookName='" + recommendationBookName + '\'' +
                ", recommendationBookAuthor='" + recommendationBookAuthor + '\'' +
                ", recommendationBookReason='" + recommendationBookReason + '\'' +
                ", recommendationBookDate='" + recommendationBookDate + '\'' +
                ", recommendationPerson='" + recommendationPerson + '\'' +
                '}';
    }
}
