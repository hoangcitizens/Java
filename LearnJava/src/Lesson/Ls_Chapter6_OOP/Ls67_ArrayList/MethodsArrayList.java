package Lesson.Ls_Chapter6_OOP.Ls67_ArrayList;

/*
    7. Một số phương thức khác của ArrayList
        - size(): Trả về số lượng phần tử hiện thời trong danh sách. Tương đương với length của mảng.
        - indexOf(object): Trả về chỉ số của lần xuất hiện đầu tiên của phần tử object trong danh sách. Nếu không tồn
          tại object này thì trả về -1.
        - lastIndexOf(object): Trả về chỉ số của lần xuất hiện cuối cùng của phần tử object trong danh sách. Nếu không
          tồn tại object này thì trả về -1.
        - isEmpty(): Trả về true nếu danh sách rỗng và false trong trường hợp ngược lại.
        - clone(): Trả về một bản sao của danh sách hiện thời.
        - contains(object): kiểm tra xem một đối tượng có tồn tại trong array list không. Trả về true nếu tồn tại và
          false nếu ngược lại.
        - ensureCapacity(minCapacity): Tăng khả năng chứa của danh sách hiện thời lên tối thiểu minCapacity phần tử.
          Sử dụng khi muốn chắc chắn rằng danh sách hiện thời có thể chứa ít nhất minCapacity phần tử.
        - subList(fromIndex, toIndex): Trả về một danh sách các phần tử của ArrayList hiện thời có chỉ số trong khoảng
          [fromIndex, toIndex).
        - toArray(): Trả về một mảng các phần tử trong danh sách theo thứ tự xuất hiện từ đầu đến cuối.
        - toArray(T[] arr): Trả về một mảng các phần tử trong danh sách ở kiểu T[] theo thứ tự xuất hiện từ đầu đến cuối.
 */

import java.util.ArrayList;

public class MethodsArrayList {
    public static void main(String[] args) {
        var pets = new ArrayList<Pet>();
        var pet1 = new Pet("Tom Cat", 3, 3.5f);
        var pet2 = new Pet("Jerry Mouse", 3, 0.5f);
        var pet3 = new Pet("Bob Dog", 5, 15.5f);
        // thêm vào cuối array list
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        System.out.println(STR."Vị trí đầu tiên xuất hiện pet1: \{pets.indexOf(pet1)}");
        System.out.println(STR."Vị trí cuối cùng xuất hiện pet1: \{pets.lastIndexOf(pet1)}");
        System.out.println(STR."Số lượng phần tử hiện có trong pets: \{pets.size()}");
        System.out.println(STR."pets rỗng?: \{pets.isEmpty()}");
        System.out.println(STR."pet2 có tồn tại trong pets?: \{pets.contains(pet2)}");
    }
}
