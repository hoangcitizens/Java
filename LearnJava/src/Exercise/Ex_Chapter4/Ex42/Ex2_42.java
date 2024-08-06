/*
    Bài 2. Nhập vào hai số a và b từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham số
    phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng tính trung bình cộng 2 số đó
    và in ra màn hình kết quả tương ứng.
    Các kiểu cần hỗ trợ (tương ứng với 4 phương thức):
        1. Phương thức nhận vào hai tham số kiểu int.
        2. Phương thức nhận vào hai tham số kiểu long.
        3. Phương thức nhận vào hai tham số kiểu float.
        4. Phương thức nhận vào hai tham số kiểu double.
    - Input: gồm 1 dòng chứa hai số a và b, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng trung bình cộng của hai số a và b, làm tròn kết quả đến 2 chữ
    số thập phân sau dấu phẩy.
 */

package Exercise.Ex_Chapter4.Ex42;

import java.util.Scanner;

public class Ex2_42 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // hai tham số kiểu int
        var a = input.nextInt();
        var b = input.nextInt();
        System.out.printf(String.format("%.2f", average(a, b)));

        // hai tham số kiểu long
        var c = input.nextLong();
        var d = input.nextLong();
        System.out.printf(String.format("%.2f", average(c, d)));

        // hai tham số kiểu float
        var fNumber1 = input.nextFloat();
        var fNumber2 = input.nextFloat();
        System.out.printf(String.format("%.2f", average(fNumber1, fNumber2)));

        // hai tham số kiểu double
        var dNumber1 = input.nextDouble();
        var dNumber2 = input.nextDouble();
        System.out.printf(String.format("%.2f", average(dNumber1, dNumber2)));
    }
    // tính trung bình cộng hai số nguyên int
    public static double average(int a, int b) {
        return 0.5 * (a + b); // số nguyên cần phải ép kiểu
    }
    // tính trung bình cộng hai số nguyên long
    public static double average(long a, long b) {
        return 0.5 * (a + b); // số nguyên cần ép kiểu
    }
    // tính trung bình cộng hai số thực float
    public static double average(float a, float b) {
        return (a + b) / 2;
    }
    // tính trung bình cộng hai số thực double
    public static double average(double a, double b) {
        return (a + b) / 2;
    }
}
