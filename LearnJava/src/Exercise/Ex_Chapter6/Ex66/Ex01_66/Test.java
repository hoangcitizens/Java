package Exercise.Ex_Chapter6.Ex66.Ex01_66;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
    Bài 1. Thông tin về nhân viên bao gồm: mã nhân viên(cả chữ và số, có dạng EMPxxxx, ví dụ EMP1001), phần số tự động
    tăng từ 1001, họ và tên đầy đủ, địa chỉ, tuổi, số điện thoại, mức lương, số năm kinh nghiệm. Trong đó địa chỉ nhân
    viên là 1 trong 63 tỉnh thành phố của Việt Nam biểu diễn bởi một enum. Thiết kế lớp mô tả đối tượng nhân viên như
    trên, sử dụng tính đóng gói dữ liệu và bổ sung các phương thức phụ trợ cần thiết. Tạo các constructor đầy đủ và tái
    sử dụng sao cho hợp lý. Lập danh sách(dùng mảng) các nhân viên sau đó tạo menu cho phép thực hiện các chức năng cho
    tới khi nào người dùng muốn kết thúc thì dừng chương trình:
        1. Nhập liệu thông tin nhân viên mới và thêm vào mảng. Mỗi nhân viên xuất hiện không quá 1 lần trong danh sách này.
        2. Sửa thông tin lương nhân viên theo mã nhân viên.
        3. Xóa bỏ nhân viên theo mã nhân viên.
        4. Tìm và hiển thị thông tin nhân viên theo tên gần đúng(tham khảo chương regular expression).
        5. Tìm nhân viên theo tên thành phố.
        6. Hiển thị danh sách nhân viên hiện có dưới dạng các hàng, cột ngay ngắn.
        7. Hiển thị danh sách nhân viên theo mức lương giảm dần.
        8. Hiển thị danh sách nhân viên theo mức lương tăng dần.
        9. Hiển thị danh sách nhân viên theo từng tỉnh/thành phố.
        10. Kết thúc chương trình.
        11. Chọn sai chức năng thì thông báo lỗi nhắc người dùng nhập lại
 */

// todo 3: sử dụng id tự tăng sao cho hợp lý
public class Test {
    private static final int EMP_NUM_MAX = 100; // số lượng nhân viên tối đa

