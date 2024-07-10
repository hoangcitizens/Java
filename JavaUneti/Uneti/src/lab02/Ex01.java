package lab02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập bán kính hình tròn: ");
        float r = scanner.nextFloat();
        System.out.println("Chu vi hình tròn là: " + (2 * Math.PI * r));
        System.out.println("Diện tích hình tròn là: " + (Math.PI * Math.pow(r,2)));
    }
}
