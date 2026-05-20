package miniProgramy.MusicPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayerMain {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\qbast\\Desktop\\Proste-projekty-Java\\miniProgramy\\MusicPlayer\\Wuhan.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in); AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.print("""

                        P = Play
                        S = Stop
                        R = Reset
                        Q = Quit

                        Enter your choice:  """);
                response = scanner.nextLine().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice.");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Couldn't locate the file.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported.");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio file.");
        }
        catch (IOException e) {
            System.out.println("Something went wrong.");
        }
        finally{
            System.out.println("Bye!");
        }
    }
}
