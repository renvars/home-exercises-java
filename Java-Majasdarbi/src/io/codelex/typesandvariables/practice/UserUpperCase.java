package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class UserUpperCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write a Sting : ");
        String variable = in.nextLine();
        int result = 0;
        for (int i = 0; i < variable.length(); i++) {
            char character = variable.charAt(i);
            if (character == Character.toUpperCase(character)) {
                result++;
            }
        }
        System.out.println("You used " + result + " Uppercase letters!");
    }
}
