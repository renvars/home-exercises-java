package io.codelex.dateandtime.practice.dateTimeExercise;

import java.time.LocalDate;

public class TestDateTimeExercise {
    public static void main(String[] args) {
        LocalDate[] twoLocalDates = DateTimeExercise.getTwoLocalDates();
        for (LocalDate twoLocalDate : twoLocalDates) {
            System.out.println(DateTimeExercise.findNextFriday13th(twoLocalDate));
        }
        System.out.println(DateTimeExercise.findNextFriday13th(DateTimeExercise.createNewYearsEve2017()));

    }
}
