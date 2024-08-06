package Exercise.Ex_Chapter5.Ex51;

/*
    Bài 5. Nhập vào một chuỗi kí tự từ bàn phím, chuỗi kí tự không chứa 1 hay nhiều dấu cách ở đầu và cuối chuỗi.
    Yêu cầu tự viết các phương thức phù hợp. Hãy tách các từ trong chuỗi ra và in theo thứ tự ngược lại.
    Sau đó hiển thị kết quả ra màn hình.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên 1 dòng các từ sau khi tách theo thứ tự ngược lại, phân tách nhau bởi 1 dấu cách.
 */

import java.util.Scanner;

public class Ex05_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine(); // đọc cả dòng
        // tách tại vị trí có 1 hoặc nhiều khoảng trắng
        String[] words = str.split("\\s+");
        // hiện kết quả
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
