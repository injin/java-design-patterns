package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;
    private final String currentDir = BigChar.class.getResource("").getPath();
    
    public BigChar(char charname) {
        this.charname = charname;
        try {
            
            BufferedReader reader = new BufferedReader(
                    new FileReader(currentDir + "/" + "big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            this.fontdata = charname + "?";
        }
    }
    
    public void print() {
        System.out.println(fontdata);
    }
}
