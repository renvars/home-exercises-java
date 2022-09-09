package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To stop the game write '420' ");
        System.out.print("Im thinking of a number from 1-100, try to guess:");


        int myNumber = (int)(Math.random() * 100);

        while(true){
            int guess = in.nextInt();
            if(guess == 420){
                System.out.println("Stopping program!");
                break;
            }
            if(guess == myNumber){
                System.out.println("NICE ONE, Right on!");
                break;
            }else if(guess > myNumber){
                System.out.print("Too High buddy! Guess Again :");
            }else{
                System.out.print("Too Low My Man! Guess Again :");
            }
        }

    }

}
