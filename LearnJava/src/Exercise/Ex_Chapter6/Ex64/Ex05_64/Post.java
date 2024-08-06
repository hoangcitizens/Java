/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */

package Exercise.Ex_Chapter6.Ex64.Ex05_64;

public class Post {
    private String id;
    private String title;
    private String content;
    private String author;
    private String publishDate;

    // todo 2: thay đổi kiểu dữ liệu từ String -> Category
    //  và thay đổi các thành phần liên quan
    private Category category;

    public Post() {
    }

    public Post(String id) {
        this();
        setId(id);
    }

    public Post(String id, String title, String content,
                String author, String publishDate, Category category) {
        this(id);
        setTitle(title);
        setContent(content);
        setAuthor(author);
        setPublishDate(publishDate);
        setCategory(category);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    // todo 3: điều chỉnh phương thức getter để trả về giá trị String của category
    public String getCategory() {
        return category.getValue();
    }

    public Category getCategoryEnum() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
