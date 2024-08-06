package Exercise.Ex_Chapter5.Ex54;

/*
    Bài 4. Viết chương trình cho phép nhập từ bàn phím một mảng số thực gồm n phần tử và một số thực x,  trong đó
    n là số lượng điểm trung bình của sinh viên ở hệ 10 và x > 0. Hãy sắp xếp mảng đó theo chiều tăng dần sử dụng
    thuật toán quick sort và sử dụng thuật toán binary search để tìm kiếm xem có sinh viên nào có điểm bằng x hay không.
    Lưu ý chương trình không nhận những giá trị điểm < 0 hoặc > 10. In các kết quả tương ứng ra màn hình.
    - Input: cho trên nhiều dòng
        o Dòng đầu tiên gồm n là số lượng điểm trung bình trong mảng, n > 0.
        o Dòng tiếp theo gồm các giá trị của n đầu điểm trong mảng, phân tách nhau bằng 1 dấu cách.
        o Dòng còn lại gồm số nguyên x.
    - Output: hiển thị trên 2 dòng
        o Dòng đầu tiên là mảng được sắp xếp theo chiều tăng dần, phân tách nhau bằng 1 dấu cách
        o Dòng còn lại là kết quả tương ứng YES nếu có điểm của sinh viên nào trong mảng bằng x hoặc NO nếu ngược lại.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Ex04_54 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức

        Arrays.sort(numbers);

        var x = input.nextFloat();

        var index = Arrays.binarySearch(numbers, x);
        if (index < 0) {
            showArray(numbers);
            System.out.println("NO");
        } else {
            showArray(numbers);
            System.out.println("YES");
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
     * phương thức nhập vào điểm của các sv trong lớp
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static float[] getNumbers(int n, Scanner input) {
        var numbers = new float[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextFloat();
        }
        return numbers;
    }
}
