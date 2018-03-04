package basicfile;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author abdul
 */
public class BasicFile {

    File f;
    JFileChooser select; 
    public void selectFile(){
        select = new JFileChooser(); 
        int returnVal = select.showOpenDialog(select);

    }
    
    public void copyFile(int returnVal){
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File orig = select.getSelectedFile();
            File copy = new File("/" + orig.getName());
            try{
                Files.copy(orig.toPath(), copy.toPath(), REPLACE_EXISTING);  
            }
            catch(IOException e){
                System.out.println("File does not exist");
            }
        }
    }
    
    public void appendFile(){
        f = select.getSelectedFile();
        try{ String data = null;
                FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                BufferedWriter bw = new BufferedWriter(fw);
                String input = JOptionPane.showInputDialog(data);
                bw.write(input);
                System.out.println("Done");
        }        
        catch(IOException e){
            System.out.println("File could not be appended");
        }
    }
    
    public void overWriteFile(){
        
    }
}    
