package Lesson.Ls_Chapter6_OOP.Ls67_ArrayList;

/*
    5. Loại bỏ phần tử khỏi ArrayList
    - Để loại bỏ phần tử nào đó khỏi ArrayList ta sử dụng các phương thức sau:
        + remove(object): Xóa phần tử object khỏi danh sách. Nếu phần tử này xuất hiện nhiều lần trong danh sách thì xóa
          phần tử đầu tiên tìm được.
        + remove(index): Xóa bỏ phần tử tại chỉ số index khỏi danh sách hiện thời. Lưu ý index phải nằm trong đoạn
          [0, size-1] nếu không bạn sẽ gặp ngoại lệ.
        + clear(): Xóa bỏ toàn bộ các phần tử hiện có trong ArrayList.
        + removeAll(Collection c): Xóa bỏ toàn bộ các phần tử chứa trong collection cho trong tham số.
        + removeRange(fromIndex, toIndex)(Đã lỗi thời): Xóa bỏ các phần tử trong danh sách mà chỉ số của các phần tử
          này nằm trong khoảng [fromIndex, toIndex). Lưu ý các index phải hợp lệ.
        + removeFirst(): xóa bỏ phần tử đầu array list.
        + removeLast(): xóa bỏ phần tử cuối array list.
 */

import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        var pets = new ArrayList<Pet>();
        var others = new ArrayList<Pet>();
        var pet1 = new Pet("Tom Cat", 3, 3.5f);
        var pet2 = new Pet("Jerry Mouse", 3, 0.5f);
        var pet3 = new Pet("Bob Dog", 5, 15.5f);
        // thêm vào cuối array list
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        others.addAll(pets);
        pets.add(1, new Pet("Terrot Bird", 2, 0.3f));

        // show arraylist elements:
        System.out.println("Trước khi xóa:");
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            pet.showInfo();
        }

        // xoá phần tử trong pets mà cũng xuất hiện trong others
        pets.removeAll(others);
        System.out.println("Sau khi xóa phần tử ở vị trí index = 1: ");
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            pet.showInfo();
        }
    }
}
