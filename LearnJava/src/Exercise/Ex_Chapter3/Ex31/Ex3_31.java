package Exercise.Ex_Chapter3.Ex31;/*
    Bài 3. Nhập vào từ bàn phím ba số thực dương tương ứng với ba cạnh a, b, c của tam giác. Hãy
    kiểm tra xem ba số đó có lập thành một tam giác được không. In kết quả ra màn hình.
    - Input: gồm 1 dòng chứa độ dài ba cạnh a, b, c của tam giác, phân tách nhau bằng 1 dấu cách.
    - Output: Hiển thị trên 1 dòng kết quả dạng CÓ hoặc KHÔNG tương ứng.
 */
import java.util.Scanner;

public class Ex3_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b = ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c = ");
        int c = scanner.nextInt();
        if ((a + b > c) && (b + c > a) && (a + c > b))
            System.out.printf(STR."Ba cạnh có độ dài \{a}, \{b}, \{c} tạo thành 1 tam giác");
        else
            System.out.printf(STR."Ba cạnh có độ dài \{a}, \{b}, \{c} KHÔNG tạo thành 1 tam giác");
    }
}
