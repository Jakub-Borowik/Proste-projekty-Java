package Zabawa;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        Instant instant = Instant.now();
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println(newDateTime);

        LocalDate date = LocalDate.of(2024, 12, 25); // Year, month, day
        System.out.println(date);
        LocalDateTime pickedDateTime = LocalDateTime.of(2023, 12, 31, 23, 59, 59);
        System.out.println(pickedDateTime);
        LocalDateTime dateForIfStatement = LocalDateTime.of(2024, 1, 1, 0, 0, 0);

        if (pickedDateTime.isBefore(dateForIfStatement)) {
            System.out.println(pickedDateTime + " is earlier than " + dateForIfStatement);
        } else if(pickedDateTime.isAfter(dateForIfStatement)) {
            System.out.println(pickedDateTime + " is later than " + dateForIfStatement);
        } else {
            System.out.println("Both dates are the same");
        }
    }
}
