package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many minutes : ");
        int minutes = in.nextInt();
        int years = (int) (minutes / 525949.2);
        int hours = (int) (minutes % 525949.2) / 60;

        System.out.println("That is " + hours + " hours and " + years + " year/s!");
    }
}
