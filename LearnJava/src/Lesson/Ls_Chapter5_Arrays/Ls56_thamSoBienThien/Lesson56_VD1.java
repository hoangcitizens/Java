package Lesson.Ls_Chapter5_Arrays.Ls56_thamSoBienThien;

public class Lesson56_VD1 {
    public static void main(String[] args) {
        // ta có thể gọi phương thức add với số lượng các đối số tùy ý
        // yêu cầu các đối số đó cùng kiểu là ok
        System.out.println(STR."Tổng 1 số: \{add(255)}");
        System.out.println(STR."Tổng 2 số: \{add(255, 354)}");
        System.out.println(STR."Tổng 3 số: \{add(255, 354, 788)}");
        System.out.println(STR."Tổng 4 số: \{add(255, 354, 788, 725)}");
    }

    /**
     * Phương thức tính tổng các số nguyên
     *
     * @param numbers tham số biến thiên chứa các phần tử cần tính tổng
     * @return tổng tính được
     */
    public static int add(int... numbers) {
        var sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }
}
