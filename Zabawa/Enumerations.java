package Zabawa;

import java.util.Scanner;

public class Enumerations {
    // Fixed set of constants, improves code readibility - while using switches, enums are faster than strings.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
                    DayEnum day = DayEnum.valueOf(response);

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It's a weekend");
        }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day.");
        }
        scanner.close();
    }
}
