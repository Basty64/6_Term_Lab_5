package builder.creators.People;

import builder.creators.Creator;
import builder.creators.Literature.RandCreate;
import builder.description.People.Prepods;
import builder.description.People.Students;
import builder.parsers.People.StudentsParser;

import java.util.ArrayList;

public class StudentGenerator implements PeopleGenerator{

    public void gen(){

        int fictionsNumber = RandCreate.getRandomInteger(4);
        int russianLiteraturesNumber = RandCreate.getRandomInteger(4);
        int englishLiteraturesNumber = RandCreate.getRandomInteger(4);

        PrepodGenerator prepodGenerator = new PrepodGenerator();
        for(Prepods prepods : prepodGenerator.getPrepods()){
            prepods.addBooks(Creator.generateFictions(fictionsNumber));
            prepods.addBooks(Creator.generateRussianLiteratures(russianLiteraturesNumber));
            prepods.addBooks(Creator.generateEnglishLiteratures(englishLiteraturesNumber));
        }
    }

    private ArrayList<Students> students;

    public ArrayList<Students> getStudents() {
        return students;
    }

    public StudentGenerator(){
        this.students = new ArrayList<>();
    }

    public ArrayList<String> getFirstNames(){
        return StudentsParser.getFirstNames();
    }

    public ArrayList<String> getLastNames(){
        return StudentsParser.getFirstNames();
    }

    public void addNewHuman(String... names){
        getStudents().add(new Students(names[0], names[1]));
    }

}
