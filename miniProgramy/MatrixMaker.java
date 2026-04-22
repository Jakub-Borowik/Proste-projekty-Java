package miniProgramy;

import java.util.Scanner;

public class MatrixMaker {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

    for(int j = 0; j < rows; j++){
        for(int i = 0; i < columns; i++){
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
        
        scanner.close();
    }
    
}
