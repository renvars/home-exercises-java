package io.codelex.oop.abstractshapes;

public class Cone extends ThreeDShape {
    public final double radius;
    public final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        //2πr
        double perimeter = Math.PI * 2 * radius;
        return roundNumber(perimeter);
    }

    @Override
    public double calculateArea() {
        //πr(r + √(h² + r²))
        double area = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        return roundNumber(area);
    }

    @Override
    public double calculateVolume() {
        //(1/3)πr2h
        double volume = (1.0 / 3.0) * Math.PI * radius * 2 * height;
        return roundNumber(volume);
    }
}
