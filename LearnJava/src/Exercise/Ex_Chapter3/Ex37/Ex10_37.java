package Exercise.Ex_Chapter3.Ex37;/*
    Bài 10. Nhập vào từ bàn phím một số nguyên dương n, trong đó 2 ≤ n ≤ 9. Hãy viết chương
    trình liệt kê các số thuận nghịch có n chữ số và in kết quả các số đó ra màn hình.
    Chú thích: số thuận nghịch là số đọc xuôi hay đọc ngược thì giá trị đều không đổi.
        - Input: gồm 1 dòng chứa số nguyên n sao cho 2 ≤ n ≤ 9.
        - Output: hiển thị trên 1 dòng các số thuận nghịch có n chữ số, phân tách nhau bằng 1 dấu phẩy.
 */

import java.util.Scanner;

public class Ex10_37 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập n = ");
        var n = input.nextInt();

        int count = 0; // đếm hàng để tách hàng
        var from = (long) Math.pow(10, n - 1);
        var to = (long) Math.pow(10, n) - 1;

        for (long i = from; i <= to; i++) {
            long rev = 0;
            long j = i;
            while (j > 0) {
                rev = rev * 10 + j % 10;
                j /= 10;
            }

            if (rev == i) {
                count++;
                System.out.print(i);
                if (i != to) {
                    System.out.print(", ");
                }
                if (count % 10 == 0) { // mỗi hàng in ra 10 số
                    count = 0; // reset biến đếm giá trị
                    System.out.println();
                }
            }
        }
    }
}