    public static void main(String[] args) {
        Employee[] employees = new Employee[EMP_NUM_MAX]; // khởi tạo mảng với 1000 nhân viên
        int employeeCount = createFakeEmployee(employees); // index của nhân viên trong mảng

        Scanner input = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Xin mời chọn(1-10): ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    if (employeeCount <= EMP_NUM_MAX) {
                        var employee = createNewEmployee(input);
                        if (employee == null) {
                            System.err.println("==> Lỗi: Tạo mới nhân viên thất bại.");
                        } else {
                            employees[employeeCount++] = employee;
                            System.out.println(STR."==> Thêm nhân viên mã \{employee.getId()} thành công!");
                        }
                    } else {
                        System.err.println("==> Lỗi: số lượng nhân viên đã đạt tối đa.");
                    }
                }
                case 2 -> updateSalary(employees, input);
                case 3 -> {
                    if (deleteEmployee(employees, input)) {
                        employeeCount--;
                        System.out.println("==> Xóa nhân viên thành công.");
                    } else {
                        System.err.println("==> Không tìm thấy nhân viên cần xóa.");
                    }
                }
                case 4 -> searchEmployeeByName(employees, input);
                case 5 -> searchEmployeeByAddress(employees, input);
                case 6 -> {
                    if (employeeCount > 0) {
                        showEmployees(employees);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 7 -> {
                    if (employeeCount > 0) {
                        displayEmployeesByDescendingSalary(employees, employeeCount);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 8 -> {
                    if (employeeCount > 0) {
                        displayEmployeesByAscendingSalary(employees, employeeCount);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 9 -> {
                    if (employeeCount > 0) {
                        displayEmployeesByAddress(employees, employeeCount);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 10 -> System.err.println("==> Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi! <==");
                default -> System.err.println("==> Chọn sai chức năng. Vui lòng chọn số từ 1 -> 10.");
            }
        } while (choice != 10);
    }


    private static void searchEmployeeByAddress(Employee[] employees, Scanner input) {
        System.out.print("Nhập địa chỉ cần tìm: ");
        String key = input.nextLine();
        var pattern = Pattern.compile(STR.".*\{key}.*", Pattern.CASE_INSENSITIVE);
        System.out.printf("%-10s%-25s%-20s%-10s%-15s%-15s%-15s\n",
                "Mã NV", "Họ và tên", "Địa chỉ", "Tuổi", "Số ĐT", "Lương", "Kinh nghiệm");
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            var matcher = pattern.matcher(employee.getAddress());
            if (matcher.matches()) {
                displayEmployee(employee);
            }
        }
    }

    private static int createFakeEmployee(Employee[] employees) {
        var counter = 0;
        employees[counter++] = new Employee(null, "Lê Hoàng Nam", Address.HA_NOI, 25, "0123456789", 16500000, 5);
        employees[counter++] = new Employee(null, "Nguyễn Minh Tuấn", Address.HO_CHI_MINH, 27, "0123456749", 18500000, 7);
        employees[counter++] = new Employee(null, "Nguyễn Thảo Ngân", Address.BINH_DINH, 21, "0123456779", 14500000, 4);
        employees[counter++] = new Employee(null, "Trần Đình Long", Address.THANH_HOA, 24, "0123456719", 12300000, 3);
        employees[counter++] = new Employee(null, "Hoàng Văn Minh", Address.NGHE_AN, 26, "0123456759", 17500000, 6);
        employees[counter++] = new Employee(null, "Lưu Thị Hà", Address.DA_NANG, 20, "0123456769", 10500000, 2);
        return counter;
    }

    private static Employee findEmployeeById(Employee[] employees, String empId) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId().compareToIgnoreCase(empId) == 0) {
                return employee;
            }
        }
        return null;
    }

    private static void displayMenu() {
        System.out.println("============= Chương trình quản lý nhân viên =============");
        System.out.println("1. Thêm mới một nhân viên.");
        System.out.println("2. Cập nhật lương cho nhân viên.");
        System.out.println("3. Xóa một nhân viên theo mã nhân viên");
        System.out.println("4. Tìm kiếm và hiển thị nhân viên theo tên gần đúng.");
        System.out.println("5. Tìm nhân viên theo tên thành phố.");
        System.out.println("6. Hiển thị danh sách nhân viên hiện có dưới dạng bảng.");
        System.out.println("7. Hiển thị danh sách nhân viên theo mức lương giảm dần.");
        System.out.println("8. Hiển thị danh sách nhân viên theo mức lương tăng dần.");
        System.out.println("9. Hiển thị danh sách nhân viên theo từng tỉnh/thành phố.");
        System.out.println("10. Kết thúc chương trình.");
    }

    private static Employee createNewEmployee(Scanner input) {
        System.out.print("Họ và tên: ");
        String fullName = input.nextLine();
        System.out.print("Địa chỉ (có dấu - ví dụ: Hà Nội, hải dương): ");
        Address address = findAddressByValue(input.nextLine());
        if (address == null) {
            System.out.println("==> Lỗi: không tồn tại địa chỉ, vui lòng nhập đúng định dạng! <==");
            return null;
        }
        System.out.print("Tuổi: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("Số điện thoại: ");
        String phoneNumber = input.nextLine();
        System.out.print("Lương: ");
        double salary = Double.parseDouble(input.nextLine());
        System.out.print("Kinh nghiệm(số năm): ");
        int experience = Integer.parseInt(input.nextLine());
        return new Employee(null, fullName, address, age, phoneNumber, salary, experience);
    }

    private static Address findAddressByValue(String value) {
        var addresses = Address.values();
        for (Address address : addresses) {
            if (address.getValue().equalsIgnoreCase(value)) {
                return address;
            }
        }
        return null;
    }

    private static void updateSalary(Employee[] employees, Scanner input) {
        System.out.print("Nhập mã nhân viên bạn muốn cập nhật: ");
        var empId = input.nextLine();
        var employee = findEmployeeById(employees, empId);
        if (employee != null) {
            System.out.print(STR."Nhập tiền lương cho nhân viên mã \{employee.getId()}: ");
            employee.setSalary(Double.parseDouble(input.nextLine()));
            System.out.println("==> Tiền lương đã được cập nhật thành công.");
        } else {
            System.out.println(STR."==> Không tìm thấy nhân viên với mã \"\{empId}\"");
        }
    }

    private static boolean deleteEmployee(Employee[] employees, Scanner input) {
        System.out.print("Nhập mã nhân viên muốn xóa: ");
        String empId = input.nextLine();
        Employee employee = findEmployeeById(employees, empId);
        if (employee != null) {
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i] != null && employees[i].getId().compareToIgnoreCase(empId) == 0) {
                    for (int j = i; j < employees.length - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    break;
                }
            }
        }
        return employee != null;
    }

