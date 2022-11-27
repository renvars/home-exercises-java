package io.codelex.oop.shapes;

public abstract class Shape {
    private final int numSides;

    public Shape(int numSize) {
        this.numSides = numSize;
    }

    public int numSides() {
        return numSides;
    }

    abstract double getArea();

    abstract double getPerimeter();

}
