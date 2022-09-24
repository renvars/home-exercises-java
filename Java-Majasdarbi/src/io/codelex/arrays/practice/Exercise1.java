package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {


    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Original numeric array : ");
        toStringArray(myArray1);
        Arrays.sort(myArray1);
        System.out.println("Sorted numeric array : ");
        toStringArray(myArray1);
        System.out.println("=".repeat(25));
        System.out.println("Original string array : ");
        toStringArray(myArray2);
        Arrays.sort(myArray2);
        System.out.println("Sorted string array : ");
        toStringArray(myArray2);


    }

    public static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
    }

    public static void toStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
    }

}
