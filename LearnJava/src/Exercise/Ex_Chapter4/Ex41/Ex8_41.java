package Exercise.Ex_Chapter4.Ex41;/*
    Bài 8. Nhập vào hai số nguyên a và b từ bàn phím, trong đó a > 0 và b > 0. Hãy viết phương thức
    tìm ước chung lớn nhất của hai số a và b. In kết quả ra màn hình.
        - Input: gồm 1 dòng chứa hai số nguyên a > 0 và b > 0.
        - Output: Hiển thị trên 1 dòng giá trị ước chung lớn nhất của hai số a và b.
 */

import java.util.Scanner;

public class Ex8_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        UCLN(a,b);
    }

    private static void UCLN(int a, int b) {
        int m = a, n = b;
        while (a != b)
        {
            if (a > b)
                a -= b;
            if (b > a)
                b -= a;
        }
        System.out.println(STR."UCLN của \{m} và \{n} là: \{a}");
    }
}
