package Lesson.Ls_Chapter6_OOP.Ls67_ArrayList;
/*
    3. Thêm phần tử vào ArrayList
    - Để thêm phần tử vào ArrayList ta dùng phương thức add:
        + add(object): Thêm mới phần tử object cùng kiểu với kiểu của ArrayList vào cuối danh sách.
        + add(index, object): Thêm mới một đối tượng object cùng kiểu với kiểu của ArrayList vào vị trí chỉ số index
          trong danh sách. Các phần tử phía sau chỉ số đó sẽ tự động được lùi về sau 1 vị trí. Lưu ý rằng index phải
          nằm trong đoạn [0, size-1] với size là kích thước hay số phần tử thực tế hiện thời của ArrayList.
        + addAll(Collection c): Thêm toàn bộ các phần tử của collection c vào cuối danh sách hiện thời.
        + addAll(index, Collection c): Chèn toàn bộ các phần tử của collection c vào vị trí index của danh sách hiện thời.
          Lưu ý index phải hợp lệ, tức thuộc khoảng [0, size-1].
    - Khi ta tạo mới một đối tượng với từ khóa new. Vùng nhớ được cấp phát cho đối tượng sẽ nằm trong bộ nhớ heap.
    - Quá trình mở rộng ArrayList khi đã đầy và nếu chúng ta tiếp tục thêm phần tử mới vào có thể được mô tả như sau:
    - Tạo một ArrayList tại một vùng nhớ lớn hơn trong bộ nhớ heap(ví dụ gấp 1.5 lần kích thước cũ).
    - Copy các phần tử hiện thời trong danh sách cũ sang phân vùng nhớ mới này.
    - Thêm phần tử mới vào danh sách mới tạo.
    - Xóa bỏ vùng nhớ cũ.
 */

import java.util.ArrayList;

public class AddArrayList {
    public static void main(String[] args) {
        var pets = new ArrayList<Pet>();
        var pet1 = new Pet("Tom Cat", 3, 3.5f);
        var pet2 = new Pet("Jerry Mouse", 3, 0.5f);
        var pet3 = new Pet("Bob Dog", 5, 15.5f);
        // thêm vào cuối array list
        pets.add(pet1);
        pets.add(pet2);
        // thêm vào vị trí được chỉ định
        pets.add(0, pet3);
        pets.add(1, new Pet("Terrot Bird", 2, 0.3f));
        // [0, pets.size() - 1]

        var otherPets = new ArrayList<Pet>();
        // thêm cả collection vào cuối array list
        otherPets.addAll(pets);
    }
}
