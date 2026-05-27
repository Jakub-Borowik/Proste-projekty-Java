package miniProgramy.Hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        String filePath = "miniProgramy\\Hangman\\slowa_wisielec.txt";
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String word ="";
        String wordPick = "";

        while(!wordPick.equals("own") && !wordPick.equals("base")){ // Kontynuuj gdy wordPick != own i wordPick != base.
        System.out.print("Would you like to create your own word or get one random? (own/base): ");
        wordPick = scanner.nextLine().toLowerCase();
        }

        if (wordPick.equals("base")) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }

        Random random = new Random();
        word = words.get(random.nextInt(words.size()));
        } else if (wordPick.equals("own")) {
            System.out.print("Please enter a word you would like: ");
            word = scanner.nextLine().toLowerCase();
            System.out.println("\n\n\n\n\n\n\n\n");
        }

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
            if(wordState.contains(guess)) {
                wrongGuesses++;
                System.out.println("You already guessed it!\n");
            } else {
            System.out.println("Correct!\n");
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == guess){
                    wordState.set(i, guess);
                    }
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
