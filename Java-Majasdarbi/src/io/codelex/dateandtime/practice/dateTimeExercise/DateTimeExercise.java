package io.codelex.dateandtime.practice.dateTimeExercise;

import java.time.LocalDate;

import static java.time.DayOfWeek.FRIDAY;


public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        LocalDate tempDate = from;
        tempDate = LocalDate.of(tempDate.getYear(), tempDate.getMonth(), 13);

        while (true) {
            if (tempDate.getDayOfWeek() == FRIDAY && !tempDate.isBefore(from)) {
                break;
            }
            tempDate = tempDate.plusMonths(1);
        }
        return tempDate;

    }
}
