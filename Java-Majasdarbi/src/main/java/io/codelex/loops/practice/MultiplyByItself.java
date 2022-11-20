package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.print("Choose the number to multiply : ");
        i = in.nextInt();


        for (int y = 0; y < n; y++) {
            i *= i;
        }
        System.out.printf("The power result is %d!", i);

    }

}
