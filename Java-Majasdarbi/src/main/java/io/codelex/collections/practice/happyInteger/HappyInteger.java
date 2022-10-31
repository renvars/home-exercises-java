package io.codelex.collections.practice.happyInteger;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HappyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String num = in.nextLine();
        isHappy(num);


    }

    public static void isHappy(String number) {
        while (number.length() != 1) {
            int temp = 0;
            for (int i = 0; i < number.length(); i++) {
                temp += Math.pow(Integer.parseInt(String.valueOf(number.charAt(i))), 2);
            }
            number = String.valueOf(temp);
        }
        if (number.equals("1")) {
            System.out.println("This is a happy integer :)");
        } else {
            System.out.println("This is NOT a happy integer :(");
        }
    }

}
