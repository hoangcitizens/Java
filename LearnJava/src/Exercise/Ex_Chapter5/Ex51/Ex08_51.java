package Exercise.Ex_Chapter5.Ex51;

/*
    Bài 8. Nhập vào từ bàn phím một số nguyên n > 0, trong đó n là số lượng số nguyên có trong mảng.
    Yêu cầu tự viết các phương thức phù hợp. Hãy viết chương trình phân tích từng số trong mảng ra thừa số nguyên tố
    và in kết quả tương ứng ra màn hình.
    - Input: cho trên 2 dòng
        o Dòng đầu tiên gồm số nguyên dương n.
        o Dòng còn lại gồm n số nguyên dương nhập vào từ bàn phím, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên n dòng dạng thừa số nguyên tố của mỗi số trong mảng, nếu số đó trong mảng âm thì in ra
    KHÔNG HỢP LỆ
 */

import java.util.Scanner;

public class Ex08_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        showResult(numbers);
    }

    // phương thức hiển thị kết quả
    private static void showResult(int[] numbers) {
        for (int number : numbers) {
            System.out.println(splitToPrime(number));
        }
    }

    /**
     * phương thức tách số n thành thừa số nguyên tố của nó
     *
     * @param number là giá trị cần tách
     * @return giá trị chuỗi kết quả sau phân tách
     */
    private static String splitToPrime(int number) {
        var res = number + " = ";
        int i = 2; // bắt đầu từ 2 - số nt nhỏ nhất
        while (number > 1) {
            if (number % i == 0) {
                res += i; // thêm i vào kết quả phân tích
                if (number != i) { // nếu i chưa phải phần tử ng.tố cuối cùng
                    res += " x "; // thêm dấu * vào kết qủa
                }
                number /= i; // giảm đi i lần
            } else { // nếu không chia hết thì
                i++; // tăng i lên
            }
        }
        return res;
    }

    /**
     * phương thức nhập vào danh sách các số nguyên
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
