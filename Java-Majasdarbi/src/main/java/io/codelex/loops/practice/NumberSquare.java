package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number to square : ");
        double num = scanner.nextDouble();
        double result = Math.pow(num, 2);
        System.out.printf("The result is %.2f", result);
    }
}
