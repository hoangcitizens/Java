package Exercise.Ex_Chapter5.Ex53;

import java.util.Scanner;

/*
    Bài 4. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử. Hãy viết chương trình sắp xếp mảng này
    theo thứ tự giảm dần. Sau đó tìm giá trị nhỏ thứ hai trong mảng và liệt kê ra tất cả các vị trị của giá trị này
    trong mảng. In các kết quả tương ứng ra màn hình
    - Input: cho trên 2 dòng
        o Dòng thứ nhất gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng thứ hai gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên nhiều dòng
        o Dòng đầu tiên hiển thị các phần tử mảng được sắp xếp giảm dần, phân tách nhau bằng 1 dấu cách.
        o Dòng tiếp theo hiển thị giá trị nhỏ thứ hai trong mảng, nếu không có in ra màn hình “KHÔNG TỒN TẠI”
          và kết thúc chương trình.
        o Dòng cuối cùng hiển thị các vị trí của giá trị nhỏ thứ hai trong mảng, phân tách nhau bằng 1 dấu cách.
 */
public class Ex04_53 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        var n = sc.nextInt();
        int[] a = new int[n];
        nhapmang(a, n);
        System.out.print("Mảng vừa nhập là: ");
        hienthimang(a, n);
        sapxepgiam(a, n);
        System.out.print("Mảng sau sắp xếp giảm dần: ");
        hienthimang(a, n);
        int min2 = findMin2(a,n);

        if (min2 != a[0]) {
            showMin2(a, min2);
        } else {
            System.out.println("KHÔNG TỒN TẠI");
        }
    }
    private static void showMin2(int[] numbers, int min2) {
        System.out.println(STR."Giá trị nhỏ thứ 2 trong mảng là \{min2}");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min2) {
                System.out.print(STR."Vị trí của phần tử nhỏ thứ 2 là \{i}");
            }
        }
    }
    private static int findMin2(int[] a, int n) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] != min)
                return a[i];
        }
        return min;
    }

    private static void sapxepgiam(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    private static void hienthimang(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("\b\b");
    }

    private static void nhapmang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
}
