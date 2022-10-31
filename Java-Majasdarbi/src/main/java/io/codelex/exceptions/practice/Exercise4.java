package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            String[] someArgs = new String[1];
            System.out.print("Enter a value: ");
            String doubleValue = in.nextLine();
            someArgs[0] = doubleValue;
            double d = getInput(someArgs[0]);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (IllegalArgumentException e) {
            System.out.println("Result will be imaginary.");
        }

    }

    static double getInput(String s) {
        double d = Double.parseDouble(s);

        return d;
    }
}
