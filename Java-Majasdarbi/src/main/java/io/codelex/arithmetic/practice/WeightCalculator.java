package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class WeightCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("This is a BMI calculator!");
        System.out.print("Input your weight (kilograms): ");
        double weight = in.nextFloat() * 2.20462262;
        System.out.print("Input your height (centimeters): ");
        double height = in.nextFloat() / 2.54;
        double bmi = weight * 703 / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("BMI is too small!");
        } else if (bmi < 25) {
            System.out.println("This is the optimal BMI!");
        } else {
            System.out.println("The BMI is too big!");
        }
    }

}
