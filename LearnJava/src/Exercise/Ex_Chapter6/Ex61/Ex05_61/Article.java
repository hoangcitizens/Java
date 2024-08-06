package Exercise.Ex_Chapter6.Ex61.Ex05_61;

/*
    Bài 5. Thông tin về các bài viết trên một blog cá nhân gồm: mã bài viết, tiêu đề, nội dung, tác giả, ngày đăng,
    thể loại. Phương thức khởi tạo gồm mặc định, một phương thức khác nhận vào tất cả các thuộc tính. Các hành động bao
    gồm thêm bài viết mới, sửa đổi nội dung bài viết. Thiết kế lớp mô tả đối tượng bài viết như trên. Sau đó tạo các bài
    viết bất kỳ trong hàm main và sử dụng các thuộc tính,  phương thức tương ứng. Tạo mảng chứa các bài viết và tạo
    phương thức để hiển thị danh sách gồm số thứ tự, mã bài viết và tiêu đề các bài viết lên màn hình. Thông tin mỗi
    bài viết hiển thị trên 1 dòng.
 */

public class Article {
    // todo 1: triển khai các thuộc tính theo đề bài
    public String articleId;
    public String title;
    public String content;
    public String author;
    public String publicationDate;
    public String category;


    // todo 2: triển khai các hàm khởi tạo theo đề bài
    public Article() {
    }

    public Article(String articleId, String title, String content, String author,
                   String publicationDate, String category) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.publicationDate = publicationDate;
        this.category = category;
    }

    // todo 3: triển khai các phương thức thể hiện hành động theo đề bài
    public void addNewArticle(String articleId, String title, String content, String author,
                              String publicationDate, String category) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.publicationDate = publicationDate;
        this.category = category;
    }

    public void editArticleContent(String newContent) {
        this.content = newContent;
    }
}
