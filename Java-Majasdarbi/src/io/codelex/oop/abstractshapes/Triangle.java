package io.codelex.oop.abstractshapes;

public class Triangle extends Shape {
    public final double base;
    public final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        double thirdSide = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        thirdSide = Math.round(thirdSide * 100.0) / 100.0;
        return roundNumber(thirdSide + base + height);
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * (base * height);
        return roundNumber(area);
    }
}
