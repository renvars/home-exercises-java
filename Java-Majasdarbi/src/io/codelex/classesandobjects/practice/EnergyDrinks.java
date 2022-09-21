package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    final static int NUMBERED_SURVEYED = 12467;
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        double energyDrinkers = calculateEnergyDrinkers(NUMBERED_SURVEYED);
        double preferCitrus = calculatePreferCitris(NUMBERED_SURVEYED);
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return Math.floor(numberSurveyed * PURCHASED_ENERGY_DRINKS);
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        return Math.floor(numberSurveyed * PREFER_CITRUS_DRINKS);
    }
}
