package io.codelex.dateandtime.practice.serverupdate;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class ServerUpdate {
    private final static LocalDate serverLaunch = LocalDate.of(2020, 8, 10);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Date are you looking for(yyyy-mm-dd):");
        LocalDate date = LocalDate.parse(in.nextLine());

        //to include the end day in calculations
        date = date.plusDays(1);
        whenAreUpdatesNeeded(date);
    }

    private static void whenAreUpdatesNeeded(LocalDate date) {
        long weeks = ChronoUnit.WEEKS.between(serverLaunch, date);
        if (weeks > 2) {
            for (int i = 2; i <= weeks; i += 2) {
                System.out.println("Updates needed on " + serverLaunch.plusWeeks(i));
            }
        } else {
            System.out.println("No updates needed!");
        }
        long totalUpdates = weeks % 2 == 0 ? weeks / 2 : (weeks - 1) / 2;
        System.out.println("Total updates needed = " + totalUpdates);

    }
}
