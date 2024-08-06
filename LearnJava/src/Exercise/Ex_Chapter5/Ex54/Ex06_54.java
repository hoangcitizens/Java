package Exercise.Ex_Chapter5.Ex54;

/*
    Bài 6. Viết chương trình cho phép nhập từ bàn phím một danh sách tên sinh viên gồm n phần tử.
    Hãy xem với mỗi tên trong danh sách, có bao nhiêu tên sinh viên trùng nhau. In kết quả tương ứng
    - Input: cho trên 2 dòng
        o Dòng đầu tiên gồm số nguyên n là số lượng sinh viên trong danh sách, n > 0.
        o Dòng tiếp theo gồm n từ là tên sinh viên, phân tách nhau bằng 1 vài dấu cách.
    - Output: hiển thị trên mỗi dòng tên của mỗi sinh viên và số lần tên xuất hiện tương ứng trong mảng, phân tách nhau bằng 1 dấu -.
 */

import java.util.Scanner;

public class Ex06_54 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        // gọi phương thức và nhận về danh sách tên sv
        var students = getStudents(n, input);
        countName(students);
    }

    /**
     * phương thức hiển thị từng tên và số lần xuất hiện của mỗi tên
     *
     * @param students
     */
    private static void countName(String[] students) {
        for (int i = 0; i < students.length; i++) {
            var isExist = false;
            for (int j = 0; j < i; j++) {
                // nếu tên sv đã xuất hiện rồi
                if (students[j].toLowerCase()
                        .compareTo(students[i].toLowerCase()) == 0) {
                    isExist = true; // đánh dấu lại
                    break; // thoát lặp
                }
            }
            if(!isExist) { // nếu tên chưa xuất hiện thì mới xét
                var count = numOfExist(students, students[i]);
                System.out.println(students[i] + " - " + count);
            }
        }
    }

    /**
     * phương thức tìm số lần xuất hiện của từng tên sv
     *
     * @param students danh sách sv
     * @param key      tên cần tìm
     * @return số lần xuất hiện của tên sv
     */
    private static int numOfExist(String[] students, String key) {
        var count = 0; // mặc định gán biến count bằng 0
        for (var s : students) {
            // nếu tên sv s trùng với tên cần tìm
            if (key.toLowerCase().compareTo(s.toLowerCase()) == 0) {
                count++; // tăng biến đếm lên
            }
        }
        return count;
    }

    /**
     * phương thức dùng để nhập tên n sinh viên
     *
     * @param n     số sinh viên cần nhập
     * @param input là đối tượng của lớp scanner
     * @return danh sách sinh viên đã nhập
     */
    private static String[] getStudents(int n, Scanner input) {
        var students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = input.next();
        }
        return students;
    }
}

