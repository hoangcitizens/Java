package Exercise.Ex_Chapter3.Ex33;/*
    Bài 2. Nhập vào một số nguyên n từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để kiểm
           tra số đó âm, dương hay không âm không dương. Sau đó in kết luận tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n bất kì.
        - Output: hiển thị trên 1 dòng kết luận “NEGATIVE” hoặc “POSITIVE” hoặc “UNSIGNED” tương ứng
 */

import java.util.Scanner;

public class Ex2_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var result = n > 0 ? "POSITIVE"
                : n < 0 ? "NEGATIVE"
                : "UNSIGNED";
        System.out.println(result);
    }
}
