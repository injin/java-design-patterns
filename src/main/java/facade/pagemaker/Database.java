package facade.pagemaker;

import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {}
    
    public static Properties getProperties(String dbname) {
        String filename = dbname + ".properties";
        
        Properties prop = new Properties();
        try {
            prop.load(Database.class.getResourceAsStream("/facade/pagemaker/" + filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
