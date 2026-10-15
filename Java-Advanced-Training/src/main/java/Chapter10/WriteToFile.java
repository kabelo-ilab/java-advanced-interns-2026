package Chapter10;

import java.io.*;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/15
 **/
public class WriteToFile {
    public static void main(String[] args) {
        //Path
        String filePath = "src/main/resources/Hobbies.txt";
        //Create a file resource
        File hobbiesFile = new File(filePath);
        try{
            PrintStream pen = new PrintStream(new FileOutputStream(hobbiesFile,true));
            //FileOutputStream b = new FileOutputStream(hobbiesFile);
                pen.println("Tennis");
                pen.println("Soccer");
                pen.println("Hiking");

            pen.close();
        }catch (FileNotFoundException ex){
            System.err.println("File not found..." + ex.getMessage());
        }catch (IOException ex){
            System.err.println("Cannot write to the file");
        }

        System.out.println("Abs Path: " + hobbiesFile.getAbsolutePath());
        System.out.println("Path: " + hobbiesFile.getPath());
        System.out.println("Parent: " + hobbiesFile.getParent());
        System.out.println("Last Modified: " + hobbiesFile.lastModified());

    }
}
