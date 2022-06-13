package builder.creators.People;

import builder.creators.Literature.RandCreate;
import builder.description.People.People;
import builder.parsers.People.PrepodsParser;

import java.util.ArrayList;

public interface PeopleGenerator extends RandCreate {

    public default String generate(){
        String firstName;
        String lastName;
        firstName = PrepodsParser.getFirstNames();
            lastName = PrepodsParser.getLastNames();
            if(this instanceof PrepodGenerator){
                String secondName = getSecondName(firstName);
                addNewHuman(firstName, secondName, lastName);
            }
            else addNewHuman(firstName, lastName);
        return firstName;
    }

    void addNewHuman(String... names);





    default String getCorrectLastName(String firstName, String lastName){
        if(!isMale(firstName)) return lastName+"а";
        return lastName;
    }

    default String getSecondName(String firstName){
        String secondName = getRandomMaleName();
        if(secondName.endsWith("й")) secondName = secondName.substring(0, secondName.length()-1)+"е";
        else secondName += "о";
        if(isMale(firstName)) secondName += "вич";
        else secondName += "вна";
        return secondName;
    }

    default String getRandomMaleName(){
        String firstNames = PrepodsParser.getFirstNames();
        while(true){
            String firstName = firstNames;
            if(isMale(firstName)) return firstName;
        }
    }

    default boolean isMale(String firstName){
        return People.isMale(firstName);
    }

}
