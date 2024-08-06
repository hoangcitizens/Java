package Exercise.Ex_Chapter6.Ex61.Ex07_61;

/*
    Bài 7. Thông tin về sinh viên bao gồm: mã sinh viên, họ và tên, chuyên ngành, email, điểm gpa. Hành động của sinh
    viên gồm: đi học, làm bài tập, trốn học, nộp học phí, làm bài kiểm tra, quay cóp bằng một tài liệu nào đó, cập nhật
    điểm gpa, nhận bằng tốt nghiệp, rút hồ sơ. Tạo mới danh sách(dùng mảng) các đối tượng sinh viên và tạo phương thức
    nhập thông tin, thêm một số sinh viên vào danh sách này. Hiển thị danh sách sinh viên lên màn hình dưới dạng bảng
    gồm các hàng các cột ngay ngắn. Lấy một đối tượng sinh viên bất kỳ trong mảng trên tại vị trí index nhập vào từ bàn
    phím, thực hiện lời gọi tới tất cả các hành động của đối tượng đó nếu hợp lệ.
 */

public class Student {
    // todo 1: triển khai các thuộc tính theo đề bài
    public String id;
    public String fullName;
    public String major;
    public String email;
    public double gpa;

    // todo 2: triển khai hàm khởi tạo mặc định và hàm khởi tạo đầy đủ các tham số
    public Student() {

    }

    public Student(String id, String fullName, String major, String email, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.major = major;
        this.email = email;
        this.gpa = gpa;
    }

    // todo 3: triển khai các hành động của sinh viên
    public void goToSchool(String schoolName, String vehicle) {
        System.out.println(STR."\{fullName} đang đi đến trường \{schoolName} bằng \{vehicle}");
    }

    public void doHomework(String subject) {
        System.out.println(STR."\{fullName} đang làm bài tập môn \{subject}");
    }

    public void hooky(String reason) {
        System.out.println(STR."\{fullName} trốn học vì \{reason}");
    }

    public void payTuition(double money){
        System.out.println(STR."\{fullName} đang nộp học phí với số tiền \{money} VND");
    }

    public void doExam(String subject) {
        System.out.println(STR."\{fullName} đang làm bài kiểm tra môn \{subject}");
    }

    public void copyBy(String document) {
        System.out.println(STR."\{fullName} đang copy tài liệu bằng \{document}");
    }

    public void updateGpa(double gpa) {
        if (gpa <= 0 || gpa > 4) {
            System.out.println("Cập nhật gpa thất bại");
        } else {
            this.gpa = gpa;
            System.out.println("Cập nhật gpa thành công");
        }
    }

    public void receiveGraduationCertificate(String date) {
        System.out.println(STR."\{fullName} lấy bằng tốt nghiệp vào thời gian là \{date}");
    }

    public void takePersonalDocuments() {
        System.out.println(STR."\{fullName} đang rút hồ sơ");
    }
}

