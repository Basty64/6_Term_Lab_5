package builder.description.Literature;

public class EnglishLiterature extends EducationalLiterature{

    private String studentType; //     Бакалавр\магистр

    public String getStudentType()
    {return studentType;}

    public String toString() {
        return "\n\tEnglishLiterature{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", discipline='" + getDiscipline() + '\'' +
                ", level='" + getStudentType() + '\'' +
                '}';
    }

public EnglishLiterature (String author, String title, String discipline, String studentType){
        super(author, title, discipline);
    this.studentType = studentType;
}
}
