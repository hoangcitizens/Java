package Exercise.Ex_Chapter6.Ex63.Ex04_63;

/*
    Bài 4. Thông tin về sản phẩm trong một cửa hàng bao gồm: mã sản phẩm có dạng ITMxxxx(ví dụ ITM1001), tên sản phẩm,
    nhà sản xuất, giá bán, ngày sản xuất, ngày hết hạn, số lượng hàng tồn kho, số lượng hàng đã bán. Bổ sung các
    constructor và tái sử dụng chúng sao cho phù hợp. Thiết kế lớp mô tả đối tượng sản phẩm như trên, sử dụng tính đóng
    gói dữ liệu và tự bổ sung các phương thức phụ trợ cần thiết. Viết chương trình có menu chọn cho phép thực hiện các chức
    năng sau:
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

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#,###.##");

    // todo 4: sử dụng các getter/setter khi cần truy xuất thông tin các mặt hàng
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Item[] items = new Item[100];
        var itemCount = createFakeItems(items);

        int choice;
        do {
            displayMenu();

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    if (itemCount <= 100) {
                        Item item = createItem(items, input);
                        if (item != null) { // item lúc này không tồn tại -> thêm vào
                            items[itemCount++] = item;
                            System.out.println("==> Thêm sản phẩm mới thành công <==");
                        } else { // item đã tồn và đã cập nhật số lượng tồn kho -> thông báo kết quả thôi
                            System.out.println("==> Cập nhật sản phẩm thành công <==");
                        }
                    } else {
                        System.err.println("==> Danh sách sản phẩm đã đầy. Không thể thêm! <==");
                    }
                    break;
                case 2:
                    if (itemCount > 0) {
                        deleteItemById(items, input);
                        itemCount--;
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 3:
                    if (itemCount > 0) {
                        updateItemPrice(items, input);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 4:
                    if (itemCount > 0) {
                        updateItemDate(items, input);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 5:
                    if (itemCount > 0) {
                        updateItemQuantity(items, input);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 6:
                    if (itemCount > 0) {
                        var totalMoney = calculateTotalItemPrice(items);
                        System.out.println(STR."==> Tổng số tiền hàng tồn kho: \{decimalFormat.format(totalMoney)}đ <==");
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 7:
                    if (itemCount > 0) {
                        displayAllItems(items);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 8:
                    if (itemCount > 0) {
                        sortItemsByPriceDESC(items, itemCount);
                        displayAllItems(items);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 9:
                    if (itemCount > 0) {
                        sortItemsByPriceASC(items, itemCount);
                        displayAllItems(items);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 10:
                    if (itemCount > 0) {
                        sellItem(input, items);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 11:
                    if (itemCount > 0) {
                        statRevenue(items);
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 12:
                    if (itemCount > 0) {
                        Item[] soldItems = findAllSoldItems(items);
                        if (soldItems != null) {
                            System.out.println("==> Danh sách mặt hàng và số lượng bán: ");
                            displayAllItems(soldItems);
                        } else {
                            System.err.println("==> Không tồn tại sản phẩm nào đã bán <==");
                        }
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 13:
                    if (itemCount > 0) {
                        Item[] maxSoldItems = findMostSoldItems(items);
                        if (maxSoldItems != null) {
                            System.out.println("==> Danh sách các sản phẩm bán được nhiều nhất: ");
                            showRevenue(maxSoldItems);
                        } else {
                            System.out.println("==> Không có kết quả tìm kiếm <==");
                        }
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 14:
                    if (itemCount > 0) {
                        var notSoldItems = findAllNotSoldItems(items);
                        if (notSoldItems != null) {
                            System.out.println("==> Danh sách các mặt hàng chưa bán được sản phẩm nào: ");
                            displayAllItems(notSoldItems);
                        } else {
                            System.err.println("==> Không tồn tại sản phẩm nào ế <==");
                        }
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 15:
                    if (itemCount > 0) {
                        Item[] expiredItems = findAllItemsExpired(items);
                        if (expiredItems != null) {
                            System.out.println("==> Danh sách các sản phẩm đã hết hạn sử dụng: ");
                            displayAllItems(expiredItems);
                        } else {
                            System.out.println("==> Không tồn tại sản phẩm nào hết hạn hôm nay <==");
                        }
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 16:
                    if (itemCount > 0) {
                        Item[] expiredItems = findAllItemsExpiredSoon(items);
                        if (expiredItems != null) {
                            displayAllItems(expiredItems);
                        } else {
                            System.out.println("==> Không tồn tại sản phẩm nào sắp hết hạn <==");
                        }
                    } else {
                        System.err.println("==> Danh sách sản phẩm rỗng! <==");
                    }
                    break;
                case 17:
                    System.err.println("==> Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi! <==");
                    break;
                default:
                    System.err.println("==> Sai chức năng, vui lòng nhập từ 1 -> 17 <==");
            }
        } while (choice != 17);
    }

    private static int createFakeItems(Item[] items) {
        int itemCount = 0;
        items[itemCount++] = new Item("ITM1001", "Mì hảo hảo", "AceCook", 4500, "01/01/2024", "12/06/2024", 10000, 1325);
        items[itemCount++] = new Item("ITM1002", "Mì siêu cay", "AceCook", 15500, "01/01/2024", "15/09/2024", 1000, 425);
        items[itemCount++] = new Item("ITM1003", "Mì trộn", "AceCook", 12600, "01/01/2024", "15/08/2024", 2000, 376);
        items[itemCount++] = new Item("ITM1004", "Mì tào phớ", "Massan", 5700, "01/01/2024", "01/06/2024", 3000, 185);
        items[itemCount++] = new Item("ITM1005", "Mì khoai môn", "AceCook", 4900, "01/01/2024", "02/08/2024", 5000, 854);
        items[itemCount++] = new Item("ITM1006", "Mì sắn dây", "Massan", 6300, "01/01/2024", "15/09/2024", 1000, 267);
        items[itemCount++] = new Item("ITM1007", "Mì cung đình", "Micoem", 6500, "01/01/2024", "12/07/2024", 3000, 0);
        items[itemCount++] = new Item("ITM1008", "Cẩu lương", "Couple", 1000, "01/01/2024", "31/12/2024", 1000, 0);
        return itemCount;
    }

    private static void displayMenu() {
        var line = "=========================";
        System.out.println(STR."\{line} CÁC LỰA CHỌN \{line}");
        System.out.println("1. Thêm mới một sản phẩm.");
        System.out.println("2. Xoá sản phẩm.");
        System.out.println("3. Cập nhật giá bán của sản phẩm.");
        System.out.println("4. Cập nhật ngày sản xuất và hạn sử dụng của sản phẩm.");
        System.out.println("5. Cập nhật số lượng hàng tồn kho.");
        System.out.println("6. Tính tổng tiền hàng hiện có trong danh sách.");
        System.out.println("7. Hiển thị danh sách mặt hàng hiện có trong cửa hàng.");
        System.out.println("8. Sắp xếp các mặt hàng theo thứ tự giá giảm dần.");
        System.out.println("9. Sắp xếp các mặt hàng theo thứ tự giá tăng dần.");
        System.out.println("10. Bán hàng.");
        System.out.println("11. Thống kê doanh thu theo từng mặt hàng của cửa hàng.");
        System.out.println("12. Hiển thị danh sách các mặt hàng và số lượng bán.");
        System.out.println("13. Hiển thị mặt hàng được bán nhiều nhất và doanh thu.");
        System.out.println("14. Hiển thị danh sách các mặt hàng đang ế.");
        System.out.println("15. Hiển thị danh sách các mặt hàng đã hết hạn sử dụng.");
        System.out.println("16. Hiển thị danh sách các mặt hàng sắp hết hạn sử dụng.");
        System.out.println("17. Kết thúc chương trình.");
        System.out.println("==> Xin mời chọn: ");
    }

    private static Item createItem(Item[] items, Scanner input) {
        String itemId;
        while (true) {
            System.out.print("Mã sản phẩm(ITMxxxx, ví dụ ITM1001): ");
            itemId = input.nextLine();
            if (checkItemId(itemId)) {
                break;
            } else {
                System.err.println("==> Mã sản phẩm không hợp lệ.");
            }
        }
        int index = findItemById(items, itemId);
        if (index != -1) { // nếu id của item đã tồn tại
            System.out.println("Sản phẩm này đã tồn tại. Nhập số lượng cần thêm: ");
            items[index].setInventoryQuantity(
                    Integer.parseInt(input.nextLine()) + items[index].getInventoryQuantity()
            );
            return null;
        }
        // nếu sản phẩm mới, nhập các thông tin của sản phẩm:
        System.out.print("Tên sản phẩm: ");
        String itemName = input.nextLine();
        System.out.print("Nhà sản xuất: ");
        String manufacturer = input.nextLine();
        System.out.print("Giá bán: ");
        float price = Float.parseFloat(input.nextLine());

        System.out.println("Ngày sản xuất(dd/MM/yyyy - ví dụ: 01/01/2024): ");
        String productionDate = input.nextLine();
        System.out.println("Ngày hết hạn(dd/MM/yyyy - ví dụ: 01/01/2029): ");
        String expirationDate = input.nextLine();
        // nếu ngày nhập vào không đúng định dạng thì lấy ngày mặc định
        if (!validateDate(productionDate)) {
            productionDate = "01/01/2024";
        }
        if (!validateDate(expirationDate)) {
            expirationDate = "01/06/2024";
        }

        System.out.println("Số lượng sản phẩm(n > 0): ");
        int value = Integer.parseInt(input.nextLine());
        int itemQuantity = Math.max(value, 0);

        int soldItemQuantity;
        System.out.println("Số lượng đã bán(x >= 0 và x <= n): ");
        value = Integer.parseInt(input.nextLine());
        soldItemQuantity = value >= 0 && value <= itemQuantity ? value : 0;

        return new Item(itemId, itemName, manufacturer, price,
                productionDate, expirationDate, itemQuantity, soldItemQuantity);
    }

    private static boolean validateDate(String dateStr) {
        var elements = dateStr.split("/");
        if (elements.length != 3) {
            return false;
        }
        int day = Integer.parseInt(elements[0]);
        int month = Integer.parseInt(elements[1]);
        int year = Integer.parseInt(elements[2]);
        if (day < 1 || day > 31) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        } else {
            if (month == 2 && day > 29) {
                return false;
            }
            if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                return false;
            }
        }
        return year >= 1900 && year <= 9999;
    }

    private static boolean checkItemId(String id) {
        return id.toUpperCase().startsWith("ITM") && id.length() == 7;
    }

    private static int findItemById(Item[] items, String id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                break; // nếu không tìm thấy =>
            }
            if (items[i].getId().compareToIgnoreCase(id) == 0) {
                return i;
            }
        }
        return -1; // trả về chỉ số không hợp lệ
    }

    private static void deleteItemById(Item[] items, Scanner input) {
        System.out.print("Mã sản phẩm cần xoá: ");
        String itemId = input.nextLine();
        int index = findItemById(items, itemId);
        if (index != -1) {
            for (int i = index; i < items.length - 1; i++) {
                if (items[i] != null) {
                    items[i] = items[i + 1];
                }
            }
            items[items.length - 1] = null;
            System.out.println(STR."==> Xoá sản phẩm mã \{itemId} thành công! <==");
        } else {
            System.err.println(STR."==> Không tồn tại sản phẩm mã \{itemId}! <==");
        }
    }

    private static void updateItemPrice(Item[] items, Scanner input) {
        System.out.print("Mã sản phẩm cần cập nhật: ");
        String itemId = input.nextLine();
        int index = findItemById(items, itemId);
        if (index != -1) {
            System.out.print("Giá mới: ");
            var newPrice = Float.parseFloat(input.nextLine());
            if (newPrice > 0.0d) {
                items[index].setPrice(newPrice);
                System.out.println("==> Cập nhật giá bán cho sản phẩm thành công! <==");
            } else {
                System.err.println("==> Cập nhật giá thất bại! Giá sản phẩm phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tồn tại sản phẩm nào có mã \{itemId}! <==");
        }
    }

    private static void updateItemDate(Item[] items, Scanner input) {
        System.out.print("Mã sản phẩm cần cập nhật: ");
        String itemId = input.nextLine();
        int index = findItemById(items, itemId);
        if (index != -1) {
            System.out.print("Ngày sản xuất(dd/MM/yyyy, ví dụ: 02/12/2023): ");
            var newProductionDate = input.nextLine();
            System.out.print("Hạn sử dụng(dd/MM/yyyy, ví dụ: 06/12/2025): ");
            var newExpirationDate = input.nextLine();
            // kiểm tra tính hợp lệ của ngày sản xuất và ngày hết hạn
            if (validateDate(newProductionDate)) { // nếu ngày hợp lệ
                items[index].setProductionDate(newProductionDate); // sử dụng
            } else { // ngày không hợp lệ => lấy ngày mặc định
                items[index].setProductionDate("01/01/2024");
            }
            if (validateDate(newProductionDate)) {
                items[index].setExpirationDate(newExpirationDate);
            } else {
                items[index].setExpirationDate("01/06/2024");
            }
            System.out.println("==> Cập nhật ngày sản xuất và hạn sử dụng thành công <==");
        } else {
            System.err.println(STR."==> Không tồn tại sản phẩm nào có mã \{itemId}! <==");
        }
    }

    private static void updateItemQuantity(Item[] items, Scanner input) {
        System.out.println("Mã sản phẩm cần cập nhật: ");
        String itemId = input.nextLine();
        int index = findItemById(items, itemId);
        if (index != -1) {
            System.out.println("Nhập số lượng hàng tồn kho hiện tại: ");
            int newQuantity = Integer.parseInt(input.nextLine());
            if (newQuantity > 0) {
                items[index].setInventoryQuantity(newQuantity);
                System.out.println("==> Cập nhật số lượng hàng tồn thành công! <==");
            } else {
                System.err.println("==> Cập nhật số lượng thất bại! Số lượng hàng tồn phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tồn tại sản phẩm nào có mã \{itemId}! <==");
        }
    }

    private static float calculateTotalItemPrice(Item[] items) {
        float totalMoney = 0.0f;
        for (Item item : items) {
            if (item == null) {
                break;
            }
            totalMoney += item.getPrice() * item.getInventoryQuantity();
        }
        return totalMoney;
    }

    private static void displayAllItems(Item[] items) {
        var line = "=============================================";
        System.out.println(STR."\{line} DANH SÁCH SẢN PHẨM \{line}");
        System.out.printf("%-10s%-25s%-20s%-15s%-12s%-12s%-10s%-10s\n",
                "Mã SP", "Tên SP", "Nhà SX", "Giá", "Ngày SX", "Hạn SD", "SL tồn", "SL bán");
        for (Item item : items) {
            if (item == null) {
                break;
            }
            System.out.printf("%-10s%-25s%-20s%-15s%-12s%-12s%-10s%-10s\n",
                    item.getId(), item.getName(), item.getManufacturer(),
                    decimalFormat.format(item.getPrice()), item.getProductionDate(),
                    item.getExpirationDate(), item.getInventoryQuantity(),
                    item.getSoldQuantity());
        }
    }

    private static void showRevenue(Item[] items) {
        var line = "========================================";
        System.out.println(STR."\{line} DANH SÁCH SẢN PHẨM \{line}");
        System.out.printf("%-10s%-25s%-20s%-15s%-10s%-10s%-15s\n",
                "Mã SP", "Tên SP", "Nhà SX", "Giá", "SL tồn", "SL bán", "Thành tiền");
        for (Item item : items) {
            if (item == null) {
                break;
            }
            var revenue = item.getSoldQuantity() * item.getPrice();
            System.out.printf("%-10s%-25s%-20s%-15s%-10s%-10s%-15s\n",
                    item.getId(), item.getName(), item.getManufacturer(),
                    decimalFormat.format(item.getPrice()), item.getInventoryQuantity(),
                    item.getSoldQuantity(), decimalFormat.format(revenue));
        }
    }

    private static void sortItemsByPriceDESC(Item[] items, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (items[j - 1].getPrice() < items[j].getPrice()) {
                    var temp = items[j];
                    items[j] = items[j - 1];
                    items[j - 1] = temp;
                }
            }
        }
    }

    private static void sortItemsByPriceASC(Item[] items, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (items[j - 1].getPrice() > items[j].getPrice()) {
                    var temp = items[j];
                    items[j] = items[j - 1];
                    items[j - 1] = temp;
                }
            }
        }
    }

    private static void sellItem(Scanner input, Item[] items) {
        System.out.println("Mã sản phẩm cần bán: ");
        String itemId = input.nextLine();
        int index = findItemById(items, itemId);
        if (index != -1) {
            Item soldItem = items[index];
            System.out.println(STR."Bạn chỉ có thể bán tối đa: \{soldItem.getInventoryQuantity()} sản phẩm");
            System.out.println("Số lượng muốn bán: ");
            int soldAmount = Integer.parseInt(input.nextLine());
            if (soldAmount >= 1 && soldAmount <= soldItem.getInventoryQuantity()) {
                soldItem.setSoldQuantity(soldItem.getSoldQuantity() + soldAmount);
                soldItem.setInventoryQuantity(soldItem.getInventoryQuantity() - soldAmount);
                System.out.println("==> Bán sản phẩm thành công <==");
            } else {
                System.err.println("==> Bán sản phẩm thất bại! Số lượng không hợp lệ <==");
            }
        } else {
            System.err.println(STR."==> Không tồn tại sản phẩm nào có mã \{itemId}! <==");
        }
    }

    private static void statRevenue(Item[] items) {
        var totalRevenue = 0.0f;
        var totalSoldItem = 0;
        var totalRemain = 0;
        var soldItems = new Item[100];
        var itemCount = 0;
        for (Item item : items) {
            if (item == null) {
                break;
            }
            if (item.getSoldQuantity() > 0) {
                soldItems[itemCount++] = item;
            }
            var revenue = item.getPrice() * item.getSoldQuantity();
            totalRevenue += revenue;
            totalRemain += item.getInventoryQuantity();
            totalSoldItem += item.getSoldQuantity();
        }
        System.out.println("==> Thông tin doanh thu các mặt hàng đã bán <==");
        showRevenue(soldItems);
        System.out.println("===================================");
        System.out.println(STR."Tổng số hàng tồn: \{decimalFormat.format(totalRemain)} sản phẩm.");
        System.out.println(STR."Tổng số hàng đã bán: \{decimalFormat.format(totalSoldItem)} sản phẩm.");
        System.out.println(STR."Tổng doanh thu: \{decimalFormat.format(totalRevenue)}đ.");
    }

    private static Item[] findAllSoldItems(Item[] items) {
        var soldItems = new Item[items.length];
        int soldItemCount = 0;
        for (var item : items) {
            if (item == null) {
                break;
            }
            if (item.getSoldQuantity() > 0) {
                soldItems[soldItemCount++] = item;
            }
        }
        if (soldItemCount > 0) { // nếu có kết quả -> trả về danh sách mặt hàng đã bán
            return soldItems;
        }
        return null; // nếu ko có kết quả thì trả về null
    }

    private static Item[] findMostSoldItems(Item[] items) {
        int maxSoldAmount = findMaxItemSoldQuantity(items);
        var maxSoldItems = new Item[items.length];
        int soldItemCount = 0;
        for (var item : items) {
            if (item != null && item.getSoldQuantity() == maxSoldAmount) {
                maxSoldItems[soldItemCount++] = item;
            }
        }
        if (soldItemCount > 0) {
            return maxSoldItems;
        }
        return null;
    }

    private static int findMaxItemSoldQuantity(Item[] items) {
        int max = Integer.MIN_VALUE;
        for (Item item : items) {
            if (item != null && item.getSoldQuantity() > max) {
                max = item.getSoldQuantity();
            }
        }
        return max;
    }


    private static Item[] findAllNotSoldItems(Item[] items) {
        var results = new Item[items.length];
        int soldItemCount = 0;
        for (Item item : items) {
            if (item != null && item.getSoldQuantity() == 0) {
                results[soldItemCount++] = item;
            }
        }
        if (soldItemCount > 0) {
            return results;
        }
        return null;
    }

    private static Item[] findAllItemsExpired(Item[] items) {
        String currentDate;
        do {
            System.out.println("Ngày hiện tại(dd/MM/yyyy, ví dụ 01/05/2029): ");
            currentDate = new Scanner(System.in).nextLine();
        } while (!validateDate(currentDate));

        Item[] expiredItems = new Item[items.length];
        int expiredItemCount = 0;

        for (Item item : items) {
            if (item != null && isExpired(currentDate, item.getExpirationDate())) {
                expiredItems[expiredItemCount++] = item;
            }
        }
        if (expiredItemCount > 0) {
            return expiredItems;
        }
        return null;
    }

    private static boolean isExpired(String now, String expiredDate) {
        var elements1 = expiredDate.split("/");
        var elements2 = now.split("/");
        int expiredDay = Integer.parseInt(elements1[0]);
        int expiredMonth = Integer.parseInt(elements1[1]);
        int expiredYear = Integer.parseInt(elements1[2]);
        int currentDay = Integer.parseInt(elements2[0]);
        int currentMonth = Integer.parseInt(elements2[1]);
        int currentYear = Integer.parseInt(elements2[2]);
        if (currentYear > expiredYear) {
            return true;
        } else if (currentYear == expiredYear && currentMonth > expiredMonth) {
            return true;
        } else return currentYear == expiredYear && currentMonth == expiredMonth && currentDay > expiredDay;
    }

    private static Item[] findAllItemsExpiredSoon(Item[] items) {
        String currentDate;
        do {
            System.out.println("Ngày hiện tại(dd/MM/yyyy, ví dụ 01/02/2024): ");
            currentDate = new Scanner(System.in).nextLine();
        } while (!validateDate(currentDate));

        Item[] expiredItems = new Item[items.length];
        int expiredItemCount = 0;

        for (Item item : items) {
            if (item != null && isExpiredSoon(item.getExpirationDate(), currentDate)) {
                expiredItems[expiredItemCount++] = item;
            }
        }

        if (expiredItemCount > 0) {
            return expiredItems;
        }

        return null;
    }

    private static boolean isExpiredSoon(String expirationDate, String currentDate) {
        var currentElements = currentDate.split("/");
        int cD = Integer.parseInt(currentElements[0]);
        int cM = Integer.parseInt(currentElements[1]);
        int cY = Integer.parseInt(currentElements[2]);

        var expiredElements = expirationDate.split("/");
        int eD = Integer.parseInt(expiredElements[0]);
        int eM = Integer.parseInt(expiredElements[1]);
        int eY = Integer.parseInt(expiredElements[2]);

        return cM == eM && cY == eY && eD - cD <= 3 && eD - cD >= 0;
    }
}
