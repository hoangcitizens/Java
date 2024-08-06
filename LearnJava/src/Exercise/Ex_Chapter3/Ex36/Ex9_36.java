package Exercise.Ex_Chapter3.Ex36;/*
    Bài 9. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm tổng chữ số đầu tiên và chữ số cuối
    cùng của n sử dụng vòng lặp while. In kết quả ra màn hình.
    - Input: gồm 1 dòng chứa số nguyên n > 0.
    - Output: hiển thị trên 1 dòng tổng của chữ số dầu tiên và cuối cùng của n.
 */

import java.util.Scanner;

public class Ex9_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();

        var sum = n % 10; // lấy chữ số cuối cùng
        // tìm chữ số đầu tiên của n: chia lấy nguyên chừng nào
        // n còn > 10 là ra
        while (n > 10) {
            n /= 10;
        }

        sum += n; // lấy chữ số đầu tiên
        System.out.println(sum);
    }
}
