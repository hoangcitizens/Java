package Exercise.Ex_Chapter3.Ex36;/*
    Bài 2. Nhập vào hai số nguyên dương a và b từ bàn phím. Hãy tìm ước chung lớn nhất và bội chung
    nhỏ nhất của a và b. In kết quả tương ứng ra màn hình.
    - Input: gồm 1 dòng chứa hai số nguyên a > 0 và b > 0, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 2 dòng
        o Dòng đầu tiên có dạng “UCLN = s”, trong đó s là ước chung lớn nhất của a và b.
        o Dòng còn lại có dạng “BCNN = t”, trong đó t là bội chung nhỏ nhất của a và b
 */


import java.util.Scanner;

public class Ex2_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        var cm = a * b;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        // lúc này ta đã có ước chung max là a hoặc b vì a = b
        var lcm = cm / a; // BCNN = (Tích a * b) / (UCLN);
        System.out.println(STR."UCLN = \{a}\nBCNN = \{lcm}");
    }
}
