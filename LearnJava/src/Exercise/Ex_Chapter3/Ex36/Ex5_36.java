package Exercise.Ex_Chapter3.Ex36;/*
    Bài 5. Viết chương trình cho phép tính tổng các giá trị mà người dùng nhập vào từ bàn phím. Việc
    nhập vào sẽ dừng lại khi người dùng nhập vào giá trị 0. Hãy in kết quả của tổng các số vừa nhập
    lên màn hình.
        - Input: gồm nhiều dòng, mỗi dòng gồm một giá trị nhập vào. Input sẽ kết thúc nếu nhập vào 0.
          Không bao gồm các kí tự đặc biệt.
        - Output: hiển thị trên 1 dòng tổng các số đã nhập
 */

import java.util.Scanner;

public class Ex5_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var sum = 0; // kiểu int
        var n = -1;
        while (n != 0) {
            n = input.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
