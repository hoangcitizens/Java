package Exercise.Ex_Chapter5.Ex53;

/*
    Bài 7. Nhập vào từ bàn phím một chuỗi kí tự, mỗi từ trong chuỗi cách nhau 1 dấu cách, chuỗi không được chứa 1 hay
    nhiều khoảng trắng ở đầu và cuối chuỗi. Hãy viết chương trình tách các từ của chuỗi đó ra và sắp xếp theo
    thứ tự từ z-a.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên 1 dòng các từ của chuỗi sau khi tách được sắp xếp theo thứ tự z-a.
 */

import java.util.Scanner;

public class Ex07_53 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine();
        // tách các từ tại vị trí có 1 hoặc nhiều dấu cách
        var words = str.split("\\s+");
        sort(words);
        showWords(words);
    }

    /**
     * phương thức thực hiện sắp xếp các từ theo thứ tự z-a
     *
     * @param words danh sách từ cần sắp xếp
     */
    private static void sort(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = words.length - 1; j > i; j--) {
                // nếu từ đứng sau mà lớn hơn từ đứng trước
                if (words[j].compareTo(words[j - 1]) > 0) {
                    // đổi chỗ hai từ
                    var tmp = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = tmp;
                }
            }
        }
    }

    /**
     * phương thức hiển thị danh sách các từ
     *
     * @param words danh sách các từ
     */
    private static void showWords(String[] words) {
        for (var word : words) {
            System.out.print(word + " ");
        }
        System.out.println(); // in xuống dòng
    }
}
