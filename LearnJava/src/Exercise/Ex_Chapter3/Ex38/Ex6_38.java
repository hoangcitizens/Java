package Exercise.Ex_Chapter3.Ex38;/*
    Bài 6. Hãy viết chương trình cho phép nhập liên tục các giá trị số nguyên từ bàn phím. Việc đọc
    vào sẽ dừng khi người dùng nhập vào số nguyên tố bất kỳ đầu tiên. Hãy in giá trị của số nguyên
    tố đã nhập lên màn hình.
        - Input: gồm nhiều dòng chứa các số nguyên nhập từ bàn phím.
        - Output: hiển thị trên 1 dòng số nguyên tố đã nhập vào.
 */

import java.util.Scanner;

public class Ex6_38 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = 0;
        for (; ; ) { // vòng lặp vô hạn
            n = input.nextInt();
            boolean isPrime = true; // mặc định ban đầu giả sử i ng.tố
            var bound = (int) Math.sqrt(n); // lấy phần nguyên căn n
            if(n < 2) {
                isPrime = false;
            }

            // tiến hành kiểm chứng n có ng.tố hay không
            for (int j = 2; j <= bound; j++) {
                if (n % j == 0) {
                    isPrime = false; // đánh dấu k phải số ng.tố
                    break; // thoát lặp for với j
                }
            }

            if (isPrime) {
                System.out.println(n);
                break; // kết thúc vòng lặp tìm ước ng.tố
            }
        }
    }
}
