package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 1. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử và tính tổng tất cả các số nguyên tố
    trong mảng đó. Yêu cầu tự viết các phương thức phù hợp. In kết quả tương ứng ra màn hình.
    - Input: cho trên 2 dòng
        o Dòng thứ nhất gồm n là số lượng phần tử của mảng.
        o Dòng thứ hai gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 1 dòng tổng của các số nguyên tố trong mảng
 */
public class Ex01_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        var sum = sumPrimeNumbers(numbers);
        System.out.println(STR."Tổng số nguyên tố trong mảng là: \{sum}");
    }

    /**
     * Phương thức kiểm tra số n có phải số nguyên tố hay không.
     *
     * @param n giá trị số nguyên cần kiểm tra.
     * @return true nếu n là số nguyên tố và false trong các trường hợp
     * ngược lại.
     */
    private static boolean isPrime(int n) {
        if (n < 2) { // n < 2 => n KHÔNG phải số nguyên tố
            return false;
        }
        int bound = (int) Math.sqrt(n); // lấy giá trị phần nguyên căn bậc hai của n
        for (int i = 2; i <= bound; i++) { // tìm nghiệm trong đoạn từ 2 đến phần nguyên căn bậc hai của n
            if (n % i == 0) { // nếu tồn tại nghiệm, n không phải số nguyên tố
                return false;
            }
        }
        return true; // mặc định n là số nguyên tố
    }

    // phương thức hiển thị các phần tử mảng
    private static void showArray(int[] numbers) {
        for (int number : numbers) { // duyệt toàn bộ mảng
            System.out.print(number + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    // phương thức tính tổng các phần tử mảng
    private static long sumPrimeNumbers(int[] numbers) { // nhận tham số kiểu mảng
        long s = 0; // có thể tổng sẽ lớn nên ta dùng kiểu long
        for (int number : numbers) {
            if (isPrime(number)) {
                s += number; // cộng giá trị phần tử thứ i vào tổng
            }
        }
        return s; // trả về tổng
    }

    // phương thức nhập vào danh sách các số nguyên
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(STR."Nhập a[\{i}] = ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
