package Exercise.Ex_Chapter4.Ex45;

/*
    Bài 3. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện tính tổng các chữ số n và in ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng tổng các chữ số của n
 */

import java.util.Scanner;

public class Ex3_45 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        var n = sc.nextInt();
        System.out.println(STR."Tổng các chữ số \{n} là: \{tinhTongChuSo(n)}");
    }
    public static int tinhTongChuSo(int n)
    {
        if (n < 10)
            return n;
        else
            return (n % 10) + tinhTongChuSo(n/10);
    }
}
