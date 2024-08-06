package Lesson.Ls_Chapter5_Arrays.Ls51_array1_foreach;

import java.util.Scanner;

public class Lesson51_VD2 {
    public static void main(String[] args) {
        // Ví dụ 2: Cho mảng nguyên n > 0 phần tử nhập vào từ bàn phím. Liệt kê các số nguyên tố trong mảng này.
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng > 0: ");
        var n = input.nextInt();
        if (n > 0) {
            // tạo mảng chứa dữ liệu nhập vào:
            var numbers = getNumbers(n, input);
            // hiển thị kết quả:
            showRessult(numbers);
        } else {
            System.out.println("Vui lòng nhập số phần tử mảng > 0");
        }
    }

    // phương thức hiển thị kết quả
    private static void showRessult(int[] numbers) {
        System.out.println("Các số nguyên tố trong mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) { // nếu số tại vị trí i là số ng.tố
                System.out.print(numbers[i] + " "); // in nó ra
            }
        }
    }

    // phương thức nhập vào danh sách các số nguyên cần kiểm tra
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(STR."Nhập phần tử thứ \{i + 1}: ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    // phương thức kiểm tra n có phải số nguyên tố hay không
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
