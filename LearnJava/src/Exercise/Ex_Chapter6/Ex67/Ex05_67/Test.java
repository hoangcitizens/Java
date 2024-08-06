package Exercise.Ex_Chapter6.Ex67.Ex05_67;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Bài 5. Thông tin về các bài viết trên một blog cá nhân gồm: mã bài viết có dạng Pxxxx(ví dụ P1003), phần số tự động
    tăng từ 1000, tiêu đề, nội dung, tác giả, ngày đăng, thể loại. Trong đó thể loại bao gồm: thời sự, thế giới,
    kinh doanh, khoa học, pháp luật, công nghệ, giáo dục, xe hơi, thư giãn. Bổ sung các constructor và tái sử dụng chúng
    sao cho hợp lệ, sử dụng tính đóng gói dữ liệu và tự bổ sung các phương thức phụ trợ cần thiết. Viết chương trình có
    menu chọn cho phép thực hiện các chức năng sau:
        1. Thêm bài viết mới vào danh sách các bài viết. Mỗi bài viết xuất hiện không quá 1 lần trong danh sách này
        2. Sửa tiêu đề bài viết theo mã bài viết.
        3. Xóa bài viết khỏi danh sách theo mã bài viết.
        4. Hiển thị danh sách bài viết lên màn hình dưới dạng bảng.
        5. Hiển thị danh sách bài viết theo từng thể loại.
        6. Tìm kiếm bài viết theo tiêu đề.
        7. Tìm kiếm bài viết theo thể loại.
        8. Tìm kiếm bài viết theo ngày đăng.
        9. Sắp xếp danh sách bài viết theo thứ tự cũ nhất -> mới nhất.
        10. Sắp xếp danh sách bài viết theo trật tự từ mới nhất đến cũ nhất.
        11. Kết thúc chương trình.
 */

