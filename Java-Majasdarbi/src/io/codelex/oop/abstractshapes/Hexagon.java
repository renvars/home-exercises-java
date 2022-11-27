package io.codelex.oop.abstractshapes;

public class Hexagon extends Shape {
    public final double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return roundNumber((side * 6) / 2);
    }

    @Override
    public double calculateArea() {
        double apothem = Math.sqrt(3) / 2 * side;
        double area = ((3 * Math.sqrt(3) * Math.pow(side, 2)) / 2) / 4;

        return roundNumber(area);
    }
}
