package Exercise.Ex_Chapter6.Ex62.Ex01_62;

/*
    Bài 1. Thông tin về nhân viên bao gồm: mã nhân viên(cả chữ và số, có dạng EMPxxxx, ví dụ EMP1001), họ và tên đầy đủ,
    địa chỉ, tuổi, số điện thoại, mức lương, số năm kinh nghiệm. Hành động của nhân viên gồm làm việc, nghỉ ngơi, nhận
    lương, đi du lịch. Thiết kế lớp mô tả đối tượng nhân viên như trên. Tạo các constructor đầy đủ và tái sử dụng sao
    cho hợp lý. Lập danh sách(dùng mảng) các nhân viên sau đó tạo menu cho phép thực hiện các chức năng cho tới khi nào
    người dùng muốn kết thúc thì dừng chương trình:
        1. Nhập liệu thông tin nhân viên mới và thêm vào mảng. Mỗi nhân viên với một mã nhân
        viên chỉ được xuất hiện duy nhất 1 lần trong danh sách.
        2. Sửa thông tin lương nhân viên theo mã nhân viên.
        3. Xóa bỏ nhân viên theo mã nhân viên.
        4. Tìm và hiển thị thông tin nhân viên theo tên gần đúng(tham khảo chương regular expression).
        5. Hiển thị danh sách nhân viên hiện có dưới dạng các hàng, cột ngay ngắn.
        6. Hiển thị danh sách nhân viên theo mức lương giảm dần.
        7. Hiển thị danh sách nhân viên theo mức lương tăng dần.
        8. Kết thúc chương trình.
        9. Chọn sai chức năng thì thông báo lỗi nhắc người dùng nhập lại.
 */

public class Employee {
    // todo 1: triển khai các thuộc tính của nhân viên theo đề bài
    public String id;
    public String fullName;
    public String address;
    public int age;
    public String phoneNumber;
    public double salary;
    public int experience;

    // todo 2: triển khai hàm khởi tạo 0 tham số và toàn bộ hàm khởi tạo
    public Employee() {
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String fullName) {
        this(id);
        this.fullName = fullName;
    }

    public Employee(String id, String fullName, String address) {
        this(id, fullName);
        this.address = address;
    }

    public Employee(String id, String fullName, String address, int age) {
        this(id, fullName, address);
        this.age = age;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber) {
        this(id, fullName, address, age);
        this.phoneNumber = phoneNumber;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber,
                    double salary) {
        this(id, fullName, address, age, phoneNumber);
        this.salary = salary;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber,
                    double salary, int experience) {
        this(id, fullName, address, age, phoneNumber, salary);
        this.experience = experience;
    }

    // todo 3: triển khai các phương thức thể hiện các hành động theo đề bài
    public void work() {
        System.out.println(STR."\{fullName} đang làm việc.");
    }

    public void rest() {
        System.out.println(STR."\{fullName} đang nghỉ ngơi.");
    }

    public void receiveSalary(double salary) {
        System.out.println(STR."\{fullName} nhận lương với số tiền là: \{salary} VND");
    }

    public void travel(String place) {
        System.out.println(STR."\{fullName} đang đi du lịch tại \{place}");
    }
}
