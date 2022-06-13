package builder.description.Literature;

public class JustBook {

    private String author;
    private String title;

    public JustBook(String author, String title) {
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
