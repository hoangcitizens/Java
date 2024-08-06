package Exercise.Ex_Chapter6.Ex61.Ex05_61;

public class Test {
    public static void main(String[] args) {
        // todo 5: tạo một mảng có size = 3 chứa 3 đối tượng của lớp Article
        Article[] articles = new Article[3];

        // todo 6: sử dụng hàm khởi tạo hoặc hàm gán để khởi tạo các giá trị cho 3 bài viết
        articles[0] = new Article("A001", "Introduction to Java", "Java is a programming language...",
                "John Doe", "25-01-2014", "Programming");
        articles[1] = new Article("A002", "Web Development with Spring Boot", "Spring Boot is a framework...",
                "Jane Smith", "01-02-2024", "Web Development");
        articles[2] = new Article();
        articles[2].addNewArticle("A003", "Machine Learning Basics", "Machine learning is a subset of artificial intelligence...",
                "Bob Johnson", "07-05-2022", "Machine Learning");

        // todo 7: đổi nội dung content của articles[0] thành "Branium Academy is the best!"
        articles[0].editArticleContent("Branium Academy is the best");

        // todo 8: in ra tất cả các đối tượng trong mảng
        displayArticleList(articles);
    }

    // todo 4: triển khai phương thức in ra danh sách bài viết trong mảng
    private static void displayArticleList(Article[] articles) {
        System.out.println("Article List:");
        for (int i = 0; i < articles.length; i++) {
            System.out.println((i + 1) + ". " + "Id: " + articles[i].articleId +
                    ", Title: " + articles[i].title + ", Content: " + articles[i].content);
        }
    }
}
/**
 * Article List:
 * 1. Id: A001, Title: Introduction to Java, Content: Branium Academy is the best
 * 2. Id: A002, Title: Web Development with Spring Boot, Content: Spring Boot is a framework...
 * 3. Id: A003, Title: Machine Learning Basics, Content: Machine learning is a subset of artificial intelligence...
 */

