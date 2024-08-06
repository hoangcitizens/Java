package Exercise.Ex_Chapter6.Ex64.Ex02_64;

/*
    Bài 2. Thông tin về địa chỉ bao gồm: mã địa chỉ có dạng ADDxxxx(ví dụ ADD0001), số nhà, ngõ, tên đường, tên xóm,
    tên xã/phường, quận(huyện)/thị trấn, tỉnh/thành phố. Trong đó tỉnh/thành phố là một enum bao gồm 63 tỉnh thành của
    Việt Nam. Thiết kế lớp mô tả đối tượng địa chỉ như trên. Bổ sung các constructor phù hợp có thể tái sử dụng một cách
    hợp lý, sử dụng tính đóng gói dữ liệu và tự bổ sung các phương thức phụ trợ cần thiết. Yêu cầu constructor ít tham
    số gọi tới constructor nhiều tham số khi tái sử dụng. Tạo chương trình có menu cho phép thực hiện các chức năng sau:
        1. Thêm mới một địa chỉ vào mảng các địa chỉ. Mỗi địa chỉ xuất hiện không quá 1 lần trong danh sách này.
        2. Xóa bỏ một địa chỉ theo mã.
        3. Sửa thông tin số nhà, ngõ, tên đường, tên xóm theo mã địa chỉ.
        4. Tìm địa chỉ theo số nhà, hiện kết quả tìm kiếm.
        5. Hiển thị danh sách địa chỉ dưới dạng bảng.
        6. Hiển thị danh sách địa chỉ gom nhóm theo từng tỉnh/thành phố.
        7. Kết thúc chương trình.
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Address[] addresses = new Address[100];
        int addressCount = createFakeAddress(addresses);

        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    if (addressCount < addresses.length) {
                        Address address = createAddress(input);
                        if (address == null) {
                            System.out.println("==> Mã địa chỉ không đúng. Mã địa chỉ có dạng ADDxxxx.");
                        } else if (findAddressById(addresses, address.getId()) >= 0) {
                            System.out.println("==> Mã địa chỉ này đã tồn tại.");
                        } else {
                            addresses[addressCount++] = address;
                        }
                    } else {
                        System.out.println(STR."==> Số lượng địa chỉ vượt quá \{addresses.length}.");
                    }
                }
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
                case 4 -> {
                    if (addressCount > 0) {
                        findAddressByName(addresses, input);
                    } else {
                        System.out.println("==> Danh sách địa chỉ rỗng.");
                    }
                }
                case 5 -> {
                    if (addressCount > 0) {
                        displayAllAddresses(addresses);
                    } else {
                        System.out.println("==> Danh sách địa chỉ rỗng.");
                    }
                }
                case 6 -> System.out.println("==> Kết thúc chương trình.");
                default -> System.out.println("==> Sai chức năng, vui lòng nhập từ 1 -> 6.");
            }
        } while (choice != 6);
    }

    private static int createFakeAddress(Address[] addresses) {
        int counter = 0;
        addresses[counter++] = new Address("ADD1001", "37", "273", "-", "Cổ Nhuế", "Cổ Nhuế 2", "Bắc Từ Liêm", City.HA_NOI);
        addresses[counter++] = new Address("ADD1002", "6", "38", "Xuân Phương", "Tu Hoàng", "Phương Canh", "Nam Từ Liêm", City.HA_NOI);
        addresses[counter++] = new Address("ADD1003", "88", "24", "Nguyễn Văn Trỗi", "Tổ 3", "Ao Sen", "Hà Đông", City.HA_NOI);
        addresses[counter++] = new Address("ADD1004", "54", "5", "-", "Trúc Bạch", "Trúc Bạch", "Ba Đình", City.HA_NOI);
        addresses[counter++] = new Address("ADD1005", "9", "31", "Mạc Thái Tổ", "-", "Yên Hòa", "Cầu Giấy", City.HA_NOI);
        addresses[counter++] = new Address("ADD1006", "82", "-", "Hàng Gai", "Hàng Gai", "Hàng Gai", "Hoàn Kiếm", City.HA_NOI);
        return counter;
    }

    private static void displayMenu() {
        System.out.println("========== CHƯƠNG TRÌNH QUẢN LÝ ĐỊA CHỈ ==========");
        System.out.println("1. Thêm mới một địa chỉ.");
        System.out.println("2. Xóa bỏ một địa chỉ theo mã địa chỉ.");
        System.out.println("3. Sửa thông tin số nhà, ngõ, tên đường, tên xóm.");
        System.out.println("4. Tìm địa chỉ theo số nhà, hiển kết quả tìm kiếm.");
        System.out.println("5. Hiển thị danh sách địa chỉ dưới dạng bảng.");
        System.out.println("6. Kết thúc chương trình.");
    }

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
            System.out.print("Tỉnh/Thành phố(vd Hà Nội ghi là HA_NOI): ");
            // todo 4: lấy hằng số enum trong City
            String city = input.nextLine();
            return new Address(id, number, lane, road, village, wards, district, City.valueOf(city));
        }
        return null;
    }

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

    private static int findAddressById(Address[] addresses, String id) {
        for (int i = 0; i < addresses.length; i++) {
            if (addresses[i] == null) {
                break;
            }
            if (addresses[i].getId().compareToIgnoreCase(id) == 0) {
                return i;
            }
        }
        return -1;
    }

    private static boolean updateAddressInfoById(Address[] addresses, Scanner input) {
        System.out.print("Mã địa chỉ muốn cập nhật: ");
        String id = input.nextLine();
        int index = findAddressById(addresses, id);
        if (index != -1) {
            System.out.print("Số nhà: ");
            addresses[index].setNumber(input.nextLine());
            System.out.print("Tên ngõ: ");
            addresses[index].setLane(input.nextLine());
            System.out.print("Tên đường: ");
            addresses[index].setRoad(input.nextLine());
            System.out.print("Tên xóm: ");
            addresses[index].setVillage(input.nextLine());
        }
        return index != -1;
    }

    private static void findAddressByName(Address[] addresses, Scanner input) {
        var founded = false;
        System.out.println("Số nhà muốn tìm kiếm: ");
        String number = input.nextLine();
        for (Address address : addresses) {
            if (address.getNumber().toLowerCase().contains(number.toLowerCase())) {
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
                if (address.getNumber().toLowerCase().contains(number.toLowerCase())) {
                    displayAddress(address);
                }
            }
        } else {
            System.out.println(STR."==> Không tìm thấy địa chỉ nào với số nhà \{number}.");
        }
    }

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
        System.out.printf("%-10s%-10s%-15s%-20s%-20s%-20s%-20s%-20s\n",
                address.getId(), address.getNumber(), address.getLane(),
                address.getRoad(), address.getVillage(), address.getWards(),
                address.getDistrict(), address.getCity());
    }
}
