package Exercise.Ex_Chapter5.Ex54;

/*
    Bài 8. Nhập vào một chuỗi kí tự từ bàn phím, chuỗi không được chứa 1 hay nhiều khoảng trắng ở đầu và cuối chuỗi,
    mỗi từ trong chuỗi cách nhau bằng 1 dấu cách. Hãy viết chương trình đếm số lần xuất hiện của từng kí tự trong chuỗi
    và in các kết quả tương ứng ra màn hình. Lưu ý không có kí tự khoảng trắng.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên mỗi dòng từng kí tự của chuỗi và số lần xuất hiện tương ứng của kí tự đó,
          không có kí tự khoảng trắng, phân tách nhau bằng 1 dấu -.
 */

import java.util.Scanner;

public class Ex08_54 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine();
        countLetters(str);
    }

    /**
     * phương thức dùng để đếm số lần xuất hiện của từng từ
     * phần tử trong chuỗi str
     *
     * @param str chuỗi kí tự gốc
     */
    private static void countLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isExist(str, str.charAt(i), i) && str.charAt(i) != ' ') {
                var result = count(str, str.charAt(i));
                System.out.println("\'" + str.charAt(i) + "\'" + " - " + result);
            }
        }
    }

    /**
     * phương thức dùng để kiểm tra xem trong khoảng [0, bound]
     * đã có sự xuất hiện của c hay chưa
     *
     * @param str   là chuỗi gốc
     * @param c     là kí tự cần kiểm tra
     * @param bound là biên trên
     * @return true nếu c đã xuất hiện trong [0, bound) và false trong trường hợp ngược lại
     */
    private static boolean isExist(String str, char c, int bound) {
        for (int i = 0; i < bound; i++) {
            if (str.charAt(i) == c) { // nếu xuất hiện rồi
                return true;
            }
        }
        return false; // chưa xuất hiện
    }

    /**
     * phương thức dùng để đếm số lần xuất hiện của từng kí tự
     *
     * @param str chuỗi gốc
     * @param key kí tự cần đếm
     * @return số lần c xuất hiện trong str
     */
    private static int count(String str, char key) {
        var counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (key == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
