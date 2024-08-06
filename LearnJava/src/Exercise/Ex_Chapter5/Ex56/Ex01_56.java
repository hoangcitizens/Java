package Exercise.Ex_Chapter5.Ex56;

/*
     Bài 1. Tính tổng các số thực với số lượng tùy ý nhập vào từ bàn phím.
    - Input: gồm nhiều dòng:
        o Dòng đầu là số lượng bộ test 1 <= t <= 100.
        o T dòng tiếp theo mỗi dòng gồm nhiều số thực cách nhau bằng 1 vài khoảng trắng.
    - Output: kết quả mỗi bộ test hiển thị trên 1 với định dạng Test k: kết_quả.
 */

import java.util.Scanner;

public class Ex01_56 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng bộ test: ");
        var t = scanner.nextInt();
        scanner.nextLine();
        for (var counter = 1; counter <= t; counter++) {
            var line = scanner.nextLine().split("\\s+");
            var numbers = toDoubleArray(line);
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
    public static double[] toDoubleArray(String... strings) {
        var numbers = new double[strings.length];
        var counter = 0;
        for (var item : strings) {
            numbers[counter++] = Double.parseDouble(item);
        }
        return numbers;
    }

    /**
     * Phương thức tính tổng các số thực cho trước.
     *
     * @param numbers mảng các số thực cần tính tổng
     * @return tổng tìm được
     */
    public static double sum(double... numbers) {
        var sum = 0.0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }
}
