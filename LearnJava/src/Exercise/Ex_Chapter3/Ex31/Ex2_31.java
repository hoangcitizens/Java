package Exercise.Ex_Chapter3.Ex31;/*
    Bài 2. Nhập vào một số nguyên n từ bàn phím. Hãy kiểm tra số đó chẵn hay lẻ và in kết luận tương
    ứng ra màn hình.
    - Input: gồm 1 dòng chứa số nguyên n bất kì.
    - Output: hiển thị trên 1 dòng kết luận CHẴN hoặc LẺ tương ứng.
 */


import java.util.Scanner;

public class Ex2_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        if (n % 2 == 0)
            System.out.print(STR."Số \{n} là số chẵn");
        else
            System.out.print(STR."Số \{n} là số lẻ");
    }
}
