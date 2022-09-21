package io.codelex.classesandobjects.practice.car;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;

    public Car(double startOdo, double endingOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double distance = this.endKilometers - this.startKilometers;
        double literPerKm = distance / this.liters;
        return literPerKm;
    }
}
