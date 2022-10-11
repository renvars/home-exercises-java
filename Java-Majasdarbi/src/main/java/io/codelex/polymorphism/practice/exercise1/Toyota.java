package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car, Boost {
    private final String name;

    public Toyota(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 9;
    }

    public void slowDown() {
        currentSpeed += 9;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Ptsssss...Ptsssss...Brrrr");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }
}
