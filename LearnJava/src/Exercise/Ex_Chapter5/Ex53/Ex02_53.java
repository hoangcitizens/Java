package Exercise.Ex_Chapter5.Ex53;

/*
    Bài 2. Nhập vào từ bàn phím các phần tử của một mảng số thực, mảng này chứa điểm trung bình của các sinh viên trong
    một lớp ở hệ 10. Hãy viết chương trình sắp xếp các điểm trung bình trong mảng theo thứ tự giảm dần.
    Lưu ý chương trình không nhận những giá trị điểm < 0 hoặc > 10. In mảng trước và sau khi sắp xếp ra màn hình.
        - Input: cho trên 2 dòng
            o Dòng đầu tiên gồm số nguyên dương n.
            o Dòng còn lại gồm n số thực là các đầu điểm của sinh viên ở hệ 10, phân tách nhau bởi 1 dấu cách.
        - Output: hiển thị trên 2 dòng
            o Dòng thứ nhất là các phần tử mảng trước khi sắp xếp giảm dần, phân tách nhau bằng 1 dấu cách.
            o Dòng thứ hai là các phần tử mảng sau khi sắp xếp giảm dần, phân tách nhau bằng 1 dấu cách.
 */

import java.util.Scanner;

public class Ex02_53 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var grades = getGrades(n, input);
        // mảng trước khi sắp xếp
        showArray(grades);

        // tiến hành sắp xếp và hiển thị kết quả
        sort(grades);

        // mảng sau khi sắp xếp
        showArray(grades);
    }

    /**
     * phương thức sắp xếp mảng theo thứ tự giảm dần
     *
     * @param arr mảng chứa các phần tử cần sắp xếp
     */
    private static void sort(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    var x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
        }
    }

    /**
     * phương thức hiển thị các phần tử mảng
     *
     * @param numbers là mảng chứa các phần tử cần hiển thị
     */
    private static void showArray(float[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // duyệt toàn bộ mảng
            System.out.print(numbers[i] + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    /**
     * phương thức nhập vào danh sách các điểm TB từng sv
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static float[] getGrades(int n, Scanner input) {
        var grades = new float[n];
        for (int i = 0; i < n; i++) {
            grades[i] = input.nextFloat();
            if (grades[i] < 0 || grades[i] > 10) {
                i--; // không tăng i
            }
        }
        return grades;
    }
}
