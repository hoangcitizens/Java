package Exercise.Ex_Chapter2.Ex26;/*
    Bài 10*. Nhập vào 1 dòng nội dung bất kỳ từ bàn phím. Trong đó, giữa các từ của câu có chứa
    một hoặc nhiều dấu cách, khoảng trắng. Hãy tách các từ trong câu đó ra và in ra màn hình các từ
    đó ở dạng chữ viết hoa.
    Gợi ý: để tách 1 hoặc nhiều khoảng trắng thì ta dùng regex: “\\s+”.
        - Input: gồm một dòng chứa câu bạn nhập vào từ bàn phím.
        - Output: hiển thị trên 1 dòng các từ được tách ra từ câu, phân tách nhau bằng kí tự '-'.
 */

import java.util.Scanner;

public class Ex10_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào thông điệp: ");
        String str1 = scanner.nextLine();
        var str2 = str1.split("\\s+");
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i].toUpperCase() + "-");
        }
    }
}
