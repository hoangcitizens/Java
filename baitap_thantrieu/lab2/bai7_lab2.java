import java.util.Scanner;
public class bai7_lab2 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Nhập số nguyên n = "); int n = input.nextInt();
        float S = 0;
        for (int i = 1; i <= n; i++) {
            S += (float)1/i;
        }
        System.out.println("=> Tổng S = " + S);
    }
}
