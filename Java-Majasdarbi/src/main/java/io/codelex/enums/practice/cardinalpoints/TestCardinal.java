package io.codelex.enums.practice.cardinalpoints;

public class TestCardinal {
    public static void main(String[] args) {
        for (int i = 0; i < CardinalPoints.values().length; i++) {
            CardinalPoints point = CardinalPoints.values()[i];
            System.out.println(point.getName() + ":" + point.getDirection() + ":" + i);
        }
    }
}
