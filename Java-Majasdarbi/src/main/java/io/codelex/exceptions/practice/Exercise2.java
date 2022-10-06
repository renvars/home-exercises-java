package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        methodA(100);
    }

    public static void methodA(int number) throws ArithmeticException {
        try {
            methodB(number);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void methodB(int number) throws ArithmeticException {
        try {
            methodC(number);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC(int number) throws ArithmeticException {
        try {
            int res = number / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
