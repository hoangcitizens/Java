package Exercise.Ex_Chapter6.Ex61.Ex04_61;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // todo 4: tạo một đối tượng product
        Product product = new Product();

        // todo 5: sử dụng phương thức trong lớp để gán các giá trị cho thuộc tính của sản phẩm
        product.addNewProduct(
                "P001",
                "Mỳ Hảo Hảo tôm chua cay",
                "Vina Ace Cook",
                4500.0,
                LocalDate.of(2024, 12, 15),
                LocalDate.of(2025, 12, 15)
        );

        // todo 6: check hạn sử dụng của sản phẩm
        boolean stillValid = product.checkExpiration();
        System.out.println(stillValid ? "Còn hạn sử dụng" : "Hết hạn sử dụng");

        // todo 7: tìm sản phẩm theo nhà sản xuất
        boolean founded = product.searchByManufacturer("Manufacturer A");
        System.out.println(founded ? "Tìm thấy" : "Không tìm thấy");

        // todo 8: hiển thị thông tin sản phẩm
        showProductInfo(product);
    }

    public static void showProductInfo(Product product) {
        System.out.println("============== THÔNG TIN SẢN PHẨM ==============");
        System.out.println(STR."Mã sản phẩm: \{product.productId}");
        System.out.println(STR."Tên sản phẩm: \{product.productName}");
        System.out.println(STR."Nhà sản xuất: \{product.manufacturer}");
        System.out.println(STR."Giá bán: \{product.sellingPrice}");
        System.out.println(STR."Ngày sản xuất: \{product.productionDate}");
        System.out.println(STR."Hạn sử dụng: \{product.expirationDate}");
    }
}
/**
 * Còn hạn sử dụng
 * Không tìm thấy
 * ============== THÔNG TIN SẢN PHẨM ==============
 * Mã sản phẩm: P001
 * Tên sản phẩm: Mỳ Hảo Hảo tôm chua cay
 * Nhà sản xuất: Vina Ace Cook
 * Giá bán: 4500.0
 * Ngày sản xuất: 2024-12-15
 * Hạn sử dụng: 2025-12-15
 */
