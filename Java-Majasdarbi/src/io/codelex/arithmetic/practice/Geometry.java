package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        double pi = 3.14;
        return 2 * (radius.multiply(BigDecimal.valueOf(pi)).doubleValue());
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {

        return (base.multiply(h)).doubleValue() * 0.5;
    }
}
