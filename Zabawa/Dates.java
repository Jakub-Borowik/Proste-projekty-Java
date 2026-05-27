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

        LocalDate date = LocalDate.now();
        Instant instant = Instant.now();
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println(date);
        System.out.println(newDateTime);
    }
}
