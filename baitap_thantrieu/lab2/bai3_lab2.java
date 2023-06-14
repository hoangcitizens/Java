import java.util.Scanner;
public class bai3_lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập chiều cao tam giác: "); int n = input.nextInt();
        for (int i = 1; i <= n; i++) { // vòng lặp chiều cao tam giác
            for (int j = i; j < n; j++) { // vòng lặp số lần xuất hiện khoảng trống sau mỗi lần vòng i
                System.out.print("   "); // VD: Lần i = 2 với n = 5 thì sẽ xuất hiện 3 lần khoảng trống
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // vòng lặp số lần xuất hiện số sau mỗi lần vòng i. VD: Lần i = 3 thì sẽ xuất hiện 5 số
                int m = k;
                if (k > i)
                    m = 2 * i - k; // VD: Lần lặp i = 3 thì số k = 4, 5 sẽ là 2 và 1
                System.out.printf("%3d",m); // %3d : để 3 ô trống để in ra số
            }
            System.out.println(" "); // xuống dòng
        }
    }
}
