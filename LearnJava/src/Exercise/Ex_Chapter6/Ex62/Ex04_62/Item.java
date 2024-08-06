package Exercise.Ex_Chapter6.Ex62.Ex04_62;

/*
    Bài 4. Thông tin về sản phẩm trong một cửa hàng tạp hóa bao gồm: mã sản phẩm có dạng ITMxxxx(ví dụ ITM1001),
    tên sản phẩm, nhà sản xuất, giá bán, ngày sản xuất, ngày hết hạn, số lượng hàng tồn kho, số lượng hàng đã bán.
    Bổ sung các constructor và tái sử dụng chúng sao cho phù hợp. Thiết kế lớp mô tả đối tượng sản phẩm như trên.
    Viết chương trình có menu chọn cho phép thực hiện các chức năng sau:
        1. Thêm mới sản phẩm vào danh sách sản phẩm. Lưu ý khi thêm cùng một sản phẩm đã tồn tại thì KHÔNG thêm mới mà
           chỉ cập nhật lại số lượng hàng tồn của sản phẩm đã có trước đó.
        2. Xóa sản phẩm khỏi danh sách.
        3. Cập nhật giá bán của sản phẩm theo mã sản phẩm.
        4. Cập nhật ngày sản xuất và hạn sử dụng của một sản phẩm.
        5. Cập nhật số lượng hàng tồn kho.
        6. Tính tổng tiền hàng hiện có trong danh sách.
        7. Hiển thị danh sách mặt hàng hiện có trong cửa hàng.
        8. Sắp xếp các mặt hàng trong danh sách theo thứ tự giá giảm dần.
        9. Sắp xếp các mặt hàng trong danh sách theo thứ tự giá tăng dần.
        10. Bán các sản phẩm bằng cách nhập số lượng, mã sản phẩm, cập nhật lại vào danh sách mặt hàng. Số lượng hàng
            tồn phải lớn hơn hoặc bằng số lượng cần bán thì mới bán được.
        11. Thống kê doanh thu, số lượng bán của các sản phẩm đã bán được hàng.
        12. Hiển thị danh sách các mặt hàng đã bán được hàng và số lượng bán của từng mặt hàng.
        13. Hãy cho biết mặt hàng nào bán được nhiều nhất, doanh thu bao nhiêu?
        14. Hãy cho biết danh sách các mặt hàng đang ế(chưa bán được sản phẩm nào).
        15. Hãy cho biết danh sách các mặt hàng đã hết hạn sử dụng tính đến thời điểm ngày hôm nay.
        16. Hãy cho biết danh sách mặt hàng sắp hết hạn sử dụng(còn 1-3 ngày nữa là hết hạn).
        17. Kết thúc chương trình.
 */

public class Item {
    // todo 1: trển khai các thuộc tính theo đề bài
    public String id;
    public String name;
    public String manufacturer;
    public float price;
    public String productionDate;
    public String expirationDate;
    public int inventoryQuantity; // số lượng hàng tồn kho
    public int soldQuantity;      // số lượng hàng đã bán

    // todo 2: triển khai hàm khởi tạo mặc định, sau đó gán các giá trị mặc định cho cc thuộc tính
    public Item() {
        this(null);
    }

    // todo 3: triển khai và tái sử dụng các constructor
    public Item(String id) {
        this(id, null);
    }

    public Item(String id, String name) {
        this(id, name, 0);
    }

    public Item(String id, String name, float price) {
        this(id, name, null, price, null, null, 0, 0);
    }

    public Item(String id, String name, String manufacturer, float price,
                String productionDate, String expirationDate, int inventoryQuantity,
                int soldQuantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.inventoryQuantity = inventoryQuantity;
        this.soldQuantity = soldQuantity;
    }
}
