package Exercise.Ex_Chapter2.Ex28;/*
    Bài 4. Nhập vào từ bàn phím hai số thực a và b bất kỳ. Hãy tìm giá trị nhỏ nhất (min) và giá trị lớn
    nhất (max) giữa hai số a và b.
    - Input: cho trên 2 dòng
        + Dòng đầu chứa số a.
        + Dòng còn lại chứa số b.
    - Output: hiển thị trên 2 dòng
        + Dòng đầu là giá trị nhỏ nhất giữa hai số a và b.
        + Dòng thứ hai là giá trị lớn nhất giữa hai số a và b.
 */
import java.util.Scanner;

public class Ex4_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        System.out.println(STR."Giá trị nhỏ nhất giữa 2 số \{a} và \{b} là: \{Math.min(a,b)}");
        System.out.println(STR."Giá trị lớn nhất giữa 2 số \{a} và \{b} là: \{Math.max(a,b)}");
    }
}
