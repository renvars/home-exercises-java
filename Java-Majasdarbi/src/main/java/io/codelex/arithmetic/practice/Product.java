package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

public class Product {
    public static void main(String[] args) {
        System.out.println(Product1ToN());
    }

    public static int Product1ToN() {
        int result = 1;
        for (int i = 2; i <= 10; i++) {
            result *= i;
        }
        return result;
    }
    
}
