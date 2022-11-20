package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CalculateFifteen {
    public static void main(String[] args) {
        System.out.println(isFifteen(15, 1));
        System.out.println(isFifteen(7, 8));
        System.out.println(isFifteen(2, 15));
        System.out.println(isFifteen(31, 16));
        System.out.println(isFifteen(16, 31));
        System.out.println(isFifteen(2, 3));

    }

    public static boolean isFifteen(int first, int second) {
        return first + second == 15 || first == 15 || second == 15 || first - second == 15 || second - first == 15;
    }
}
