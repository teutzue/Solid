package flowsolid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author CosticaTeodor
 */
public class SimpleAcces {

    public void read() throws FileNotFoundException {
        // File class gives acces to a file, add then the file in the paranthersis
        File mini = new File("filenme.txt");
        //Scanner scan = new Scanner(userPicker());
        
        
//        Scanner scan = new Scanner(mini);
        Scanner scan = new Scanner(mini);
        scan.useDelimiter(",");
        

        while (scan.hasNext() ) {// as long there is still a next line 
            //String oneLine = scan.nextLine();// read one line into oneLine variable
            System.out.println(scan.next());
        }
    }
    public void write() throws IOException{
        /* the file class gives acces to a file */
        File mini = new File("filename.txt");
//        PrintWriter pWriter = new PrintWriter(mini);// equivalt of scanner class but for writing files
//        
//        pWriter.append("Teo is king\n");
//        pWriter.append("Teo is king1\n");
//        pWriter.append("Teo is king2\n");
//        pWriter.append();
        
        
        FileWriter fWriter = new FileWriter(mini, true);
        
        fWriter.append(Starter.input);
        
        fWriter.close();// close acces to file 
    }
    
    
//    public File userPicker(){
//    
//        JFileChooser picker = new JFileChooser();
//        int checkNumber = picker.showOpenDialog(null);// opens the filechooser window 
//        
//        if( checkNumber == JFileChooser.CANCEL_OPTION){
//        
//            System.exit(1);
//        }
//        
//        File userSelectedFile = picker.getSelectedFile();
//        return userSelectedFile;
//    
//    }
    
    
}
