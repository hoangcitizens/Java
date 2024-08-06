package Exercise.Ex_Chapter3.Ex36;/*
    Bài 6. Nhập vào từ bàn phím một số nguyên dương n. Hãy sử dụng vòng lặp while để tính tổng biểu
    thức S dưới đây và in kết quả ra màn hình.
            S = 1 + 1/4 + 1/9 + ... + 1/(n^2)
- Input: gồm 1 dòng chứa số nguyên n > 0.
- Output: hiển thị trên 1 dòng kết quả của biểu thức S, kết quả lấy hai chữ số thập phân sau
dấu phẩy
 */


import java.util.Scanner;

public class Ex6_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var sum = 0.0;
        var i = 1;
        while (i <= n) {
            sum += 1.0 / (i * i);
            i++;
        }
        System.out.println(String.format("%.2f", sum));
    }
}
