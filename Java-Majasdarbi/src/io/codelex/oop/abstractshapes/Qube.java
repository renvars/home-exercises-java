package io.codelex.oop.abstractshapes;

public class Qube extends ThreeDShape {

    public final double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 12 * side;

        return roundNumber(perimeter);
    }

    @Override
    public double calculateArea() {
        //total surface area = 6 * a**2
        double area = 6 * Math.pow(side, 2);
        return roundNumber(area);
    }

    @Override
    public double calculateVolume() {
        double volume = Math.pow(side, 3);
        return roundNumber(volume);
    }
}
