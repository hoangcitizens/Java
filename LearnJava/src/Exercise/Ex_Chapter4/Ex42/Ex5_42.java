/*
    Bài 5. Nhập vào hai số a và b từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham số
    phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng hiển thị tổng của hai số ra màn hình.
    Các kiểu cần hỗ trợ (tương ứng với 9 phương thức):
        1. Phương thức nhận vào 1 tham số: String.
        2. Phương thức nhận vào 2 tham số: String và int.
        3. Phương thức nhận vào 2 tham số: String và float.
        4. Phương thức nhận vào 2 tham số: String và long.
        5. Phương thức nhận vào 2 tham số: String và double.
        6. Phương thức nhận vào 4 tham số: String, int, int, int.
        7. Phương thức nhận vào 4 tham số: String, long, long, long.
        8. Phương thức nhận vào 4 tham số: String, float, float, float.
        9. Phương thức nhận vào 4 tham số: String, double, double, double.
    - Input: gồm 1 dòng chứa hai số a và b, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng tổng của hai số a và b.
 */

package Exercise.Ex_Chapter4.Ex42;

import java.util.Scanner;

public class Ex5_42 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // 1. gọi phương thức 1 tham số kiểu String:
        var str1 = input.nextLine();
        var a1 = input.nextInt();
        var b1 = input.nextInt();
        showResult(STR."\{str1} = \{a1 + b1}");

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 2. gọi phương thức 2 tham số kiểu String và int:
        var str2 = input.nextLine();
        var a2 = input.nextInt();
        var b2 = input.nextInt();
        showResult(str2, a2 + b2);

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 3. gọi phương thức 2 tham số kiểu String và float:
        var str3 = input.nextLine();
        var a3 = input.nextFloat();
        var b3 = input.nextFloat();
        showResult(str3, a3 + b3);

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 4. gọi phương thức 2 tham số kiểu String và long:
        var str4 = input.nextLine();
        var a4 = input.nextLong();
        var b4 = input.nextLong();
        showResult(str4, a4 + b4);

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 5. gọi phương thức 2 tham số kiểu String và double:
        var str5 = input.nextLine();
        var a5 = input.nextDouble();
        var b5 = input.nextDouble();
        showResult(str5, a5 + b5);

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 6. gọi phương thức 4 tham số kiểu String, int, int, int:
        var str6 = input.nextLine();
        var a6 = input.nextInt();
        var b6 = input.nextInt();
        var c6 = a6 + b6;
        showResult(str6, a6, b6, c6);

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 7. gọi phương thức 4 tham số kiểu String, long, long, long:
        var str7 = input.nextLine();
        var a7 = input.nextLong();
        var b7 = input.nextLong();
        var c7 = a7 + b7;
        showResult(str7, a7, b7, c7);

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 8. gọi phương thức 4 tham số kiểu String, float, float, float:
        var str8 = input.nextLine();
        var a8 = input.nextFloat();
        var b8 = input.nextFloat();
        var c8 = a8 + b8;
        showResult(str8, a8, b8, c8);

        input.nextLine(); // Đọc bỏ kí tự thừa

        // 9. gọi phương thức 4 tham số kiểu String, double, double, double:
        var str9 = input.nextLine();
        var a9 = input.nextDouble();
        var b9 = input.nextDouble();
        var c9 = a9 + b9;
        showResult(str9, a9, b9, c9);


    }

    // 1. Phương thức nhận vào 1 tham số: String.
    public static void showResult(String result) {
        System.out.println(result);
    }

    // 2. Phương thức nhận vào 2 tham số: String và int.
    public static void showResult(String msg, int result) {
        System.out.println(STR."\{msg} = \{result}");
    }

    // 3. Phương thức nhận vào 2 tham số: String và float.
    public static void showResult(String msg, float result) {
        System.out.println(STR."\{msg} = \{result}");
    }

    // 4. Phương thức nhận vào 2 tham số: String và long.
    public static void showResult(String msg, long result) {
        System.out.println(STR."\{msg} = \{result}");
    }

    // 5. Phương thức nhận vào 2 tham số: String và double.
    public static void showResult(String msg, double result) {
        System.out.println(STR."\{msg} = \{result}");
    }

    // 6. Phương thức nhận vào 4 tham số: String, int, int, int.
    public static void showResult(String msg, int a, int b, int result) {
        System.out.println(STR."\{msg}\{a} + \{b} = \{result}");
    }

    // 7. Phương thức nhận vào 4 tham số: String, long, long, long.
    public static void showResult(String msg, long a, long b, long result) {
        System.out.println(STR."\{msg}\{a} + \{b} = \{result}");
    }

    // 8. Phương thức nhận vào 4 tham số: String, float, float, float.
    public static void showResult(String msg, float a, float b, float result) {
        System.out.println(STR."\{msg}\{a} + \{b} = \{result}");
    }

    // 9. Phương thức nhận vào 4 tham số: String, double, double, double.
    public static void showResult(String msg, double a, double b, double result) {
        System.out.println(STR."\{msg}\{a} + \{b} = \{result}");
    }
}
