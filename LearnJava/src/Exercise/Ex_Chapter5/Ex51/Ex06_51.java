package Exercise.Ex_Chapter5.Ex51;

/*
    Bài 6. Nhập vào một số nguyên dương n từ bàn phím, trong đó n là số lượng tên trong danh sách. Yêu cầu tự viết
    các phương thức phù hợp. Hãy viết chương trình cho phép nhập vào danh sách tên những người bạn của bạn từ bàn phím.
    Sau đó liệt kê tên những người có độ dài ngắn nhất ra màn hình.
    - Input: cho trên 2 dòng
        o Dòng đầu tiên gồm số nguyên dương n.
        o Dòng còn lại gồm tên n người bạn, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng tên của những người bạn có độ dài ngắn nhất, phân tách nhau bằng một dấu cách
 */

import java.util.Scanner;

public class Ex06_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số lượng người bạn: ");
        var n = Integer.parseInt(input.nextLine()); // số lượng tên của những người bạn
        String[] friendNames = getFriendNames(n, input);
        // hiện kết quả những người tên ngắn nhất:
        System.out.print("Người bạn có tên ngắn nhất: ");
        showResult(friendNames);
    }

    /**
     * phương thức hiển thị kết quả
     *
     * @param friends là tham số chứa danh sách tên những người bạn
     */
    private static void showResult(String[] friends) {
        var minLength = shortestName(friends);
        for (var friend : friends) {
            if (friend.length() == minLength) {
                System.out.print(friend);
            }
        }
    }

    /**
     * phương thức tìm độ dài nhỏ nhất của tên
     *
     * @param friends danh sách các tên
     * @return một giá trị nguyên
     */
    private static int shortestName(String[] friends) {
        int min = friends[0].length();
        for (int i = 1; i < friends.length; i++) {
            if (friends[i].length() < min) {
                min = friends[i].length(); // cập nhật giá trị nhỏ nhất của tên
            }
        }
        return min;
    }

    private static String[] getFriendNames(int n, Scanner input) {
        var names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = input.next();  // Nhập mỗi tên thôi nha
        }
        return names;
    }
}
