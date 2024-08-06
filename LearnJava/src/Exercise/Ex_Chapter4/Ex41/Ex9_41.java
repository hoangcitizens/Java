package Exercise.Ex_Chapter4.Ex41;/*
    Bài 9. Nhập vào một chuỗi kí tự từ bàn phím. Hãy viết phương thức chuẩn hóa chuỗi vừa nhập
    sao cho không có 1 hay nhiều dấu cách ở đầu và cuối câu, mỗi từ cách nhau 1 dấu cách. Sau đó
    viết thêm phương thức đếm xem trong chuỗi vừa nhập có bao nhiêu từ và in kết quả số lượng ra
    màn hình.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên 1 dòng số lượng từ của chuỗi
 */

import java.util.Scanner;

public class Ex9_41 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine();

        // để đảm bảo chính xác, ta lược bỏ các dấu cách thừa trước khi đếm
        str = str.trim(); // bỏ dấu cách đầu cuối
        // thay thế 1 hoặc nhiều dấu cách giữa bằng 1 dấu cách
        str = str.replaceAll("\\s+", " ");

        System.out.println(countWords(str));
    }

    // phương thức đếm số từ của một câu
    public static int countWords(String str) {
        var count = 0;
        if (!str.isEmpty()) { // nếu string k rỗng thì chắc chắn
            count++; // có 1 từ
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // nếu gặp dấu cách thì có thêm từ
                count++; // tăng biến đếm
            }
        }
        return count; // trả về kết quả là số từ đếm được
    }
}
