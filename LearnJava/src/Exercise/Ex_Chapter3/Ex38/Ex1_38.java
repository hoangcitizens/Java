package Exercise.Ex_Chapter3.Ex38;/*
    Bài 1. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm ước số của n thỏa mãn hai điều
    kiện là ước số nhỏ nhất và là số nguyên tố. In kết quả tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng kết quả là ước số nguyên tố nhỏ nhất của n.
 */

import java.util.Scanner;

public class Ex1_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        // tìm ước số nguyên tố nhỏ nhất của n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true; // mặc định ban đầu giả sử i là nguyên tố
            var bound = (int) Math.sqrt(i); // lấy phần nguyên căn i
            // tiến hành kiểm chứng i có ng.tố hay không
            for (int j = 2; j <= bound; j++) {
                if (i % j == 0) {
                    isPrime = false; // đánh dấu k phải số ng.tố
                    break; // thoát lặp for với j
                }
            }
            if (isPrime && n % i == 0) { // nếu i ng.tố và n chia hết cho i
                System.out.println(i);
                break; // kết thúc vòng lặp tìm ước ng.tố nhỏ nhất
            }
        }
    }
}