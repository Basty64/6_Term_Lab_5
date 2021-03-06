package builder.parsers.Literature;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import builder.parsers.Parser;

import java.util.ArrayList;

public class EnglishParser {
    private static ArrayList<String> authors;
    private static ArrayList<String> titles;
    private static ArrayList<String> disciplines;
    private static ArrayList<String> levels;
    private static ArrayList<String> universities;
    private static final int columnsNumber = 5;

    public static ArrayList<String> getAuthors() {
        return authors;
    }

    public static void setAuthors(ArrayList<String> authors) {
        EnglishParser.authors = authors;
    }

    public static ArrayList<String> getTitles() {
        return titles;
    }

    public static void setTitles(ArrayList<String> titles) {
        EnglishParser.titles = titles;
    }

    public static ArrayList<String> getDisciplines() {
        return disciplines;
    }

    public static void setDisciplines(ArrayList<String> disciplines) {
        EnglishParser.disciplines = disciplines;
    }

    public static ArrayList<String> getLevels() {
        return levels;
    }

    public static void setLevels(ArrayList<String> levels) {
        EnglishParser.levels = levels;
    }

    public static ArrayList<String> getUniversities() {
        return universities;
    }

    public static void setUniversities(ArrayList<String> universities) {
        EnglishParser.universities = universities;
    }

    public static void parseSheet(XSSFSheet sheet){
        for(int j=0; j<columnsNumber; j++){
            int rowsNumber = Parser.getRowsNumberAtColumn(sheet, j);
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i<rowsNumber; i++){
                String value = sheet.getRow(i+1).getCell(j).getStringCellValue();
                list.add(value);
            }
            if(j==0) setAuthors(list);
            else if(j==1) setTitles(list);
            else if(j==2) setDisciplines(list);
            else if(j==3) setLevels(list);
            else setUniversities(list);
        }
    }

}

