package adapterPractice;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2018");
            f.setValue("month", "9");
            f.setValue("day", "8");
            f.writeToFile("newFile.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
