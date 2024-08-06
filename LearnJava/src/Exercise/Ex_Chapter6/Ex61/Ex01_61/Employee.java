package Exercise.Ex_Chapter6.Ex61.Ex01_61;

/*
    Bài 1. Thông tin về nhân viên bao gồm: mã nhân viên(cả chữ và số), họ và tên đầy đủ, địa chỉ, tuổi, số điện thoại,
    mức lương, số năm kinh nghiệm. Hành động của nhân viên gồm làm việc, nghỉ ngơi, nhận lương, đi du lịch.
    Thiết kế lớp mô tả đối tượng nhân viên như trên. Bỏ qua phương thức khởi tạo. Sau đó các đối tượng nhân viên bất kỳ
    trong hàm main và sử dụng các thuộc tính, phương thức tương ứng.
 */


/**
 * Lớp mô tả thông tin nhân viên.
 */
public class Employee {
    // todo 1: bổ sung các thuộc tính
    public String empId;
    public String fullName;
    public String address;
    public int age;
    public String phoneNumber;
    public float salary;
    public int experience;

    // todo 2: bổ sung các phương thức
    public void work() {
        System.out.println(STR."Employee \{fullName} is working now.");
    }

    public void relax() {
        System.out.println(STR."Employee \{fullName} is relaxing.");
    }

    public void receiveSalary() {
        System.out.println(STR."Employee \{fullName} is receiving salary.");
        System.out.println(STR."Salary is \{salary}.");
    }

    public void travel(String place) {
        System.out.println(STR."Employee \{fullName} is traveling at \{place}.");
    }
}

