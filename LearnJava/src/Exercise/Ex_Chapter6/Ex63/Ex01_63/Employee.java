package Exercise.Ex_Chapter6.Ex63.Ex01_63;

public class Employee {
    // todo 1: triển khai các thuộc tính private của nhân viên theo đề bài
    private String id; // mã nhân viên
    private String fullName; // họ và tên
    private String address; // địa chỉ
    private int age; // tuổi
    private String phoneNumber; // số điện thoại
    private double salary; // mức lương
    private int experience; // năm kinh nghiệm

    // todo 2: gọi tới các setter tương úng trong constructor
    public Employee() {
    }

    public Employee(String id) {
        this();
        setId(id);
    }

    public Employee(String id, String fullName) {
        this(id);
        setFullName(fullName);
    }

    public Employee(String id, String fullName, String address) {
        this(id, fullName);
        setAddress(address);
    }

    public Employee(String id, String fullName, String address, int age) {
        this(id, fullName, address);
        setAge(age);
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber) {
        this(id, fullName, address, age);
        setPhoneNumber(phoneNumber);
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber,
                    double salary) {
        this(id, fullName, address, age, phoneNumber);
        setSalary(salary);
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber,
                    double salary, int experience) {
        this(id, fullName, address, age, phoneNumber, salary);
        setExperience(experience);
    }

    // todo 3: triển khai các phương thức getter setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
