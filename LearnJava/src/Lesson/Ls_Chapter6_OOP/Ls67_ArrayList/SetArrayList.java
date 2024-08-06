package Lesson.Ls_Chapter6_OOP.Ls67_ArrayList;

import java.util.ArrayList;

/*
    4. Thay đổi giá trị của phần tử trong ArrayList
    - Để thay đổi một phần tử nào đó trong ArrayList khi phần tử đó đã tồn tại, ta sử dụng phương thức set():
        + set(index, newObject): Thay thế phần tử tại vị trí index trong ArrayList hiện thời bằng phần tử newObject.
          Trong đó newObject phải đảm bảo cùng kiểu với kiểu của ArrayList. Lưu ý rằng index phải nằm trong
          đoạn [0, size-1] với size là kích thước hay số phần tử thực tế hiện thời của ArrayList.
 */

public class SetArrayList {
    public static void main(String[] args) {
        var pets = new ArrayList<Pet>();
        var pet1 = new Pet("Tom Cat", 3, 3.5f);
        var pet2 = new Pet("Jerry Mouse", 3, 0.5f);
        var pet3 = new Pet("Bob Dog", 5, 15.5f);
        // thêm vào cuối array list
        pets.add(pet1);
        pets.add(pet2);
        // thêm vào vị trí được chỉ định
        pets.add(pet3);
        pets.add(1, new Pet("Terrot Bird", 2, 0.3f));

        // show arraylist elements:
        System.out.println("Trước khi thay đổi:");
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            pet.showInfo();
        }

        // thay thế object tại vị trí index = 1
        pets.set(1, new Pet("Donald Duck", 5, 2.5f));
        System.out.println("Sau khi thay thế pet tại vị trí index = 1: ");
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            pet.showInfo();
        }
    }
}
