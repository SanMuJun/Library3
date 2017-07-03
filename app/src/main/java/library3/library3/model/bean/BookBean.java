package library3.library3.model.bean;

import java.util.List;

/**
 * Created by San on 2017/4/9.
 *
 *
 * 书本的json的bean类
 */
public class BookBean {

    public List<Book> Book;
    public List<BookAll> BookAll;

    public List<BookBean.Book> getBook() {
        return Book;
    }

    public void setBook(List<BookBean.Book> book) {
        Book = book;
    }

    public List<BookBean.BookAll> getBookAll() {
        return BookAll;
    }

    public void setBookAll(List<BookBean.BookAll> bookAll) {
        BookAll = bookAll;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "Book=" + Book +
                ", BookAll=" + BookAll +
                '}';
    }

    public class Book{

        public List<Information> Information;
        public List<Live> Live;
        public List<MachineLearning> MachineLearning;
        public List<Literature> Literature;
        public List<History> History;
        public List<ScienceTechnology> ScienceTechnology;
        public List<Economy> Economy;
        public List<Other> Other;


        public List<BookBean.Book.Information> getInformation() {
            return Information;
        }

        public void setInformation(List<BookBean.Book.Information> information) {
            Information = information;
        }

        public List<BookBean.Book.Live> getLive() {
            return Live;
        }

        public void setLive(List<BookBean.Book.Live> live) {
            Live = live;
        }

        public List<BookBean.Book.MachineLearning> getMachineLearning() {
            return MachineLearning;
        }

        public void setMachineLearning(List<BookBean.Book.MachineLearning> machineLearning) {
            MachineLearning = machineLearning;
        }

        public List<BookBean.Book.Literature> getLiterature() {
            return Literature;
        }

        public void setLiterature(List<BookBean.Book.Literature> literature) {
            Literature = literature;
        }

        public List<BookBean.Book.History> getHistory() {
            return History;
        }

        public void setHistory(List<BookBean.Book.History> history) {
            History = history;
        }

        public List<BookBean.Book.ScienceTechnology> getScienceTechnology() {
            return ScienceTechnology;
        }

        public void setScienceTechnology(List<BookBean.Book.ScienceTechnology> scienceTechnology) {
            ScienceTechnology = scienceTechnology;
        }

        public List<BookBean.Book.Economy> getEconomy() {
            return Economy;
        }

        public void setEconomy(List<BookBean.Book.Economy> economy) {
            Economy = economy;
        }

        public List<BookBean.Book.Other> getOther() {
            return Other;
        }

        public void setOther(List<BookBean.Book.Other> other) {
            Other = other;
        }


        @Override
        public String toString() {
            return "Book{" +
                    "Information=" + Information +
                    ", Live=" + Live +
                    ", MachineLearning=" + MachineLearning +
                    ", Literature=" + Literature +
                    ", History=" + History +
                    ", ScienceTechnology=" + ScienceTechnology +
                    ", Economy=" + Economy +
                    ", Other=" + Other +
                    '}';
        }

       public class Information{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;


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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }
        }

