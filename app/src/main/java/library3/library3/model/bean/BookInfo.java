package library3.library3.model.bean;

/**
 * Created by San on 2017/4/3.
 * 书的bean类
 */
public class BookInfo {

    //1.书id
    private int bookId;
    //2.书的编号
    private int bookNumber;
    //3.书的名字
    private String bookName;
    //4.书的种类
    private String bookSort;
    //5.书所在的楼层
    private String bookFloor;
    //6.是否被借出
    private String bookIsBorrow;
    //7.书的作者
    private String bookAuthor;
    //8.书的出版社
    private String bookPulish;
    //9.出版时间
    private String bookPublicationTime;
    //10.书的图片地址
    private String bookImageUrl;
    //11.书的网络地址
    private String bookInternetUrl;
    //12.书的ISBN
    private String bookISBN;
    //13.书的简介
    private String bookContent;


    //14.剩余本数
    private  int bookRemainNumber;


    public BookInfo(
            int bookId,
            int bookNumber,
            String bookName,
            String bookSort,
            String bookFloor,
            String bookIsBorrow,
            String bookAuthor,
            String bookPulish,
            String bookPublicationTime,
            String bookImageUrl,
            String bookInternetUrl,
            String bookISBN,
            String bookContent,
            int bookRemainNumber) {
        this.bookId = bookId;
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookSort = bookSort;
        this.bookFloor = bookFloor;
        this.bookIsBorrow = bookIsBorrow;
        this.bookAuthor = bookAuthor;
        this.bookPulish = bookPulish;
        this.bookPublicationTime = bookPublicationTime;
        this.bookImageUrl = bookImageUrl;
        this.bookInternetUrl = bookInternetUrl;
        this.bookISBN = bookISBN;
        this.bookContent = bookContent;
        this.bookRemainNumber = bookRemainNumber;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId=" + bookId +
                ", bookNumber=" + bookNumber +
                ", bookName='" + bookName + '\'' +
                ", bookSort='" + bookSort + '\'' +
                ", bookFloor='" + bookFloor + '\'' +
                ", bookIsBorrow='" + bookIsBorrow + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPulish='" + bookPulish + '\'' +
                ", bookPublicationTime='" + bookPublicationTime + '\'' +
                ", bookImageUrl='" + bookImageUrl + '\'' +
                ", bookInternetUrl='" + bookInternetUrl + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                ", bookContent='" + bookContent + '\'' +
                ", bookRemainNumber=" + bookRemainNumber +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSort() {
        return bookSort;
    }

    public void setBookSort(String bookSort) {
        this.bookSort = bookSort;
    }

    public String getBookFloor() {
        return bookFloor;
    }

    public void setBookFloor(String bookFloor) {
        this.bookFloor = bookFloor;
    }

    public String getBookIsBorrow() {
        return bookIsBorrow;
    }

    public void setBookIsBorrow(String bookIsBorrow) {
        this.bookIsBorrow = bookIsBorrow;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPulish() {
        return bookPulish;
    }

    public void setBookPulish(String bookPulish) {
        this.bookPulish = bookPulish;
    }

    public String getBookPublicationTime() {
        return bookPublicationTime;
    }

    public void setBookPublicationTime(String bookPublicationTime) {
        this.bookPublicationTime = bookPublicationTime;
    }

    public String getBookImageUrl() {
        return bookImageUrl;
    }

    public void setBookImageUrl(String bookImageUrl) {
        this.bookImageUrl = bookImageUrl;
    }

    public String getBookInternetUrl() {
        return bookInternetUrl;
    }

    public void setBookInternetUrl(String bookInternetUrl) {
        this.bookInternetUrl = bookInternetUrl;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public int getBookRemainNumber() {
        return bookRemainNumber;
    }

    public void setBookRemainNumber(int bookRemainNumber) {
        this.bookRemainNumber = bookRemainNumber;
    }
}
