package Exercise.Ex_Chapter3.Ex33;/*
    Bài 9. Nhập vào từ bàn phím ba số thực dương tương ứng với ba cạnh a, b, c của tam giác. Hãy sử dụng
           kiến thức về toán tử ba ngôi để kiểm tra xem ba số đó có lập thành một tam giác vuông được không.
           In kết quả ra màn hình.
        - Input: gồm 1 dòng chứa độ dài ba cạnh a, b, c của tam giác, phân tách nhau bằng 1 dấu cách.
        - Output: Hiển thị trên 1 dòng kết quả dạng YES hoặc NO tương ứng.
 */


import java.util.Scanner;

public class Ex9_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextFloat();
        var b = scanner.nextFloat();
        var c = scanner.nextFloat();
        // điều kiện lập thành tam giác vuông:
        var result = ((a + b > c) && (b + c > a) && (c + a > b))
                && (a * a + b * b == c * c || a * a + c * c == b * b || a * a == b * b + c * c) ? "YES" : "NO";
        System.out.println(result);
    }
}
