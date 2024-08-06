package Exercise.Ex_Chapter6.Ex61.Ex04_61;

/*
    Bài 4. Thông tin về sản phẩm trong một cửa hàng bao gồm: mã sản phẩm, tên sản phẩm, nhà sản xuất, giá bán, ngày sản
    xuất, ngày hết hạn. Phương thức khởi tạo gồm mặc định, một phương thức khác nhận vào mã sản phẩm và tên sản phẩm.
    Các hành động bao gồm thêm sản phẩm mới, kiểm tra hạn sử dụng của sản phẩm, tìm kiếm sản phẩm theo nhà sản xuất.
    Thiết kế lớp mô tả đối tượng sản phẩm như trên. Sau đó tạo các sản phẩm bất kỳ trong hàm main và sử dụng các
    thuộc tính, phương thức tương ứng
 */

import java.time.LocalDate;

public class Product {// todo 1: thêm các thuộc tính theo đề bài
    public String productId;
    public String productName;
    public String manufacturer;
    public double sellingPrice;
    public LocalDate productionDate;
    public LocalDate expirationDate;

    // todo 2: thêm các phương thức khởi tạo theo đề bài
    public Product() {
    }

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // todo 3: thêm các phương thức thể hiện các hành động theo đề bài

    public void addNewProduct(String productId, String productName, String manufacturer,
                              double sellingPrice, LocalDate productionDate, LocalDate expirationDate) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.sellingPrice = sellingPrice;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    /**
     * Kiểm tra sản phẩm có hết hạn không
     *
     * @return true nếu có, false nếu không
     */
    public boolean checkExpiration() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isBefore(expirationDate);
    }

    public boolean searchByManufacturer(String manufacturerToSearch) {
        return manufacturer.equals(manufacturerToSearch);
    }
}

