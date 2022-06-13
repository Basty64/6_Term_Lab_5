package builder.description;

import builder.description.People.Prepods;
import builder.description.People.Students;

import java.util.HashSet;

public class Summary {

    private HashSet<Students> students;
    private HashSet<Prepods> prepods;

    public Summary(){
        this.students = new HashSet<>();
        this.prepods = new HashSet<>();
    }

    public HashSet<Students> getStudents() {
        return students;
    }

    public void setStudents(HashSet<Students> students) {
        this.students = students;
    }

    public HashSet<Prepods> getProfessors() {
        return prepods;
    }

    public void setProfessors(HashSet<Prepods> prepods) {
        this.prepods = prepods;
    }

    //

    public void addStudent(Students students){
        getStudents().add(students);
    }

    public void addProfessor(Prepods prepods){
        getProfessors().add(prepods);
    }

    public void removeStudent(Students students){
        getStudents().remove(students);
    }

    public void removeProfessor(Prepods prepods){
        getProfessors().remove(prepods);
    }

}

