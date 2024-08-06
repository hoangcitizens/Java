package Exercise.Ex_Chapter6.Ex62.Ex01_62;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    private static final int EMP_NUM_MAX = 100; // số lượng nhân viên tối đa

    public static void main(String[] args) {
        // todo 4: triển khai khởi tạo mảng chứa các nhân viên
        Employee[] employees = new Employee[EMP_NUM_MAX]; // khởi tạo mảng với 1000 nhân viên
        int employeeCount = createFakeEmployee(employees); // index của nhân viên trong mảng

        // todo 5: tạo đối tượng Scanner đọc dữ liệu vào từ bàn phím
        Scanner input = new Scanner(System.in);

        // todo 6: triển khai menu chứa các chức năng, gợi ý: dùng do-while kết hợp với switch-case
        int choice;
        do {
            // todo 8: gọi hiển thị menu chọn và triển khai đọc lựa chọn của ngươi dùng từ bàn phím
            displayMenu();
            System.out.print("Xin mời chọn(1-8): ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                // todo 9: triển khai code xử lý khi người dùng lựa chọn chức năng số 1
                case 1 -> {
                    if (employeeCount <= EMP_NUM_MAX) {
                        var employee = createNewEmployee(input);
                        if (employee == null) {
                            System.out.println("==> Lỗi: mã nhân viên không hợp lệ.");
                        } else {
                            employees[employeeCount++] = employee;
                            System.out.println(STR."==> Thêm nhân viên mã \{employee.id} thành công!");
                        }
                    } else {
                        System.out.println("==> Lỗi: số lượng nhân viên đã đạt tối đa.");
                    }
                }
                // todo 11: triển khai code xử lý khi người dùng lựa chọn chức năng số 2
                case 2 -> updateSalary(employees, input);
                // todo 14: triển khai code xử lý khi người dùng lựa chọn chức năng số 3
                case 3 -> {
                    if (deleteEmployee(employees, input)) {
                        employeeCount--;
                        System.out.println("==> Xóa nhân viên thành công.");
                    } else {
                        System.out.println("==> Không tìm thấy nhân viên cần xóa.");
                    }
                }
                // todo 16: triển khai code xử lý khi người dùng lựa chọn chức năng số 4
                case 4 -> searchEmployeeByName(employees, input);
                // todo 18: triển khai code xử lý khi người dùng lựa chọn chức năng số 5
                case 5 -> {
                    if (employeeCount > 0) {
                        showEmployees(employees);
                    } else {
                        System.out.println("==> Danh sách nhân viên rỗng.");
                    }
                }
                // todo 20: triển khai code xử lý khi người dùng lựa chọn chức năng số 6
                case 6 -> {
                    if (employeeCount > 0) {
                        displayEmployeesByDescendingSalary(employees, employeeCount);
                    } else {
                        System.out.println("==> Danh sách nhaan viên rỗng.");
                    }
                }
                // todo 22: triển khai code xử lý khi người dùng lựa chọn chức năng số 7
                case 7 -> {
                    if (employeeCount > 0) {
                        displayEmployeesByAscendingSalary(employees, employeeCount);
                    } else {
                        System.out.println("==> Danh sách nhaan viên rỗng.");
                    }
                }
                // todo 24: triển khai code xử lý khi người dùng lựa chọn chức năng số 8
                case 8 -> System.out.println("==> Kết thúc chương trình. Cảm ơn bạn đã sử dụng! <==");
                // todo 25: triển khai code xử lý khi người dùng lựa chọn chức năng không tồn tại
                default -> System.out.println("==> Chọn sai chức năng. Vui lòng chọn từ 1 -> 8.");
            }
        } while (choice != 8);
    }

    private static int createFakeEmployee(Employee[] employees) {
        var counter = 0;
        employees[counter++] = new Employee("EMP1001", "Lê Hoàng Nam", "Hà Nội", 25, "0123456789", 16500000, 5);
        employees[counter++] = new Employee("EMP1002", "Nguyễn Minh Tuấn", "Hồ Chí Minh", 27, "0123456749", 18500000, 7);
        employees[counter++] = new Employee("EMP1003", "Nguyễn Thảo Ngân", "Bình Định", 21, "0123456779", 14500000, 4);
        employees[counter++] = new Employee("EMP1004", "Trần Đình Long", "Thanh Hóa", 24, "0123456719", 12300000, 3);
        employees[counter++] = new Employee("EMP1005", "Hoàng Văn Minh", "Nghệ An", 26, "0123456759", 17500000, 6);
        employees[counter++] = new Employee("EMP1006", "Lưu Thị Hà", "Đà Nẵng", 20, "0123456769", 10500000, 2);
        return counter;
    }

    // todo 13: triển khai code tìm nhân viên theo mã nhân viên cho trước
    private static Employee findEmployeeById(Employee[] employees, String empId) {
        for (Employee employee : employees) {
            if (employee != null && employee.id.compareToIgnoreCase(empId) == 0) {
                return employee;
            }
        }
        return null;
    }

    // todo 7: triển khai phương thức hiển thị giao diện menu
    private static void displayMenu() {
        System.out.println("============= Chương trình quản lý nhân viên =============");
        System.out.println("1. Thêm mới một nhân viên.");
        System.out.println("2. Cập nhật lương cho nhân viên.");
        System.out.println("3. Xóa một nhân viên theo mã nhân viên");
        System.out.println("4. Tìm kiếm và hiển thị nhân viên theo tên gần đúng.");
        System.out.println("5. Hiển thị danh sách nhân viên hiện có dưới dạng bảng.");
        System.out.println("6. Hiển thị danh sách nhân viên theo mức lương giảm dần.");
        System.out.println("7. Hiển thị danh sách nhân viên theo mức lương tăng dần.");
        System.out.println("8. Kết thúc chương trình.");
    }

    // todo 10: triển khai phương thức thêm mới một nhân viên
    private static Employee createNewEmployee(Scanner input) {
        System.out.print("Mã nhân viên(EMPxxxx): ");
        String id = input.nextLine().trim().toUpperCase();
        if (id.startsWith("EMP") && id.length() == 7) {
            System.out.print("Họ và tên: ");
            String fullName = input.nextLine();
            System.out.print("Địa chỉ: ");
            String address = input.nextLine();
            System.out.print("Tuổi: ");
            int age = Integer.parseInt(input.nextLine());
            System.out.print("Số điện thoại: ");
            String phoneNumber = input.nextLine();
            System.out.print("Lương: ");
            double salary = Double.parseDouble(input.nextLine());
            System.out.print("Kinh nghiệm(số năm): ");
            int experience = Integer.parseInt(input.nextLine());
            return new Employee(id, fullName, address, age, phoneNumber, salary, experience);
        }
        return null;
    }


    // todo 12: triển khai phương thức có cập nhật tiền lương theo mã nhân viên cho trước
    private static void updateSalary(Employee[] employees, Scanner input) {
        System.out.print("Nhập mã nhân viên bạn muốn cập nhật: ");
        var empId = input.nextLine();
        var employee = findEmployeeById(employees, empId);
        if (employee != null) {
            System.out.print(STR."Nhập tiền lương cho nhân viên mã \{employee.id}: ");
            employee.salary = Double.parseDouble(input.nextLine());
            System.out.println("==> Tiền lương đã được cập nhật thành công.");
        } else {
            System.out.println(STR."==> Không tìm thấy nhân viên với mã \"\{empId}\"");
        }
    }

    // todo 15: triển khai phương thức có chức năng xóa nhân viên theo mã nhân viên
    private static boolean deleteEmployee(Employee[] employees, Scanner input) {
        System.out.print("Nhập mã nhân viên muốn xóa: ");
        String empId = input.nextLine();
        Employee employee = findEmployeeById(employees, empId);
        if (employee != null) {
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i] != null && employees[i].id.compareToIgnoreCase(empId) == 0) {
                    for (int j = i; j < employees.length - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    break;
                }
            }
        }
        return employee != null;
    }

    // todo 17: triển khai phương thức có chức năng tìm kiếm nhân viên theo mã nhân viên
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
            var matcher = pattern.matcher(employee.fullName);
            if (matcher.matches()) {
                displayEmployee(employee);
            }
        }
    }

    // todo 19: triển khai phương thức hiển thị toàn bộ nhân viên theo hàng và cột
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
        System.out.printf("%-10s%-25s%-20s%-10d%-15s%-15.2f%-15d\n", emp.id,
                emp.fullName, emp.address, emp.age, emp.phoneNumber, emp.salary, emp.experience);
    }

    // todo 21: triển khai phương thức hiển thị toàn bộ nhân viên theo lương giảm dần
    private static void displayEmployeesByDescendingSalary(Employee[] employees, int employeeCount) {
        for (int i = 0; i < employeeCount; i++) {
            for (int j = employeeCount - 1; j > i; j--) {
                // nhân viên đứng sau có lương lớn hơn nhân viên đứng trước thì đổi chỗ
                if (employees[j].salary > employees[j - 1].salary) {
                    var tmp = employees[j];
                    employees[j] = employees[j - 1];
                    employees[j - 1] = tmp;
                }
            }
        }
        showEmployees(employees);
    }

    // todo 23: triển khai phương thức hiển thị toàn bộ nhân viên theo lương tăng dần
    private static void displayEmployeesByAscendingSalary(Employee[] employees, int employeeCount) {
        for (int i = 0; i < employeeCount; i++) {
            for (int j = employeeCount - 1; j > i; j--) {
                // nhân viên đứng sau có lương nhỏ hơn nhân viên đứng trước thì đổi chỗ
                if (employees[j].salary < employees[j - 1].salary) {
                    var tmp = employees[j];
                    employees[j] = employees[j - 1];
                    employees[j - 1] = tmp;
                }
            }
        }
        showEmployees(employees);
    }
}
