package builder.description.People;

import builder.description.Literature.JustBook;

import java.util.ArrayList;
import java.util.HashSet;

public class People {

    private final String name;
    private final String familia;
    private final HashSet<JustBook> books;

    public People(String name, String familia){
        this(name, familia, new HashSet<>());
    }

    public People(String name, String familia, HashSet<JustBook> books){
        this.name = name;
        this.familia = familia;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getFamilia() {
        return familia;
    }

    public HashSet<JustBook> getBooks() {
        return books;
    }


    public void addBook(JustBook book){
        getBooks().add(book);
    }

    public void addBooks(ArrayList<JustBook> books){
        for(JustBook book : books){
            addBook(book);
        }
    }

    public static boolean isMale(String name){
        return !(name.endsWith("а") || name.endsWith("я"));
    }
}
