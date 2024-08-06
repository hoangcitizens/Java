package Exercise.Ex_Chapter6.Ex63.Ex07_63;

/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

@SuppressWarnings("unused")
public class Student {
    // todo 1: triển khai các thuộc tính thể hiện tính đóng gói dữ liệu
    private String id;       // mã sinh viên
    private String fullName; // họ và tên
    private String major;    // chuyên ngành
    private String email;    // email
    private float gpa;       // điểm gpa

    // todo 3: sử dụng các setter
    public Student() {
    }

    public Student(String id) {
        setId(id);
    }

    public Student(String id, String fullName) {
        this(id);
        setFullName(fullName);
    }

    public Student(String id, String fullName, float gpa) {
        this(id, fullName);
        setGpa(gpa);
    }

    public Student(String id, String fullName, String major, String email, float gpa) {
        this(id, fullName, gpa);
        setMajor(major);
        setEmail(email);
    }

    // todo 2: triển khai các getter/setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}