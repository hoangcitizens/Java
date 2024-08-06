package Lesson.Ls_Chapter6_OOP.Ls61_class_object.Lesson61_VD2;

import java.util.Date;

public class Item {
    private String id; // mã mặt hàng
    private String name; // tên mặt hàng
    private float price; // giá gốc
    private Date expiry; // hạn sử dụng
    private String brand; // hãng sản xuất
    private String productType; // dòng sản phẩm, ví dụ: thường, pro, ultra...

    public Item() {
    }

    public Item(String id, String name, float price,
                Date expiry, String brand, String productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expiry = expiry;
        this.brand = brand;
        this.productType = productType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
