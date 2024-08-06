package Lesson.Ls_Chapter6_OOP.Ls61_class_object.Lesson61_VD2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Item iphone16 = new Item("ip16", "iPhone 16", 26560000,
                null, "Apple", "Normal");
        Item iphone16Pro = new Item("ip16pro", "iPhone 16 Pro", 28860000,
                null, "Apple", "Pro");
        // hiện thông tin sản phẩm
        Test test = new Test();
        test.showHeader();
        test.showInfo(iphone16);
        test.showInfo(iphone16Pro);
    }

    private void showInfo(Item item) {
        System.out.printf("%-12s%-25s%-12.2f%-15s%-20s%-30s\n",
                item.getId(), item.getName(), item.getPrice(),
                expiryDateString(item.getExpiry()), item.getBrand(),
                item.getProductType());
    }

    private void showHeader() {
        System.out.println("========= Thông tin sản phẩm ==========");
        System.out.printf("%-12s%-25s%-12s%-15s%-20s%-30s\n",
                "Mã SP", "Tên sản phẩm", "Giá", "Hạn sử dụng", "Hãng SX", "Dòng SP");
    }

    private String expiryDateString(Date date) {
        if (date == null) {
            return "null";
        }
        var simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }
}
