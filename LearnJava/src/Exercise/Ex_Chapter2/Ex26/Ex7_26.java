package Exercise.Ex_Chapter2.Ex26;

import java.util.Scanner;

/*
    Bài 7. Nhập vào từ bàn phím để đọc cả dòng một chuỗi kí tự trong đó có rất nhiều dấu cách thừa
ở đầu và cuối chuỗi. Hãy loại bỏ tất cả các dấu cách thừa đó. Sau đó thay thế tất cả các vị trí có
khoảng trắng trong thân chuỗi bởi 1 dấu cách.
Gợi ý: để tìm 1 hoặc nhiều khoảng trắng thì ta dùng regex: “\\s+”.
- Input: gồm một dòng chứa chuỗi đầu vào.
- Output: gồm một dòng chứa chuỗi kết quả.
 */
public class Ex7_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi : ");
        String str = scanner.nextLine();
        str = str.trim();
        System.out.println(STR."Chuỗi sau khi xóa khoảng trắng: \{str.replaceAll("\\s+"," ")}");
    }
}
