package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 4. Nhập vào một chuỗi kí tự từ bàn phím, chuỗi gồm các từ cách nhau bởi 1 vài khoảng trắng, không có
    các khoảng trắng ở đầu và cuối chuỗi. Yêu cầu tự viết các phương thức phù hợp. Hãy tách các từ trong chuỗi
    ra và lưu vào mảng. Sau đó hiển thị kết quả ra màn hình.
    - Input: gồm 1 dòng chứa chuỗi kí tự.
    - Output: hiển thị trên nhiều dòng các từ sau khi tách và chỉ số tương ứng , phân tách nhau bởi một dấu -.
 */
public class Ex04_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine(); // đọc cả dòng
        // tách tại vị trí có 1 hoặc nhiều khoảng trắng
        String[] words = str.split("\\s+");
        // hiện kết quả
        for (int i = 0; i < words.length; i++) {
            System.out.println(STR."\{i} - \{words[i]}");
        }
    }
}
