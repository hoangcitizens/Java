package Exercise.Ex_Chapter3.Ex35;/*
    Bài 8. Nhập vào một số nguyên dương n từ bàn phím. Hãy kiểm tra xem n có phải là số đẹp hay không và
           in kết quả tương ứng ra màn hình.
    Chú thích: số đẹp là số đọc từ trái sang phải hay từ phải sang trái đều cho cùng một giá trị.
        - Input: gồm 1 dòng chứa số nguyên dương n.
        - Output: hiển thị trên 1 dòng kết quả tương ứng YES hoặc NO.
 */


import java.util.Scanner;

public class Ex8_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n = ");
        var n = scanner.nextInt();
        var tmp = 0;
        for (int i = n; i > 0; i /= 10) {
            tmp = tmp * 10 + i % 10;
        }
        System.out.println(STR."Số \{n} \{(n == tmp) ? "là số đẹp." : "không là số đẹp"}");
    }
}
