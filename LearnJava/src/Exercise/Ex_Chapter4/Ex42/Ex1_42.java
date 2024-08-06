/*
    Bài 1. Nhập vào hai số a và b từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham số
    phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng tính tích 2 số đó và in ra màn
    hình kết quả tương ứng.
    Các kiểu cần hỗ trợ (tương ứng với 4 phương thức):
        1. Phương thức nhận vào hai tham số kiểu int.
        2. Phương thức nhận vào hai tham số kiểu long.
        3. Phương thức nhận vào hai tham số kiểu float.
        4. Phương thức nhận vào hai tham số kiểu double.
    - Input: gồm 1 dòng chứa hai số a và b, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng giá trị tích của hai số a và b, làm tròn kết quả đến 2 chữ số
    thập phân sau dấu phẩy.
 */

package Exercise.Ex_Chapter4.Ex42;

import java.util.Scanner;

public class Ex1_42 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        // hai tham số kiểu int
        System.out.print("Nhập a = ");
        var a = input.nextInt();
        System.out.print("Nhập b = ");
        var b = input.nextInt();
        System.out.println(mul(a, b));

        // hai tham số kiểu long
        System.out.print("Nhập c = ");
        var c = input.nextLong();
        System.out.print("Nhập d = ");
        var d = input.nextLong();
        System.out.println(mul(c, d));

        // hai tham số kiểu float
        System.out.print("Nhập e = ");
        var fNumber1 = input.nextFloat();
        System.out.print("Nhập f = ");
        var fNumber2 = input.nextFloat();
        System.out.println(String.format("%.2f", mul(fNumber1, fNumber2)));

        // hai tham số kiểu double
        System.out.print("Nhập g = ");
        var dNumber1 = input.nextDouble();
        System.out.print("Nhập h = ");
        var dNumber2 = input.nextDouble();
        System.out.println(String.format("%.2f", mul(dNumber1, dNumber2)));
    }

    // nhận vào hai tham số kiểu int, trả về int
    public static int mul(int a, int b) {
        return a * b;
    }

    // nhận vào hai tham số kiểu long, trả về long
    public static long mul(long a, long b) {
        return a * b;
    }

    // nhận vào hai tham số kiểu float, trả về float
    public static float mul(float a, float b) {
        return a * b;
    }

    // nhận vào hai tham số kiểu double, trả về double
    public static double mul(double a, double b) {
        return a * b;
    }
}
