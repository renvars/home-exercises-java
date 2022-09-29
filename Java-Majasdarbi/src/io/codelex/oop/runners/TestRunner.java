package io.codelex.oop.runners;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write in your fastest time running a marathon (min) :");
        int fastestTime = in.nextInt();
        System.out.print("Write in your slowest time running a marathon (min) :");
        int slowestTime = in.nextInt();
        System.out.println("When you ran the fastest time you were a/an : " + Runner.getFitnessLevel(fastestTime) + " runner");
        System.out.println("When you ran the slowest time you were a/an : " + Runner.getFitnessLevel(slowestTime) + " runner");

    }
}
