package Exercise.Ex_Chapter5.Ex55;

/*
    Bài 7. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân rỗng với chiều cao bằng h sử dụng mảng
    hai chiều, mỗi phần tử trong mảng được thể hiển bằng kí tự * hoặc các khoảng trắng. In hình tam giác cân tương ứng
    ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của chiều cao của tam giác cân.
        - Output: hiển thị trên nhiều dòng hình tam giác cân rỗng thể hiển bằng kí tự *.
 */

import java.util.Scanner;

public class Ex07_55 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var h = input.nextInt();
        // mảng lưu kết quả
        var triangle = new String[h][2 * h - 1];
        // vẽ tam giác
        fillRect(triangle);
        // hiện kết quả lên màn hình
        onScreen(triangle);
    }

    /**
     * phương thức vẽ lên màn hình các giá trị trong mảng
     *
     * @param rect mảng chứa dữ liệu cần hiển thị lên màn hình
     */
    private static void onScreen(String[][] rect) {
        for (int i = 0; i < rect.length; i++) {
            for (int j = 0; j < 2 * rect.length - 1; j++) {
                System.out.print(rect[i][j]); // in ra giá trị trong mảng
            }
            System.out.println(); // in xuống dòng
        }
    }

    /**
     * phương thức điền kí tự * và khoảng trắng vào mảng
     *
     * @param rect mảng chứa hình tam giác vuông cần vẽ
     */
    private static void fillRect(String[][] rect) {
        // vẽ tam giác cân rỗng bằng các dấu *
        // nguyên lý: vẽ dấu * đối xứng qua cột h, i, j bắt đầu từ 1
        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 và h+i-1
        // các vị trí còn lại vẽ khoảng trắng. Riêng hàng cuối vẽ dấu *
        var h = rect.length;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (i == h || j == h - i + 1 || j == h + i - 1) {
                    rect[i - 1][j - 1] = " * ";
                } else {
                    rect[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}
