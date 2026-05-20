package miniProgramy.Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "Mango";
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 7;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("*----------------------*");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("*----------------------*");

        
        scanner.close();
    }
    static String getHnagmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    


                      """;
            case 1 -> """
                       ☺


                      """;
            case 2 -> """
                       ☺
                       |

                      """;
            case 3 -> """
                       ☺
                       |\\

                      """;
            case 4 -> """
                       ☺
                      /|\\

                      """;
            case 5 -> """
                       ☺
                      /|\\
                      /
                      """;
            case 6 -> """
                       ☺
                      /|\\
                      / \\
                      """;
            case 7 -> """
                       ☺
                      /|\\
                      /!\\
                      """;
            default -> "";
        };
    }
}
