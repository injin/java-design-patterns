package adapterPractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class FileProperties implements FileIO {
    
    Map<String, String> map = new HashMap<>();

    @Override
    public void readFromFile(String filename) throws IOException {
        
        File file = new File(filename);
        
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(file));
            String year = prop.getProperty("year");
            System.out.println(year);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void writeToFile(String filename) throws IOException {
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter(filename));
            
            Set<String> set = map.keySet();
            Iterator<String> ita = set.iterator();
            while (ita.hasNext()) {
                String key = ita.next();
                String value = map.get(key);
                bw.write(key + "=" + value + "\n");
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bw != null) try { bw.close(); } catch(Exception e) {}
        }
        
    }

    @Override
    public void setValue(String key, String value) {
        map.put(key, value);
    }

    @Override
    public String getValue(String value) {
        // TODO Auto-generated method stub
        return null;
    }
}
