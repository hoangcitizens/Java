import java.util.Scanner;
public class bai4_lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) {
            //System.out.println("BẢNG NHÂN " + i);
            for (int j = 1; j <= 10; j++) {
                int k = i * j;
                System.out.println(i + "*" + j + " = " + k);
            }
            System.out.println("");
        }
    }
}
