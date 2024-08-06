package Exercise.Ex_Chapter6.Ex61.Ex02_61;

public class Test {
    public static void main(String[] args) {
        // todo 6: Tạo đối tượng myAddress1 với hàm khởi tạo không tham số
        Address myAddress1 = new Address();

        // todo 7: Tạo đối tượng myAddress2 với hàm khởi tạo nhận 2 tham số số nhà và tên đường
        Address myAddress2 = new Address("54A", "Phan Đình Phùng");

        // todo 8: gán giá trị cho các thuộc tính của đối tượng myAddress1
        myAddress1.number = "74A";
        myAddress1.lane = "ngõ 21";
        myAddress1.road = "đường Phan Bội Châu";
        myAddress1.village = "xóm 3";
        myAddress1.wards = "phường Cẩm Thượng";
        myAddress1.district = "quận Thanh Xuân";
        myAddress1.city = "Hà Nội";

        // todo 9: gọi phương thức để điền vào các thông tin của đối tượng myAddress2
        myAddress2.setFullAddress();

        // todo 11: gọi phương thức để in ra màn hình thông tin đầy đủ của đối tượng myAddress2
        showAddress(myAddress1);
        showAddress(myAddress2);
    }

    // todo 10: tạo phương thức hiển thị thông tin về địa chỉ
    private static void showAddress(Address address) {
        System.out.println("------------------- Địa chỉ đầy đủ: -------------------");
        System.out.println(address.getFullAddress());
    }
}
