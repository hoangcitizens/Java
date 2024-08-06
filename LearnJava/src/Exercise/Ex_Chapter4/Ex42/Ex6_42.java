/*
    Bài 6. Nhập vào tối đa 2 số nguyên dương từ bàn phím. Tự xác định kiểu, tên phương thức và tên
    các tham số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng vẽ hình chữ nhật
    đặc và các biến thể của nó bằng các dấu * ra màn hình.
    Các kiểu cần hỗ trợ (tương ứng với 3 phương thức):
        1. Phương thức mặc định không tham số vẽ hình vuông kích thước 5 x 5.
        2. Phương thức nhận 1 tham số kiểu int vẽ hình vuông với kích thước cho trong tham số.
        3. Phương thức nhận 2 tham số kiểu int vẽ hình chữ nhật với kích thước dài x rộng cho trong
        2 tham số. Tham số thứ nhất là chiều dài, tham số thứ hai là chiều rộng.
    - Input: gồm 1 dòng chứa tối đa 2 số nguyên dương tương ứng, phân tách nhau bởi 1 dấu cách, có thể nhập trống.
    - Output: hiển thị trên nhiều dòng hình chữ nhật hoặc các hình vuông theo kích thước tương ứng.
 */

package Exercise.Ex_Chapter4.Ex42;

import java.util.Scanner;

public class Ex6_42 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        drawRectangle();

        System.out.println(); // in xuống dòng

        var size = input.nextInt();
        drawRectangle(size);

        System.out.println(); // in xuống dòng

        var height = input.nextInt();
        var width = input.nextInt();
        drawRectangle(width, height);
    }

    // phương thức không tham số
    public static void drawRectangle() {
        var size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // phương thức có tham số int
    public static void drawRectangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // phương thức nhận 2 tham số int
    public static void drawRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf(" * ");
            }
            System.out.println();
        }
    }
}
