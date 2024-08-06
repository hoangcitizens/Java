package Exercise.Ex_Chapter2.Ex28;/*
    Bài 6. Nhập vào từ bàn phím hai số nguyên a và b bất kỳ. Hãy tính lũy thừa của ab và ba rồi in kết quả ra màn hình.
    - Input: cho trên 2 dòng
        + Dòng đầu chứa số a.
        + Dòng còn lại chứa số b.
    - Output: hiển thị trên 2 dòng
        + Dòng đầu là giá trị của a mũ b.
        + Dòng thứ hai là giá trị của b mũ a.
 */

import java.util.Scanner;

public class Ex6_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        System.out.println(STR."Lũy thừa \{a}^\{b} = \{Math.pow(a,b)}");
        System.out.println(STR."Lũy thừa \{b}^\{a} = \{Math.pow(b,a)}");
    }
}
