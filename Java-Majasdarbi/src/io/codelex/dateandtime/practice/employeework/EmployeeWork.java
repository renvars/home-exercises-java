package io.codelex.dateandtime.practice.employeework;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeWork {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting date (yyyy-mm-dd): ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter end date (yyyy-mm-dd): ");
        LocalDate endDate = LocalDate.parse(scanner.next());
        long workingDays = startDate.datesUntil(endDate).filter(day -> day.getDayOfWeek().getValue() <= 5).count();
        workingDays += 1;
        long workingHours = workingDays * 8;
        System.out.println("Employee worked for " + workingHours + " hours in " + workingDays + " days!");

    }
}
