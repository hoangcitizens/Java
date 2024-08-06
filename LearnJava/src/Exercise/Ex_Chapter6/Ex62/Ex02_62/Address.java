/*
    Bài 2. Thông tin về địa chỉ bao gồm: mã địa chỉ có dạng ADDxxxx(ví dụ ADD0001), số nhà, ngõ, tên đường, tên xóm,
    tên xã/phường, quận(huyện)/thị trấn, tỉnh/thành phố. Thiết kế lớp mô tả đối tượng địa chỉ như trên. Bổ sung các
    constructor phù hợp có thể tái sử dụng một cách hợp lý. Yêu cầu constructor ít tham số gọi tới constructor nhiều
    tham số khi tái sử dụng. Tạo chương trình có menu cho phép thực hiện các chức năng sau:
        1. Thêm mới một địa chỉ vào mảng các địa chỉ. Mỗi địa chỉ với một mã địa chỉ duy nhất chỉ được xuất hiện đúng
           1 lần trong danh sách.
        2. Xóa bỏ một địa chỉ theo mã.
        3. Sửa thông tin số nhà, ngõ, tên đường, tên xóm theo mã địa chỉ.
        4. Tìm địa chỉ theo số nhà, hiện kết quả tìm kiếm.
        5. Hiển thị danh sách địa chỉ dưới dạng bảng.
        6. Kết thúc chương trình.
 */

package Exercise.Ex_Chapter6.Ex62.Ex02_62;

/*
    Lớp mô tả đối tượng địa chỉ
 */
public class Address {

    // todo 1: Khai báo các thuộc tính theo yêu cầu của đề bài
    public String id;           // mã địa chỉ
    public String number;       // số nhà
    public String lane;         // ngõ
    public String road;         // tên đường
    public String village;      // tên xóm
    public String wards;        // phường/xã
    public String district;     // quận/huyện
    public String city;         // thành phố


    // todo 2: triển khai các constructor 0 tham số và các hàm khởi tạo hợp lý theo đề bài
    public Address() {
        this(null);
    }

    public Address(String id) {
        this(id, null);
    }

    public Address(String id, String number) {
        this(id, number, null);
    }

    public Address(String id, String number, String lane) {
        this(id, number, lane, null);
    }

    public Address(String id, String number, String lane, String road) {
        this(id, number, lane, road, null);
    }

    public Address(String id, String number, String lane, String road, String village) {
        this(id, number, lane, road, village, null);
    }

    public Address(String id, String number, String lane, String road, String village, String wards) {
        this(id, number, lane, road, village, wards, null);
    }

    public Address(String id, String number, String lane, String road,
                   String village, String wards, String district) {
        this(id, number, lane, road, village, wards, district, null);
    }

    public Address(String id, String number, String lane, String road,
                   String village, String wards, String district, String city) {
        this.id = id;
        this.number = number;
        this.lane = lane;
        this.road = road;
        this.village = village;
        this.wards = wards;
        this.district = district;
        this.city = city;
    }
}

