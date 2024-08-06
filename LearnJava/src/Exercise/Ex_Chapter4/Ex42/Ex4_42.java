/*
    Bài 4. Nhập vào ba số a, b và c từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham
    số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng tìm giá trị lớn nhất trong
    3 số đó và in ra màn hình kết quả tương ứng.
    Các kiểu cần hỗ trợ (tương ứng với 4 phương thức):
        1. Phương thức nhận vào hai tham số kiểu int.
        2. Phương thức nhận vào hai tham số kiểu long.
        3. Phương thức nhận vào hai tham số kiểu float.
        4. Phương thức nhận vào hai tham số kiểu double.
    - Input: gồm 1 dòng chứa ba số a, b và c, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng giá trị lớn nhất trong 3 số a, b và c
 */

package Exercise.Ex_Chapter4.Ex42;

import java.util.Scanner;

public class Ex4_42 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // ba tham số kiểu int
        var a = input.nextInt();
        var b = input.nextInt();
        var c = input.nextInt();
        System.out.println(findMax(a, b, c));

        // ba tham số kiểu long
        var lNumber1 = input.nextLong();
        var lNumber2 = input.nextLong();
        var lNumber3 = input.nextLong();
        System.out.println(findMax(lNumber1, lNumber2, lNumber3));

        // ba tham số kiểu float
        var fNumber1 = input.nextFloat();
        var fNumber2 = input.nextFloat();
        var fNumber3 = input.nextFloat();
        System.out.println(findMax(fNumber1, fNumber2, fNumber3));

        // ba tham số kiểu double
        var dNumber1 = input.nextDouble();
        var dNumber2 = input.nextDouble();
        var dNumber3 = input.nextDouble();
        System.out.println(findMax(dNumber1, dNumber2, dNumber3));
    }

    public static int findMax(int a, int b, int c) {
        var max = a; // ban đầu gán max là a
        if (b > max) {   // nếu b > max thì max là b
            max = b;
        }
        if (c > max) {   // nếu c > max thì max là c
            max = c;
        }
        return max;
    }

    public static long findMax(long a, long b, long c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static float findMax(float a, float b, float c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static double findMax(double a, double b, double c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
