package Exercise.Ex_Chapter6.Ex67.Ex01_67;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
    Bài 1. Thông tin về nhân viên bao gồm: mã nhân viên(cả chữ và số, có dạng EMPxxxx, ví dụ EMP1001), phần số tự động
    tăng từ 1001, họ và tên đầy đủ, địa chỉ, tuổi, số điện thoại, mức lương, số năm kinh nghiệm. Trong đó địa chỉ nhân
    viên là 1 trong 63 tỉnh thành phố của Việt Nam biểu diễn bởi một enum. Thiết kế lớp mô tả đối tượng nhân viên như
    trên, sử dụng tính đóng gói dữ liệu và bổ sung các phương thức phụ trợ cần thiết. Tạo các constructor đầy đủ và tái
    sử dụng sao cho hợp lý. Lập danh sách(dùng ArrayList) các nhân viên sau đó tạo menu cho phép thực hiện các chức năng
    cho tới khi nào người dùng muốn kết thúc thì dừng chương trình:
        1. Nhập liệu thông tin nhân viên mới và thêm vào danh sách các nhân viên. Mỗi nhân viên xuất hiện không quá 1
           lần trong danh sách này.
        2. Sửa thông tin lương nhân viên theo mã nhân viên.
        3. Xóa bỏ nhân viên theo mã nhân viên.
        4. Tìm và hiển thị thông tin nhân viên theo tên gần đúng(tham khảo chương regular expression).
        5. Tìm nhân viên theo tên thành phố.
        6. Hiển thị danh sách nhân viên hiện có dưới dạng các hàng, cột ngay ngắn.
        7. Hiển thị danh sách nhân viên theo mức lương giảm dần.
        8. Hiển thị danh sách nhân viên theo mức lương tăng dần.
        9. Hiển thị danh sách nhân viên theo từng tỉnh/thành phố.
        10. Kết thúc chương trình.
        11. Chọn sai chức năng thì thông báo lỗi nhắc người dùng nhập lại.
 */

