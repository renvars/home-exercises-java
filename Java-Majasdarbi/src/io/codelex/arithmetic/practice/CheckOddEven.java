package io.codelex.arithmetic.practice;

public class CheckOddEven {
    public static void main(String[] args) {
        checkOddEven(5);
        checkOddEven(2);
        checkOddEven(10);
        checkOddEven(999);
        checkOddEven(1024);
        checkOddEven(1000000);

    }

    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("Bye! ;)");
    }

}
