package io.codelex.typesandvariables.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberCalculator {
    public static void main(String[] args) {
        System.out.println("To stop the program write '69' ");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> allNumbers = new ArrayList<>();

        while (true) {
            System.out.print("Write a number: ");
            int number = in.nextInt();
            if (number == 69) {
                System.out.println("Stop Method Detected!");
                break;
            }
            allNumbers.add(number);
        }
        int result = 0;
        for (Integer number : allNumbers) {
            result += number;
        }
        System.out.println("The sum is -> " + result);
    }
}
