package Exercise.Ex_Chapter6.Ex64.Ex01_64;


public class Employee {
    private String id;
    private String fullName;
    private int age;
    private String phoneNumber;
    private double salary;
    private int experience;

    // todo 2: thay đổi kiểu dữ liệu của địa chỉ từ String sang kiểu Address
    //  và sửa code những chỗ liên quan
    private Address address;

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

    public Employee(String id, String fullName, Address address) {
        this(id, fullName);
        setAddress(address);
    }

    public Employee(String id, String fullName, Address address, int age) {
        this(id, fullName, address);
        setAge(age);
    }

    public Employee(String id, String fullName, Address address, int age, String phoneNumber) {
        this(id, fullName, address, age);
        setPhoneNumber(phoneNumber);
    }

    public Employee(String id, String fullName, Address address, int age, String phoneNumber,
                    double salary) {
        this(id, fullName, address, age, phoneNumber);
        setSalary(salary);
    }

    public Employee(String id, String fullName, Address address, int age, String phoneNumber,
                    double salary, int experience) {
        this(id, fullName, address, age, phoneNumber, salary);
        setExperience(experience);
    }


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

    // todo 3: thay đổi getter trả về giá trị của hằng số địa chỉ tương ứng
    public String getAddress() {
        return address.getValue();
    }

    public Address getAddressEnum() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
