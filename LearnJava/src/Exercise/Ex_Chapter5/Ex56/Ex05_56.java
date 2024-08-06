package Exercise.Ex_Chapter5.Ex56;

import java.util.Scanner;

/*
    Bài 5. Đếm số từ trong câu nhập vào từ bàn phím. Các từ phân tách nhau bởi khoảng trắng.
    - Input: gồm nhiều dòng:
        o Dòng đầu là số lượng bộ test 1 <= t <= 100.
        o T dòng tiếp theo mỗi dòng gồm nhiều cụm kí tự cách nhau bằng 1 vài khoảng trắng.
    - Output: kết quả mỗi bộ test hiển thị trên 2 dòng với định dạng
        o Dòng thứ nhất hiển thị Test k: với k là số thứ tự bộ test tính từ 1.
        o Dòng còn lại liệt kê số lượng từ đếm được.
 */
public class Ex05_56 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng bộ test: ");
        var t = scanner.nextInt();
        scanner.nextLine();
        for (var counter = 1; counter <= t; counter++) {
            var line = scanner.nextLine().split("\\s+");
            System.out.println(STR."Test \{counter}: \n\{line.length}");
        }
    }
}