        public  class Live{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;

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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }

        }

        public  class MachineLearning{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;

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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }

        }

        public class Literature{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;

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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }

        }

        public  class History{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;

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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }

        }

        public  class ScienceTechnology{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;

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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }

        }

        public  class Economy{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;

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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }

        }

        public   class Other{

            public int bookId;
            public int bookNumber;
            public int bookRemainNumber;

            public String bookAuthor;
            public String bookContent;
            public String bookFloor;
            public String bookISBN;
            public String bookImageUrl;
            public String bookInternetUrl;
            public String bookIsBorrow;
            public String bookName;
            public String bookPublicationTime;
            public String bookPulish;
            public String bookSort;

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

            public int getBookRemainNumber() {
                return bookRemainNumber;
            }

            public void setBookRemainNumber(int bookRemainNumber) {
                this.bookRemainNumber = bookRemainNumber;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public void setBookAuthor(String bookAuthor) {
                this.bookAuthor = bookAuthor;
            }

            public String getBookContent() {
                return bookContent;
            }

            public void setBookContent(String bookContent) {
                this.bookContent = bookContent;
            }

            public String getBookFloor() {
                return bookFloor;
            }

            public void setBookFloor(String bookFloor) {
                this.bookFloor = bookFloor;
            }

            public String getBookISBN() {
                return bookISBN;
            }

            public void setBookISBN(String bookISBN) {
                this.bookISBN = bookISBN;
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

            public String getBookIsBorrow() {
                return bookIsBorrow;
            }

            public void setBookIsBorrow(String bookIsBorrow) {
                this.bookIsBorrow = bookIsBorrow;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public String getBookPublicationTime() {
                return bookPublicationTime;
            }

            public void setBookPublicationTime(String bookPublicationTime) {
                this.bookPublicationTime = bookPublicationTime;
            }

            public String getBookPulish() {
                return bookPulish;
            }

            public void setBookPulish(String bookPulish) {
                this.bookPulish = bookPulish;
            }

            public String getBookSort() {
                return bookSort;
            }

            public void setBookSort(String bookSort) {
                this.bookSort = bookSort;
            }


            @Override
            public String toString() {
                return "Information{" +
                        "bookId=" + bookId +
                        ", bookNumber=" + bookNumber +
                        ", bookRemainNumber=" + bookRemainNumber +
                        ", bookAuthor='" + bookAuthor + '\'' +
                        ", bookContent='" + bookContent + '\'' +
                        ", bookFloor='" + bookFloor + '\'' +
                        ", bookISBN='" + bookISBN + '\'' +
                        ", bookImageUrl='" + bookImageUrl + '\'' +
                        ", bookInternetUrl='" + bookInternetUrl + '\'' +
                        ", bookIsBorrow='" + bookIsBorrow + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", bookPublicationTime='" + bookPublicationTime + '\'' +
                        ", bookPulish='" + bookPulish + '\'' +
                        ", bookSort='" + bookSort + '\'' +
                        '}';
            }

        }


    }

    public class BookAll{

        public int bookId;
        public int bookNumber;
        public int bookRemainNumber;

        public String bookAuthor;
        public String bookContent;
        public String bookFloor;
        public String bookISBN;
        public String bookImageUrl;
        public String bookInternetUrl;
        public String bookIsBorrow;
        public String bookName;
        public String bookPublicationTime;
        public String bookPulish;
        public String bookSort;

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

        public int getBookRemainNumber() {
            return bookRemainNumber;
        }

        public void setBookRemainNumber(int bookRemainNumber) {
            this.bookRemainNumber = bookRemainNumber;
        }

        public String getBookAuthor() {
            return bookAuthor;
        }

        public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
        }

        public String getBookContent() {
            return bookContent;
        }

        public void setBookContent(String bookContent) {
            this.bookContent = bookContent;
        }

        public String getBookFloor() {
            return bookFloor;
        }

        public void setBookFloor(String bookFloor) {
            this.bookFloor = bookFloor;
        }

        public String getBookISBN() {
            return bookISBN;
        }

        public void setBookISBN(String bookISBN) {
            this.bookISBN = bookISBN;
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

        public String getBookIsBorrow() {
            return bookIsBorrow;
        }

        public void setBookIsBorrow(String bookIsBorrow) {
            this.bookIsBorrow = bookIsBorrow;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getBookPublicationTime() {
            return bookPublicationTime;
        }

        public void setBookPublicationTime(String bookPublicationTime) {
            this.bookPublicationTime = bookPublicationTime;
        }

        public String getBookPulish() {
            return bookPulish;
        }

        public void setBookPulish(String bookPulish) {
            this.bookPulish = bookPulish;
        }

        public String getBookSort() {
            return bookSort;
        }

        public void setBookSort(String bookSort) {
            this.bookSort = bookSort;
        }


        @Override
        public String toString() {
            return "Information{" +
                    "bookId=" + bookId +
                    ", bookNumber=" + bookNumber +
                    ", bookRemainNumber=" + bookRemainNumber +
                    ", bookAuthor='" + bookAuthor + '\'' +
                    ", bookContent='" + bookContent + '\'' +
                    ", bookFloor='" + bookFloor + '\'' +
                    ", bookISBN='" + bookISBN + '\'' +
                    ", bookImageUrl='" + bookImageUrl + '\'' +
                    ", bookInternetUrl='" + bookInternetUrl + '\'' +
                    ", bookIsBorrow='" + bookIsBorrow + '\'' +
                    ", bookName='" + bookName + '\'' +
                    ", bookPublicationTime='" + bookPublicationTime + '\'' +
                    ", bookPulish='" + bookPulish + '\'' +
                    ", bookSort='" + bookSort + '\'' +
                    '}';
        }

    }


}
