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
            secondArray[i] = firstArray[i];
        }
        firstArray[firstArray.length - 1] = -7;

        System.out.print("Array 1 :");
        printArray(firstArray);
        System.out.println("\n");
        System.out.print("Array 2 :");
        printArray(secondArray);

    }

    public static void printArray(int[] array) {
        for (int nr : array) {
            System.out.print(nr + " ");
        }
    }


}
