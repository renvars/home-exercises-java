package io.codelex.arrays.practice;

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
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i]);
            if (i != myArray1.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }

        Arrays.sort(myArray1);
        System.out.println("Sorted numeric array : ");
        for (int j = 0; j < myArray1.length; j++) {
            System.out.print(myArray1[j]);
            if (j != myArray1.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
        System.out.println("Original string array : ");
        for (int y = 0; y < myArray2.length; y++) {
            System.out.print(myArray2[y]);
            if (y != myArray2.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }

        Arrays.sort(myArray2);
        System.out.println("Sorted string array : ");
        for (int x = 0; x < myArray2.length; x++) {
            System.out.print(myArray2[x]);
            if (x != myArray2.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }


    }
}
