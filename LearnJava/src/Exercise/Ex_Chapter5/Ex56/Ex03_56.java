package Exercise.Ex_Chapter5.Ex56;

/*
    Bài 3. Liệt kê các số nguyên tố trong tập hợp với số lượng phần tử tùy ý nhập vào từ bàn phím.
    - Input: gồm nhiều dòng:
        o Dòng đầu là số lượng bộ test 1 <= t <= 100.
        o T dòng tiếp theo mỗi dòng gồm nhiều số nguyên cách nhau bằng 1 vài khoảng trắng.
    - Output: kết quả mỗi bộ test hiển thị trên 2 dòng với định dạng
        o Dòng thứ nhất hiển thị Test k: với k là số thứ tự bộ test tính từ 1.
        o Dòng còn lại liệt kê các số nguyên tố tìm được theo thứ tự từ trái sang phải. Nếu không có kết quả in ra dòng trống.
 */

import java.util.Scanner;

public class Ex03_56 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng bộ test: ");
        var t = scanner.nextInt();
        scanner.nextLine();
        for (var counter = 1; counter <= t; counter++) {
            var line = scanner.nextLine().split("\\s+");
            var numbers = toIntArray(line);
            System.out.println(STR."Test \{counter}:");
            listPrimeNumbers(numbers);
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
     * Phương thức liệt kê các số nguyên tố trong mảng.
     *
     * @param numbers mảng các số nguyên cần kiểm tra
     */
    public static void listPrimeNumbers(int... numbers) {
        for (var number : numbers) {
            if (isPrime(number)) {
                System.out.print(STR."\{number} ");
            }
        }
        System.out.println();
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
