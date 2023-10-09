package pl.mariuszk.chapter_4_core_apis;

import java.time.*;
import java.time.temporal.ChronoUnit;

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

        // periods - for bigger units of time
        var annually = Period.ofYears(1);
        var monthly = Period.ofMonths(1);
        var weekly = Period.ofWeeks(1);
        var daily = Period.ofDays(1);
        var everyYearAndWeek = Period.of(1, 0, 7);
        // print format: P1Y2M3D (only non-zero parts are printed)
        System.out.println(Period.of(1, 2, 3));
        // periods' of() methods cannot be chained
        var weekly1 = Period.ofYears(1).ofWeeks(1);
        // periods can be used with LocalDate, LocalDateTime  and ZonedDateTime objects
        LocalDate datePeriod = LocalDate.of(2022, 1, 1).plus(annually);
        System.out.println(datePeriod);

        // durations - for smaller units of time
        var daily1 = Duration.ofDays(1);
        var hourly = Duration.ofHours(1);
        var everyMinute = Duration.ofMinutes(1);
        var everySecond = Duration.ofSeconds(1);
        var everyMilli = Duration.ofMillis(1);
        var everyNano = Duration.ofNanos(1);
        // print format: PT24H
        System.out.println(daily1);
        // print format: PT1M
        System.out.println(everyMinute);
        // print format: PT0.001S
        System.out.println(everyMilli);
        // ChronoUnit can be used
        var every10Minutes = Duration.of(10, ChronoUnit.MINUTES);
        // durations can be used with LocalTime, LocalDateTime and ZonedDateTime objects
        LocalDateTime dateTimeDuration = LocalDateTime.now().plus(every10Minutes);

        // instants
        var now = Instant.now();
        // ZonedDateTime can be turned into an Instant. LocalDateTime cannot be turned into an Instant (no zone info).
        var zdt = ZonedDateTime.of(LocalDate.of(2022, 9, 10), LocalTime.of(1, 0),
                ZoneId.of("US/Eastern"));
        var zdtInstant = zdt.toInstant();
        System.out.println("ZonedDateTime: " + zdt);
        System.out.println("Instant: " + zdtInstant);
    }
}
