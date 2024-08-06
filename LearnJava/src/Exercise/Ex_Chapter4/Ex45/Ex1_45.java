package Exercise.Ex_Chapter4.Ex45;

import java.util.Scanner;

/*
    Bài 1. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện
    tính n giai thừa và in kết quả ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng giá trị của n giai thừa.
 */
public class Ex1_45 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        var n = sc.nextInt();
        System.out.print(STR."\{n}! = \{factorial(n)}");
    }
    public static long factorial(int n)
    {
        if (n < 2)
            return 1;
        else
            return n * factorial(n-1);
    }
}
