package io.codelex.oop.shapes;

public class TestShapes {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        Rectangle rectangle = new Rectangle(8, 17);

        //get methods for both
        System.out.println("Rectangle sides = " + rectangle.numSides());
        System.out.println("Triangle sides = " + triangle.numSides());

        //Functionality of Rectangle
        System.out.println("Rectangle perimeter = " + rectangle.getPerimeter());
        System.out.println("Rectangle area = " + rectangle.getArea());

        //Functionality of Triangle
        System.out.printf("Triangle perimeter = %.2f\n", triangle.getPerimeter());
        System.out.println("Triangle area = " + triangle.getArea());
    }
}
