package Lesson.Ls_Chapter6_OOP.Ls63_Encapsulation;

/**
 * Lớp Student để mô tả thông tin và hành động của sinh viên.
 */
public class Student {
    private String studentId; // mã sinh viên
    private String fullName;  // họ tên đầy đủ
    private float gpa;        // điểm TB
    private String email;     // địa chỉ email
    private String address;   // địa chỉ cư trú

    /**
     * Phương thức khởi tạo không tham số.
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
        setStudentId(studentId);
        setFullName(fullName);
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
        this(studentId, fullName);
        setGpa(gpa);
        setEmail(email);
        setAddress(address);
    }

    // tạo các getter/setter
    // Alt Ins -> Getter / Setter -> select properties -> Enter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (isFullNameValid(fullName)) {
            this.fullName = fullName;
        } else {
            System.out.println("==> Họ và tên không hợp lệ.");
        }
    }

    /**
     * Phương thức hỗ trợ kiểm tra nội bộ thông tin họ tên sinh viên
     * có hợp lệ không.
     *
     * @param fullName họ và tên cần kiểm tra
     * @return true nếu họ và tên hợp lệ và false nếu ngược lại
     */
    private boolean isFullNameValid(String fullName) {
        if (fullName.trim().isEmpty()) {
            return false;
        }
        var str = fullName.trim().toLowerCase();
        return !str.matches(".*[^a-zắằẳẵặăấầẩẫậâáàãảạđếềểễệêéèẻẽẹíìỉĩịốồổỗộôớờởỡợơóòõỏọứừửữựưúùủũụýỳỷỹỵ\\s]+.*");
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (!isValidGpa(gpa)) {
            System.out.println("==> Gpa không hợp lệ.");
            this.gpa = 0;
        } else {
            this.gpa = gpa;
        }
    }

    /**
     * Phương thức kiểm tra điểm gpa có hợp lệ không. Ở đây chỉ xét điểm hệ 4.
     *
     * @param gpa điểm cần kiểm tra
     * @return true nếu gpa hợp lệ ngược lại trả về false
     */
    private boolean isValidGpa(float gpa) {
        return !(gpa < 0 || gpa > 4);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
