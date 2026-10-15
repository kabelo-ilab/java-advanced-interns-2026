package Chapter10;

import java.io.*;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/15
 **/
public class ReadFromFile {
    public static void main(String[] args) {
        String filePath = "src/main/resources/Modules.txt";
        File moduleFile = new File(filePath);
        String text;

        try {
            //opens the file for reading
            FileReader fileReader = new FileReader(moduleFile);
            //read contents of the file
            BufferedReader reader = new BufferedReader(fileReader);

            //readAllAsString
            while (   (text = reader.readLine()) != null  ){//C#
                System.out.println(text);
            }

            reader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
