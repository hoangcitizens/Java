package Lesson.Ls_Chapter5_Arrays.Ls51_array1_foreach;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
     1. Định nghĩa
    - Mảng là cấu trúc dữ liệu dùng để lưu trữ tập hợp của các giá trị cùng kiểu.
    - Các giá trị đơn lẻ trong mảng được gọi là phần tử của mảng, nói gọn là phần tử hoặc phần tử mảng.
    - Mỗi phần tử mảng được truy xuất, tức gán hoặc đọc giá trị ra thông qua một giá trị nguyên gọi là chỉ số mảng.
    - Chỉ số mảng là số nguyên. Chỉ số phần tử đầu tiên trong mảng là 0. Chỉ số phần tử cuối trong mảng là n-1 với
      n là số phần tử tối đa có thể chứa của mảng.
    - Như vậy:
        + Kiểu mảng là kiểu tập hợp, ta có thể dùng mảng để lưu một tập hợp các giá trị cùng kiểu nào đó
        + Thay vì dùng n biến lưu n giá trị khác nhau của cùng 1 kiểu nào đó ta dùng 1 biến mảng lưu trữ n phần tử
    - Ví dụ: mảng dùng để lưu trữ danh sách sinh viên, danh sách môn học, danh sách các tỉ phú thế giới, danh sách
      người yêu cũ…
    2. Cú pháp khai báo tổng quát
    - Sau đây là cú pháp tổng quát của khai báo mảng: type[] name;
    - Trong đó:
        + type là kiểu dữ liệu của mảng, thường gọi tắt là kiểu của mảng hay kiểu mảng. Kiểu của mảng là các kiểu hợp
          lệ trong ngôn ngữ lập trình Java như các kiểu nguyên thủy: int, float boolean; các kiểu tham chiếu: String,
          các class, interface… như StringBuilder, StringBuffer, Student, BankAccount, ContentProvider, Comparator, Comparable…
        + Sau kiểu của mảng ta dùng cặp ngoặc vuông [] đi liền. Đây là cú pháp để nhận biết một biến kiểu mảng với một
          biến thông thường. Ta có thể để [] sau tên mảng tuy nhiên khuyến nghị đặt [] ngay sau kiểu của mảng.
        + Sau cặp móc vuông là 1 dấu cách, tiếp đó đến phần name. Đây chính là tên mảng. Quy ước đặt tên như đặt tên
          biến nhưng ở dạng số nhiều.
        + Kết thúc cú pháp khai báo mảng luôn có dấu chấm phẩy ;.
    3. Khởi tạo mảng
    - Mảng khai báo như trên chưa sử dụng được do chúng ta chỉ mới khai báo, chưa khởi tạo giá trị cho nó. Mọi mảng
      trước khi đem sử dụng đều phải được khởi tạo hoặc gán giá trị.
    - Cú pháp khởi tạo mảng:
        type[] name = new type[num_of_elements];
        type[] name = new type[]{elements};
        type[] name ={elements};
    - Trong đó giống cú pháp khai báo mảng và cộng thêm:
        + Dấu bằng = và vế bên phải dấu = là tổ hợp new …
        + Phần num_of_elements là số lượng phần tử của mảng mà ta muốn lưu trữ. Nhớ đặt trong ngoặc vuông.
          Số phần tử tối đa luôn là số nguyên dương.
        + Cách thứ nhất sẽ mặc định tạo ra một mảng kiểu type có num_of_elements phần tử. Tất cả các phần tử này
          mặc định sẽ là 0 nếu là các kiểu số, false nếu là boolean và null nếu là các kiểu tham chiếu như
          String, các class, interface khác.
        + Cách thứ hai tạo ra một mảng kiểu type có số phần tử xác định qua số lượng phần tử được khởi tạo trong cặp { }.
        + Cách thứ ba là rút gọn của cách thứ 2, lúc này số lượng phần tử liệt kê trong cặp ngoặc {} sẽ là số lượng
          phần tử của mảng.
        + Các phần tử trong phần elements là các giá trị cùng kiểu với kiểu của mảng và phân tách nhau bởi dấu phẩy.
        + Kết thúc cú pháp khởi tạo luôn có dấu chấm phẩy(;).
    4. Truy xuất giá trị trong mảng
    - Truy xuất là việc gán giá trị cho các phần tử mảng hoặc lấy giá trị của các phần tử mảng ra để sử dụng vào
      mục đích nào đó.
    - Để sử dụng giá trị trong mảng, tức đọc giá trị ra để tính toán, thao tác; hoặc gán, thay đổi giá trị một phần tử
      nào đó, ta sử dụng tên mảng và chỉ số mảng.
    - Cú pháp tổng quát gán giá trị cho 1 phần tử là: name[index] = value;
    - Cú pháp gán giá trị của một phần tử mảng cho một biến cùng kiểu: variable = arrName[index];
        + Trong đó name hoặc arrName là tên mảng
        + value, variable phải cùng kiểu với kiểu của mảng. Vế phải phép gán = có thể là giá trị cụ thể: “abc”, 647,…
          hoặc các biến, biểu thức, hằng số, lời gọi phương thức.
        + index là chỉ số mảng luôn nằm trong đoạn [0, n-1] với n là số lượng phần tử của mảng.
    - Cú pháp lấy số lượng phần tử hiện có của mảng là: name.length
    - Ta có thể gán hai biến mảng cùng kiểu cho nhau. Khi đó chúng cùng tham chiếu tới một mảng. Lý do là kiểu mảng
      là kiểu đối tượng.
    * Copy mảng
        - Nếu muốn copy nội dung từ một mảng sang 1 mảng khác ta dùng Arrays.copyOf(source, new_size);
        - Trong đó:
            + Tham số thứ nhất source là mảng nguồn cần copy.
            + Tham số thứ hai new_size là kích thước mảng đích.
            + Phương thức trên trả về mảng mới cùng kiểu mảng gốc trong tham số thứ nhất.
        - Ví dụ:
            String[] brands = new String[]{"Apple", "Samsung", "Huawei", "Oppo"};
            var copyArr = Arrays.copyOf(brands, 2);
            System.out.println(copyArr[1]); // kết quả in ra: Samsung
    * Truy xuất mảng
        - Truy xuất tất cả hoặc một đoạn phần tử trong mảng, ta thường sử dụng kết hợp với vòng lặp for:
            String[] brands = new String[]{"Apple", "Samsung", "Huawei", "Oppo"};
            // duyệt toàn bộ mảng
            for (int i = 0; i < brands.length; i++) {
                System.out.println(brands[i]);
            }
 */
public class Lesson51_mang1chieu {
    public static void main(String[] args) {
        // Khai báo mảng
        int[] numbers;
        float[] avgGrades;
        String[] friends = new String[]{"Nam","Linh","Hoàng"};
        System.out.println(friends[0]);
        // Copy mảng
        String[] brands = new String[]{"Apple","Samsung","Huawei","Oppo"};
        String[] other = Arrays.copyOf(brands,10);
        other[3] = "Xiaomi";
        System.out.println(brands[3]);
        System.out.println(other[3]);
        // dùng foreach
        for (var item : brands) {
            System.out.println(item);
        }
    }
}
