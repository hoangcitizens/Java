package Exercise.Ex_Chapter3.Ex33;/*
    Bài 4. Nhập vào ba số nguyên a, b và c từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để tìm giá
           trị lớn nhất trong ba số đó và in kết quả tương ứng ra màn hình.
    - Input: gồm 1 dòng chứa ba số nguyên a, b và c, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng kết quả tương ứng với từng trường hợp sau
        o Nếu tồn tại giá trị lớn nhất, in ra màn hình chuỗi có dạng “MAX = m”, trong đó m là giá trị lớn nhất
          trong ba số a, b và c vừa nhập.
        o Nếu không tồn tại giá trị lớn nhất, in ra màn hình chuỗi “NOT AVAILABLE”.
 */


import java.util.Scanner;

public class Ex4_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var max = a; // giả định ban đầu max là số a
        max = max < b ? b : max;
        max = max < c ? c : max;
        var result = a == b && b == c ? "NOT AVAILABLE" : STR."MAX = \{max}";
        System.out.println(result);
    }
}
