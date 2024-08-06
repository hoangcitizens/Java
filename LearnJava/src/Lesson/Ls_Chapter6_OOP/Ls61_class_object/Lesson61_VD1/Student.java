package Lesson.Ls_Chapter6_OOP.Ls61_class_object.Lesson61_VD1;

public class Student {
    public String studentId; // mã sinh viên
    public String fullName;  // họ tên đầy đủ
    public float gpa;        // điểm TB
    public String email;     // địa chỉ email
    public String address;   // địa chỉ cư trú

    /**
     * Phương thức khởi tạo mặc định của lớp.
     */
    public Student() {
    }

    /**
     * Phương thức khởi tạo 2 tham số.
     *
     * @param studentId mã sinh viên cho trước
     * @param fullName  họ và tên sinh viên cho trước
     */
    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    /**
     * Phương thức khởi tạo đối tượng sinh viên với các thông tin cho trước.
     *
     * @param studentId mã sinh viên
     * @param fullName  họ và tên
     * @param gpa       điểm trung bình tích lũy
     * @param email     email
     * @param address   địa chỉ
     */
    public Student(String studentId, String fullName,
                   float gpa, String email, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gpa = gpa;
        this.email = email;
        this.address = address;
    }

    /**
     * Phương thức thể hiện hành động làm bài tập về nhà của sinh viên.
     *
     * @param subject môn học cần làm bài tập.
     */
    public void doHomework(String subject) {
        System.out.println(STR."Sinh viên \{fullName} đang làm bài tập môn \{subject}.");
    }

    /**
     * Phương thức thể hiện hành động làm bài kiểm tra của sinh viên.
     *
     * @param subject môn học cần làm bài kiểm tra.
     */
    public void doExam(String subject) {
        System.out.println(STR."Sinh viên \{fullName} đang làm bài kiểm tra môn \{subject}.");
    }

    /**
     * Phương thức chuyển thông tin sinh viên thành chuỗi văn bản mô tả tương ứng.
     *
     * @return một String mô tả thông tin sinh viên
     */
    @Override
    public String toString() {
        return STR."Student{studentId='\{studentId}\{'\''}, fullName='\{fullName}\{'\''}, gpa=\{gpa}, " +
                STR."email='\{email}\{'\''}, address='\{address}\{'\''}\{'}'}";
    }
}
