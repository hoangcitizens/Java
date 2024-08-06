package Exercise.Ex_Chapter6.Ex62.Ex05_62;

import java.util.Scanner;
import static java.lang.StringTemplate.STR;

public class Test {
    public static void main(String[] args) {
        // todo 3: tạo đối tượng đọc dữ liệu vào từ bàn phím
        Scanner input = new Scanner(System.in);

        // todo 4: tạo mảng chứa các bài viết với số lượng > 0
        Post[] posts = new Post[100];
        var postCount = createFakePosts(posts);

        // todo 5: triển khai menu thực hiện các chức năng, sử dụng vòng lặp do while
        int choice;
        do {
            displayMenu();
            // todo 7: đọc vào lựa chọn của người dùng
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                // todo 8: viết code xử lý cho chức năng số 1
                case 1:
                    if (postCount <= 100) {
                        Post post = createPost(posts, input);
                        posts[postCount++] = post;
                        System.out.println("==> Thêm bài viết thành công <==");
                    } else {
                        System.err.println("==> Số lượng bài viết vượt quá 100, không thể thêm! <==");
                    }
                    break;
                // todo 12: viết code xử lý cho chức năng số 2
                case 2:
                    if (postCount > 0) {
                        updateTitleByPostId(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                // todo 15: viết code xử lý cho chức năng số 3
                case 3:
                    if (postCount > 0) {
                        if (deletePostById(posts, input)) {
                            postCount--;
                        }
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                // todo 17: viết code xử lý cho chức năng số 4
                case 4:
                    if (postCount > 0) {
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                // todo 19: viết code xử lý cho chức năng số 5
                case 5:
                    if (postCount > 0) {
                        findPostsByTitle(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                // todo 21: viết code xử lý cho chức năng số 6
                case 6:
                    if (postCount > 0) {
                        sortOldestToNewest(posts, postCount);
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                // todo 24: viết code xử lý cho chức năng số 7
                case 7:
                    if (postCount > 0) {
                        findAllNewestPosts(posts, postCount);
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                // todo 26: viết code xử lý cho chức năng số 8
                case 8:
                    System.out.println("==> Cảm ơn bạn đã sử dụng dịch vụ! <==");
                    break;
                // todo 27: viết code xử lý cho chức năng không hợp lệ
                default:
                    System.err.println("==> Sai chức năng, vui lòng nhập từ 1 -> 8 <==");
            }
        } while (choice != 8);
    }

    private static int createFakePosts(Post[] posts) {
        int postCount = 0;
        posts[postCount++] = new Post("P1001", "ChatGPT đang hot", "Xuất hiện cuối năm 2022...", "Denny Nguyễn", "12/12/2023", "Công nghệ");
        posts[postCount++] = new Post("P1002", "Java là ngôn ngữ...", "Ra đời năm 1995...", "Denny Nguyễn", "20/02/2024", "Công nghệ");
        posts[postCount++] = new Post("P1003", "AI và Data đang...", "Các công việc liên quan...", "Denny Nguyễn", "19/02/2023", "Công nghệ");
        posts[postCount++] = new Post("P1004", "Lập trình game...", "Liệu có dễ kiếm tiền...", "Denny Nguyễn", "10/10/2023", "Công nghệ");
        posts[postCount++] = new Post("P1005", "MS sa thải hàng nghìn...", "Đầu năm 2024...", "Denny Nguyễn", "19/01/2024", "Công nghệ");
        posts[postCount++] = new Post("P1006", "Nhân sự IT ít việc làm...", "Kinh tế suy thoái ảm đạm...", "Denny Nguyễn", "09/03/2024", "Công nghệ");
        return postCount;
    }

    // todo 6: triển khai phương thức hiển thị menu các lựa chọn
    private static void displayMenu() {
        System.out.println("================ CÁC LỰA CHỌN ================");
        System.out.println("1. Thêm bài viết mới.");
        System.out.println("2. Sửa tiêu đề bài viết.");
        System.out.println("3. Xoá bài viết.");
        System.out.println("4. Hiển thị danh sách bài viết.");
        System.out.println("5. Tìm kiếm bài viết.");
        System.out.println("6. Sắp xếp danh sách bài viết từ cũ đến mới.");
        System.out.println("7. Sắp xếp danh sách bài viết từ mới đến cũ.");
        System.out.println("8. Kết thúc chương trình.");
        System.out.println("==> Lựa chọn của bạn: ");
    }

    // todo 9: triển khai phương thức thêm mới mọt bài viết
    private static Post createPost(Post[] posts, Scanner input) {
        String id;
        do {
            System.out.println("Mã bài viết(Pxxxx - ví dụ: P1003): ");
            id = checkValidId(posts, input.nextLine().trim().toUpperCase());
        } while (id == null);
        System.out.print("Tiêu đề: ");
        String title = input.nextLine();
        System.out.print("Nội dung: ");
        String content = input.nextLine();
        System.out.print("Tác giả: ");
        String author = input.nextLine();
        System.out.println("Ngày phát hành(dd/MM/yyyy - ví dụ: 01/01/2025): ");
        String publishDate = input.nextLine();
        if (!validateDate(publishDate)) { // nếu ngày xuất bản không hợp lệ
            publishDate = "01/01/2020"; // lấy ngày mặc định
        }
        System.out.print("Thể loại: ");
        String category = input.nextLine();
        return new Post(id, title, content, author, publishDate, category);
    }

    // todo 11: triển khai code kiểm tra tính hợp lệ của ngày đăng bài viết(ngày xuất bản).
    //  ngày hợp lệ phải có định dạng dd/MM/yyyy ví dụ 01/04/2000
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

    // todo 10: kiểm tra id có đúng định dạng không và đã tồn tại chưa. Nếu sai và đã tồn tại -> return null
    private static String checkValidId(Post[] posts, String id) {
        if (!id.startsWith("P") && id.length() != 5) {
            System.err.println("==> Mã bài viết bắt đầu với P sau đó là 4 số. Ví dụ P1001. <==");
            return null;
        }
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] == null) {
                break;
            }
            if (posts[i].id.compareToIgnoreCase(id) == 0) {
                System.err.println("==> Mã bài viết đã tồn tại. Vui lòng nhập mã khác! <==");
                return null;
            }
        }
        return id;
    }

    // todo 13: triển khai phương thức cập nhật bài viết theo mã bài viết
    private static void updateTitleByPostId(Post[] posts, Scanner input) {
        System.out.println("Mã bài viết cần sửa: ");
        String postId = input.nextLine().trim().toUpperCase();
        int indexByPost = findIndexByPostId(posts, postId);
        if (indexByPost != -1) {
            System.out.println("Tiêu đề mới: ");
            posts[indexByPost].title = input.nextLine();
            System.out.println(STR."==> Cập nhật tiêu đề cho bài viết mã \{postId} thành công! <==");
        } else {
            System.err.println("==> Bài viết không tồn tại! <==");
        }
    }

    // todo 16: triển khai phương thức xoá một bài viết theo mã bài viết
    private static boolean deletePostById(Post[] posts, Scanner input) {
        System.out.println("Mã bài viết cần xoá: ");
        String postId = input.nextLine().trim().toUpperCase();
        int indexByPost = findIndexByPostId(posts, postId);
        if (indexByPost != -1) {
            for (int i = indexByPost; i < posts.length - 1; i++) {
                if (posts[i] != null) {
                    posts[i] = posts[i + 1];
                }
            }
            posts[posts.length - 1] = null;
            System.out.println(STR."==> Xoá bài viết mã \{postId} thành công! <==");
        } else {
            System.err.println("==> Bài viết không tồn tại! <==");
        }
        return indexByPost != -1;
    }

    // todo 14: triển khai code thực hiện chức năng tìm và trả về chỉ số của bài viết theo mã bài viết
    private static int findIndexByPostId(Post[] posts, String postId) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null && posts[i].id.equals(postId)) {
                return i;
            }
        }
        return -1;
    }

    // todo 18: triển khai phương thức hiển thị danh sách các bài viết dưới dạng bảng
    private static void displayAllPosts(Post[] posts) {
        var line = "=============================================";
        System.out.println(STR."\{line} DANH SÁCH BÀI VIẾT \{line}");
        System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n",
                "Mã BV", "Tiêu đề", "Nội dung", "Tác giả", "Ngày XB", "Thể loại");
        for (Post post : posts) {
            if (post == null) {
                break;
            }
            System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n", post.id, post.title,
                    post.content, post.author, post.publishDate, post.category);
        }
    }

    // todo 20: triển khai phương thức tìm kiếm các bài viết theo tiêu đề
    private static void findPostsByTitle(Post[] posts, Scanner input) {
        System.out.println("Tiêu đề bài viết cần tìm: ");
        String title = input.nextLine();
        Post[] results = new Post[posts.length];
        int count = 0;
        for (Post post : posts) {
            if (post != null && post.title.toLowerCase().contains(title.toLowerCase())) {
                results[count++] = post;
            }
        }
        if (results.length != 0) {
            displayAllPosts(results);
        } else {
            System.err.println("==> Không có kết quả tìm kiếm <==");
        }
    }

    // todo 22: triển khai phương thức sắp xếp các bài viết theo thứ tự từ cũ nhất -> mới nhất
    private static void sortOldestToNewest(Post[] posts, int postCount) {
        for (int i = 0; i < postCount - 1; i++) {
            for (int j = postCount - 1; j > i; j--) {
                if (shouldSwap(posts[j - 1], posts[j])) {
                    var temp = posts[j];
                    posts[j] = posts[j - 1];
                    posts[j - 1] = temp;
                }
            }
        }
    }

    // todo 23: triển khai phương thức thực hiện chức năng kiểm tra xem có cần tráo đổi
    //  vị trí hai bài viết khi sắp xếp không.
    private static boolean shouldSwap(Post p1, Post p2) {
        int[] dateDetails1 = dateInNumber(p1.publishDate);
        int d1 = dateDetails1[0];
        int m1 = dateDetails1[1];
        int y1 = dateDetails1[2];

        int[] dateDetails2 = dateInNumber(p2.publishDate);
        int d2 = dateDetails2[0];
        int m2 = dateDetails2[1];
        int y2 = dateDetails2[2];

        if (y1 > y2) { // năm xuất bản thằng đứng trước lớn hơn thằng đứng sau
            return true; // rõ ràng cần phải đổi chỗ
        } else if (y1 == y2 && m1 > m2) { // tương tự cho tháng
            return true; // cũng đổi chỗ
        } else return y1 == y2 && m1 == m2 && d1 > d2; // tương tự cho ngày -> đổi chỗ
    }

    // todo 25: triển khai phương thức sắp xếp các bài viết theo thứ tự từ mới nhất -> cũ nhất
    private static void findAllNewestPosts(Post[] posts, int postCount) {
        for (int i = 0; i < postCount - 1; i++) {
            for (int j = postCount - 1; j > i; j--) {
                if (!shouldSwap(posts[j - 1], posts[j])) {
                    var temp = posts[j];
                    posts[j] = posts[j - 1];
                    posts[j - 1] = temp;
                }
            }
        }
    }

    private static int[] dateInNumber(String publishDate) {
        String[] dateDetailsStr = publishDate.split("/");
        int[] dateDetailsInt = new int[dateDetailsStr.length];
        for (int i = 0; i < dateDetailsInt.length; i++) {
            dateDetailsInt[i] = Integer.parseInt(dateDetailsStr[i]);
        }
        return dateDetailsInt;
    }
}
