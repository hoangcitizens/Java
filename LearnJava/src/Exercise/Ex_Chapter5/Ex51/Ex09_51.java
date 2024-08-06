package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 9. Nhập vào từ bàn phím các phần tử của một mảng số thực, mảng này chứa điểm trung bình của các sinh viên
    trong một lớp ở hệ 10. Yêu cầu tự viết các phương thức phù hợp. Hãy viết chương trình tính điểm trung bình của
    cả lớp và in kết quả ra màn hình. Lưu ý chương trình không nhận những giá trị < 0 hoặc > 10.
    - Input: cho trên 2 dòng
        o Dòng đầu tiên gồm số nguyên dương n.
        o Dòng còn lại gồm n số thực là các đầu điểm của sinh viên ở hệ 10, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng giá trị điểm trung bình của cả lớp, làm tròn đến 2 chữ số thập phân sau dấu phẩy.
 */
public class Ex09_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        var n = input.nextInt();
        var grades = getGrades(n, input);
        var avgGrades = averageGrades(grades);
        System.out.print("Điểm trung bình của cả lớp: ");
        System.out.printf(String.format("%.2f", avgGrades));

    }

    /**
     * phương thức tính điểm trung bình của cả lớp
     *
     * @param grades danh sách điểm tb từng sinh viên
     * @return điểm trung bình cả lớp
     */
    private static float averageGrades(float[] grades) {
        float sum = 0;
        for (var grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
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
            System.out.print(STR."Điểm sinh viên thứ \{i + 1}: ");
            grades[i] = input.nextFloat();
            if (grades[i] < 0 || grades[i] > 10) {
                // Nếu nhập điểm trong đoạn [0-10]
                i--; // không tăng i
            }
        }
        return grades;
    }
}
