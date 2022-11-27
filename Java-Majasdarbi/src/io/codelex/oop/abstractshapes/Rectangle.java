package io.codelex.oop.abstractshapes;

public class Rectangle extends Shape {
    public final double width;
    public final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (width + height) * 2;
        return roundNumber(perimeter);
    }

    @Override
    public double calculateArea() {
        double area = width * height;
        return roundNumber(area);
    }
}
