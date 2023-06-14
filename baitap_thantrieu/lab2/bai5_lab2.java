import java.util.Scanner;
public class bai5_lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n = "); int n = input.nextInt();;
        while (n < 10 || n > 99) {
            System.out.print("Vui lòng nhập lại !!!");
            System.out.print(" Nhập vào n = "); n = input.nextInt();;
        }
        int S = 0, m = 0;
        for (int i = 11; i < 99; i++) {
            S += i;
            if (i == n)
            {
                m = i;
                break;
            }
        }
        System.out.println("Tổng các số trong khoảng (" + 11 + "," + m + ") = " + S);
    }
}
