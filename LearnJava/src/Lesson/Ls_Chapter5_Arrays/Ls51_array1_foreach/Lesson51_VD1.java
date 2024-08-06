package Lesson.Ls_Chapter5_Arrays.Ls51_array1_foreach;

import java.util.Scanner;

public class Lesson51_VD1 {
    public static void main(String[] args) {
        // Ví dụ 1: Nhập vào danh sách n > 0 người bạn của bạn, lưu vào mảng. Tìm người tên dài nhất và hiển thị ra màn hình.
        var sc = new Scanner(System.in);
        System.out.print("Nhâp số lượng người bạn của bạn: ");
        var n = sc.nextInt();
        if (n < 0)
            System.out.print("Nhập số lượng là số nguyên dương");
        else {
            var friends = getFriend(n, sc);
            showResult(friends);
        }
    }

    /**
     * phương thức hiển thị những người có tên dài nhất
     * @param friends danh sách những người bạn
     */
    private static void showResult(String[] friends) {
        System.out.println("Danh sách những người có tên dài nhất: ");
        int maxLength = findMaxLength(friends);
        for (var friend : friends)
        {
            if (friend.length() == maxLength) {
                System.out.print(STR."\{friend} ");
            }
        }
    }

    /**
     * phương thức tìm độ dài lớn nhất của tên có trong danh sách
     * @param friends danh sách chứa những tên cần tìm độ dài max
     * @return độ dài lớn nhất tìm được
     */
    private static int findMaxLength(String[] friends) {
        int max = 0;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].length() > max) {
                max = friends[i].length();
            }
        }
        return max;
    }

    /**
     * phương thức này dùng để nhập vào tên n người bạn
     *
     * @param n  : là số phần tử của mảng
     * @param sc : đối tượng của lớp Scanner
     * @return mảng danh sách những người bạn
     */
    private static String[] getFriend(int n, Scanner sc) {
        var friends = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print(STR."Nhập tên người bạn thứ \{i + 1}: ");
            friends[i] = sc.next();
        }
        return friends;
    }
}
