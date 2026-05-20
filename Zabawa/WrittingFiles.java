package Zabawa;

import java.io.FileWriter;

public class WrittingFiles {
    public static void main(String[] args) {
        // FileWriter = Good for small/medium sized text files
        // BufferedWritter = Better performance for large texts
        // PrintWritter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (images, audio etc.)
        try(FileWriter writer = new FileWriter("test.txt")){

        }
        catch{
            
        }
    }
}
