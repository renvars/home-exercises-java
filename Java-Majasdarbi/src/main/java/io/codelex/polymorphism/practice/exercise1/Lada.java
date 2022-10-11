package io.codelex.polymorphism.practice.exercise1;

public class Lada implements Car {
    private final String name;

    public Lada(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 1;
    }

    public void slowDown() {
        currentSpeed += 1;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Honestly...just let it die in piece");
    }
}
