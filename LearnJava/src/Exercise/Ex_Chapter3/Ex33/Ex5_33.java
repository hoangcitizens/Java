package Exercise.Ex_Chapter3.Ex33;/*
    Bài 5. Nhập vào ba số nguyên a, b và c từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để tìm
           giá trị nhỏ nhất trong ba số đó và in kết quả tương ứng ra màn hình.
    - Input: gồm 1 dòng chứa ba số nguyên a, b và c, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng kết quả tương ứng với từng trường hợp sau
        o Nếu tồn tại giá trị nhỏ nhất, in ra màn hình chuỗi có dạng “MIN = m”, trong đó m là
          giá trị nhỏ nhất trong ba số a, b và c vừa nhập.
        o Nếu không tồn tại giá trị nhỏ nhất, in ra màn hình chuỗi “NOTA VAILABLE”.
 */

import java.util.Scanner;

public class Ex5_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var min = a; // giả định ban đầu min là số a
        min = min > b ? b : min;
        min = min > c ? c : min;
        var result = a == b && b == c ? "NOT AVAILABLE" : STR."MIN = \{min}";
        System.out.println(result);
    }
}
