package library3.library3.model.bean;

/**
 * Created by San on 2017/4/8.
 *
 * 借阅的bean类
 */
public class BorrowAndReadInfo {

       //id
    private int    borrowAndReadId;
    //书名
    private String borrowAndReadBookName;
    //作者
    private String borrowAndReadBookAuthor;
    //图片地址
    private String borrowAndReadBookImageUrl;
    //借出日期
    private String borrowAndReadBookBorrowDate;
    //归还日期
    private String borrowAndReadBookBackDate;
    //剩余天数
    private String borrowAndReadBookRemainDate;


    public BorrowAndReadInfo(
            int borrowAndReadId,
            String borrowAndReadBookName,
            String borrowAndReadBookAuthor,
            String borrowAndReadBookPublish,
            String borrowAndReadBookBorrowDate,
            String borrowAndReadBookBackDate,
            String borrowAndReadBookRemainDate) {
        this.borrowAndReadId = borrowAndReadId;
        this.borrowAndReadBookName = borrowAndReadBookName;
        this.borrowAndReadBookAuthor = borrowAndReadBookAuthor;
        this.borrowAndReadBookImageUrl = borrowAndReadBookPublish;
        this.borrowAndReadBookBorrowDate = borrowAndReadBookBorrowDate;
        this.borrowAndReadBookBackDate = borrowAndReadBookBackDate;
        this.borrowAndReadBookRemainDate = borrowAndReadBookRemainDate;
    }

    public int getBorrowAndReadId() {
        return borrowAndReadId;
    }

    public void setBorrowAndReadId(int borrowAndReadId) {
        this.borrowAndReadId = borrowAndReadId;
    }

    public String getBorrowAndReadBookName() {
        return borrowAndReadBookName;
    }

    public void setBorrowAndReadBookName(String borrowAndReadBookName) {
        this.borrowAndReadBookName = borrowAndReadBookName;
    }

    public String getBorrowAndReadBookAuthor() {
        return borrowAndReadBookAuthor;
    }

    public void setBorrowAndReadBookAuthor(String borrowAndReadBookAuthor) {
        this.borrowAndReadBookAuthor = borrowAndReadBookAuthor;
    }

    public String getBorrowAndReadBookImageUrl() {
        return borrowAndReadBookImageUrl;
    }

    public void setBorrowAndReadBookImageUrl(String borrowAndReadBookImageUrl) {
        this.borrowAndReadBookImageUrl = borrowAndReadBookImageUrl;
    }

    public String getBorrowAndReadBookBorrowDate() {
        return borrowAndReadBookBorrowDate;
    }

    public void setBorrowAndReadBookBorrowDate(String borrowAndReadBookBorrowDate) {
        this.borrowAndReadBookBorrowDate = borrowAndReadBookBorrowDate;
    }

    public String getBorrowAndReadBookBackDate() {
        return borrowAndReadBookBackDate;
    }

    public void setBorrowAndReadBookBackDate(String borrowAndReadBookBackDate) {
        this.borrowAndReadBookBackDate = borrowAndReadBookBackDate;
    }

    public String getBorrowAndReadBookRemainDate() {
        return borrowAndReadBookRemainDate;
    }

    public void setBorrowAndReadBookRemainDate(String borrowAndReadBookRemainDate) {
        this.borrowAndReadBookRemainDate = borrowAndReadBookRemainDate;
    }


    @Override
    public String toString() {
        return "BorrowAndReadInfo{" +
                "borrowAndReadId=" + borrowAndReadId +
                ", borrowAndReadBookName='" + borrowAndReadBookName + '\'' +
                ", borrowAndReadBookAuthor='" + borrowAndReadBookAuthor + '\'' +
                ", borrowAndReadBookImageUrl='" + borrowAndReadBookImageUrl + '\'' +
                ", borrowAndReadBookBorrowDate='" + borrowAndReadBookBorrowDate + '\'' +
                ", borrowAndReadBookBackDate='" + borrowAndReadBookBackDate + '\'' +
                ", borrowAndReadBookRemainDate='" + borrowAndReadBookRemainDate + '\'' +
                '}';
    }
}
