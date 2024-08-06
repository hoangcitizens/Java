package Lesson.Ls_Chapter6_OOP.Ls61_class_object.Lesson61_VD1;

public class Test {
    public static void main(String[] args) {
        // tạo một mảng các sinh viên
        Student[] students = new Student[10];

        // liên kết từng phần tử với đối tượng sinh viên mong muốn:
        students[0] = new Student("SV1002", "Nguyễn Thúy Lan");
        students[1] = new Student("SV1003", "Nguyễn Hải Nam",
                3.26f, "namdeptrai@xmail.com", "Hà Nội");
        students[2] = new Student("SV1005", "Nguyễn Trần Khánh Nga",
                3.26f, "ngacute@xmail.com", "Hà Nội");

        // tạo một đối tượng sinh viên đơn lẻ
        var loan = new Student("SV1001", "Nguyễn Mai Loan");

        // truy cập vào các hành động và thuộc tính
        loan.doExam("Java OOP");
        loan.doHomework("DSA");
        System.out.println(STR."Mã SV: \{loan.studentId}");
        System.out.println(STR."Họ và tên: \{loan.fullName}");
        System.out.println(STR."Địa chỉ: \{loan.address}");

        // gọi phương thức hiển thị danh sách sinh viên
        showStudentInfo(students);
    }

    private static void showStudentInfo(Student[] students) {
        System.out.println("===> Danh sách sinh viên trong mảng: ");
        for (var student : students) {
            System.out.println(student); // gọi tới phương thức toString() của lớp Student
        }
    }
}
