package Exercise.Ex_Chapter6.Ex61.Ex02_61;

/*
    Bài 2. Thông tin về địa chỉ bao gồm: số nhà, ngõ, tên đường, tên xóm, tên xã/phường, quận(huyện)/thị trấn,
    tỉnh/thành phố. Phương thức khởi tạo gồm mặc định, một phương thức khác nhận vào số nhà và tên đường. Các phương
    thức khác gồm phương thức trả về đầy đủ thông tin của địa chỉ, phương thức nhập các thông tin của địa chỉ. Thiết kế
    lớp mô tả đối tượng địa chỉ như trên. Sau đó tạo các địa chỉ bất kỳ trong hàm main và sử dụng các thuộc tính,
    phương thức tương ứng
 */


import java.util.Scanner;

/*
    Lớp mô tả đối tượng địa chỉ
 */
public class Address {

    // todo 1: Khai báo các thuộc tính theo yêu cầu của đề bài
    public String number;       // số nhà
    public String lane;         // ngõ
    public String road;         // tên đường
    public String village;      // tên xóm
    public String wards;        // phường/xã
    public String district;     // quận/huyện
    public String city;         // thành phố


    // todo 2: Tạo constructor 0 tham số, trong đó khởi tạo các giá trị mặc định của kiểu thuộc tính đã khai báo
    public Address() {
        number = "";
        lane = "";
        road = "";
        village = "";
        wards = "";
        district = "";
        city = "";
    }


    // todo 3: Tạo constructor nhận vào 2 tham số là số nhà và tên đường
    public Address(String number, String road) {
        this.number = number;
        this.road = road;
    }


    // todo 4: Tạo phương thức trả về đầy đủ thông tin của địa chỉ
    public String getFullAddress() {
        String address = "";
        if (!number.isEmpty()) {
            address += STR."Số \{number}";
        }
        if (!lane.isEmpty()) {
            address += STR." ngõ \{lane}";
        }
        if (!road.isEmpty()) {
            address += STR." đường \{road}";
        }
        if (!village.isEmpty()) {
            address += STR." thôn/xóm \{village}";
        }
        if (!wards.isEmpty()) {
            address += STR." xã/phường \{wards}";
        }
        if (!district.isEmpty()) {
            address += STR." quận/huyện \{district}";
        }
        if (!city.isEmpty()) {
            address += STR." tỉnh/thành phố \{city}";
        }
        return address;
    }


    // todo 5: Tạo phương thức cho phép nhập các thông tin cho địa chỉ
    public void setFullAddress() {
        Scanner input = new Scanner(System.in);
        System.out.print("Số nhà: ");
        number = input.nextLine();
        System.out.print("Ngõ: ");
        lane = input.nextLine();
        System.out.print("Tên đường: ");
        road = input.nextLine();
        System.out.print("Tên xóm: ");
        village = input.nextLine();
        System.out.print("Phường/xã: ");
        wards = input.nextLine();
        System.out.print("Quận/huyện: ");
        district = input.nextLine();
        System.out.print("Thành phố: ");
        city = input.nextLine();
    }

}

