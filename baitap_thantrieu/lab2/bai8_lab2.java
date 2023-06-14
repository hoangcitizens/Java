import java.util.Scanner;
public class bai8_lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        System.out.printf("Nhập số tự nhiên n = "); n = sc.nextInt();
        while (n == 0 || n < 0) {
            System.out.printf("Vui lòng nhâp n > 0: "); n = sc.nextInt();
        }
        System.out.printf("Các ước số của " + n + " là: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
            {
                System.out.printf(i + ", ");
                count++;
            }
        }
        System.out.printf("\nCó " + count + " ước số của " + n);
    }
}
