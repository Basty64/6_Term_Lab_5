package builder.description.Literature;

public abstract class EducationalLiterature extends JustBook {


    private String discipline;

    public EducationalLiterature(String author, String title, String discipline) {
        super(title,author);
        this.discipline = discipline;
    }

    public String getDiscipline(){return discipline;}
}

