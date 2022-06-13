package builder.description.People;

public class Students extends People{

    public Students(String name, String familia) {
        super(name, familia);
    }

    public String toString(){
        return "\nStudent{" +
                "firstName='" + getName() + '\'' +
                ", lastName='" + getFamilia() + '\'' +
                ", \n\tbooks=" + getBooks() +
                '}';
    }

}
