package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 7. Nhập vào một số nguyên dương n từ bàn phím, trong đó n là số lượng các đầu điểm trung bình của sinh viên
    ở hệ 4. Yêu cầu tự viết các phương thức phù hợp. Hãy viết chương trình phân loại sinh viên dựa trên các tiêu chí
    sau và in kết quả ra màn hình.
    Các tiêu chí:
        1. Trượt: điểm TB < 2.0.
        2. Yếu: điểm TB trong khoảng [2.0, 2.5).
        3. TB: điểm TB trong khoảng [2.5, 3.0).
        4. Khá: điểm Tb trong khoảng [3.0, 3.2).
        5. Giỏi: điểm TB trong khoảng [3.2, 3.6).
        6. Xuất sắc: điểm TB trong đoạn [3.6, 4.0].
    - Input: cho trên 2 dòng
        o Dòng đầu tiên gồm số nguyên n là số lượng đầu điểm.
        o Dòng còn lại gồm giá trị của n số điểm, mỗi giá trị không quá 4.0 và phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên n dòng tiêu chí tương ứng với số điểm của từng sinh viên theo dạng
        o “SV 1: gpa => type”
        o “SV 2: gpa => type”
        ........
        o “SV n: gpa => type”
    - Trong đó, gpa là số điểm tương ứng của từng sinh viên theo chỉ số, type là xếp loại đánh giá gồm
      {Trượt, yếu, Trung bình, Khá, Giỏi, Xuất sắc}.
 */
public class Ex07_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số lượng đầu điểm: ");
        var n = input.nextInt();
        var grades = getGrades(n, input);
        showResult(grades);
    }

    /**
     * phương thức hiển thị kết quả
     *
     * @param grades danh sách đầu điểm cần hiển thị kết quả
     */
    private static void showResult(float[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("SV " + (i + 1) + ": " + grades[i] + " => " + classify(grades[i]));
        }
    }

    /**
     * phương thức xếp loại sinh viên giả định dựa trên điểm TB
     *
     * @param grade điểm đầu vào
     * @return kết luận tương ứng ở kiểu String
     */
    private static String classify(float grade) {
        if (grade < 2.0f) {
            return "Trượt";
        } else if (grade < 2.5f) {
            return "Yếu";
        } else if (grade < 3.0) {
            return "TB";
        } else if (grade < 3.2) {
            return "Khá";
        } else if (grade < 3.6) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    // phương thức nhập vào danh sách các đầu điểm
    private static float[] getGrades(int n, Scanner input) {
        var numbers = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print(STR."Nhập sinh viên thứ \{i + 1}: ");
            numbers[i] = input.nextFloat();
        }
        return numbers;
    }
}
