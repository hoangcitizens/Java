package Lesson.Ls_Chapter6_OOP.Ls67_ArrayList;

/*
    6, Duyệt ArrayList
        Để duyệt ArrayList, ta có thể sử dụng vòng lặp for thường hoặc vòng lặp for-each:
 */

import java.util.ArrayList;

public class DisplayArrayList {
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

        // show arraylist elements:
        // cách 1: dùng for thường
        System.out.println("Cách 1: dùng for thường:");
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            pet.showInfo();
        }

        // dùng for-each (có thể thay đổi thuộc tính trong đối tượng)
        System.out.println("Cách 2: dùng for-each:");
        for (var pet : pets) {
            pet.setName(STR."\{pet.getName()}Haha");
        }

        for(var pet : pets) {
            pet.showInfo();
        }
    }
}
