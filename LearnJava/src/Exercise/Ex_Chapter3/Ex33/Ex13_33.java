package Exercise.Ex_Chapter3.Ex33;/*
    Bài 13. Nhập vào hai số thực a và h từ bàn phím, trong đó h là chiều cao hạ từ đỉnh đối diện cạnh
            a của một tam giác. Hãy sử dụng kiến thức về toán tử ba ngôi để tính diện tích tam giác này và in
            ra màn hình kết quả tương ứng.
    - Input: gồm 1 dòng chứa hai số thực a và h, phân tách nhau bởi 1 dấu cách.
    - Output: Hiển thị trên 1 dòng giá trị diện tích của tam giác, nếu a < 0 hoặc b < 0 thì in ra màn hình “INVALID” .
 */

import java.util.Scanner;

public class Ex13_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextFloat();
        var h = scanner.nextFloat();
        var result = (a <= 0 || h <= 0) ? "INVALID"
                : STR."\{0.5 * a * h}";
        System.out.println(result);
    }
}
