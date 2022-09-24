package io.codelex.classesandobjects.practice.car;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo, double endingOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double distance = endKilometers - startKilometers;
        return liters / distance * 100;
    }

    public boolean gasHog() {
        double fuel = calculateConsumption();
        return fuel > 15;
    }

    public boolean economyCar() {
        double fuel = calculateConsumption();
        return fuel < 5;
    }

    public void fillUp(int mileage, double liters) {

    }
}
