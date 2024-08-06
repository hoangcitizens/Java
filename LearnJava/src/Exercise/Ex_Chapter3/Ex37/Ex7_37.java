package Exercise.Ex_Chapter3.Ex37;/*
    Bài 7. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân rỗng với chiều
    cao bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác cân tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của chiều cao của tam giác cân.
        - Output: hiển thị trên nhiều dòng hình tam giác cân rỗng thể hiển bằng kí tự *
 */


import java.util.Scanner;

public class Ex7_37 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập độ cao của tam giác: ");
        var h = input.nextInt();

        // vẽ tam giác cân đặc bằng các dấu *
        // nguyên lý: vẽ dấu * đối xứng qua cột h, i, j bắt đầu từ 1
        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 và h+i-1
        // các vị trí còn lại vẽ khoảng trắng. Riêng hàng cuối vẽ dấu *
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                // nếu i là hàng cuối hoặc các hàng khác tại cột j thỏa
                if (i == h || j == h - i + 1 || j == h + i - 1) {
                    System.out.print(" * "); // vẽ dấu *
                } else {
                    System.out.print("   "); // vẽ khoảng trắng
                }
            }
            System.out.println();
        }
    }
}
