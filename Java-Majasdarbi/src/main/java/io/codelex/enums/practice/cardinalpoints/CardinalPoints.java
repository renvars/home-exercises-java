package io.codelex.enums.practice.cardinalpoints;

public enum CardinalPoints {
    NORTH("up", "North"),
    SOUTH("down", "South"),
    EAST("right", "East"),
    WEST("left", "West");

    private final String direction;
    private final String name;

    CardinalPoints(String direction, String name) {
        this.direction = direction;
        this.name = name;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getName() {
        return this.name;
    }

}
