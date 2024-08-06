package Exercise.Ex_Chapter3.Ex35;/*
    Bài 4. Nhập vào một chuỗi kí tự từ bàn phím. Chuẩn hóa chuỗi vừa nhập sao cho không có 1 hay nhiều
           dấu cách ở đầu và cuối câu, mỗi từ cách nhau 1 dấu cách. Hãy đếm xem trong chuỗi vừa
           nhập có bao nhiêu từ và in kết quả số lượng ra màn hình.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên 1 dòng số lượng từ của chuỗi.
 */

import java.util.Scanner;

public class Ex4_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        var str = scanner.nextLine().trim();
        str = str.replaceAll("\\s+"," ");
        int count = 0;
        if (!str.isEmpty()) { // nếu str không rỗng
            count = 1; // ít nhất chuỗi str có 1 từ
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++; // tăng biến đếm lên
            }
        }
        System.out.println(count);
    }
}
