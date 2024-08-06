package Lesson.Ls_Chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // biến nhập dữ liệu từ bàn phím

        // nhập vào một giá trị kiểu khác
        System.out.println("Nhập tuổi: ");
        var age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        var fullName = scanner.nextLine();
        System.out.println("Điểm GPA" );
        var gpa = scanner.nextFloat();
        System.out.println("Mức lương: ");
        var salary = scanner.nextDouble();

        // hiển thị ra màn hình:
        // printf : kiểm soát theo định dạng mong muốn
        System.out.printf("Họ và tên: %-30s\n", fullName); // định dạng kiểu khác với căn lề trái 30 ký tự
        System.out.printf("Điểm GPA: %-10.2f\n", gpa); // làm chòn 2 chữ số sau dấu .
        System.out.println("Tuổi: " + age);
        var formatter = new DecimalFormat("#,###.00"); // chuẩn hóa các số
        System.out.printf("Mức lương: %s USA\n", formatter.format(salary));

        // Khai báo biến
//        - Từ phiên bản Java 9 ta có thể sử dụng keyword var để khai báo các biến cục bộ. Cú pháp: var variableName = value;
//        - Java sẽ tự động gắn kiểu cho biến dựa vào giá trị value ở phía bên phải dấu bằng ta gán cho biến.
//        - Trong cú pháp khai báo biến với keyword var, bắt buộc phải gán giá trị cho biến ngay khi khai báo. Nếu không ta sẽ bị lỗi.
        // Hằng số
//       final int MAX_VALUE = 100;
        // Nhập dữ liệu cho biến
//       char c = input.next().charAt(0); // nhập một ký tự cho biến
//       String name = input.next(): // Đọc 1 từ:
//       String fullName = input.nextLine(); // Đọc cả dòng: nextLine()
        // Một số định dạng với printf
//        Char                   :	%c
//        String                 :	%s
//        Int, byte, short, long :	%d
//        Float, double          :	%f
    }
}
