package Exercise.Ex_Chapter4.Ex45;

import java.util.Scanner;

/*
    Bài 4. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện in ra đảo ngược các chữ số của n.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng các chữ số đảo ngược của n
 */
public class Ex4_45 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        var n = sc.nextInt();
        System.out.println(STR."Số đảo ngược của \{n} là: \{soDaoNguoc(n)}");

    }
    public static int soDaoNguoc(int n)
    {
        if (n < 10)
            return n;
        else
        {
            int digit = n % 10;
            int remainingDigits = n / 10;
            return (digit * (int) Math.pow(10, (int) Math.log10(n))) + soDaoNguoc(remainingDigits);
        }
    }
}
