package builder.creators.Literature;

import builder.description.Literature.RussianLiterature;
import builder.parsers.Literature.RussianParser;

import java.util.ArrayList;

    public class RussianLiteratureGenerator implements LiteratureGenerator {

        private ArrayList<RussianLiterature> russianLiteratures;

        public ArrayList<RussianLiterature> getRussianLiteratures() {
            return russianLiteratures;
        }

        public RussianLiteratureGenerator() {
            this.russianLiteratures = new ArrayList<>();
        }

        public String[] generateArguments() {
            ArrayList<String> authors = getAuthors();
            ArrayList<String> titles = getTitles();
            ArrayList<String> disciplines = getDisciplines();

            String author = authors.get(getRandomIndex(authors));
            String title = titles.get(getRandomIndex(titles));
            String discipline = disciplines.get(getRandomIndex(disciplines));

            return new String[]{author, title, discipline};
        }


        public void addNewBook(String[] args) {
            getRussianLiteratures().add(new RussianLiterature(args[0], args[1], args[2]));
        }

        public ArrayList<String> getAuthors() {
            return RussianParser.getAuthors();
        }

        public ArrayList<String> getTitles() {
            return RussianParser.getTitles();
        }

        public ArrayList<String> getDisciplines() {
            return RussianParser.getDisciplines();
        }

    }

