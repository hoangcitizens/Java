package Exercise.Ex_Chapter4.Ex45;

import java.util.Scanner;

/*
    Bài 7. Nhập vào một chuỗi kí tự từ bàn phím. Hãy viết phương thức đệ quy thực hiện in ngược lại các kí tự của chuỗi
    vừa nhập ra màn hình.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên 1 dòng chuỗi kí tự sau khi đảo ngược.
 */
public class Ex7_45 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine();
        showRevert(str, str.length() - 1);
    }

    // phương thức hiển thị string theo thứ tự giảm dần
    public static void showRevert(String str, int pos) {
        if (pos >= 0) { // điều kiện đệ quy
            System.out.print(str.charAt(pos));
            showRevert(str, pos - 1);
        }
    }
}
