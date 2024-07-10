package lab02;

import java.util.Scanner;

public class VD {
     public static void main(String[] args) {
        int a;
        byte t;
        short b;
        long i;
        float f;
        double d;
        String s = new String("xin chào");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("In giá trị của a: " + a);
        System.out.println("Nhập giá trị của t: ");
        t = scanner.nextByte();
        System.out.println("In ra t = " + t);
        System.out.println("Nhập giá trị của b: ");
        b = scanner.nextShort();
        System.out.println("In ra b = " + b);
        System.out.println("Nhập giá trị của i: ");
        i = scanner.nextLong();
        System.out.println("In ra i = " + i);
        System.out.println("Nhập giá trị của f: ");
        f = scanner.nextFloat();
        System.out.println("In ra f = " + f);
        System.out.println("Nhập giá trị của d: ");
        d = scanner.nextDouble();
        System.out.println("In ra d = " + d);
    }
}
