package builder.creators.People;

import builder.creators.Creator;
import builder.creators.Literature.RandCreate;
import builder.description.People.Prepods;
import builder.parsers.People.PrepodsParser;
import java.util.ArrayList;

public class PrepodGenerator implements PeopleGenerator{


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

    private ArrayList<Prepods> prepods;

    public ArrayList<Prepods> getPrepods() {
        return prepods;
    }

    public PrepodGenerator(){
        this.prepods = new ArrayList<>();
    }

    public String getFirstNames(){
        return PrepodsParser.getFirstNames();
    }

    public String getLastNames(){
        return PrepodsParser.getLastNames();
    }

    public void addNewHuman(String... names){
        getPrepods().add(new Prepods(names[0], names[1], names[2]));
    }

}