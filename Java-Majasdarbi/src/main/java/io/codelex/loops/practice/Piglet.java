package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");

        int score = 0;
        boolean roll = true;
        boolean rolledAOne = false;
        while (roll) {
            Random random = new Random();
            int diceRoll = random.nextInt(6) + 1;
            if (diceRoll == 1) {
                System.out.println("You rolled a " + diceRoll);
                System.out.println("You got 0 points!");
                roll = false;
                rolledAOne = true;
                break;
            } else {
                System.out.println("You rolled a " + diceRoll);
            }
            score += diceRoll;


            int inputstried = 0;
            while (true) {
                if (inputstried == 3) {
                    roll = false;
                    System.out.println("Too many invalid inputs!");
                    break;
                }
                System.out.print("Roll again? ");
                String rollAgain = scanner.nextLine();
                char compare = rollAgain.toLowerCase().charAt(0);
                if (compare == 'y') {
                    break;
                } else if (compare == 'n') {
                    roll = false;
                    break;
                } else {
                    System.out.println("Invalid input!");
                }
                inputstried++;
            }


        }
        if (!rolledAOne) {
            System.out.println("You got " + score + " points!");
        }

    }

}
