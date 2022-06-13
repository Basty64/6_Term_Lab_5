package builder.creators.Literature;

import builder.description.Literature.EnglishLiterature;
import builder.parsers.Literature.EnglishParser;

import java.util.ArrayList;

public class EnglishLiteratureGenerator implements LiteratureGenerator{

    private ArrayList<EnglishLiterature> englishLiteratures;

    public ArrayList<EnglishLiterature> getEnglishLiteratures() {
        return englishLiteratures;
    }

    public EnglishLiteratureGenerator(){
        this.englishLiteratures = new ArrayList<>();
    }

    @Override
    public String[] generateArguments(){
        ArrayList<String> authors = getAuthors();
        ArrayList<String> titles = getTitles();
        ArrayList<String> disciplines = getDisciplines();
        ArrayList<String> levels = getLevels();
        ArrayList<String> universities = getUniversities();

        String author = authors.get(getRandomIndex(authors));
        String title = titles.get(getRandomIndex(titles));
        String discipline = disciplines.get(getRandomIndex(disciplines));
        String level = levels.get(getRandomIndex(levels));
        String university = universities.get(getRandomIndex(universities));
        return new String[]{author, title, discipline, level, university};
    }

    @Override
    public void addNewBook(String[] args){
        getEnglishLiteratures().add(new EnglishLiterature(args[0], args[1], args[2], args[3]));
    }

    public ArrayList<String> getAuthors(){
        return EnglishParser.getAuthors();
    }

    public ArrayList<String> getTitles(){
        return EnglishParser.getTitles();
    }

    public ArrayList<String> getDisciplines(){
        return EnglishParser.getDisciplines();
    }

    public ArrayList<String> getLevels(){
        return EnglishParser.getLevels();
    }

    public ArrayList<String> getUniversities(){
        return EnglishParser.getUniversities();
    }

}

