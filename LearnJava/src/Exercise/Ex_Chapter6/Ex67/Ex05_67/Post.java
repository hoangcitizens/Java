package Exercise.Ex_Chapter6.Ex67.Ex05_67;

/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */
public class Post {
    private static int autoId = 1000;
    private String id;
    private String title;
    private String content;
    private String author;
    private String publishDate;
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
        this.id = (id == null || id.isBlank()) ? STR."P\{autoId++}" : id;
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
