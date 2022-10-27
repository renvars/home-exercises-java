package io.codelex.classesandobjects.practice.gaugeandodo;

public class FuelGauge {
    private int liters;
    public static final int MAX_FUEL_CAPACITY = 70;

    public FuelGauge(int liters) {
        this.liters = liters;
    }

    public int getLiters() {
        return this.liters;
    }

    public void incrementLiters() {
        if (this.liters < FuelGauge.MAX_FUEL_CAPACITY) {
            this.liters++;
        }
    }

    public void decrementLiters() {
        if (this.liters > 0) {
            this.liters--;
        }
    }


}
