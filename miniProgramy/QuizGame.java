package miniProgramy;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"What is the most valuable piece in chess?",
                              "Which part of the brain is associated with controlling heart rate, blood preassure or breathing?",
                              "What year did the WW1 end?",
                              "Who discovered Radium and Pollonium?",
                              "What was the first commercially available programming language?"};
        String[][] options = {{"1. King", "2. Rook", "3. Queen", "4. Bishop"},
                              {"1. Brainstem", "2. Corpus Callosum", "3. Cerebellum", "4. Frontal Lobe"},
                              {"1. 1919", "2. 1939", "3. 1945", "4. 1918"},
                              {"1. Albert Einstein", "2. Marie Skłodowska-Curie", "3. Nelson Mandela", "4. Charles Darwin"},
                              {"1. COBOL", "2. Fortran", "3. C", "4. Assembly"}};
        int[] answers = {3, 1, 4, 2, 2};
        int score = 0;
        int guess;

        System.out.println("------------------------------");
        System.out.println("Welcome to the Java quiz game!");
        System.out.println("------------------------------\n");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if(guess == answers[i]){
                System.out.println("--------");
                System.out.println("Correct!");
                System.out.println("--------");
                score++;
            }else{
                System.out.println("------");
                System.out.println("Wrong!");
                System.out.println("------");
            }
        }
        System.out.println("Your score was: " + score + "/" + questions.length);
        scanner.close();
    }
}
