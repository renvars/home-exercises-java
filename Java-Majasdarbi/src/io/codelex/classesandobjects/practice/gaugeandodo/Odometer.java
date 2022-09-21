package io.codelex.classesandobjects.practice.gaugeandodo;

public class Odometer {
    int mileage;
    int currentMileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
        this.currentMileage = mileage;
    }

    public int getMileage() {
        return this.currentMileage;
    }

    public void incrementMileage() {
        if (this.currentMileage < 999_999) {
            this.currentMileage++;
        } else if (this.currentMileage == 999_999) {
            this.currentMileage = 0;
        }
    }

    public void fuelConsumption(FuelGauge fuelGauge) {
        int litersConsumed = (currentMileage - mileage) / 10;
        for (int i = 0; i < litersConsumed; i++) {
            fuelGauge.decrementLiters();
        }
    }
}
