package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Larges number is num1 -> " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Larges number is num2 -> " + num2);
        } else {
            System.out.println("Larges number is num3 -> " + num3);
        }

    }

}
