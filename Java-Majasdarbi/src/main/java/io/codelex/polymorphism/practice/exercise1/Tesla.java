package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private final String name;

    public Tesla(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 11;
    }

    public void slowDown() {
        currentSpeed += 20;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("-- silence ---");
    }
}
