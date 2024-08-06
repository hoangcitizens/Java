package Exercise.Ex_Chapter2.Ex26;

import java.util.Scanner;

/*
    Bài 5. Nhập vào chuỗi str1 và chuỗi str2 từ bàn phím, trong đó chuỗi str1 dài hơn chuỗi str2. Hãy tìm vị trí xuất
    hiện cuối cùng của chuỗi str2 trong str1. Vị trí xuất hiện là một số nguyên tính từ 0. Nếu không tìm thấy ta sẽ
    nhận được kết quả là -1.
    - Input cho trên 2 dòng:
        + Dòng đầu chứa chuỗi str1 dài hơn chuỗi str2.
        + Dòng còn lại chứa chuỗi str2.
    - Output: hiển thị trên 1 dòng vị trí xuất hiện cuối của str2 trong str1.
 */
public class Ex5_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập vào chuỗi 2: ");
        String str2 = scanner.nextLine();
        int i = str1.lastIndexOf(str2);
        if (i != -1)
            System.out.println(STR."Vị trí cuối cùng chuỗi \{str2} trong chuỗi \{str1} là: \{i}");
        else
            System.out.print(STR."Không tìm thấy vị trí chuỗi \{str2} trong chuỗi \{str1}");
    }
}
