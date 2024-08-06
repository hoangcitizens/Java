package Exercise.Ex_Chapter5.Ex56;

import java.util.Scanner;

/*
    Bài 2. Tính tổng các số nguyên tố trong tập hợp với số lượng phần tử tùy ý nhập vào từ bàn phím.
    - Input: gồm nhiều dòng:
        o Dòng đầu là số lượng bộ test 1 <= t <= 100.
        o T dòng tiếp theo mỗi dòng gồm nhiều số nguyên cách nhau bằng 1 vài khoảng trắng.
    - Output: kết quả mỗi bộ test hiển thị trên 1 dòng với định dạng Test k: kết_quả.
 */
public class Ex02_56 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng bộ test: ");
        var t = scanner.nextInt();
        scanner.nextLine();
        for (var counter = 1; counter <= t; counter++) {
            var line = scanner.nextLine().split("\\s+");
            var numbers = toIntArray(line);
            var result = sum(numbers);
            System.out.println(STR."Test \{counter}: \{result}");
        }
    }

    /**
     * Phương thức chuyển đổi chuỗi kí tự thành số
     *
     * @param strings mảng chứa các chuỗi con số cần chuyển đổi
     * @return mảng chứa các số thực sau chuyển đổi
     */
    public static int[] toIntArray(String... strings) {
        var numbers = new int[strings.length];
        var counter = 0;
        for (var item : strings) {
            numbers[counter++] = Integer.parseInt(item);
        }
        return numbers;
    }

    /**
     * Phương thức tính tổng các số nguyên tố cho trước.
     *
     * @param numbers mảng các số nguyên cần tính tổng
     * @return tổng tìm được
     */
    public static int sum(int... numbers) {
        var sum = 0;
        for (var number : numbers) {
            if (isPrime(number)) { // nếu số đang xét là số ng.tố
                sum += number; // cộng vào tổng
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        var bound = (int) Math.sqrt(number);
        for (var i = 2; i <= bound; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
