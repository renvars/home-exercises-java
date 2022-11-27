package io.codelex.dateandtime.practice.dateperiod;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePeriodTest {
    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2021, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2023, 1, 10);
        LocalDate secondEnd = LocalDate.of(2023, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        if (overlap != null) {
            String overlapStartFormatted = formatDates(overlap.getStart());
            String overlapEndFormatted = formatDates(overlap.getEnd());
            //overlap variable should have start date 10.01.2022 and end date 15.01.2022
            System.out.println("The start of overlap is " + overlapStartFormatted + " and the end is " + overlapEndFormatted);
        } else {
            System.out.println("These dates don't overlap at all!");
        }

    }

    private static String formatDates(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return date.format(format);
    }
}
