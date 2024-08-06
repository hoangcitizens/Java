package Exercise.Ex_Chapter4.Ex41;

import java.util.Scanner;

public class Ex3_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        System.out.print("Nhập c = ");
        int c = scanner.nextInt();
        timMax(a,b,c);
    }

    private static void timMax(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println(STR."Số lớn nhất trong ba số \{a}, \{b}, \{c} là: \{max}");
    }
}
