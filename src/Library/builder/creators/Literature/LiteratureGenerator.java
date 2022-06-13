package builder.creators.Literature;

import java.util.ArrayList;

    public interface LiteratureGenerator extends RandCreate{

        default void generate(int booksNumber){
            for(int i=1; i<=booksNumber; i++){
                addNewBook(generateArguments());
            }
        }

        String[] generateArguments();

        void addNewBook(String[] args);

        ArrayList<String> getAuthors();

        ArrayList<String> getTitles();

    }
