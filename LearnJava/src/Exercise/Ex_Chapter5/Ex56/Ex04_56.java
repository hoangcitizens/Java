package Exercise.Ex_Chapter5.Ex56;

import java.util.Scanner;

/*
    Bài 4. Đếm số lần xuất hiện của các số nguyên trong tập hợp với số lượng phần tử tùy ý nhập vào từ bàn phím.
        - Input: gồm nhiều dòng:
            o Dòng đầu là số lượng bộ test 1 <= t <= 100.
            o T dòng tiếp theo mỗi dòng gồm nhiều số nguyên cách nhau bằng 1 vài khoảng trắng.
        - Output: kết quả mỗi bộ test hiển thị trên nhiều dòng với định dạng
            o Dòng thứ nhất hiển thị Test k: với k là số thứ tự bộ test tính từ 1.
            o Các dòng còn lại liệt kê giá trị số: số lần xuất hiện.
 */
public class Ex04_56 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng bộ test: ");
        var t = scanner.nextInt();
        scanner.nextLine();
        for (var counter = 1; counter <= t; counter++) {
            var line = scanner.nextLine().split("\\s+");
            var numbers = toIntArray(line);
            System.out.println(STR."Test \{counter}:");
            count(numbers);
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
     * Phương thức đếm số lần xuất hiện của các giá trị trong mảng.
     *
     * @param numbers mảng các số nguyên cần đếm
     */
    public static void count(int... numbers) {
        for (var index = 0; index < numbers.length; index++) {
            if (!isExisted(numbers[index], index, numbers)) {
                int count = 0;
                System.out.print(STR."\{numbers[index]}: ");
                for (var item : numbers) {
                    if (item == numbers[index]) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }

    /**
     * Phương thức kiểm tra xem tính đến trước vị trí pos thì giá trị x đã xuất hiện
     * trong mảng numbers chưa.
     *
     * @param x       giá trị cần tìm
     * @param pos     vị trí chặn trên
     * @param numbers mảng chứa các phần tử cần xem xét
     * @return trả về true nếu x đã tồn tại và false nếu ngược lại
     */
    private static boolean isExisted(int x, int pos, int... numbers) {
        for (var index = 0; index < pos; index++) {
            if (numbers[index] == x) {
                return true;
            }
        }
        return false;
    }
}
