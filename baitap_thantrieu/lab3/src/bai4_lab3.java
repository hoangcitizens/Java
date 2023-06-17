/*
    Bài 4: Tạo ngẫu nhiên mảng a[N] gồm các số nguyên sau đó thực hiện:
            • Sắp xếp dãy a theo thứ tự tăng dần
            • Loại bỏ bớt các phần tử trùng nhau sao cho mỗi giá trị chỉ xuất hiện trong a duy nhất một lần.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai4_lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.printf("Nhập số phần tử của mảng: "); int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Nhập phần tử a[" + i + "] = ");
//            a[i] =  sc.nextInt();
//        }
//        System.out.printf("Các phần tử trong mảng là: ");
//        System.out.printf(Arrays.toString(a));
//        for (int i = 0; i < n; i++) {
//            System.out.printf(a[i] + ", ");
//        }
//        System.out.printf("\b\b");
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (a[i] > a[j]) {
//                    int tmp = a[i];
//                    a[i] = a[j];
//                    a[j] = tmp;
//                }
//            }
//        }
//        System.out.printf("\nMảng sau khi được sắp xếp tăng dần: ");
//        for (int i = 0; i < n; i++) {
//            System.out.printf(a[i] + ", ");
//        }
//        System.out.printf("\b\b");

        // tìm phần tử trùng nhau
        System.out.printf("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        Random random = new Random(); // tạo biến ngẫu nhiên
        while (count < n) { // dem cac so ngau nhien da duoc sinh ra
            a[count++] = random.nextInt(50); // gán số ngẫu nhiên cho a[count]; sau đó count++; 50 là phạm vi số ngẫu nhiên
        }
        int bSize = 0;
        boolean isExist = false;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) { // xét phần tử mảng a
            isExist = false; // (*)
            for (int j = 0; j < count; j++) { // xét phần tử mảng b
                System.out.println("b[" + j + "] = " + b[j]);
                if (a[i] == b[j]) {
                    isExist = true;
                    break;
                }
            }
            if (isExist == false) { // <=> (!isExist) : ta đang gán isExist là false mà phủ định của isExist sẽ là đúng tức là isExist phải bằng biểu thức (*)
                b[bSize++] = a[i];
            }
        }
        System.out.printf("Các phần tử trong mảng là: ");
        System.out.printf(Arrays.toString(a));
        System.out.printf("\nMảng sau khi được sắp xếp tăng dần: ");
        Arrays.sort(a); // phương thức dùng để sắp xếp mảng tăng dần (phương thức này dùng QuickSort)
        System.out.printf(Arrays.toString(a));
        // phương thức dùng để sao chép 1 đoạn của 1 mảng trả về mảng mới
        b = Arrays.copyOfRange(b,0, bSize); // sao chép mảng b sang mảng b mới từ phần tử 0 đến phẩn tử thứ bSize
        Arrays.sort(b);
        System.out.printf("\nMảng chỉ chứa các phần tử duy nhất: ");
        System.out.printf(Arrays.toString(b));
    }
}
