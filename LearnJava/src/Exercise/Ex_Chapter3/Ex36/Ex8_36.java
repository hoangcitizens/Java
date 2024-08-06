package Exercise.Ex_Chapter3.Ex36;/*
    Bài 8. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm chữ số đầu tiên của n sử dụng vòng
    lặp while và in kết quả ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng chữ số đầu tiền của n
 */


import java.util.Scanner;

public class Ex8_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        // tìm chữ số đầu tiên của n: chia lấy nguyên chừng nào
        // n còn > 10 là ra
        while (n > 10) {
            n /= 10;
        }
        System.out.println(n);
    }
}
