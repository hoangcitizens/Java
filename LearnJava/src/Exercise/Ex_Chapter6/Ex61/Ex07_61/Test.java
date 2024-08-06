package Exercise.Ex_Chapter6.Ex61.Ex07_61;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // todo 6: tạo mảng có chứa các đối tượng sinh viên
        Student[] students = new Student[3];

        // todo 7: thêm thông tin cho các sinh viên trong mảng
        System.out.println("============== NHẬP THÔNG TIN SINH VIÊN ==============");
        for (int i = 0; i < students.length; i++) {
            students[i] = createStudent(input);
            System.out.println("--------------------------------");
        }

        // todo 8: hiển thị danh sách sinh viên lên màn hình theo dàng hàng, cột
        showStudentInTable(students);

        // todo 9: thực hiện các hành động của sinh có vị trí index nhập vào từ bàn phím
        System.out.println("Nhập chỉ số mảng: ");
        var index = Integer.parseInt(input.nextLine());
        if (index < 0 || index >= students.length) {
            System.out.println("Không tồn tại sinh viên nào");
        } else {
            students[index].updateGpa(3.78d);
            students[index].copyBy("phao");
            students[index].doExam("Java");
            students[index].doHomework("C#");
            students[index].goToSchool("Thủ Thiêm", "Xe đạp");
            students[index].payTuition(2000000.12d);
            students[index].hooky("lười học");
            students[index].receiveGraduationCertificate("02/12/2025");
            students[index].takePersonalDocuments();
        }
    }

    // todo 4: triển khai phương thức tạo mới một sinh viên
    public static Student createStudent(Scanner input) {
        Student student = new Student();
        System.out.print("Mã sinh viên: ");
        student.id = input.nextLine();
        System.out.print("Họ và tên: ");
        student.fullName = input.nextLine();
        System.out.print("Chuyên ngành: ");
        student.major = input.nextLine();
        System.out.print("Email: ");
        student.email = input.nextLine();
        System.out.print("Điểm GPA: ");
        student.gpa = Double.parseDouble(input.nextLine());
        return student;
    }

    // todo 5: triển khai phương thức in ra danh sách các sinh viên theo
    //  dạng hàng và cột ngay ngắn
    public static void showStudentInTable(Student[] students) {
        var line = "===================================";
        System.out.println(STR."\{line} DANH SÁCH SINH VIÊN \{line}");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        for (Student student : students) {
            System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n", student.id, student.fullName,
                    student.major, student.email, student.gpa);
        }
    }
}
/**
 * ============== NHẬP THÔNG TIN SINH VIÊN ==============
 * Mã sinh viên: B25DCCN115
 * Họ và tên: Nguyễn Ngọc Mai
 * Chuyên ngành: CNTT
 * Email: ngocmai@xmail.com
 * Điểm GPA: 3.69
 * --------------------------------
 * Mã sinh viên: B25DCCN155
 * Họ và tên: Lê Thanh Hải
 * Chuyên ngành: CNTT
 * Email: thanhhaile@xmail.com
 * Điểm GPA: 3.15
 * --------------------------------
 * Mã sinh viên: B25DCCN101
 * Họ và tên: Nguyễn Mạnh Hùng
 * Chuyên ngành: CNTT
 * Email: manhhungng@xmail.com
 * Điểm GPA: 3.45
 * --------------------------------
 * =================================== DANH SÁCH SINH VIÊN ===================================
 * Mã SV          Họ và tên                Chuyên ngành        Email                 Điểm GPA
 * B25DCCN115     Nguyễn Ngọc Mai          CNTT                ngocmai@xmail.com     3.69
 * B25DCCN155     Lê Thanh Hải             CNTT                thanhhaile@xmail.com  3.15
 * B25DCCN101     Nguyễn Mạnh Hùng         CNTT                manhhungng@xmail.com  3.45
 * Nhập chỉ số mảng:
 * 0
 * Cập nhật gpa thành công
 * Nguyễn Ngọc Mai đang copy tài liệu bằng phao
 * Nguyễn Ngọc Mai đang làm bài kiểm tra môn Java
 * Nguyễn Ngọc Mai đang làm bài tập môn C#
 * Nguyễn Ngọc Mai đang đi đến trường Thủ Thiêm bằng Xe đạp
 * Nguyễn Ngọc Mai đang nộp học phí với số tiền 2000000.12 VND
 * Nguyễn Ngọc Mai trốn học vì lười học
 * Nguyễn Ngọc Mai lấy bằng tốt nghiệp vào thời gian là 02/12/2025
 * Nguyễn Ngọc Mai đang rút hồ sơ
 */
