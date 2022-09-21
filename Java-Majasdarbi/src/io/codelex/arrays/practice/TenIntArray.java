package io.codelex.arrays.practice;

import java.util.Random;

public class TenIntArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        for (int i = 0; i < firstArray.length; i++) {
            int randomNr = random.nextInt(99) + 1;
            firstArray[i] = randomNr;
        }
        //Could have done it in the first loop but for the sake of README
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        firstArray[firstArray.length - 1] = -7;

        System.out.print("Array 1 :");
        for (int nr : firstArray) {
            System.out.print(nr + " ");
        }
        System.out.println("\n");
        System.out.print("Array 2 :");
        for (int nr : secondArray) {
            System.out.print(nr + " ");
        }

    }


}
