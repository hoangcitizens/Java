package Exercise.Ex_Chapter3.Ex36;/*
    Bài 1. Nhập vào một số nguyên dương n từ bàn phím. Hãy tìm tất cả các ước tự nhiên của n và in kết quả ra
           màn hình.
    - Input: gồm 1 dòng chứa số nguyên n > 0.
    - Output: hiển thị trên 1 dòng kết quả gồm các ước lớn hơn 0 của n, phân tách nhau bằng 1 dấu phẩy.
              Các ước được sắp xếp theo thứ tự tăng dần.
 */


import java.util.Scanner;

public class Ex1_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int i = 1;
        System.out.print(STR."Ước tự nhiên của \{n} là: ");
        while (n > 0)
        {
            if (n % i == 0)
            {
                System.out.print(STR."\{i}, ");
            }
            i++;
        }
    }
}