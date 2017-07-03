package library3.library3.model.bean;

/**
 * Created by San on 2017/4/8.
 * 收藏的bean类
 */
public class CollectionInfo {

    //id
    private int collectionId;
    //书名
    private String collectionBookName;
    //作者
    private String collectionBookAuthor;
    //所在的位置
    private String collectionBookLocation;
    //内容
    private String collectionBookContent;


    public CollectionInfo(
            int collectionId,
            String collectionBookName,
            String collectionBookAuthor,
            String collectionBookLocation,
            String collectionBookContent) {
        this.collectionId = collectionId;
        this.collectionBookName = collectionBookName;
        this.collectionBookAuthor = collectionBookAuthor;
        this.collectionBookLocation = collectionBookLocation;
        this.collectionBookContent = collectionBookContent;
    }


    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionBookName() {
        return collectionBookName;
    }

    public void setCollectionBookName(String collectionBookName) {
        this.collectionBookName = collectionBookName;
    }

    public String getCollectionBookAuthor() {
        return collectionBookAuthor;
    }

    public void setCollectionBookAuthor(String collectionBookAuthor) {
        this.collectionBookAuthor = collectionBookAuthor;
    }

    public String getCollectionBookLocation() {
        return collectionBookLocation;
    }

    public void setCollectionBookLocation(String collectionBookLocation) {
        this.collectionBookLocation = collectionBookLocation;
    }

    public String getCollectionBookContent() {
        return collectionBookContent;
    }

    public void setCollectionBookContent(String collectionBookContent) {
        this.collectionBookContent = collectionBookContent;
    }


    @Override
    public String toString() {
        return "CollectionInfo{" +
                "collectionId=" + collectionId +
                ", collectionBookName='" + collectionBookName + '\'' +
                ", collectionBookAuthor='" + collectionBookAuthor + '\'' +
                ", collectionBookLocation='" + collectionBookLocation + '\'' +
                ", collectionBookContent='" + collectionBookContent + '\'' +
                '}';
    }
}
