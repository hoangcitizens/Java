package Exercise.Ex_Chapter4.Ex41;

import java.util.Scanner;

public class Ex7_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        tongChuSo(n);
    }

    private static void tongChuSo(int n) {
        int m = n;
        int pev = 0, S = 0;
        while (m > 0)
        {
            pev = m % 10;
            m /= 10;
            S += pev;
        }
        System.out.println(STR."Trung bình cộng chữ số của \{n} là: \{S}");
    }
}
