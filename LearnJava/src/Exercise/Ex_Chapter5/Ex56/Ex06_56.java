package Exercise.Ex_Chapter5.Ex56;

/*
    Bài 6. Kiểm tra mã màu. Mã màu bắt đầu với dấu # sau đó là 3 kí tự hoặc 6 kí tự là sự kết hợp của
    0-9, a, b, c, d, e, f, A, B, C, D, E, F. Các mã màu được nhập vào từ bàn phím, phân tách nhau bởi
    một vài khoảng trắng. Liệt kê ra các mã màu không hợp lệ.
        - Input: gồm nhiều dòng:
            o Dòng đầu là số lượng bộ test 1 <= t <= 100.
            o T dòng tiếp theo mỗi dòng gồm nhiều cụm kí tự cách nhau bằng 1 vài khoảng trắng.
        - Output: kết quả mỗi bộ test hiển thị trên 2 dòng với định dạng
            o Dòng thứ nhất hiển thị Test k: với k là số thứ tự bộ test tính từ 1.
            o Dòng còn lại liệt kê các mã màu sai định dạng. Nếu không có kết quả in ra dòng trống.
 */

import java.util.Scanner;

public class Ex06_56 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng bộ test: ");
        var t = scanner.nextInt();
        scanner.nextLine();
        for (var counter = 1; counter <= t; counter++) {
            var line = scanner.nextLine().split("\\s+");
            System.out.println(STR."Test \{counter}:");
            listResult(line);
        }
    }

    /**
     * Phương thức liệt kê các mã màu không hợp lệ
     *
     * @param colors danh sách mã màu cần xét
     */
    private static void listResult(String... colors) {
        for (var color : colors) {
            if (containInvalidCharacter(color)) {
                System.out.print(STR."\{color} ");
            }
        }
        System.out.println();
    }

    /**
     * Phương thức kiểm tra mã màu có hợp lệ không
     *
     * @param color mã màu cần kiểm tra
     * @return true nếu mã màu không hợp lệ và false nếu mã màu hợp lệ
     */
    private static boolean containInvalidCharacter(String color) {
        if (color.length() != 4 && color.length() != 7) {
            return true;
        }
        var colorToCheck = color.toLowerCase();
        if (colorToCheck.charAt(0) != '#') {
            return true;
        }
        var characters = color.toCharArray();
        for (var index = 1; index < characters.length; index++) {
            char c = characters[index];
            if (c < '0' || c > '9' && (c < 'a' || c > 'f')) {
                return true;
            }
        }
        return false;
    }
}
