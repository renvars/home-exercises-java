package io.codelex.classesandobjects.practice.gaugeandodo;

public class FuelGauge {
    private int liters;

    public FuelGauge(int liters) {
        this.liters = liters;
    }

    public int getLiters() {
        return this.liters;
    }

    public void incrementLiters() {
        if (this.liters < 70) {
            this.liters++;
        }
    }

    public void decrementLiters() {
        if (this.liters > 0) {
            this.liters--;
        }
    }


}
