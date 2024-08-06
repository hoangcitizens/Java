package Exercise.Ex_Chapter5.Ex54;

/*
    Bài 3. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử và một số nguyên x.
    Hãy tìm xem x có xuất hiện trong đoạn chỉ số [a, b] của mảng hay không và nếu có thì xuất hiện bao lần,
    trong đó a và b là hai số nguyên dương nhập từ bàn phím sao cho 0 ≤ a < b. In kết quả tương ứng ra màn hình.
    - Input: cho trên 4 dòng
        o Dòng thứ nhất gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng thứ hai gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
        o Dòng thứ ba gồm hai số nguyên a >= 0 và b > 0 sao cho 0 ≤ a < b, phân tách nhau bằng 1 dấu cách.
        o Dòng thứ tư gồm số nguyên x là giá trị cần tìm và đếm số lượng trong đoạn [a, b].
    - Output: hiển thị trên 2 dòng
        o Dòng thứ nhất là kết quả tương ứng YES nếu x thuộc đoạn [a, b] hoặc NO nếu x không thuộc đoạn [a, b].
        o Dòng thứ hai là số lần x xuất hiện trong đoạn [a, b].
 */


import java.util.Arrays;
import java.util.Scanner;

public class Ex03_54 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        var n = sc.nextInt();
        int[] numbers = new int[n];
        nhapMang(numbers, n);
        System.out.print("Mảng vừa nhập là: ");
        hienThiMang(numbers, n);
        System.out.print("Nhập a = ");
        var a = sc.nextInt();
        System.out.print("Nhập b = ");
        var b = sc.nextInt();
        System.out.print("Nhập x = ");
        var x = sc.nextInt();
        findArray(numbers, n, x, a, b);
    }

    private static void findArray(int[] numbers, int n, int x, int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (numbers[i] == x) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(STR."Tìm thấy \{x} trong đoạn [\{a},\{b}]");
            System.out.print(STR."Số lần xuất hiện \{x} là: \{count}");
        } else {
            System.out.println(STR."Không tồn tại \{x} trong đoạn [\{a},\{b}]");
        }
    }


    private static void hienThiMang(int[] numbers, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\b\b");
    }

    private static void nhapMang(int[] numbers, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập numbers[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }
    }

}
