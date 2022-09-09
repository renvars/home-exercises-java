package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        float sum = 0;
        float average;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = sum / (upperBound - lowerBound + 1);
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + (int)sum);
        System.out.println("The average is " + String.format("%.1f" ,average));
    }
}
