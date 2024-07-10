package lab03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao tam giác: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j || i == j)
                    System.out.print(" * ");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
