package Lesson.Ls_Chapter5_Arrays.Ls51_array1_foreach;

/*
   5. Vòng lặp foreach
    - Khi sử dụng vòng lặp for, ta có thể gặp vấn đề đó là chỉ số phần tử vượt biên của mảng. Điều này làm chương trình
      bị crash và kết thúc không mong muốn.
    - Để giải quyết vấn đề trên, ta sử dụng vòng lặp foreach.
    - Đọc là for-each.
    - Vòng lặp này sẽ lần lượt duyệt từ đầu đến hết tập hợp hiện có.
    - Cú pháp của vòng lặp foreach là:
    for (type element : collection) {
        // do something
    }
    - Trong đó:
        + type là kiểu của biến, cùng kiểu với kiểu mảng cần duyệt, có thể sử dụng var.
        + element là tên biến nào đó ngắn gọn dùng để đại diện cho từng phần tử của mảng.
        + Có dấu hai chấm phân tách ở giữa element và collection.
        + Phần collection là tên một tập hợp nào đó như tên mảng chẳng hạn.
        + Trong phần thân của foreach là các câu lệnh cần thực hiện nào đó.
    - Ta sử dụng foreach khi duyệt mảng là chủ yếu. Còn nếu muốn thao tác sâu hơn như thay đổi giá trị phần tử, duyệt
      một đoạn thay vì toàn bộ mảng,… ta dùng vòng for thường.
    - Để sử dụng foreach trong IntelliJ bạn gõ foreach rồi ấn phím Tab.
 */
public class Lesson51_foreach {
    public static void main(String[] args) {
        String[] brands = new String[]{"Apple", "Samsung", "Huawei", "Oppo"};
// duyệt toàn bộ mảng
        for (int i = 0; i < brands.length; i++) {
            System.out.println(brands[i]); // hiển thị p.tử thứ i
        }
// tương đương:
        for (var item : brands) { // sử dụng kiểu tự suy luận var
            System.out.println(item);
        }
// hoặc:
        for (String item : brands) { // sử dụng kiểu tường minh: String
            System.out.println(item);
        }
    }
}