// todo 1: sử dụng ArrayList thay cho mảng và sửa đổi code sao cho hợp lý
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Post> posts = new ArrayList<>();
        createFakePosts(posts);

        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    Post post = createPost(input);
                    posts.add(post);
                    System.out.println("==> Thêm bài viết thành công <==");
                    break;
                case 2:
                    if (!posts.isEmpty()) {
                        updateTitleByPostId(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 3:
                    if (!posts.isEmpty()) {
                        deletePostById(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 4:
                    if (!posts.isEmpty()) {
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 5:
                    if (!posts.isEmpty()) {
                        displayPostsByCategory(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 6:
                    if (!posts.isEmpty()) {
                        findPostsByTitle(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 7:
                    if (!posts.isEmpty()) {
                        findPostsByCategory(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 8:
                    if (!posts.isEmpty()) {
                        findPostsByPublishDate(posts, input);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 9:
                    if (!posts.isEmpty()) {
                        sortOldestToNewest(posts);
                        displayAllPosts(posts);
                    } else {
                        System.err.println("==> Danh sách bài viết rỗng! <==");
                    }
                    break;
                case 10:
                    if (!posts.isEmpty()) {
                        findAllNewestPosts(posts);
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


    private static void displayPostsByCategory(ArrayList<Post> posts) {
        var currentCategories = new ArrayList<Category>();
        for (Post post : posts) {
            if (!isExistedCategory(currentCategories, post)) {
                currentCategories.add(post.getCategoryEnum());
            }
        }

        for (Category currentCategory : currentCategories) {
            if (currentCategory == null) {
                break;
            }
            String line = "==================================";
            System.out.println(STR."\{line} DANH SÁCH BÀI VIẾT CÓ THỂ LOẠI '\{currentCategory.getValue().toUpperCase()}' \{line}");
            System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n",
                    "Mã BV", "Tiêu đề", "Nội dung", "Tác giả", "Ngày XB", "Thể loại");
            for (Post post : posts) {
                if (post.getCategoryEnum() == currentCategory) {
                    System.out.printf("%-10s%-25s%-30s%-20s%-15s%-15s\n",
                            post.getId(), post.getTitle(), post.getContent(),
                            post.getAuthor(), post.getPublishDate(), post.getCategory());
                }
            }
        }
    }

    private static boolean isExistedCategory(ArrayList<Category> currentCategories, Post post) {
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


    private static void createFakePosts(ArrayList<Post> posts) {
        posts.add(new Post(null, "ChatGPT đang hot", "Xuất hiện cuối năm 2022...", "Denny Nguyễn", "12/12/2023", Category.TECHNOLOGY));
        posts.add(new Post("", "Java là ngôn ngữ...", "Ra đời năm 1995...", "Denny Nguyễn", "20/02/2024", Category.BUSINESS));
        posts.add(new Post("", "AI và Data đang...", "Các công việc liên quan...", "Denny Nguyễn", "19/02/2023", Category.CAR));
        posts.add(new Post("", "Lập trình game...", "Liệu có dễ kiếm tiền...", "Denny Nguyễn", "10/10/2023", Category.EDUCATION));
        posts.add(new Post("", "MS sa thải hàng nghìn...", "Đầu năm 2024...", "Denny Nguyễn", "19/01/2024", Category.CAR));
        posts.add(new Post("", "Nhân sự IT ít việc làm...", "Kinh tế suy thoái ảm đạm...", "Denny Nguyễn", "09/03/2024", Category.EDUCATION));
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

    private static Post createPost(Scanner input) {
        System.out.print("Tiêu đề: ");
        String title = input.nextLine();
        System.out.print("Nội dung: ");
        String content = input.nextLine();
        System.out.print("Tác giả: ");
        String author = input.nextLine();
        System.out.println("Ngày phát hành(dd/MM/yyyy - ví dụ: 01/01/2025): ");
        String publishDate = input.nextLine();
        if (isNotValidDate(publishDate)) { // nếu ngày xuất bản không hợp lệ
            publishDate = "01/01/2020"; // lấy ngày mặc định
        }
        Category category;
        System.out.print("Thể loại: \nthời sự\ncông nghệ\nthế giới\nkinh doanh");
        System.out.println("khoa học\npháp luật\ngiáo dục\nxe hơi\nthư giãn");
        category = findCategoryByValue(input.nextLine());
        return new Post(null, title, content, author, publishDate, category);
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

    private static void findPostsByCategory(ArrayList<Post> posts, Scanner input) {
        System.out.println("Thể loại bài viết cần tìm: ");
        String category = input.nextLine();
        ArrayList<Post> results = new ArrayList<>();
        for (Post post : posts) {
            if (post != null && post.getCategory().toLowerCase().contains(category.toLowerCase())) {
                results.add(post);
            }
        }
        if (!posts.isEmpty()) {
            displayAllPosts(results);
        } else {
            System.err.println("==> Không có kết quả tìm kiếm <==");
        }
    }

    private static void findPostsByPublishDate(ArrayList<Post> posts, Scanner input) {
        System.out.println("Ngày đăng bài viết cần tìm: ");
        String publishDate = input.nextLine();
        if (isNotValidDate(publishDate)) { // nếu ngày xuất bản không hợp lệ
            publishDate = "01/01/2020"; // lấy ngày mặc định
        }

        var publishDateDetails = dateInNumber(publishDate);
        int publishDay = publishDateDetails[0];
        int publishMonth = publishDateDetails[1];
        int publishYear = publishDateDetails[2];

        ArrayList<Post> results = new ArrayList<>();
        for (Post post : posts) {
            if (post != null) {
                var postDateDetails = dateInNumber(post.getPublishDate());
                int postDay = postDateDetails[0];
                int postMonth = postDateDetails[1];
                int postYear = postDateDetails[2];
                if (postDay == publishDay && postMonth == publishMonth && postYear == publishYear) {
                    results.add(post);
                }
            }
        }

        if (!results.isEmpty()) {
            displayAllPosts(results);
        } else {
            System.err.println("==> Không có kết quả tìm kiếm <==");
        }
    }

    private static boolean isNotValidDate(String dateStr) {
        var elements = dateStr.split("/");
        if (elements.length != 3) {
            return true;
        }
        int day = Integer.parseInt(elements[0]);
        int month = Integer.parseInt(elements[1]);
        int year = Integer.parseInt(elements[2]);
        if (day < 1 || day > 31) {
            return true;
        }
        if (month < 1 || month > 12) {
            return true;
        } else {
            if (month == 2 && day > 29) {
                return true;
            }
            if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                return true;
            }
        }
        return year < 1900 || year > 9999;
    }

    private static void updateTitleByPostId(ArrayList<Post> posts, Scanner input) {
        System.out.println("Mã bài viết cần sửa: ");
        String postId = input.nextLine().trim().toUpperCase();
        int index = findIndexByPostId(posts, postId);
        if (index != -1) {
            System.out.println("Tiêu đề mới: ");
            posts.get(index).setTitle(input.nextLine());
            System.out.println(STR."==> Cập nhật tiêu đề cho bài viết mã \{postId} thành công! <==");
        } else {
            System.err.println("==> Bài viết không tồn tại! <==");
        }
    }

    private static void deletePostById(ArrayList<Post> posts, Scanner input) {
        System.out.println("Mã bài viết cần xoá: ");
        String postId = input.nextLine().trim().toUpperCase();
        int index = findIndexByPostId(posts, postId);
        if (index != -1) {
            posts.remove(index);
            System.out.println(STR."==> Xoá bài viết mã \{postId} thành công! <==");
        } else {
            System.err.println("==> Bài viết không tồn tại! <==");
        }
    }

    private static int findIndexByPostId(ArrayList<Post> posts, String postId) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i) != null && posts.get(i).getId().equals(postId)) {
                return i;
            }
        }
        return -1;
    }

    private static void displayAllPosts(ArrayList<Post> posts) {
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

    private static void findPostsByTitle(ArrayList<Post> posts, Scanner input) {
        System.out.println("Tiêu đề bài viết cần tìm: ");
        String title = input.nextLine();
        ArrayList<Post> results = new ArrayList<>();
        for (Post post : posts) {
            if (post != null && post.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(post);
            }
        }
        if (!results.isEmpty()) {
            displayAllPosts(results);
        } else {
            System.err.println("==> Không có kết quả tìm kiếm <==");
        }
    }

    private static void sortOldestToNewest(ArrayList<Post> posts) {
        for (int i = 0; i < posts.size() - 1; i++) {
            for (int j = posts.size() - 1; j > i; j--) {
                if (shouldSwap(posts.get(j - 1), posts.get(j))) {
                    var temp = posts.get(j);
                    posts.set(j, posts.get(j - 1));
                    posts.set(j - 1, temp);
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

    private static void findAllNewestPosts(ArrayList<Post> posts) {
        for (int i = 0; i < posts.size() - 1; i++) {
            for (int j = posts.size() - 1; j > i; j--) {
                if (!shouldSwap(posts.get(j - 1), posts.get(j))) {
                    var temp = posts.get(j);
                    posts.set(j, posts.get(j - 1));
                    posts.set(j - 1, temp);
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
