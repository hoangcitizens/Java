package Exercise.Ex_Chapter6.Ex61.Ex06_61;

/*
    Bài 6. Thông tin về môn học bao gồm: mã môn học, tên môn học, số tín chỉ, số tiết học, số lượng bài kiểm tra,
    số bài thực hành, số lượng bài tập lớn, loại môn học. Các hành động bao gồm: phương thức khởi tạo mặc định, phương
    thức khởi tạo đầy đủ tham số; nhập thông tin môn học, hiển thị thông tin môn học, cập nhật số tiết học, số bài kiểm
    tra, số bài thực hành cho môn học. Tạo mới danh sách(dùng mảng) các đối tượng môn học và thực hiện gọi tới các hành
    động của nó. Hiển thị danh sách môn học dưới dạng bảng gồm các hàng các cột ngay ngắn.
 */

import java.util.Scanner;

public class Subject {
    // todo 1: triển khai các thuộc tính theo đề bài
    public String id;           // mã môn học
    public String title;        // tên môn học
    public int credit;          // số tín chỉ
    public int numOfLesson; // số tiết
    public int numberOfExam;    // số bài kiểm tra
    public int numberOfPractice; // số bài thc hành
    public int numberOfProject; // số bài tập lớn
    public String type;         // loại môn học

    // todo 2: triển khai các phương thức khởi tạo theo đề bài

    public Subject() {

    }

    public Subject(String id, String title, int credit, int numOfLesson,
                   int numberOfExam, int numberOfPractice, int numberOfProject, String type) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.numOfLesson = numOfLesson;
        this.numberOfExam = numberOfExam;
        this.numberOfPractice = numberOfPractice;
        this.numberOfProject = numberOfProject;
        this.type = type;
    }

    // todo 3: triển khai các phương thức thể hiện hành động theo đề bài

    /**
     * Phương thức nhập vào thông tin môn học
     */
    public void setSubjectInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Mã môn học: ");
        id = input.nextLine();
        System.out.print("Tên môn học: ");
        title = input.nextLine();
        System.out.print("Số tín chỉ: ");
        credit = Integer.parseInt(input.nextLine());
        System.out.print("Số tiết: ");
        numOfLesson = Integer.parseInt(input.nextLine());
        System.out.print("Số bài kiểm tra: ");
        numberOfExam = Integer.parseInt(input.nextLine());
        System.out.print("Số bài thực hành: ");
        numberOfPractice = Integer.parseInt(input.nextLine());
        System.out.print("Số bài tập lớn: ");
        numberOfProject = Integer.parseInt(input.nextLine());
        System.out.print("Loại môn học: ");
        type = input.nextLine();
    }

    /**
     * Phương thức hiển thị thông tin môn học
     */
    public String showSubjectInfo() {
        return String.format("%-20s%-25s%-12s%-12s%-12s%-12s%-12s%-12s",
                id, title, credit, numOfLesson, numberOfExam, numberOfPractice,
                numberOfProject, type);
    }

    /**
     * Phương thức cập nhật số tiết học
     *
     * @param number số tiết học mới
     * @return true nếu cập nhật thành công
     */
    public boolean updateNumberOfLesson(int number) {
        if (number >= 0) {
            numOfLesson = number;
            return true;
        }
        return false;
    }

    /**
     * Phương thức cập nhật số bài kiểm tra
     *
     * @param number số lượng bài kiểm tra mới
     * @return true nếu cập nhật thành công
     */
    public boolean updateNumberOfExam(int number) {
        if (number >= 0) {
            numberOfExam = number;
            return true;
        }
        return false;
    }

    /**
     * Phương thức cập nhật số bài thực hành
     *
     * @param number số bài thực hành mới
     * @return true nếu cập nhật thành công
     */
    public boolean updateNumberOfPractice(int number) {
        if (number >= 0) {
            numberOfPractice = number;
            return true;
        }
        return false;
    }
}
