package Lesson.Ls_Chapter5_Arrays.Ls53_sortArray;

import java.util.Arrays;

public class Lesson53_BubbleSort {
    public static void main(String[] args) {
        // mảng gốc ban đầu
        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
        System.out.println("Mảng gốc ban đầu: ");
        showArray(numbers);
        // sắp xếp toàn bộ theo thứ tự tăng dần:
        Arrays.sort(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
        // Bạn có thể sử dụng một trong các phương thức overload này để sắp xếp mảng:
        Arrays.sort(numbers, 0, 12);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
        // sắp xếp các phần tử từ index 2 đến 8 theo thứ tự tăng dần:
        // (Sắp xếp một đoạn trong mảng: tham số thứ hai là vị trí bắt đầu, tham số thứ ba là vị trí kết thúc sắp xếp.)
        Arrays.sort(numbers, 2, 8);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
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
