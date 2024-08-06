package Exercise.Ex_Chapter4.Ex41;

import java.util.Scanner;

public class Ex2_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        soDoiXung(n);
    }

    private static void soDoiXung(int n) {
        if (kiemTraSoDoiXung(n))
            System.out.println(STR."\{n} là số đối xứng");
        else
            System.out.println(STR."\{n} không là số đối xứng");
    }

    private static boolean kiemTraSoDoiXung(int n) {
        int m = n;
        int tmp = 0;
        while (m > 0)
        {
            tmp = tmp * 10 + m % 10;
            m /= 10;
        }
        return tmp == n;
    }
}