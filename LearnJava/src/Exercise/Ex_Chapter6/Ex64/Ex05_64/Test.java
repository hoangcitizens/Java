/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */

package Exercise.Ex_Chapter6.Ex64.Ex05_64;

import java.util.Scanner;

// todo 4: sử dụng enum đã định nghĩa và sửa đổi code sao cho hợp lý
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Post[] posts = new Post[100];
        var postCount = createFakePosts(posts);

        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    if (postCount <= 100) {
                        Post post = createPost(posts, input);
                        posts[postCount++] = post;
                        System.out.println("==> Thêm bài viết thành công <==");
                    } else {
                        System.err.println("==> Số lượng bài viết vượt quá 100, không thể thêm! <==");
                    }
                    break;
                case 2:
                    if (postCount > 0) {
                        updateTitleByPostId(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 3:
                    if (postCount > 0) {
                        if (deletePostById(posts, input)) {
                            postCount--;
                        }
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 4:
                    if (postCount > 0) {
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 5:
                    if (postCount > 0) {
                        displayPostsByCategory(posts, postCount);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 6:
                    if (postCount > 0) {
                        findPostsByTitle(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 7:
                    if (postCount > 0) {
                        findPostsByCategory(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 8:
                    if (postCount > 0) {
                        findPostsByPublishDate(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 9:
                    if (postCount > 0) {
                        sortOldestToNewest(posts, postCount);
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 10:
                    if (postCount > 0) {
                        findAllNewestPosts(posts, postCount);
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 11:
                    System.out.println("==> Cảm ơn bạn đã sử dụng dịch vụ! <==");
                    break;
                default:
                    System.err.println("==> Sai chức năng, vui lòng nhập từ 1 -> 11 <==");
            }
        } while (choice != 11);
    }


    private static void displayPostsByCategory(Post[] posts, int postCount) {
        Category[] currentCategories = new Category[postCount];
        int count = 0;
        for (int i = 0; i < postCount; i++) {
            if (!isExistedCategory(currentCategories, posts[i])) {
                currentCategories[count++] = posts[i].getCategoryEnum();
            }
        }

        for (int i = 0; i < count; i++) {
            if (currentCategories[i] == null) {
                break;
            }
            String line = "==================================";
            System.out.println(STR."\{line} DANH SÁCH BÀI VIẾT CÓ THỂ LOẠI '\{currentCategories[i].getValue().toUpperCase()}' \{line}");
            System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n",
                    "Mã BV", "Tiêu đề", "Nội dung", "Tác giả", "Ngày XB", "Thể loại");
            for (int j = 0; j < postCount; j++) {
                if (posts[j].getCategoryEnum() == currentCategories[i]) {
                    System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n",
                            posts[j].getId(), posts[j].getTitle(), posts[j].getContent(),
                            posts[j].getAuthor(), posts[j].getPublishDate(), posts[j].getCategory());
                }
            }
        }
    }

    private static boolean isExistedCategory(Category[] currentCategories, Post post) {
        for (var category : currentCategories) {
            if (category == null) {
                break;
            }
            if (category == post.getCategoryEnum()) {
                return true;
            }
        }
        return false;
    }


    private static int createFakePosts(Post[] posts) {
        int postCount = 0;
        posts[postCount++] = new Post("P1001", "ChatGPT đang hot", "Xuất hiện cuối năm 2022...", "Denny Nguyễn", "12/12/2023", Category.TECHNOLOGY);
        posts[postCount++] = new Post("P1002", "Java là ngôn ngữ...", "Ra đời năm 1995...", "Denny Nguyễn", "20/02/2024", Category.BUSINESS);
        posts[postCount++] = new Post("P1003", "AI và Data đang...", "Các công việc liên quan...", "Denny Nguyễn", "19/02/2023", Category.CAR);
        posts[postCount++] = new Post("P1004", "Lập trình game...", "Liệu có dễ kiếm tiền...", "Denny Nguyễn", "10/10/2023", Category.EDUCATION);
        posts[postCount++] = new Post("P1005", "MS sa thải hàng nghìn...", "Đầu năm 2024...", "Denny Nguyễn", "19/01/2024", Category.CAR);
        posts[postCount++] = new Post("P1006", "Nhân sự IT ít việc làm...", "Kinh tế suy thoái ảm đạm...", "Denny Nguyễn", "09/03/2024", Category.EDUCATION);
        return postCount;
    }

    private static void displayMenu() {
        System.out.println("================ CÁC LỰA CHỌN ================");
        System.out.println("1. Thêm bài viết mới.");
        System.out.println("2. Sửa tiêu đề bài viết.");
        System.out.println("3. Xoá bài viết.");
        System.out.println("4. Hiển thị danh sách bài viết.");
        System.out.println("5. Hiển thị danh sách bài viết theo từng thể loại.");
        System.out.println("6. Tìm kiếm bài viết theo tiêu đề.");
        System.out.println("7. Tìm kiếm bài viết theo thể loại.");
        System.out.println("8. Tìm kiếm bài viết theo ngày đăng.");
        System.out.println("9. Sắp xếp danh sách bài viết từ cũ đến mới.");
        System.out.println("10. Sắp xếp danh sách bài viết từ mới đến cũ.");
        System.out.println("11. Kết thúc chương trình.");
        System.out.println("==> Lựa chọn của bạn: ");
    }

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
        Category category;
        System.out.print("Thể loại: \nthời sự\ncông nghệ\nthế giới\nkinh doanh");
        System.out.println("khoa học\npháp luật\ngiáo dục\nxe hơi\nthư giãn");
        category = findCategoryByValue(input.nextLine());
        return new Post(id, title, content, author, publishDate, category);
    }

    private static Category findCategoryByValue(String value) {
        var categories = Category.values();
        for (Category category : categories) {
            if (category.getValue().equalsIgnoreCase(value)) {
                return category;
            }
        }
        return Category.NEWS;
    }

    private static void findPostsByCategory(Post[] posts, Scanner input) {
        System.out.println("Thể loại bài viết cần tìm: ");
        String category = input.nextLine();
        Post[] results = new Post[posts.length];
        int count = 0;
        for (Post post : posts) {
            if (post != null && post.getCategory().toLowerCase().contains(category.toLowerCase())) {
                results[count++] = post;
            }
        }
        if (count != 0) {
            displayAllPosts(results);
        } else {
            System.err.println("==> Không có kết quả tìm kiếm <==");
        }
    }

    private static void findPostsByPublishDate(Post[] posts, Scanner input) {
        System.out.println("Ngày đăng bài viết cần tìm: ");
        String publishDate = input.nextLine();
        if (!validateDate(publishDate)) { // nếu ngày xuất bản không hợp lệ
            publishDate = "01/01/2020"; // lấy ngày mặc định
        }

        var publishDateDetails = dateInNumber(publishDate);
        int publishDay = publishDateDetails[0];
        int publishMonth = publishDateDetails[1];
        int publishYear = publishDateDetails[2];

        Post[] results = new Post[posts.length];
        int count = 0;
        for (Post post : posts) {
            if (post != null) {
                var postDateDetails = dateInNumber(post.getPublishDate());
                int postDay = postDateDetails[0];
                int postMonth = postDateDetails[1];
                int postYear = postDateDetails[2];
                if (postDay == publishDay && postMonth == publishMonth && postYear == publishYear) {
                    results[count++] = post;
                }
            }
        }

        if (count != 0) {
            displayAllPosts(results);
        } else {
            System.err.println("==> Không có kết quả tìm kiếm <==");
        }
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

    private static String checkValidId(Post[] posts, String id) {
        if (!id.startsWith("P") && id.length() != 5) {
            System.err.println("==> Mã bài viết bắt đầu với P sau đó là 4 số. Ví dụ P1001. <==");
            return null;
        }

        for (Post post : posts) {
            if (post == null) {
                break;
            }
            if (post.getId().compareToIgnoreCase(id) == 0) {
                System.err.println("==> Mã bài viết đã tồn tại. Vui lòng nhập mã khác! <==");
                return null;
            }
        }
        return id;
    }

    private static void updateTitleByPostId(Post[] posts, Scanner input) {
        System.out.println("Mã bài viết cần sửa: ");
        String postId = input.nextLine().trim().toUpperCase();
        int indexByPost = findIndexByPostId(posts, postId);
        if (indexByPost != -1) {
            System.out.println("Tiêu đề mới: ");
            posts[indexByPost].setTitle(input.nextLine());
            System.out.println(STR."==> Cập nhật tiêu đề cho bài viết mã \{postId} thành công! <==");
        } else {
            System.err.println("==> Bài viết không tồn tại! <==");
        }
    }

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

    private static int findIndexByPostId(Post[] posts, String postId) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null && posts[i].getId().equals(postId)) {
                return i;
            }
        }
        return -1;
    }

    private static void displayAllPosts(Post[] posts) {
        var line = "=============================================";
        System.out.println(STR."\{line} DANH SÁCH BÀI VIẾT \{line}");
        System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n",
                "Mã BV", "Tiêu đề", "Nội dung", "Tác giả", "Ngày XB", "Thể loại");
        for (Post post : posts) {
            if (post == null) {
                break;
            }
            System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n",
                    post.getId(), post.getTitle(), post.getContent(),
                    post.getAuthor(), post.getPublishDate(), post.getCategory());
        }
    }

    private static void findPostsByTitle(Post[] posts, Scanner input) {
        System.out.println("Tiêu đề bài viết cần tìm: ");
        String title = input.nextLine();
        Post[] results = new Post[posts.length];
        int count = 0;
        for (Post post : posts) {
            if (post != null && post.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results[count++] = post;
            }
        }
        if (count != 0) {
            displayAllPosts(results);
        } else {
            System.err.println("==> Không có kết quả tìm kiếm <==");
        }
    }

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

    private static boolean shouldSwap(Post p1, Post p2) {
        int[] dateDetails1 = dateInNumber(p1.getPublishDate());
        int d1 = dateDetails1[0];
        int m1 = dateDetails1[1];
        int y1 = dateDetails1[2];

        int[] dateDetails2 = dateInNumber(p2.getPublishDate());
        int d2 = dateDetails2[0];
        int m2 = dateDetails2[1];
        int y2 = dateDetails2[2];

        if (y1 > y2) { // năm xuất bản thằng đứng trước lớn hơn thằng đứng sau
            return true; // rõ ràng cần phải đổi chỗ
        } else if (y1 == y2 && m1 > m2) { // tương tự cho tháng
            return true; // cũng đổi chỗ
        } else return y1 == y2 && m1 == m2 && d1 > d2; // tương tự cho ngày -> đổi chỗ
    }

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
