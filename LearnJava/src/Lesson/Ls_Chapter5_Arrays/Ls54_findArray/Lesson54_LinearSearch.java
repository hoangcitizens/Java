package Lesson.Ls_Chapter5_Arrays.Ls54_findArray;

/*
    1. Mục đích của tìm kiếm
        - Mục đích của tìm kiếm trong mảng là nhằm tìm ra các phần tử thỏa mãn tiêu chí nào đó.
        - Ví dụ ta cần tìm ra các sinh viên trong lớp có tên bắt đầu bằng chữ H
        - Ta cần tìm kiếm xem những sinh viên nào có xếp hạng loại giỏi trong một danh sách lớp
        - Ta cần tìm kiếm xem dịch bệnh nào gây tổn thất cho nhân loại nhiều nhất…
    2. Tìm kiếm tuyến tính
        - Hình thức đơn giản nhất của tìm kiếm là thuật toán tìm kiếm tuyến tính.
        - Giả sử n là số phần tử của mảng, i là một biến chạy, x là giá trị cần tìm.
        - Cụ thể như sau:
            + Cho biến i chạy từ 0 đến n
            + Nếu phần tử thứ i bằng x, trả về i
            + Sau khi tìm kiếm mặc định trả về -1
    3. Tìm kiếm nhị phân
        - Trong thư viện Java đã có sẵn phương thức tìm kiếm nhị phân. Do đó chúng ta chỉ việc gọi phương thức và sử dụng.
        - Để đảm bảo việc tìm kiếm được chính xác, bạn phải sắp xếp mảng theo thứ tự tăng dần của giá trị trước khi tìm kiếm.
        - Phương thức tìm kiếm nhị phân sẽ trả về giá trị kiểu int. Nếu tìm thấy thì chỉ số phần tử sẽ được trả về.
          Ngược lại phương thức trả về giá trị âm.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lesson54_LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
        System.out.println("Mảng gốc ban đầu: ");
        showArray(numbers);
        System.out.println("Nhập giá trị cần tìm: ");
        var x = new Scanner(System.in).nextInt();

        // tìm kiếm tuyến tính
        int index1 = linearSearch(numbers, x);
        var result1 = index1 < 0 ? "Không tồn tại x" : "Tìm thấy x tại vị trí " + index1;
        System.out.println(result1);

        // tìm kiếm nhị phân
        int index2 = Arrays.binarySearch(numbers, x);
        var result2 = index2 < 0 ? "Không tồn tại x" : "Tìm thấy x tại vị trí " + index2;
        System.out.println(result2);

        // Tìm trong đoạn fromIndex đến toIndex.
        int index3 = Arrays.binarySearch(numbers, 0, 8, x);
        var result3 = index3 < 0 ? "Không tồn tại x" : "Tìm thấy x tại vị trí " + index3;
        System.out.println(result3);
    }

    /**
     * phương thức sử dụng để tìm kiếm tuyến tính xem x có
     * xuất hiện trong mảng numbers hay không
     *
     * @param numbers là mảng gốc cần tìm
     * @param x       là biến chứa giá trị cần tìm
     * @return giá trị khác -1 nếu tìm thấy x và ngược lại
     */
    private static int linearSearch(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) { // nếu tìm thấy
                return i; // trả về chỉ số i
            }
        }
        return -1; // mặc định không tìm thấy
    }

    /**
     * phương thức hiển thị các phần tử của mảng nguyên
     *
     * @param numbers mảng chứa dữ liệu cần hiển thị
     */
    private static void showArray(int[] numbers) {
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // in xuống dòng
    }
}
