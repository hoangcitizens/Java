import java.util.Scanner;

public class bai9_lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t, count = 0;
        System.out.printf("Nhập số tự nhiên n = "); n = sc.nextInt();
        while (n == 0 || n < 0) {
            System.out.printf("Vui lòng nhâp n > 0: "); n = sc.nextInt();
        }
        t = n;
        int k = 0, S = 0;
        while (n > 0) {
            k = n % 10;
            n /= 10;
            S += k;
            count++;
        }
        System.out.printf("Tổng các chữ số của " + t + " là: " + S);
        double P = (double)S/count;
        double C = Math.round(P * 100.0) / 100.0;
        System.out.printf("\nTrung bình cộng các chữ số của " + t + " là: " + C); // Bài 10
    }
}
