package miniProgramy.Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        // TODO: Dodaj wybór czy własne słowo czy losuje z bazy.     +     Błąd kiedy wpisuje się już zgadniętą literę.
        Scanner scanner = new Scanner(System.in);

        String word = "manngo";
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("*----------------------*");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("*----------------------*");

    while(wrongGuesses < 7){
        System.out.print(getHnagmanArt(wrongGuesses));
        System.out.print("Word: ");
        for(char c : wordState){
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Guess a letter: ");
        char guess = scanner.next().toLowerCase().charAt(0);

        if(word.indexOf(guess) >= 0){
            System.out.println("Correct!\n");
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == guess){
                    wordState.set(i, guess);
                }
            }

            if(!wordState.contains('_')){
                System.out.print(getHnagmanArt(wrongGuesses));
                System.out.println("You won.");
                System.out.println("The word was: " + word);
                break;
            }
        }
        else{
            wrongGuesses++;
            System.out.println("Wrong!\n");
        }
        }
        
        if(wrongGuesses >= 7){
            System.out.print(getHnagmanArt(wrongGuesses));
            System.out.println("Game over.");
            System.out.println("The word was: " + word);
        }
        
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
