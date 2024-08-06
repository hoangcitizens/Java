package Exercise.Ex_Chapter3.Ex35;/*
    Bài 5. Nhập vào một chuỗi kí tự từ bàn phím. Chuẩn hóa chuỗi vừa nhập sao cho không có 1 hay nhiều
           dấu cách ở đầu và cuối câu, mỗi từ cách nhau 1 dấu cách. Hãy sử dụng kiến thức đã học về
           vòng lặp để in ra các kí tự của chuỗi theo thứ tự ngược lại.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên 1 dòng chuỗi kí tự đã được đảo ngược lại.
 */

import java.util.Scanner;

public class Ex5_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        var str = scanner.nextLine().trim();
        str = str.replaceAll("\\s+", " ");
        System.out.print("Chuỗi sau khi đảo ngược: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
