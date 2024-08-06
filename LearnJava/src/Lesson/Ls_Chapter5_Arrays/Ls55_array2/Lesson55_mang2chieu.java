package Lesson.Ls_Chapter5_Arrays.Ls55_array2;

/*
    Bài 5.5. Mảng nhiều chiều
    1. Mục đích sử dụng
        - Mục đích sử dụng của mảng nhiều chiều là để lưu trữ các dữ liệu dạng bảng.
        - Phổ biến nhất của mảng nhiều chiều là mảng 2 chiều.
        - Ví dụ lưu trữ hình ảnh, bảng tính excel, bàn cờ, tọa độ hai chiều, thông tin bảng điểm, thông tin nhân viên…
    2. Cú pháp khai báo tổng quát
    - Cú pháp khai báo mảng hai chiều tổng quát là: type[][] name;
    - Trong đó:
        + Phần type là kiểu của mảng. Có thể là bất kì kiểu dữ liệu hợp lệ nào trong Java.
          Ví dụ như int, float, boolean, String…
        + Sau phần kiểu mảng là hai cặp móc vuông [][] đi liền nhau. Đây là dấu hiệu nhận biết mảng hai chiều.
        + Sau đó là dấu cách và phần name. Name là tên mảng. Đặt theo quy tắc đặt tên mảng 1 chiều.
        + Kết thúc khai báo là dấu chấm phẩy.
    - Mọi mảng đều phải được cấp phát hoặc khởi tạo trước khi có thể sử dụng.
    3. Khởi tạo mảng
    - Ta có thể khởi tạo mảng theo nhiều cách khác nhau:
        + cách 1: type[][] name = new type[row][col];
        + cách 2:
            type[][] name = new type[][] {
                    {v[0, 0], v[0, 1], ..., v[0, col-1]},
                    ...,
                    {v[row-1, 0], v[row-1, 1], ..., v[row-1, col-1]}
            };
        + cách 3:
            type[][] name = {          {v[0, 0], v[0, 1], ..., v[0, col-1]},
                    ...,
                    {v[row-1, 0], v[row-1, 1], ..., v[row-1, col-1]}
            };
    - Trong đó:
        + Nếu khởi tạo theo cách 1, tất cả các phần tử của mảng sẽ được khởi tạo giá trị mặc định của kiểu.
          Các kiểu số là 0, kiểu boolean là false, kiểu tham chiếu là null. Tổng số phần tử trong mảng là row x col.
        + Nếu khởi tạo theo cách 2 hoặc 3 thì thường ta sẽ biết trước tập dữ liệu. Và tập dữ liệu tương đối nhỏ.
          Số cặp {} bên trong {} sẽ là số hàng của mảng. Số phần tử trong mỗi cặp {} bên trong là số phần tử trên
          từng hàng tương ứng, gọi là số cột.
        + Cách 3 là cú pháp rút gọn của cách 2. Tổng số phần tử khởi tạo là tổng số phần tử của mảng.
    - Mảng sau khi cấp phát hoặc khởi tạo là không thể thay đổi số lượng phần tử.
    4. Truy xuất giá trị trong mảng
    - Để truy xuất một phần tử mảng, ta dùng tên mảng và chỉ số hàng, cột. Cú pháp là: name[row_index][col_index];
    - Lưu ý rằng chỉ số hàng, cột theo quy tắc của mảng 1 chiều. Luôn bắt đầu từ 0 và kết thúc ở row-1 và col-1 tương ứng cho hàng, cột.
    - Số hàng, số cột luôn là số nguyên dương.
    - Nếu truy cập phần tử ngoài mảng thì sẽ bị ngoại lệ như mảng 1 chiều.
    - Ví dụ:
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[0][0]); // lấy giá trị phần tử đầu tiên
        System.out.println(matrix[2][2]); // lấy giá trị phần tử cuối
        matrix[0][2] = 100; // thay đổi giá trị hàng 0 cột 2
        matrix[3][3] = 200; // xảy ra ngoại lệ vì chỉ số hàng cột chỉ đến 2, 2
    - Giải thích
        + Để truy xuất toàn mảng hoặc một phần của mảng, ta thường dùng vòng lặp for lồng nhau.
        + Cú pháp lấy số hàng của mảng hai chiều: name.length
        + Cú pháp lấy số phần tử trên hàng i: name[i].length
 */

public class Lesson55_mang2chieu {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // truy xuất từng phần tử mảng, trong đó matrix.length là số hàng
        // matrix[i].length là số cột trên từng hàng
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // in xuống dòng
        }

        // Nếu dùng foreach thì phải duyệt toàn bộ mảng. Cú pháp sẽ khác đôi chút với foreach ở mảng 1 chiều.
        int[][] matrix1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (var row : matrix1) { // duyệt từng hàng trong ma trận
            for (var element : row) { // duyệt từng phần tử trên hàng
                System.out.print(element + " ");
            }
            System.out.println(); // in xuống dòng
        }
    }
}
