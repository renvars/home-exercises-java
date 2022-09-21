package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int[] myArray = new int[maxNumber];
        int sum = 0;

        //add values to array
        for (int i = minNumber; i <= myArray.length; i++) {
            myArray[i - minNumber] = i;
        }
        //calculate them
        for (int number : myArray) {
            sum += number;
        }


        System.out.println("The sum is " + sum);
    }
}
