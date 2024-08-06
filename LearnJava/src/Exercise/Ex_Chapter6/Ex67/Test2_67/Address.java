package Exercise.Ex_Chapter6.Ex67.Test2_67;

/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */

/*
    Lớp mô tả đối tượng địa chỉ
 */
@SuppressWarnings("unused")
public class Address {

    private static int nextId = 1000;
    private String id;           // mã địa chỉ
    private String number;       // số nhà
    private String lane;         // ngõ
    private String road;         // tên đường
    private String village;      // tên xóm
    private String wards;        // phường/xã
    private String district;     // quận/huyện
    private City city;         // tỉnh/thành phố

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
                   String village, String wards, String district, City city) {
        setId(id);
        setNumber(number);
        setLane(lane);
        setRoad(road);
        setVillage(village);
        setWards(wards);
        setDistrict(district);
        setCity(city);
    }

    public String getId() {
        return id;
    }

    /**
     * Phương thức thiết lập id cho địa chỉ. Nguyên lý: nếu id rỗng hoặc null, ta lấy id tự động tăng với
     * tiền tố "ADD", sau đó id tự tăng lên 1 đơn vị sử dụng thành phần static. Nếu id khác rỗng và null,
     * ta gán id là id được cung cấp.
     *
     * @param id giá trị id cần cập nhật
     */
    public void setId(String id) {
        if (id == null || id.isBlank()) {
            this.id = STR."ADD\{nextId++}";
        } else {
            this.id = id;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city.getValue();
    }

    public void setCity(City city) {
        this.city = city;
    }
}
