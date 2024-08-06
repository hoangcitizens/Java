package Lesson.Ls_Chapter5_Arrays.Ls55_array2;

/*
    5. Mảng zigzag
    - Mảng từ đầu tới giờ ta xét là mảng có số phần tử trên từng hàng là như nhau.
    - Trong Java cho phép tạo mảng hai chiều mà số cột trên từng hàng là khác nhau. Tức là số phần tử trên từng hàng
      khác nhau.
    - Thực chất Java chỉ có mảng 1 chiều. Mảng nhiều chiều là mảng được tạo ra từ mảng của mảng. Tức là mỗi hàng trong
      mảng hai chiều có bản chất là một mảng 1 chiều.
    - Để tạo mảng zigzag ta thực hiện qua hai bước:
        + Cấp phát số hàng
        + Cấp phát số phần tử trên từng hàng(số cột của từng hàng)
    - Ví dụ
        type[][] name = new type[row][]; // cấp phát số hàng
        for (int i = 0; i < row; i++) { // cấp phát số p.tử
            name[i] = new type[col_i];  // cho từng hàng
}
 */
public class Lesson55_ArrayZigzag {
    public static void main(String[] args) {
        // giả sử tạo mảng có số phần tử trên từng hàng tăng dần
        int[][] triangle = new int[4][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
        }
        // gán các giá trị cho mảng:
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = i + j;
            }
        }
        // hiện giá trị từng phần tử mảng zigzag
        for (var row : triangle) { // duyệt từng hàng trong ma trận
            for (var element : row) { // duyệt từng phần tử trên hàng
                System.out.print(element + " ");
            }
            System.out.println(); // in xuống dòng
        }
    }
}
