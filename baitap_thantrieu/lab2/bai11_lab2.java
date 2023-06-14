/*
    Bài 11: Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
    Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
*/

import java.util.Scanner;

public class bai11_lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 2;
        System.out.printf("Nhập vào số nguyên n = "); n = sc.nextInt();
        if (n == 1) {
            System.out.println(n + " = " + n);
        }
        else {
            System.out.printf(n + " = ");
            while (n != 1) {
                if (n % i == 0) { // nếu n chia hết cho i thì in ra i và giảm n đi i lần
                    System.out.printf(i + " x ");
                    n /= i;
                }
                else { // tăng i lên
                    ++i;
                }
            }
            System.out.print("\b\b\b"); // xóa 3 ký tự ở cuối
        }
    }
}