    private static void searchEmployeeByName(Employee[] employees, Scanner input) {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String key = input.nextLine();
        var pattern = Pattern.compile(STR.".*\{key}.*", Pattern.CASE_INSENSITIVE);
        System.out.printf("%-10s%-25s%-20s%-10s%-15s%-15s%-15s\n",
                "Mã NV", "Họ và tên", "Địa chỉ", "Tuổi", "Số ĐT", "Lương", "Kinh nghiệm");
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            var matcher = pattern.matcher(employee.getFullName());
            if (matcher.matches()) {
                displayEmployee(employee);
            }
        }
    }

    private static void showEmployees(Employee[] employees) {
        var line = "===========================================";
        System.out.println(STR."\{line} DANH SÁCH NHÂN VIÊN \{line}");
        System.out.printf("%-10s%-25s%-20s%-10s%-15s%-15s%-15s\n",
                "Mã NV", "Họ và tên", "Địa chỉ", "Tuổi", "Số ĐT", "Lương", "Kinh nghiệm");
        for (var emp : employees) {
            if (emp == null) {
                break;
            }
            displayEmployee(emp);
        }
    }

    private static void displayEmployee(Employee emp) {
        System.out.printf("%-10s%-25s%-20s%-10d%-15s%-15.2f%-15d\n", emp.getId(),
                emp.getFullName(), emp.getAddress(), emp.getAge(), emp.getPhoneNumber(),
                emp.getSalary(), emp.getExperience());
    }

    private static void displayEmployeesByDescendingSalary(Employee[] employees, int employeeCount) {
        for (int i = 0; i < employeeCount; i++) {
            for (int j = employeeCount - 1; j > i; j--) {
                // nhân viên đứng sau có lương lớn hơn nhân viên đứng trước thì đổi chỗ
                if (employees[j].getSalary() > employees[j - 1].getSalary()) {
                    var tmp = employees[j];
                    employees[j] = employees[j - 1];
                    employees[j - 1] = tmp;
                }
            }
        }
        showEmployees(employees);
    }

    private static void displayEmployeesByAscendingSalary(Employee[] employees, int employeeCount) {
        for (int i = 0; i < employeeCount; i++) {
            for (int j = employeeCount - 1; j > i; j--) {
                // nhân viên đứng sau có lương nhỏ hơn nhân viên đứng trước thì đổi chỗ
                if (employees[j].getSalary() < employees[j - 1].getSalary()) {
                    var tmp = employees[j];
                    employees[j] = employees[j - 1];
                    employees[j - 1] = tmp;
                }
            }
        }
        showEmployees(employees);
    }

    private static void displayEmployeesByAddress(Employee[] employees, int employeeCount) {
        // tìm các địa chỉ hiện tồn tại trong mảng các nhân viên
        Address[] addresses = new Address[employeeCount]; // mảng các địa chỉ đã tồn tại trong mảng nên chỉ số sẽ là tối đa
        int count = 0;
        for (int i = 0; i < employeeCount; i++) {
            // check xem địa chỉ của nhân viên hiện tại có tồn tại trong mảng các địa chỉ không
            if (!isExistedAddress(addresses, employees[i])) {
                addresses[count++] = employees[i].getAddressEnum();
            }
        }
        for (Address address : addresses) {
            if (address == null) {
                break;
            }
            System.out.println(STR."==> Danh sách nhân viên tại '\{address.getValue()}'");
            System.out.printf("%-10s%-25s%-20s%-10s%-15s%-15s%-15s\n",
                    "Mã NV", "Họ và tên", "Địa chỉ", "Tuổi", "Số ĐT", "Lương", "Kinh nghiệm");
            for (int j = 0; j < employeeCount; j++) {
                if (employees[j].getAddressEnum() == address) {
                    displayEmployee(employees[j]);
                }
            }
            System.out.println();
        }
    }

    private static boolean isExistedAddress(Address[] addresses, Employee employee) {
        for (Address address : addresses) {
            if (address == null) {
                break;
            }
            if (employee.getAddress().equals(address.getValue())) {
                return true;
            }
        }
        return false;
    }
}
