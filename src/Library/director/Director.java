package controller;

import builder.creators.Creator;
import builder.description.Summary;
import builder.parsers.Parser;

public class Director{

    public static void main(String[] args){
        Parser parser = new Parser("C:\\Программирование\\Java\\Лабы по Java 6 сем\\Лаба 5\\материалы\\library.xlsx");
        parser.parse();
        Summary summary = new Summary();
        summary.setStudents(Creator.generateStudentsWithBooks(15, 3, 2, 0));
        summary.setProfessors(Creator.generatePrepodWithBooks(2));

        summary.setProfessors(Creator.generatePrepodWithBooks(4));

        System.out.println(summary.getStudents());
        System.out.println(summary.getProfessors());
    }

}

