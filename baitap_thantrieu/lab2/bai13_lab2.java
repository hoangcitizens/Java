/*
    Bài 13: Viết chương trình nhập vào số nguyên dương n và thực hiện liệt kê n số nguyên tố đầu tiên.
*/

import java.util.Scanner;

public class bai13_lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n = "); int n = sc.nextInt();
        System.out.printf(n + " số nguyên tố đầu tiên là: ");
        int x = 2, count = 0;
        while (true) {
            if (kiemTraSoNguyenTo(x)) {
                System.out.printf(x + ", ");
                count++;
            }
            if (count == n) {
                break;
            }
            x++;
//            if (x == 2)
//                x++;
//            else // điều kiện cho quá trình duyệt nhanh hơn
//                x += 2;
        }
        System.out.printf("\b\b");
    }
    public static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }
}

