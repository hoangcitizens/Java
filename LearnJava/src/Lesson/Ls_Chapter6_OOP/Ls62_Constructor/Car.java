package Lesson.Ls_Chapter6_OOP.Ls62_Constructor;

/**
 * Lớp mô tả thông tin về chiếc ô tô.
 */
public class Car {
    private String carId;
    private String name;
    private String type;
    private String brand;
    private int year;
    private float weight;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Car(String name, String type, String brand, int year) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.year = year;
    }

    public Car(String carId, String name, String type,
               String brand, int year, float weight) {
        this.carId = carId;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.year = year;
        this.weight = weight;
    }
}
