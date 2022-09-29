package io.codelex.oop.abstractshapes;

public abstract class Shape {
    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public static double roundNumber(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
