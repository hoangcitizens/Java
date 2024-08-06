package Exercise.Ex_Chapter2.Ex28;/*
    Bài 5. Nhập vào từ bàn phím hai số nguyên a và b bất kỳ. Hãy làm tròn kết quả của phép chia a/b đến
           số nguyên gần nhất và in ra ngoài màn hình.
    Lưu ý: b bắt buộc phải khác 0
    - Input: cho trên 2 dòng
        + Dòng đầu chứa số a.
        + Dòng còn lại chứa số b.
    - Output: Hiện thị trên 1 dòng giá trị của phép chia a / b sau khi làm tròn.
 */


import java.util.Scanner;

public class Ex5_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        System.out.println(STR."Kết quả phép chia \{a}/\{b} là: \{Math.round((float)a/b)}");
    }
}
