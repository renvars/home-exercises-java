package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }
}
