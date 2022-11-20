package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number of the week (1 - 7) : ");
        int weekday = scanner.nextInt();
        if (weekday < 1 || weekday > 7) {
            System.out.print("Invalid number! Choose again : ");
            weekday = scanner.nextInt();
            if (weekday < 1 || weekday > 7) {
                System.out.print("Invalid number! Choose again : ");
                weekday = scanner.nextInt();
                if (weekday < 1 || weekday > 7) {
                    System.out.print("That's it, I'm out of patience! Bye.");
                }
            }
        } else {
            switch (weekday) {
                case 1 -> System.out.println("This is a Monday!");
                case 2 -> System.out.println("This is a Tuesday!");
                case 3 -> System.out.println("This is a Wednesday!");
                case 4 -> System.out.println("This is a Thursday!");
                case 5 -> System.out.println("This is a Friday!");
                case 6 -> System.out.println("This is a Saturday!");
                default -> System.out.println("This is a Sunday!");
            }
        }


    }


}
