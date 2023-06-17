/*
    Bài 3. Đọc vào một dãy số a có n phần tử là các số nguyên. Nhập vào một số X.
           Xác định vị trí của số nguyên tố trên a có giá trị gần với X nhất.
*/

import java.util.Scanner;
public class bai3_lab3 {
    public static void main(String[] args) {
        int index = -1, min = Integer.MAX_VALUE; // gán các giá trị ban đầu
        System.out.printf(min + " ");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số lượng phần tử: "); int n = scanner.nextInt();
        System.out.printf("Nhập giá trị x = "); int x = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        //kiem tra , tim kq
        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i], x);
            if (nguyenTo(arr[i]) && currentMin < min) { // min a[0] = 2147483647
                min = currentMin; // gán lại biến min = độ lớn từ giá trị phần tử i đang xét thỏa mãn 2đk tới giá trị x nhập từ bàn phím
                index = i;
            }
        }
        /*
            VD : Cho mảng (4,3,9,7,11,5) nhập x = 8
            + i = 0
                currentMin = 4; (không thỏa mãn đk do arr[0] = 4 không là số nguyên tố)
            + i = 1
                currentMin = 5; (3 là số nguyên tố và 5 < 2147483647 (Integer.MAX_VALUE) (giá trị min ban đầu ta gán) gán lại giá trị)
                    min = 5;
                    index = 1;
            + i = 2, = 3 = 4, = 5 tương tự như vậy đến khi ta thấy min = 1, index = 3;
        */
        if (index != -1) {// tim thay gia tri thoa man
            System.out.println("Phần tử thứ " + index + " trong mảng có giá trị = " + arr[index]);
        } else {
            System.out.println("Khong ton tai gia tri thoa man!");
        }
    }

    // phương thức tính độ lớn từ số a đến số x
    public static int getMin(int a, int x) {
        return Math.abs(a - x);
    }
    // phương thức kiểm tra số nguyên tố
    public static boolean nguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}