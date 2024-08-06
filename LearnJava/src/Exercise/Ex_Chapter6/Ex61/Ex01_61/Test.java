package Exercise.Ex_Chapter6.Ex61.Ex01_61;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // todo 5: tạo đối tượng nhân viên rỗng
        Employee employee = new Employee();
        // todo 6: gọi phương thức nhập liệu thông tin nhân viên
        createNewEmployee(employee);
        // todo 7: gọi phương thức hiển thị thông tin nhân viên
        showEmployeeInfo(employee);
    }

    // todo 3: tạo phương thức nhập liệu thông tin nhân viên
    private static void createNewEmployee(Employee employee) {
        var scanner = new Scanner(System.in);
        System.out.println("Mã nhân viên: ");
        employee.empId = scanner.nextLine();
        System.out.println("Họ và tên: ");
        employee.fullName = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        employee.address = scanner.nextLine();
        System.out.println("Tuổi: ");
        employee.age = scanner.nextInt();
        System.out.println("Mức lương: ");
        employee.salary = scanner.nextFloat();
        System.out.println("Số năm kinh nghiệm: ");
        employee.experience = scanner.nextInt();
    }

    // todo 4: tạo phương thức hiển thị thông tin nhân viên
    public static void showEmployeeInfo(Employee employee) {
        System.out.println("================ THÔNG TIN NHÂN VIÊN ================");
        System.out.println(STR."Mã nhân viên: \{employee.empId}");
        System.out.println(STR."Họ và tên: \{employee.fullName}");
        System.out.println(STR."Địa chỉ: \{employee.address}");
        System.out.println(STR."Tuổi: \{employee.age}");
        System.out.println(STR."Số điện thoại: \{employee.salary}");
        System.out.println(STR."Mức lương: \{employee.salary}");
        System.out.println(STR."Số năm kinh nghiệm: \{employee.experience}");
    }
}

/**
 * VÍ DỤ VỀ INPUT VÀ OUTPUT:
 * Mã nhân viên:
 * NV1001
 * Họ và tên:
 * TRẦN VĂN NAM
 * Địa chỉ:
 * HÀ NỘI
 * Tuổi:
 * 25
 * Mức lương:
 * 25600000
 * Số năm kinh nghiệm:
 * 5
 * ================ THÔNG TIN NHÂN VIÊN ================
 * Mã nhân viên: NV1001
 * Họ và tên: TRẦN VĂN NAM
 * Địa chỉ: HÀ NỘI
 * Tuổi: 25
 * Số điện thoại: 2.56E7
 * Mức lương: 2.56E7
 * Số năm kinh nghiệm: 5
 */