// todo 1: thay mảng bởi ArrayList và sửa đổi code tương ứng sao cho hợp lý
public class Test {
    public static void main(String[] args) {
        var employees = new ArrayList<Employee>(); // khởi tạo mảng với 1000 nhân viên
        createFakeEmployee(employees); // tạo danh sách nhân viên giả định

        Scanner input = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Xin mời chọn(1-10): ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    var employee = createNewEmployee(input);
                    if (employee == null) {
                        System.err.println("==> Lỗi: Tạo mới nhân viên thất bại.");
                    } else {
                        employees.add(employee);
                        System.out.println(STR."==> Thêm nhân viên mã \{employee.getId()} thành công!");
                    }
                }
                case 2 -> updateSalary(employees, input);
                case 3 -> {
                    if (!employees.isEmpty()) {
                        if (deleteEmployee(employees, input)) {
                            System.out.println("==> Xóa nhân viên thành công.");
                        } else {
                            System.err.println("==> Không tìm thấy nhân viên cần xóa.");
                        }
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 4 -> searchEmployeeByName(employees, input);
                case 5 -> searchEmployeeByAddress(employees, input);
                case 6 -> {
                    if (!employees.isEmpty()) {
                        showEmployees(employees);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 7 -> {
                    if (!employees.isEmpty()) {
                        displayEmployeesByDescendingSalary(employees);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 8 -> {
                    if (!employees.isEmpty()) {
                        displayEmployeesByAscendingSalary(employees);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 9 -> {
                    if (!employees.isEmpty()) {
                        displayEmployeesByAddress(employees);
                    } else {
                        System.err.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                case 10 -> System.err.println("==> Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi! <==");
                default -> System.err.println("==> Chọn sai chức năng. Vui lòng chọn số từ 1 -> 10.");
            }
        } while (choice != 10);
    }


    private static void searchEmployeeByAddress(ArrayList<Employee> employees, Scanner input) {
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

    private static void createFakeEmployee(ArrayList<Employee> employees) {
        employees.add(new Employee(null, "Lê Hoàng Nam", Address.HA_NOI, 25, "0123456789", 16500000, 5));
        employees.add(new Employee(null, "Nguyễn Minh Tuấn", Address.HO_CHI_MINH, 27, "0123456749", 18500000, 7));
        employees.add(new Employee(null, "Nguyễn Thảo Ngân", Address.BINH_DINH, 21, "0123456779", 14500000, 4));
        employees.add(new Employee(null, "Trần Đình Long", Address.THANH_HOA, 24, "0123456719", 12300000, 3));
        employees.add(new Employee(null, "Hoàng Văn Minh", Address.NGHE_AN, 26, "0123456759", 17500000, 6));
        employees.add(new Employee(null, "Lưu Thị Hà", Address.DA_NANG, 20, "0123456769", 10500000, 2));
    }

    private static Employee findEmployeeById(ArrayList<Employee> employees, String empId) {
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

    private static void updateSalary(ArrayList<Employee> employees, Scanner input) {
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

    private static boolean deleteEmployee(ArrayList<Employee> employees, Scanner input) {
        System.out.print("Nhập mã nhân viên muốn xóa: ");
        String empId = input.nextLine();
        Employee employee = findEmployeeById(employees, empId);
        if (employee != null) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i) != null && employees.get(i).getId().compareToIgnoreCase(empId) == 0) {
                    employees.remove(employee);
                    break;
                }
            }
        }
        return employee != null;
    }

    private static void searchEmployeeByName(ArrayList<Employee> employees, Scanner input) {
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

    private static void showEmployees(ArrayList<Employee> employees) {
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

    private static void displayEmployeesByDescendingSalary(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = employees.size() - 1; j > i; j--) {
                // nhân viên đứng sau có lương lớn hơn nhân viên đứng trước thì đổi chỗ
                if (employees.get(j).getSalary() > employees.get(j - 1).getSalary()) {
                    var tmp = employees.get(j);
                    employees.set(j, employees.get(j - 1));
                    employees.set(j - 1, tmp);
                }
            }
        }
        showEmployees(employees);
    }

    private static void displayEmployeesByAscendingSalary(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = employees.size() - 1; j > i; j--) {
                // nhân viên đứng sau có lương nhỏ hơn nhân viên đứng trước thì đổi chỗ
                if (employees.get(j).getSalary() < employees.get(j - 1).getSalary()) {
                    var tmp = employees.get(j);
                    employees.set(j, employees.get(j - 1));
                    employees.set(j - 1, tmp);
                }
            }
        }
        showEmployees(employees);
    }

    private static void displayEmployeesByAddress(ArrayList<Employee> employees) {
        // tìm các địa chỉ hiện tồn tại trong mảng các nhân viên
        ArrayList<Address> addresses = new ArrayList<>(); // mảng các địa chỉ đã tồn tại trong mảng nên chỉ số sẽ là tối đa
        for (Employee value : employees) {
            // check xem địa chỉ của nhân viên hiện tại có tồn tại trong mảng các địa chỉ không
            if (!isExistedAddress(addresses, value)) {
                addresses.add(value.getAddressEnum());
            }
        }
        for (Address address : addresses) {
            if (address == null) {
                break;
            }
            System.out.println(STR."==> Danh sách nhân viên tại '\{address.getValue()}'");
            System.out.printf("%-10s%-25s%-20s%-10s%-15s%-15s%-15s\n",
                    "Mã NV", "Họ và tên", "Địa chỉ", "Tuổi", "Số ĐT", "Lương", "Kinh nghiệm");
            for (Employee employee : employees) {
                if (employee.getAddressEnum() == address) {
                    displayEmployee(employee);
                }
            }
            System.out.println();
        }
    }

    private static boolean isExistedAddress(ArrayList<Address> addresses, Employee employee) {
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
