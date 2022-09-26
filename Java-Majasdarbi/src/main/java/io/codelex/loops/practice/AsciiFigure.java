package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What will be the tower height? ");
        int height = scanner.nextInt();
        drawAscii(height);
        while (true) {
            System.out.println("To stop drawing write 420");
            System.out.print("Next height drawing? ");
            int nextHeight = scanner.nextInt();
            if (nextHeight == 420) {
                System.out.println("Program terminated! Bye");
                break;
            }
            drawAscii(nextHeight);
        }
    }

    private static void drawAscii(int towerHeight) {
        int nextStep = 8;
        int maxWidth = nextStep * (towerHeight - 1);
        for (int i = 0; i < towerHeight; i++) {
            int repetitionSides = (maxWidth - nextStep * i) / 2;
            System.out.println("/".repeat(repetitionSides) + "*".repeat(nextStep * i) + "\\".repeat(repetitionSides));
        }
    }

}
