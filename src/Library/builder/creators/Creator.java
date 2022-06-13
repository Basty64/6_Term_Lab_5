package builder.creators;

import builder.creators.Literature.EnglishLiteratureGenerator;
import builder.creators.Literature.FictionGenerator;
import builder.creators.Literature.RussianLiteratureGenerator;
import builder.creators.People.PrepodGenerator;
import builder.creators.People.StudentGenerator;
import builder.description.Literature.JustBook;
import builder.description.People.Prepods;
import builder.description.People.Students;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Creator{

    public static HashSet<Students> generateStudentsWithBooks(int studentsNumber,
                                                             int fictionsNumber,
                                                             int russianLiteraturesNumber,
                                                             int englishLiteraturesNumber){
        HashSet<Students> students = new HashSet<>();
        StudentGenerator studentGenerator = new StudentGenerator();
        studentGenerator.generate();
        for(Students student : studentGenerator.getStudents()){
            student.addBooks(generateFictions(fictionsNumber));
            student.addBooks(generateRussianLiteratures(russianLiteraturesNumber));
            student.addBooks(generateEnglishLiteratures(englishLiteraturesNumber));
            students.add(student);
        }
        return students;
    }

    public static Students generateStudentWithBooks(int fictionsNumber,
                                                   int russianLiteraturesNumber,
                                                   int englishLiteraturesNumber){
        return generateStudentsWithBooks(1,
                fictionsNumber,
                russianLiteraturesNumber,
                englishLiteraturesNumber).iterator().next();
    }

    public static HashSet<Prepods> generatePrepodWithBooks(int number_of_prepods){
        HashSet<Prepods> professors = new HashSet<>();
        PrepodGenerator prepodGenerator = new PrepodGenerator();
        ArrayList<String> prepods = null;
        for (int i = 1; i< number_of_prepods; i++) {
            prepods.add(prepodGenerator.generate());

        }

        public static Prepods generatePrepodWithBooks(int fictionsNumber,int russianLiteraturesNumber,int englishLiteraturesNumber)
        {
            return generatePrepodWithBooks(1,
                    .iterator().next();
        }


        return professors;
    }






    public static ArrayList<JustBook> generateFictions(int fictionsNumber){
        FictionGenerator fictionGenerator = new FictionGenerator();
        fictionGenerator.generate(fictionsNumber);
        return new ArrayList<>(fictionGenerator.getFictions());
    }

    public static ArrayList<JustBook> generateRussianLiteratures(int russianLiteraturesNumber){
        RussianLiteratureGenerator russianLiteratureGenerator = new RussianLiteratureGenerator();
        russianLiteratureGenerator.generate(russianLiteraturesNumber);
        return new ArrayList<>(russianLiteratureGenerator.getRussianLiteratures());
    }

    public static ArrayList<JustBook> generateEnglishLiteratures(int englishLiteraturesNumber){
        EnglishLiteratureGenerator englishLiteratureGenerator = new EnglishLiteratureGenerator();
        englishLiteratureGenerator.generate(englishLiteraturesNumber);
        return new ArrayList<>(englishLiteratureGenerator.getEnglishLiteratures());
    }


}