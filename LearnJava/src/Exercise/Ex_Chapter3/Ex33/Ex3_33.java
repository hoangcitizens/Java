package Exercise.Ex_Chapter3.Ex33;/*
    Bài 3. Nhập vào hai số nguyên a, b từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để so
           sánh và đưa ra kết luận xem hai số bằng nhau hay khác nhau. Nếu khác nhau thì độ chênh lệch
           là bao nhiêu đơn vị. In kết quả tương ứng ra màn hình.
    - Input: gồm 1 dòng chứa hai số nguyên a và b, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng kết quả tương ứng với từng trường hợp sau
        o Nếu a bằng b, in ra màn hình chuỗi có dạng “EQUAL”.
        o Nếu a khác b, in ra màn hình chuỗi có dạng “DIFF n”, trong đó n là độ chênh lệch giữa hai số a và b.
 */

import java.util.Scanner;

public class Ex3_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var result = a == b ? "EQUAL"
                : STR."DIFF \{Math.abs(a - b)}";
        System.out.println(result);
    }
}
