package lab03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int i = 1;
        float Si = 0;
        do {
            Si += (1/(float)i);
            i++;
        } while (i <= n);
        System.out.println("Vòng lặp do-while tổng S = " + Si);

        float Sj = 0;
        for (int j = 1; j <= n; j++) {
            Sj += (1/(float)j);
        }
        System.out.println("Vòng lặp for tổng S = " + Sj);
    }
}
