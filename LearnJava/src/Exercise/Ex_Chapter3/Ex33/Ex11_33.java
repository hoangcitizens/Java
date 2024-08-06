package Exercise.Ex_Chapter3.Ex33;/*
    Bài 11. Nhập vào từ bàn phím một số thực r, trong đó r là bán kính của một đường tròn. Hãy sử
    dụng kiến thức về toán tử ba ngôi để tính chu vi và diện tích của đường tròn này, lấy PI = 3.14.
    Sau đó in kết quả ra màn hình.
    - Input: gồm 1 dòng chứa số thực r là bán kính của đường tròn.
    - Output: Hiển thị trên 1 dòng giá trị chu vi và diện của đường tròn, phân tách nhau bởi 1
      dấu cách. Nếu r <= 0 thì in ra màn hình “INVALID”.
 */

import java.util.Scanner;

public class Ex11_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        final var PI = 3.14;
        var r = scanner.nextFloat();
        var result = (r <= 0) ? "INVALID"
                : STR."\{2 * PI * r} \{PI * r * r}";
        System.out.println(result);
    }
}
