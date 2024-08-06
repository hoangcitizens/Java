package Exercise.Ex_Chapter3.Ex38;/*
    Bài 2. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm ước số của n thỏa mãn hai điều
    kiện là ước số lớn nhất và là số nguyên tố. In kết quả tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng kết quả là ước số nguyên tố lớn nhất của n.
Ví dụ
 */

import java.util.Scanner;

public class Ex2_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        // tìm ước số nguyên tố lớn nhất của n
        System.out.print(STR."Ước số nguyên tố lớn nhất của \{n} là: ");
        for (int i = n; i >= 2; i--) {
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
                break; // kết thúc vòng lặp tìm ước ng.tố lớn nhất
            }
        }
    }
}
