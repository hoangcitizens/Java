import java.util.Scanner;
public class bai6_lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n = "); int n = input.nextInt();
        int S1 = 0, S2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                S1 += i;
            else
                S2 += i;
        }
        if (n % 2 == 0)
            System.out.println("Tổng của số chẵn từ (0," + n + ") = " + S1);
        else {
            System.out.println("Tổng của số lẻ từ (0," + n + ") = " + S2);

        }
    }
}
