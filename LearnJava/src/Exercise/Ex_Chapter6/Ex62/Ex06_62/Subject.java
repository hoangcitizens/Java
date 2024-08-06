package Exercise.Ex_Chapter6.Ex62.Ex06_62;

/*
    Bài 6. Thông tin về môn học bao gồm: mã môn học có dạng SJxxxx(ví dụ SJ1005), tên môn học, số tín chỉ, số tiết học,
    số lượng bài kiểm tra, số bài thực hành, số lượng bài tập lớn, loại môn học. Bổ sung các constructor và tái sử dụng
    chúng sao cho phù hợp. Viết chương trình có menu chọn thực hiện các chức năng sau:
        1. Thêm mới môn học vào danh sách. Mỗi môn học với một mã môn học chỉ được xuất hiện duy nhất 1 lần trong danh sách.
        2. Sửa thông tin về số tiết học theo mã môn học.
        3. Xóa môn học khỏi danh sách theo mã môn.
        4. Sửa thông tin số bài kiểm tra, bài thực hành và bài tập lớn theo mã môn.
        5. Hiển thị danh sách môn học dưới dạng bảng gồm các hàng các cột ngay ngắn.
        6. Sắp xếp danh sách môn học theo tên môn tăng dần.
        7. Sắp xếp danh sách môn học theo số tín chỉ tăng dần.
        8. Sắp xếp môn học theo số lượng bài kiểm tra giảm dần.
        9. Tìm kiếm môn học theo thể loại.
        10. Tìm kiếm môn học theo tên môn.
        11. Tìm kiếm môn học theo số lượng bài kiểm tra.
        12. Tìm kiếm môn học theo số lượng tín chỉ.
        13. Liệt kê các môn học có nhiều tín chỉ nhất.
        14. Liệt kê các môn học có số tiết học nhiều nhất.
        15. Kết thúc chương trình.
 */

public class Subject {
    // todo 1: triển khai các thuộc tính theo yêu cầu của đề bài
    public String id;
    public String name;
    public int credit;
    public int numOfLesson;
    public int numOfExam;
    public int numOfPractice;
    public int numOfProject;
    public String type;

    // todo 2: triển khai các constructor và gọi tái sử dụng cho phù hợp
    public Subject() {
    }

    public Subject(String id) {
        this();
        this.id = id;
    }

    public Subject(String id, String name, int credit) {
        this(id);
        this.name = name;
        this.credit = credit;
    }

    public Subject(String id, String name, int credit, int numOfLesson,
                   int numOfExam, int numOfPractice, int numOfProject, String type) {
        this(id, name, credit);
        this.numOfLesson = numOfLesson;
        this.numOfExam = numOfExam;
        this.numOfPractice = numOfPractice;
        this.numOfProject = numOfProject;
        this.type = type;
    }
}
