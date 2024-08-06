package Exercise.Ex_Chapter6.Ex66.Ex07_66;

@SuppressWarnings("unused")
public class Student {
    // todo 1: bổ sung thuộc tính id tự tăng
    private static int autoId = 1000;
    private String id;       // mã sinh viên
    private String fullName; // họ và tên
    private Major major;    // chuyên ngành
    private String email;    // email
    private float gpa;       // điểm gpa

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

    public Student(String id, String fullName, Major major, String email, float gpa) {
        this(id, fullName, gpa);
        setMajor(major);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    // todo 2: cập nhật id tự tăng theo logic sau: nếu id khác rỗng và khác null
    //  thì gán id vào thuộc tính, nếu không thì lấy giá trị của id tự tăng.
    public void setId(String id) {
        if(id == null || id.isBlank()) {
            this.id = STR."ST\{autoId++}";
        } else {
            this.id = id;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major.getValue();
    }

    public void setMajor(Major major) {
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