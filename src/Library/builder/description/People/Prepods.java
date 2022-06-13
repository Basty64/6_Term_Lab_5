package builder.description.People;

public class Prepods extends People{

    private String otchestvo;

    public Prepods (String name, String familia, String otchestvo){
        super(name, familia);
        this.otchestvo = otchestvo;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public String toString(){
        return "\nProfessor{" +
                "firstName='" + getName() + '\'' +
                ", secondName='" + getFamilia() + '\'' +
                ", lastName='" + getOtchestvo() + '\'' +
                ", \n\tbooks=" + getBooks() +
                '}';
    }
}
