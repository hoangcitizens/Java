package lab03;

import java.util.Scanner;

public class VD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int i = 1, S = 0;
        do {
             S += i;
             i++;
        } while (i <= n);
        System.out.print("Tổng các số từ 1 tới " + n + " là: " + S);

        int j = 1, Gt = 1;
        do {
            Gt *= j;
            j++;
        } while (j <= n);
        System.out.print("\nGiai thừa của " + n + " là " + n + "! = " + Gt);
    }
}
