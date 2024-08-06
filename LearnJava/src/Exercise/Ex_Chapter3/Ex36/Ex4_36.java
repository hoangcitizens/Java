package Exercise.Ex_Chapter3.Ex36;/*
    Bài 4. Nhập vào một thông điệp từ bàn phím. Hãy hiển thị các kí tự trong thông điệp từ cuối lên
    đầu bằng cách sử dụng vòng lặp while. In kết quả tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa thông điệp.
        - Output: hiển thị trên 1 dòng các kí tự của thông điệp theo thứ tự ngược lại.
 */


import java.util.Scanner;

public class Ex4_36 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi ký tự: ");
        var str = scanner.nextLine();
        int i = str.length() - 1;
        while (i >= 0)
        {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}
