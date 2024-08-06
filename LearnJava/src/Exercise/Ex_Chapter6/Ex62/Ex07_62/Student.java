package Exercise.Ex_Chapter6.Ex62.Ex07_62;

/*
    Bài 7. Thông tin về sinh viên bao gồm: mã sinh viên có dạng STxxxx(ví dụ ST1005), họ và tên, chuyên ngành, email,
    điểm gpa. Bổ sung các constructor và tái sử dụng chúng sao cho phù hợp. Viết chương trình có menu chọn cho phép thực
    hiện các chức năng sau:
        1. Thêm mới sinh viên vào danh sách. Lưu ý rằng mỗi sinh viên với một mã sinh viên chỉ được xuất hiện duy nhất
           1 lần trong danh sách.
        2. Hiển thị danh sách sinh viên dưới dạng bảng ngay ngắn.
        3. Sắp xếp danh sách sinh viên theo điểm giảm dần, tên tăng dần, họ tăng dần.
        4. Sắp xếp danh sách sinh viên theo điểm gpa tăng dần.
        5. Xét học bổng cho sinh viên. Biết rằng có 3 mức học bổng:
            a. Xuất sắc: các sinh viên có điểm gpa từ 3.70 trở lên. Mức học bổng 15tr.
            b. Giỏi: các sinh viên có điểm gpa từ 3.40 trở lên. Mức học bổng 8tr.
            c. Khá: các sinh viên có điểm gpa từ 3.15 trở lên. Mức học bổng 4tr.
            d. Hiển thị danh sách các sinh viên đạt học bổng, loại học bổng, mức học bổng ra màn hình dưới dạng bảng.
        6. Xếp loại học lực cho sinh viên sau đó hiển thị danh sách xếp loại ra màn hình:
            a. Loại xuất sắc: gpa >= 3.6.
            b. Loại giỏi: gpa >= 3.2.
            c. Loại khá: gpa >= 2.8.
            d. Loại trung bình: >= 2.0.
            e. Trượt: < 2.0.
        7. Tìm sinh viên theo tên.
        8. Tìm sinh viên theo điểm gpa.
        9. Cho biết thông tin tất cả các sinh viên có điểm gpa cao nhất.
        10. Thống kê số lượng sinh viên của từng cấp học lực theo chuyên ngành.
        11. Cập nhật điểm gpa cho sinh viên theo mã sinh viên.
        12. Xóa sinh viên khỏi danh sách theo mã sinh viên.
        13. Hãy liệt kê các sinh viên chưa đủ điều kiện tốt nghiệp(gpa < 2.0).
        14. Kết thúc chương trình.
 */

public class Student {
    // todo 1: triển khai các thuộc tính theo đề bài
    public String id;       // mã sinh viên
    public String fullName; // họ và tên
    public String major;    // chuyên ngành
    public String email;    // email
    public float gpa;       // điểm gpa

    // todo 2: triển khai hàm khởi tạo mặc định và hàm khởi tạo đầy đủ các tham số
    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName) {
        this(id);
        this.fullName = fullName;
    }

    public Student(String id, String fullName, float gpa) {
        this(id, fullName);
        this.gpa = gpa;
    }

    public Student(String id, String fullName, String major, String email, float gpa) {
        this(id, fullName, gpa);
        this.major = major;
        this.email = email;
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

    public void payTuition(double money) {
        System.out.println(STR."\{fullName} đang nộp học phí với số tiền \{money} VND");
    }

    public void doExam(String subject) {
        System.out.println(STR."\{fullName} đang làm bài kiểm tra môn \{subject}");
    }

    public void copyBy(String document) {
        System.out.println(STR."\{fullName} đang copy tài liệu bằng \{document}");
    }

    public void updateGpa(float gpa) {
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