package Zabawa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {
        // BufferedReader + FileReader = Best for reading line by line
        // FileInputStream = Best for binary files (Images, audio etc.)
        // RandomAccessFile = Best for read/write a part of a big file
        String filePath = "C:\\Users\\qbast\\Desktop\\Proste-projekty-Java\\Zabawa\\TextFiles\\Poem";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
