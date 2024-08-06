package Exercise.Ex_Chapter3.Ex35;/*
    Bài 6. Nhập vào một số nguyên n từ bàn phím. Hãy viết chương trình kiểm tra n có phải số nguyên tố hay
           không và in kết quả ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên.
        - Output: hiển thị trên 1 dòng kết quả tương ứng YES nếu n là số nguyên tố và NO nếu n không phải số nguyên tố
 */

import java.util.Scanner;

public class Ex6_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        var n = scanner.nextInt();
        int count = 0;
        if (n < 2)
            System.out.println(STR."\{n} không là số nguyên tố");
        else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0)
                    count++;
            }
            var result = (count == 0) ? STR."\{n} là số nguyên tố" : STR."\{n} không là số nguyên tố";
            System.out.println(result);
        }
    }
}
