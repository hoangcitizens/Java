package Exercise.Ex_Chapter4.Ex45;

import java.util.Scanner;

/*
    Bài 8. Nhập vào hai số nguyên dương a và b từ bàn phím. Hãy viết phương thức đệ quy có chức
    năng tìm ước chung lớn nhất của a và b. In kết quả tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa hai số nguyên a > 0 và b > 0, phân tách nhau bằng 1 dấu cách.
        - Output: hiển thị trên 1 dòng kết quả có dạng “UCLN = s”, trong đó s là ước chung lớn nhất của a và b.
 */
public class Ex8_45 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var a = input.nextInt();
        var b = input.nextInt();
        var result = gcd(a, b);  // cách 1
        System.out.println("UCLN = " + gcd2(a, b)); // cách 2
    }

    // phương thức tìm ước chung lớn nhất cách 1
    public static int gcd(int a, int b) {
        if (a == b) { // đk dừng
            return a;
        } else if (a > b) { // đệ quy
            return gcd(a - b, b);
        } else { // đệ quy
            return gcd(a, b - a);
        }
    }

    // cách 2:
    public static int gcd2(int a, int b) {
        if (b == 0) { // đk dừng
            return a;
        } else { // bước đệ quy
            return gcd2(b, a % b);
        }
    }
}
