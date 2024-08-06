package Exercise.Ex_Chapter3.Ex36;/*
    Bài 10. Nhập vào từ bàn phím một số nguyên dương n. Hãy sử dụng vòng lặp while để đếm xem n có
    bao nhiêu chữ số. In kết quả ra màn hình là số chữ số của n.
    - Input: gồm 1 dòng chứa số nguyên n > 0.
    - Output: hiển thị trên 1 dòng số chữ số của n
 */

import java.util.Scanner;

public class Ex10_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var numOfDigits = 0;
        // ta đến số chữ số rất đơn giản: mỗi khi chia nguyên cho 10
        // thì ta đếm đc thêm 1 chữ số của n
        while (n > 0) {
            n /= 10;
            numOfDigits++; // tăng biến đếm số chữ số
        }
        System.out.println(numOfDigits);
    }
}
