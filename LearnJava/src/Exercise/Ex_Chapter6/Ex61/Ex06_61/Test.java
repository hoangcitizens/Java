package Exercise.Ex_Chapter6.Ex61.Ex06_61;

public class Test {
    public static void main(String[] args) {
        // todo 4: tạo mới một mảng để chứa các đối tượng môn học
        Subject[] subjects = new Subject[]{
                new Subject(),
                new Subject(),
                new Subject()
        };

        // todo 5: nhập thông tin cho các môn học trong mảng
        System.out.println("==============> NHẬP THÔNG TIN CHO CÁC MÔN HỌC <==============");
        for (Subject subject : subjects) {
            subject.setSubjectInfo();
            System.out.println("---------------------------");
        }

        // todo 6: thực hiện lời gọi đến các hành động của một số đối tượng môn học trong mảng
        subjects[0].updateNumberOfExam(6);
        subjects[1].updateNumberOfLesson(36);
        subjects[2].updateNumberOfPractice(7);

        // todo 8: hiển thị danh sách các môn học dưới dạng bảng ngay ngắn
        showSubjectsRowCol(subjects);
    }

    // todo 7: triển khai phương thức hiển thị danh sách các môn học dưới dạng bảng
    public static void showSubjectsRowCol(Subject[] subjects) {
        System.out.printf("%-20s%-25s%-12s%-12s%-12s%-12s%-12s%-12s\n",
                "Mã môn", "Tên môn", "Số tín", "Số tiết",
                "Số BKT", "Số BTH", "Số BTL", "Loại MH");
        for (Subject subject : subjects) {
            System.out.println(subject.showSubjectInfo());
        }
    }
}
