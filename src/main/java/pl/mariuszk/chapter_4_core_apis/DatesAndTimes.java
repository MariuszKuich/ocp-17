package pl.mariuszk.chapter_4_core_apis;

import java.time.*;

public class DatesAndTimes {

    public static void main(String[] args) {
        // Month enum can be used when creating LocalDate / LocalDateTime instances
        LocalDate date = LocalDate.of(2023, Month.OCTOBER, 10);
        LocalDateTime dateTime = LocalDateTime.of(2023, Month.OCTOBER, 10, 16, 44);

        // creating ZonedDateTime
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime dateTime2 = ZonedDateTime.of(LocalDate.of(2022, 1, 20), LocalTime.of(6, 15, 30, 200), zone);
        ZonedDateTime dateTime3 = ZonedDateTime.of(LocalDateTime.of(2022, 1, 20, 6, 15, 30, 200), zone);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
        // Remember: The date and time classes have private constructors.
        // Instances can be created with static of() methods (factory pattern).
        // Passing invalid numbers (e.g. day 32) to of() methods will result in an exception.
    }
}
