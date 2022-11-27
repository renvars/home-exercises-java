package io.codelex.classesandobjects.practice.car;

public class Car {
    private double startKilometers;
    private double endKilometers;

    private double liters = 0;
    public static final int GAS_HOG_CONSUMPTION = 15;

    public Car(double startOdo) {
        this.startKilometers = startOdo;

    }

    public double calculateConsumption() {
        double distance = endKilometers - startKilometers;
        return liters / distance * 100;
    }

    public boolean gasHog() {
        double fuel = calculateConsumption();

        return fuel > Car.GAS_HOG_CONSUMPTION;

    }

    public boolean economyCar() {
        double fuel = calculateConsumption();
        return fuel < 5;
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage + this.startKilometers;
        this.liters += liters;
    }
}
