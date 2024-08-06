package Exercise.Ex_Chapter4.Ex45;

import java.util.Scanner;

/*
    Bài 5. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện đếm các chữ số của n và in ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng số lượng chữ số của n.
 */
public class Ex5_45 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        var n = sc.nextInt();
        System.out.println(STR."Số chữ số của \{n} là: \{demSo(n)}");
    }

    private static int demSo(int n) {
        if (n < 10)
            return 1;
        else
            return 1 + demSo(n/10);
    }
}
