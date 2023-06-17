/*
    Bài 12. Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số b bất kì (2 < b ≤ 36)
*/

import java.util.Scanner;
public class bai12_lab3 {
    /*
        Các bước thực hiện:
        - Tạo mảng đối sánh tương ứng với hệ cơ số
        - Chuyển đổi cơ số-> tạo kết quả đảo
        - Đảo lại kết quả -> Done!
     */
    public static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";
    public static String result(int n, int b){
        StringBuilder stringBuilder = new StringBuilder();
        int x = 0;
        while(n > 0){
            x = n%b;
            n/= b;
            stringBuilder.append(BASE.charAt(x));
        }
        return stringBuilder.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, b;
        System.out.println("Nhap gia tri, co so: ");
        n = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("KET QUA: " + result(n, b));
    }
}