package Lesson.Ls_Chapter6_OOP.Ls67_ArrayList;

import static java.lang.System.*;

public class Pet {
    private String name; // tên
    private float age; // tuổi
    private float weight; // cân nặng

    public Pet() {
        name = "No Name";
        age = 0.0f;
        weight = 0.0f;
    }

    public Pet(String name, int age, float weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void showInfo() {
        out.println("================================");
        out.println(STR."Tên pet: \{name}\nTuổi: \{age}\nCân nặng: \{weight}");
    }
}
