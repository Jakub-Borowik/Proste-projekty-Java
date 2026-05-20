package Zabawa;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingFiles {
    public static void main(String[] args) {
        // FileWriter = Good for small/medium sized text files
        // BufferedWritter = Better performance for large texts
        // PrintWritter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (images, audio etc.)

        String fileName = "Poem";
        String fileLocation = "C:\\Users\\qbast\\Desktop\\Proste-projekty-Java\\Zabawa\\TextFiles\\" + fileName;
        String textContent = """
                Róże są czerwone, 
                tulipany są niebieskie 
                zgery zgery zgery hawk and tuah.
                """;

        try(FileWriter writer = new FileWriter(fileLocation)){
            writer.write(textContent);
            System.out.println("The file has been edited.");
        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't locate file location");
        }
        catch(IOException e){
            System.out.println("Couldn't create the file.");
        }
    }
}
