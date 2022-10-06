package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            int numerator = 0;
            int divisor = 0;
            try {
                System.out.print("Enter the numerator: ");
                numerator = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter the divisor: ");
                divisor = scanner.nextInt();
                scanner.nextLine();
                if (divisor == 0) {
                    System.out.println("You can't divide " + numerator + " by 0");
                } else {
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                }
            } catch (InputMismatchException e) {
                String input = scanner.nextLine();
                if (input.startsWith("q") || input.startsWith("Q")) {
                    loop = false;
                } else {
                    System.out.println("You entered bad data!");
                    System.out.println("Please try again");
                }
            }
        }
    }

}
