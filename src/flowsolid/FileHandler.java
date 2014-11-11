
package flowsolid;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author CosticaTeodor
 */
public class FileHandler {
     public void write() throws IOException{
        /* the file class gives acces to a file */
        File mini = new File("filename.txt");
        FileWriter fWriter = new FileWriter(mini, true);
        
       // fWriter.append();
        
        fWriter.close();// close acces to file 
        
    }
}
