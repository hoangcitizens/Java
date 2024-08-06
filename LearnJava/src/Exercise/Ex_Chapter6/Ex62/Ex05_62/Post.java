package Exercise.Ex_Chapter6.Ex62.Ex05_62;

/*
    Bài 5. Thông tin về các bài viết trên một blog cá nhân gồm: mã bài viết có dạng Pxxxx(ví dụ P1003), tiêu đề,
    nội dung, tác giả, ngày đăng, thể loại. Bổ sung các constructor và tái sử dụng chúng sao cho hợp lệ. Viết chương
    trình có menu chọn cho phép thực hiện các chức năng sau:
        1. Thêm bài viết mới vào danh sách các bài viết. Mỗi bài viết với một mã bài viết chỉ được xuất hiện duy nhất 1
           lần trong danh sách.
        2. Sửa tiêu đề bài viết theo mã bài viết.
        3. Xóa bài viết khỏi danh sách theo mã bài viết.
        4. Hiển thị danh sách bài viết lên màn hình dưới dạng bảng.
        5. Tìm kiếm bài viết theo tiêu đề.
        6. Sắp xếp danh sách bài viết theo thứ tự cũ nhất -> mới nhất.
        7. Sắp xếp danh sách bài viết theo trật tự từ mới nhất đến cũ nhất.
        8. Kết thúc chương trình.
 */

public class Post {
    // todo 1: triển khai các thuộc tính theo yêu cầu
    public String id;
    public String title;
    public String content;
    public String author;
    public String publishDate;
    public String category;


    // todo 2: triển khai và tái sử dụng constructor
    public Post() {
    }

    public Post(String id) {
        this();
        this.id = id;
    }

    public Post(String id, String title, String content,
                String author, String publishDate, String category) {
        this(id);
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishDate = publishDate;
        this.category = category;
    }
}
