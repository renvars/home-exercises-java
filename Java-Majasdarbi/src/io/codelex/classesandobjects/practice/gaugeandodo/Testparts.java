package io.codelex.classesandobjects.practice.gaugeandodo;

public class Testparts {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(30);
        Odometer odometer = new Odometer(100);

        //fill the tank up to 70 litres
        int missingLitres = 70 - fuelGauge.getLiters();
        for (int i = 0; i < missingLitres + 10; i++) {
            fuelGauge.incrementLiters();
        }
        System.out.println("Liters : " + fuelGauge.getLiters());

        //simulate adding to the odometer
        int missingMileage = 999999 - odometer.getMileage();
        for (int i = 0; i <= missingMileage + 10; i++) {
            odometer.incrementMileage();
        }
        System.out.println("Mileage gas to be 10 : " + odometer.getMileage());
    }
}
