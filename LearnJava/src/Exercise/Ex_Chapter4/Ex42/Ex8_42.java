/*
    Bài 8. Nhập vào tối đa 1 số nguyên dương và 1 kí tự từ bàn phím. Tự xác định kiểu, tên phương
    thức và tên các tham số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng vẽ
    tam giác cân đặc và các biến thể của nó bằng các dấu * ra màn hình.
    Các kiểu cần hỗ trợ (tương ứng với 3 phương thức):
        1. Phương thức không tham số vẽ hình tam giác cân đặc bằng các dấu * chiều cao h = 5.
        2. Phương thức nhận 1 tham số kiểu char vẽ tam giác cân đặc chiều cao h = 5 bằng 1 kí tự
        char cho trong tham số.
        3. Phương thức nhận 2 tham số, tham số thứ nhất kiểu int và tham số thứ hai kiểu char vẽ
        hình tam giác cân đặc. Tham số thứ nhất là chiều cao h của tam giác, tham số thứ hai là
    1 kí tự kiểu char để vẽ tam giác với kí tự đó.
    - Input: gồm 1 dòng chứa tối đa 1 số nguyên dương hoặc 1 kí tự, phân tách nhau bởi 1 dấu
    cách, có thể nhập trống.
    - Output: hiển thị trên nhiều dòng các hình tam giác cân đặc và biến thể của chúng.
 */

package Exercise.Ex_Chapter4.Ex42;

import java.util.Scanner;

public class Ex8_42 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // 1. Vẽ tam giác mặc định  h = 5
        drawTriangle(); // vẽ mặc định

        // 2. Vẽ tam giác đặc với kí tự c bất kỳ nhập từ bàn phím và chiều cao h = 5
        char c2 = input.next().charAt(0);
        drawTriangle(c2); // vẽ mặc định bằng kí tự c

        // 3. Vẽ tam giác đặc với chiều cao h và 1 kí tự bất kỳ nhập từ bàn phím
        var height = input.nextInt();
        char c3 = input.next().charAt(0);
        drawTriangle(height, c3); // vẽ tam giác chiều cao h bằng kí tự c
    }

    // phương thức vẽ tam giác không tham số
    public static void drawTriangle() {
        // vẽ tam giác cân đặc bằng các dấu *
        // nguyên lý: vẽ dấu * đối xứng qua cột h i, j bắt đầu từ 1
        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 đến h+i-1
        // các vị trí còn lại vẽ khoảng trắng
        var h = 5;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    // phương thức vẽ tam giác nhận 1 tham số kiểu char
    public static void drawTriangle(char c) {
        var h = 5;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %c ", c);
                }
            }
            System.out.println();
        }
    }

    // phương thức vẽ tam giác nhận 2 tham số int, char
    public static void drawTriangle(int h, char c) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %c ", c);
                }
            }
            System.out.println();
        }
    }
}
