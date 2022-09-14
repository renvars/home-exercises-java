package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Desired sum : ");
        int sum = in.nextInt();
        int currentSum = 0;
        while (sum != currentSum){
            Random random = new Random();
            int firstDice = random.nextInt(6) + 1;
            int secondDice = random.nextInt(6) + 1;
            currentSum = firstDice + secondDice;
            System.out.println(firstDice + " and " + secondDice + " = " + currentSum);
        }
    }
}
