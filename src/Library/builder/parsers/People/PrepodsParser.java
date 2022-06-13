package builder.parsers.People;

import builder.creators.Literature.RandCreate;
import builder.parsers.Parser;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.ArrayList;

public class PrepodsParser {

    private static ArrayList<String> firstNames;
    private static ArrayList<String> lastNames;
    private static final int columnsNumber = 2;

    public static String getFirstNames() {
    String firstName = firstNames.get(RandCreate.getRandomInteger(4));

        return firstName;
    }

    public static void setFirstNames(ArrayList<String> firstNamesNew) {

        firstNames = firstNames = firstNamesNew;
    }

    public static String getLastNames() {
        String lastName = lastNames.get(RandCreate.getRandomInteger(4));
        return lastName;
    }

    public static void setLastNames(ArrayList<String> lastNamesNew) {
        lastNames = lastNamesNew;
    }

    public static void parseSheet(XSSFSheet sheet){
        for(int j=0; j<columnsNumber; j++){
            int rowsNumber = Parser.getRowsNumberAtColumn(sheet, j);
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i<rowsNumber; i++){
                String value = sheet.getRow(i+1).getCell(j).getStringCellValue();
                list.add(value);
            }
            if(j==0) setFirstNames(list);
            else setLastNames(list);
        }
    }

}