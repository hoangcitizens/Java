package lab05;

import java.util.Scanner;

public class Uneti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int []a = new int[50];
//        int n, S = 0;
//        System.out.print("Nhập n = ");
//        n = sc.nextInt();
//        System.out.println("Nhập các phần tử của mảng");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("In danh sách phần tử đã nhập");
//        for (int i = 0; i < n; i++) {
//            System.out.println("a[" + i + "] = " + a[i]);
//        }
//        System.out.print("Tính tổng các con số đã nhập: ");
//        for (int i = 0; i < n; i++) {
//            S = S + a[i];
//        }
//        System.out.println("S = " + S);
//        
        float[] b = new float[70];
        System.out.print("Nhập số phần tử mảng: ");
        int m = sc.nextInt();
        // Nhập 1 mảng số thực, sau đó in mảng thực hiện theo chiều ngược lại
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập b[" + i + "] = ");
            b[i] = sc.nextFloat();
        }
        System.out.print("Mảng vừa nhập theo thứ tự ngược lại: ");
        for (int i = m - 1; i >= 0; i--) {
            System.out.print(b[i] + ", ");
        }
        
        // Đếm số phần tử số thực âm
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (b[i] < 0)
                count++;
        }
        System.out.print("\nSố thực âm trong mảng là: " + count);
         // Tính trung bình cộng các phần tử vừa nhập
        float S = 0;
        for (int i = 0; i < m; i++) {
            S += b[i];
        }
        System.out.println("\nTrung bình cộng các phần tử vừa nhập: " + (float)S/m);
        // Sắp xếp theo thứ tự tăng dần và in lại kết quả
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (b[i] > b[j])
                {
                    float tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }    
        }
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + ", ");
        }
    }
}
