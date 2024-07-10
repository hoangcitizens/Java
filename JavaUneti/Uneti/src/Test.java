import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, q, r, t, n = 26;
        System.out.print("Nhập a: ");
        a = scanner.nextInt();
        
        int r1 = n, r2 = a, t1 = 0, t2 = 1;
        int i = 1;

        // In tiêu đề bảng
        System.out.println("_____________________________________________________________________________");
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", "Lần", "q", "r1", "r2", "r", "t1", "t2");
        // In dấu ngăn cách  __________
        System.out.println("|__________|__________|__________|__________|__________|__________|__________|");

        while (r2 > 0) {
            q = r1 / r2;
            r = r1 - q * r2;
            r1 = r2;
            r2 = r;
            t = t1 - q * t2;
            t1 = t2;
            t2 = t;

            // In từng dòng dữ liệu
            System.out.printf("|%-10d|%-10d|%-10d|%-10d|%-10d|%-10d|%-10d%n", i, q, r1, r2, r, t1, t2);
            // In dấu ngăn cách
            System.out.println("|__________|__________|__________|__________|__________|__________|__________|");
            i++;
        }
        
        if (t1 > 0)
            System.out.println("Nghịch đảo của " + a + " = " + t1);
        else
            System.out.println("Nghịch đảo của " + a + " = " + (t1 + t2));
        
        scanner.close();
    }
}
