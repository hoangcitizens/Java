/**
 * @author Branium Academy
 * @version 2024.01
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */
package Exercise.Ex_Chapter6.Ex63.Ex02_63;

/*
    Lớp mô tả đối tượng địa chỉ
 */
@SuppressWarnings("unused")
public class Address {

    // todo 1: Khai báo các thuộc tính theo yêu cầu của đề bài
    private String id;           // mã địa chỉ
    private String number;       // số nhà
    private String lane;         // ngõ
    private String road;         // tên đường
    private String village;      // tên xóm
    private String wards;        // phường/xã
    private String district;     // quận/huyện
    private String city;         // thành phố


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

    public void setId(String id) {
        this.id = id;
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
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
