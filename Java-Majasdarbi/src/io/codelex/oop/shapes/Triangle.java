package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private final double width;
    private final double height;

    public Triangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (height * width);
    }

    //getting perimeter not knowing what kind of triangle that is or where the
    //height is located on width (assuming that is the base) is impossible
    //I will assume that the triangle is a right angle
    @Override
    public double getPerimeter() {
        double thirdSide = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        return thirdSide + width + height;
    }

}
