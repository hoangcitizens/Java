package Exercise.Ex_Chapter5.Ex51;
/*
    Bài 2. Nhập vào một số nguyên dương n từ bàn phím. Yêu cầu tự viết các phương thức phù hợp.
    Hãy tìm n số nguyên tố đầu tiên rồi lưu vào một mảng. Sau đó hiện kết quả ra màn hình các phần tử trong mảng đó.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng các phần tử của mảng chứa n số nguyên tố, phân tách nhau bằng 1 dấu cách.
 */

import java.util.Scanner;

public class Ex02_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();

        var primeNumbers = firstNPrime(n);
        showResult(primeNumbers);
    }

    // phương thức hiển thị kết quả
    private static void showResult(int[] primes) {
        for (int prime : primes) {
            System.out.print(STR."\{prime} ");
        }
    }

    // phương thức tìm n số ng.tố đầu tiên
    private static int[] firstNPrime(int n) {
        var primes = new int[n];
        var count = 0; // biến đếm số ng.tố
        int i = 2;
        while (count < n) {
            if (isPrime(i)) { // nếu n là số ng.tố
                primes[count] = i; // lưu lại n
                count++; // tăng biến đếm lên
            }
            i++; // tăng i lên
        }
        return primes; // trả về mảng số ng.tố
    }

    // phương thức kiểm tra n có phải số nt
    private static boolean isPrime(int n) {
        if (n < 2) { // mọi n nhỏ hơn 2 đều k là số ng.tố
            return false; // trả về false
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // n có nghiệm khác 1 và chính nó
                return false; // n k ng.tố
            }
        }
        return true; // mặc định n là số ng.tố
    }
}
