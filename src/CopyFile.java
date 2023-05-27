import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;

public class CopyFile {

    
    public static void main(String[] args) {
        
        System.out.println("What is the source File name?(iroha.txt)");
       
            Scanner in1 = new Scanner(System.in);
            String sourceFilename = in1.nextLine();
           
        System.out.println("What is the new File name?");  
            
            Scanner in2 = new Scanner(System.in);
            String newFilename = in2.nextLine();
           
            
            File sourceFile = new File(sourceFilename);
            File newFile = new File(newFilename);
            
        try{
                
             Files.copy(sourceFile.toPath(), newFile.toPath());
                
        }
        catch(Exception e){
                
            System.out.println("There was an error");
                
        }
       
        
        
            
            
            
            
            
            
    }
        
        
        
        
        
    }
    

