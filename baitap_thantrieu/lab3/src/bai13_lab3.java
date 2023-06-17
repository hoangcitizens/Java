/*
    Bài 13. Sử dụng xâu ký tự để viết phương thức kiểm tra số thuận nghịch. Áp dụng cho việc liệt kê các số thuận nghịch có 9 chữ số.
*/
public class bai13_lab3 {
    public static void main(String[] args) {
        String number = 99997 + ""; // chuyển từ số sang string thì + với ""
        System.out.println("Thuận nghịch ? " + isReverse(number)); // isReverse() : dùng để kiểm tra 1 chuỗi có thuận nghịch không
        int count = 0;
        for (int i = 100000000; i < 999999999; i++) {
            if (isReverse(i + "")) {
                System.out.printf("%12d",i);
                count++;
                if (count % 10 == 0) { // 10 số thì xuống dòng
                    System.out.println();
                }
            }
        }
    }
    public static boolean isReverse(String s) {
        String other;
        StringBuffer builder = new StringBuffer(s); // tạo lớp thao tác với chuỗi có thể thay đổi
        other = builder.reverse().toString(); // reverse() : đảo chuỗi
        return (s.compareTo(other) == 0); // compareTo() : so sánh 2 đối tượng cùng lớp giống nhau
    }
}
