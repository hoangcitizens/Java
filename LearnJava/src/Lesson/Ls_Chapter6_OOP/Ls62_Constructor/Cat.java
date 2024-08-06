package Lesson.Ls_Chapter6_OOP.Ls62_Constructor;


public class Cat {
    private String name;
    private float weight;
    private int age;
    private String favoriteFood;

    // sử dụng this khi tham số trùng tên với tên thuộc tính.
    // lý do: trong một phương thức, biến cục bộ có mức ưu tiên cao hơn
    // biến class(thuộc tính của lớp)
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this(name); // gọi constructor 1 tham số
        this.age = age; // bên có this. là thuộc tính, bên không có this là tham số
    }

    public Cat(String name, float weight, int age) {
        this(name, age); // gọi constructor 2 tham số
        this.weight = weight;
    }

    public Cat(String name, float weight, int age, String favoriteFood) {
        this(name, weight, age); // gọi constructor 3 tham số
        this.favoriteFood = favoriteFood;
    }
}
