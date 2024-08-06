package Exercise.Ex_Chapter6.Ex63.Ex05_63;

public class Post {
    // todo 1: triển khai các thuộc tính theo yêu cầu
    private String id;
    private String title;
    private String content;
    private String author;
    private String publishDate;
    private String category;


    // todo 2: triển khai và tái sử dụng constructor, setter
    public Post() {
    }

    public Post(String id) {
        this();
        setId(id);
    }

    public Post(String id, String title, String content,
                String author, String publishDate, String category) {
        this(id);
        setTitle(title);
        setContent(content);
        setAuthor(author);
        setPublishDate(publishDate);
        setCategory(category);
    }

    // todo 3: triển khai các phương thức getter và setter
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
