package io.codelex.loops.practice;

import java.util.Scanner;

public class TwoWordSeperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int TOTAL_LENGTH = 30;
        System.out.println("Enter first word:");
        String firstWord = scanner.next();
        System.out.println("Enter first word:");
        String secondWord = scanner.next();
        int missingLength = TOTAL_LENGTH - firstWord.length() - secondWord.length();

        System.out.print(firstWord);
        for (int i = 0; i < missingLength; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);


    }
}
