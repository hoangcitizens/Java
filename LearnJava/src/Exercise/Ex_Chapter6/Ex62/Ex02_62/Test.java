package Exercise.Ex_Chapter6.Ex62.Ex02_62;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // todo 3: khởi tạo mảng và khởi tạo các địa chỉ với số lượng địa chỉ cố định
        Address[] addresses = new Address[100];
        int addressCount = createFakeAddress(addresses);

        // todo 4: triển khai menu chứa các chức năng, gọi ý: sử dụng do-while
        int choice;
        do {
            displayMenu();
            // todo 6: đọc vào lựa chọn của người dùng
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                // todo 7: viết code xử lý chức năng số 1
                case 1 -> {
                    if (addressCount < addresses.length) {
                        Address address = createAddress(input);
                        if (address == null) {
                            System.out.println("==> Mã địa chỉ không đúng. Mã địa chỉ có dạng ADDxxxx.");
                        } else if (findAddressById(addresses, address.id) >= 0) {
                            System.out.println("==> Mã địa chỉ này đã tồn tại.");
                        } else {
                            addresses[addressCount++] = address;
                        }
                    } else {
                        System.out.println(STR."==> Số lượng địa chỉ vượt quá \{addresses.length}.");
                    }
                }
                // todo 10: viết code xử lý chức năng số 2
                case 2 -> {
                    if (addressCount > 0) {
                        if (deleteAddressById(addresses, input)) {
                            addressCount--;
                            System.out.println("==> Xóa địa chỉ thành công.");
                        } else {
                            System.out.println("==> Xóa địa chỉ thất bại. Mã địa chỉ không tồn tại.");
                        }
                    } else {
                        System.out.println("==> Danh sách địa chỉ rỗng.");
                    }
                }
                // todo 12: viết code xử lý chức năng số 3
                case 3 -> {
                    if (addressCount > 0) {
                        if (updateAddressInfoById(addresses, input)) {
                            System.out.println("==> Cập nhật địa chỉ thành công.");
                        } else {
                            System.out.println("==> Cập nhật địa chỉ thất bại. Địa chỉ không tồn tại.");
                        }
                    } else {
                        System.out.println("==> Danh sách địa chỉ rỗng.");
                    }
                }
                // todo 14: viết code xử lý chức năng số 4
                case 4 -> {
                    if (addressCount > 0) {
                        findAddressByName(addresses, input);
                    } else {
                        System.out.println("==> Danh sách địa chỉ rỗng.");
                    }
                }
                // todo 16: viết code xử lý chức năng số 5
                case 5 -> {
                    if (addressCount > 0) {
                        displayAllAddresses(addresses);
                    } else {
                        System.out.println("==> Danh sách địa chỉ rỗng.");
                    }
                }
                // todo 18: viết code xử lý chức năng số 6
                case 6 -> System.out.println("==> Kết thúc chương trình.");
                // todo 19: viết code xử lý chức năng không tồn tại
                default -> System.out.println("==> Sai chức năng, vui lòng nhập từ 1 -> 6.");
            }
        } while (choice != 6);
    }

    private static int createFakeAddress(Address[] addresses) {
        int counter = 0;
        addresses[counter++] = new Address("ADD1001", "37", "273", "-", "Cổ Nhuế", "Cổ Nhuế 2", "Bắc Từ Liêm", "Hà Nội");
        addresses[counter++] = new Address("ADD1002", "6", "38", "Xuân Phương", "Tu Hoàng", "Phương Canh", "Nam Từ Liêm", "Hà Nội");
        addresses[counter++] = new Address("ADD1003", "88", "24", "Nguyễn Văn Trỗi", "Tổ 3", "Ao Sen", "Hà Đông", "Hà Nội");
        addresses[counter++] = new Address("ADD1004", "54", "5", "-", "Trúc Bạch", "Trúc Bạch", "Ba Đình", "Hà Nội");
        addresses[counter++] = new Address("ADD1005", "9", "31", "Mạc Thái Tổ", "-", "Yên Hòa", "Cầu Giấy", "Hà Nội");
        addresses[counter++] = new Address("ADD1006", "82", "-", "Hàng Gai", "Hàng Gai", "Hàng Gai", "Hoàn Kiếm", "Hà Nội");
        return counter;
    }

    // todo 5: triển khai phương thức hiện thị giao diện menu
    private static void displayMenu() {
        System.out.println("========== CHƯƠNG TRÌNH QUẢN LÝ ĐỊA CHỈ ==========");
        System.out.println("1. Thêm mới một địa chỉ.");
        System.out.println("2. Xóa bỏ một địa chỉ theo mã địa chỉ.");
        System.out.println("3. Sửa thông tin số nhà, ngõ, tên đường, tên xóm.");
        System.out.println("4. Tìm địa chỉ theo số nhà, hiển kết quả tìm kiếm.");
        System.out.println("5. Hiển thị danh sách địa chỉ dưới dạng bảng.");
        System.out.println("6. Kết thúc chương trình.");
    }

    // todo 8: triển khai phương thức tạo mới một địa chỉ
    private static Address createAddress(Scanner input) {
        System.out.print("Mã địa chỉ (ADDxxxx): ");
        var id = input.nextLine().trim().toUpperCase();
        if (id.startsWith("ADD") && id.length() == 7) {
            System.out.print("Số nhà: ");
            String number = input.nextLine();
            System.out.print("Ngõ: ");
            String lane = input.nextLine();
            System.out.print("Tên đừờng: ");
            String road = input.nextLine();
            System.out.print("Tên xóm(tổ dân phố): ");
            String village = input.nextLine();
            System.out.print("Phường/Xã: ");
            String wards = input.nextLine();
            System.out.print("Quận/Huyện: ");
            String district = input.nextLine();
            System.out.print("Thành phố: ");
            String city = input.nextLine();
            return new Address(id, number, lane, road, village, wards, district, city);
        }
        return null;
    }

    // todo 11: triển khai phương thức xóa một địa chỉ theo mã địa chỉ
    private static boolean deleteAddressById(Address[] addresses, Scanner input) {
        System.out.println("Mã địa chỉ muốn xóa: ");
        String id = input.nextLine();
        int index = findAddressById(addresses, id);
        if (index != -1) {
            for (int i = index; i < addresses.length - 1; i++) {
                addresses[i] = addresses[i + 1];
            }
        }
        return index != -1;
    }

    // todo 9: triển khai code kiểm tra xem mã địa chỉ cho trước đã tồn tại trong danh sách
    //  địa chỉ hay chưa
    private static int findAddressById(Address[] addresses, String id) {
        for (int i = 0; i < addresses.length; i++) {
            if (addresses[i] == null) {
                break;
            }
            if (addresses[i].id.compareToIgnoreCase(id) == 0) {
                return i;
            }
        }
        return -1;
    }

    // todo 13: triển khai phương thức cập nhật thông tin (số nhà, ngõ, tên đường, tên xóm theo mã địa chỉ
    private static boolean updateAddressInfoById(Address[] addresses, Scanner input) {
        System.out.print("Mã địa chỉ muốn cập nhật: ");
        String id = input.nextLine();
        int index = findAddressById(addresses, id);
        if (index != -1) {
            System.out.print("Số nhà: ");
            addresses[index].number = input.nextLine();
            System.out.print("Tên ngõ: ");
            addresses[index].lane = input.nextLine();
            System.out.print("Tên đường: ");
            addresses[index].road = input.nextLine();
            System.out.print("Tên xóm: ");
            addresses[index].village = input.nextLine();
        }
        return index != -1;
    }

    // todo 15: triển khai phương thức tìm địa chỉ theo số nhà
    private static void findAddressByName(Address[] addresses, Scanner input) {
        var founded = false;
        System.out.println("Số nhà muốn tìm kiếm: ");
        String number = input.nextLine();
        for (Address address : addresses) {
            if (address.number.toLowerCase().contains(number.toLowerCase())) {
                founded = true;
                break;
            }
        }
        if (founded) {
            var line = "===================================================";
            System.out.println(STR."\{line} KẾT QUẢ TÌM KIẾM \{line}");
            System.out.printf("%-10s%-10s%-15s%-20s%-20s%-20s%-20s%-20s\n",
                    "Mã ĐC", "Số nhà", "Ngõ", "Đường", "Xóm", "Phường/Xã",
                    "Quận/Huyện", "Thành phố");
            for (Address address : addresses) {
                if (address == null) {
                    break;
                }
                if (address.number.toLowerCase().contains(number.toLowerCase())) {
                    displayAddress(address);
                }
            }
        } else {
            System.out.println(STR."==> Không tìm thấy địa chỉ nào với số nhà \{number}.");
        }
    }

    // todo 17: triển khai phương thức liệt kê danh sách toàn bộ các địa chỉ
    private static void displayAllAddresses(Address[] addresses) {
        var line = "===================================================";
        System.out.println(STR."\{line} DANH SÁCH CÁC ĐỊA CHỈ \{line}");
        System.out.printf("%-10s%-10s%-15s%-20s%-20s%-20s%-20s%-20s\n",
                "Mã ĐC", "Số nhà", "Ngõ", "Đường", "Xóm", "Phường/Xã",
                "Quận/Huyện", "Thành phố");
        for (Address address : addresses) {
            if (address == null) {
                break;
            }
            displayAddress(address);
        }
    }

    private static void displayAddress(Address address) {
        System.out.printf("%-10s%-10s%-15s%-20s%-20s%-20s%-20s%-20s\n", address.id,
                address.number, address.lane, address.road, address.village,
                address.wards, address.district, address.city);
    }
}
