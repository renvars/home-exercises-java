package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();



        if (n < Long.MAX_VALUE) {

            if (n < 0) {
                n *= -1;
            }
            int numberLength = Long.toString(n).length();
            if (numberLength >= 11) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 1;
                if (numberLength == 2) {
                    digits = 2;
                } else if (numberLength == 3) {
                    digits = 3;
                } else if (numberLength == 4) {
                    digits = 4;
                } else if (numberLength == 5) {
                    digits = 5;
                } else if (numberLength == 6) {
                    digits = 6;
                } else if (numberLength == 7) {
                    digits = 7;
                } else if (numberLength == 8) {
                    digits = 8;
                } else if (numberLength == 9) {
                    digits = 9;
                } else if (numberLength == 10) {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }

    }

}
