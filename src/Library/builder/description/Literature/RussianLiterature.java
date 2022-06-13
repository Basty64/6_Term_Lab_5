package builder.description.Literature;

public class RussianLiterature extends EducationalLiterature{

    public String toString() {
        return "\n\tRussianLiterature{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", discipline='" + getDiscipline() + '\'' +
                '}';
    }

    public RussianLiterature(String author, String title, String discipline){
        super(author,title,discipline);
    }
}
