package library3.library3.model.bean;

/**
 * Created by San on 2017/4/3.
 * 学生的bean类
 */
public class StudentInfo {

    //1.学生id
    private int studentId;
    //2.学号
    private String studentNumber;
    //3.学生密码
    private String studentPassword;
    //4.学生名字
    private String studentName;
    //5.专业
    private String studentMajor;
    //6.班级
    private String studentClass;
    //7.学院
    private String studentCollege;
    //8.座位的控件座位号
    private String studentSeatNumber;



//    //8.借书日期
//    private String bookBorrowData;
//    //9.归还日期
//    private String bookReturnData;
//    //10.评论
//    private String bookComment;
//    //11.收藏
//    private String bookCollection;


    public StudentInfo(
            int studentId,
            String studentNumber,
            String studentPassword,
            String studentName,
            String studentMajor,
            String studentClass,
            String studentCollege,
            String studentSeatNumber
            ) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.studentPassword = studentPassword;
        this.studentName = studentName;
        this.studentMajor = studentMajor;
        this.studentClass = studentClass;
        this.studentCollege = studentCollege;
        this.studentSeatNumber = studentSeatNumber;
    }


    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", studentCollege='" + studentCollege + '\'' +
                ", studentSeatNumber='" + studentSeatNumber + '\'' +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentCollege() {
        return studentCollege;
    }

    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege;
    }

    public String getStudentSeatNumber() {
        return studentSeatNumber;
    }

    public void setStudentSeatNumber(String studentSeatNumber) {
        this.studentSeatNumber = studentSeatNumber;
    }
}
