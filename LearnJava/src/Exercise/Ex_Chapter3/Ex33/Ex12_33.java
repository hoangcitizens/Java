package Exercise.Ex_Chapter3.Ex33;/*
    Bài 12. Nhập vào hai số thực a và b từ bàn phím, trong đó a là chiều dài và b là chiều rộng của một
    hình chữ nhật. Hãy sử dụng kiến thức về toán tử ba ngôi để tính chu vi và diện tích của hình chữ nhật
    này và in ra màn hình kết quả tương ứng.
    - Input: gồm 1 dòng chứa hai số thực a và b, phân tách nhau bởi 1 dấu cách.
    - Output: Hiển thị trên 1 dòng giá trị chu vi và diện tích của hình chữ nhật, phân tách nhau
      bởi 1 dấu cách. Nếu a <= 0 hoặc b <= 0 thì in ra màn hình “INVALID”.
 */

import java.util.Scanner;

public class Ex12_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextFloat();
        var b = scanner.nextFloat();
        var result = (a <= 0 || b <= 0) ? "INVALID"
                : STR."\{2 * (a + b)} \{a * b}";
        System.out.println(result);
    }
}
