import java.util.Scanner;

public class bai15_lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Số thuận nghịch là: ");
        for (int i = 100000; i <= 999999; i++) {
            if (kiemTraSoThuanNghich(i))
                System.out.printf(i + ", ");
        }
        System.out.printf("\b\b");
    }
    public static boolean kiemTraSoThuanNghich(int n) {
        int tmp = n, nDao = 0; // gán biến n vào biến tạm thời
        while (tmp > 0) {
            nDao = nDao * 10 + tmp % 10;
            tmp /= 10;
        }
        if (nDao == n)
            return true;
        return false;
    }
}
