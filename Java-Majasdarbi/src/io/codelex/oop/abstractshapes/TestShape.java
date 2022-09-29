package io.codelex.oop.abstractshapes;

public class TestShape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        Rectangle rectangle = new Rectangle(8, 12);
        Hexagon hexagon = new Hexagon(10);
        Cone cone = new Cone(5, 10);
        Qube qube = new Qube(7);
        System.out.println("----------Triangle----------");
        System.out.println("Triangle perimeter ->" + triangle.calculatePerimeter());
        System.out.println("Triangle area -> " + triangle.calculateArea());
        System.out.println("----------Rectangle----------");
        System.out.println("Rectangle perimeter -> " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area -> " + rectangle.calculateArea());
        System.out.println("----------Hexagon----------");
        System.out.println("Hexagon perimeter -> " + hexagon.calculatePerimeter());
        System.out.println("Hexagon area -> " + hexagon.calculateArea());
        System.out.println("----------Cone----------");
        System.out.println("Cone perimeter -> " + cone.calculatePerimeter());
        System.out.println("Cone area -> " + cone.calculateArea());
        System.out.println("Cone total volume -> " + cone.calculateVolume());
        System.out.println("----------Qube----------");
        System.out.println("Qube perimeter -> " + qube.calculatePerimeter());
        System.out.println("Qube area -> " + qube.calculateArea());
        System.out.println("Qube total volume -> " + qube.calculateVolume());

    }
}
