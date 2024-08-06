/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */

package Exercise.Ex_Chapter6.Ex63.Ex04_63;

public class Item {
    // todo 1: trển khai các thuộc tính private theo đề bài
    private String id;
    private String name;
    private String manufacturer;
    private float price;
    private String productionDate;
    private String expirationDate;
    private int inventoryQuantity; // số lượng hàng tồn kho
    private int soldQuantity;      // số lượng hàng đã bán

    public Item() {
        this(null);
    }

    public Item(String id) {
        this(id, null);
    }

    public Item(String id, String name) {
        this(id, name, 0);
    }

    public Item(String id, String name, float price) {
        this(id, name, null, price, null, null, 0, 0);
    }

    // todo 3: sử dụng các getter/setter trong constructor
    public Item(String id, String name, String manufacturer, float price,
                String productionDate, String expirationDate, int inventoryQuantity,
                int soldQuantity) {
        setId(id);
        setName(name);
        setManufacturer(manufacturer);
        setPrice(price);
        setProductionDate(productionDate);
        setExpirationDate(expirationDate);
        setInventoryQuantity(inventoryQuantity);
        setSoldQuantity(soldQuantity);
    }

    // todo 2: tạo các getter/setter cần thiết cho các thuộc tính private
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }
}
