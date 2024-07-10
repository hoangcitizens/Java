package lab01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b = ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c = ");
        int c = scanner.nextInt();
        if (Math.abs(b-c) < a && a < b + c) {
            System.out.println("3 cạnh a = " + a + " b = " + b + " c = " + c + " tạo thành tam giác !");
            float p = (float) (a + b + c) / 2;
            float S = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Chu vi hình tam giác là: " + (a + b + c));
            System.out.println("Tính diện tích hình tam giác là: " + S);
        } else
            System.out.println("3 cạnh a = " + a + " b = " + b + " c = " + c + " không tạo thành tam giác !");
    }
}
