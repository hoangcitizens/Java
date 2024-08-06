package Exercise.Ex_Chapter3.Ex31;/*
    Bài 1. Nhập vào hai số nguyên từ bàn phím. Hãy so sánh giá trị của hai số đó và rút ra kết luận
    tương ứng. In kết quả so sánh ra màn hình.
    - Input: cho trên 2 dòng
        o Dòng thứ nhất gồm giá trị số nguyên đầu tiên.
        o Dòng thứ hai gồm giá trị số nguyên còn lại.
    - Output: hiển thị trên 1 dòng kết quả dạng “a op b“. Trong đó a, b là hai số nguyên cần so
    sánh và op là kết luận tương ứng >, <, =.
 */


import java.util.Scanner;

public class Ex1_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b)
            System.out.println(STR."\{a} > \{b}");
        else if (a < b)
            System.out.println(STR."\{a} < \{b}");
        else
            System.out.println(STR."\{a} = \{b}");
    }
}