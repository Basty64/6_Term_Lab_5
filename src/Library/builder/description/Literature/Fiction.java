package builder.description.Literature;

public class Fiction extends JustBook {

    public Fiction(String author, String title){
        super(author, title);
    }
    public String toString() {
        return "\n\tFiction{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
