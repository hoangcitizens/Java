package Exercise.Ex_Chapter3.Ex33;/*
    Bài 1: Nhập vào một số nguyên n từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để kiểm
           tra số đó chẵn hay lẻ và in kết luận tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n bất kì.
        - Output: hiển thị trên 1 dòng kết luận EVEN hoặc ODD tương ứng
 */

import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Ex1_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        var n = scanner.nextInt();
        System.out.println((n % 2 == 0) ? STR."\{n} là số chẵn" : STR."\{n} là số lẻ");
    }
}