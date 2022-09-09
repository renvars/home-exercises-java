package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class CalculateSpeed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input distance in meters:");
        double meters = in.nextInt();
        System.out.print("Input hour:");
        double hours = in.nextInt();
        System.out.print("Input minutes:");
        double minutes = in.nextInt();
        System.out.print("Input seconds:");
        double seconds = in.nextInt();

        double metersSecond = meters / ((hours * 60 * 60) + (minutes * 60) + seconds);
        double kilometersHour = (meters / 1000) / (hours + (minutes / 60) + (seconds / 60 / 60));
        double milesHour = (meters / 1609) / (hours + (minutes / 60) + (seconds / 60 / 60));
        System.out.println("Your speed in meters/second is " + metersSecond);
        System.out.println("Your speed in km/h is " + kilometersHour);
        System.out.println("Your speed in miles/h is " + milesHour);
    }
}
