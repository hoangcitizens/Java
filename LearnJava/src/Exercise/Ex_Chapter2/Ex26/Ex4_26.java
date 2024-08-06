package Exercise.Ex_Chapter2.Ex26;/*
    Bài 4. Nhập vào từ bàn phím chuỗi str1 và chuỗi str2, trong đó chuỗi str1 dài hơn chuỗi str2. Hãy
    tìm vị trí xuất hiện đầu tiên của chuỗi str2 trong str1.
    Vị trí xuất hiện là một số nguyên tính từ 0. Nếu không tìm thấy ta sẽ nhận được kết quả là -1.
    - Input cho trên 2 dòng:
    o Dòng đầu chứa chuỗi str1 dài hơn chuỗi str2.
    o Dòng còn lại chứa chuỗi str2.
    - Output: hiển thị vị trí xuất hiện đầu tiên của str2 trong str1
 */

import java.util.Scanner;

public class Ex4_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập vào chuỗi 2: ");
        String str2 = scanner.nextLine();
        int i = str1.indexOf(str2);
        if (i != -1)
            System.out.println(STR."Vị trí đầu tiên chuỗi \{str2} trong chuỗi \{str1} là: \{i}");
        else
            System.out.print(STR."Không tìm thấy vị trí chuỗi \{str2} trong chuỗi \{str1}");
    }
}
