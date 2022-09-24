package io.codelex.classesandobjects.practice.car;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Car firstCar = getReading(scan);
        Car secondCar = getReading(scan);
        System.out.printf("First cars Kilometers per liter are %.2f \n", firstCar.calculateConsumption());
        fuelEconomy(firstCar);
        System.out.printf("Second cars Kilometers per liter are %.2f \n", secondCar.calculateConsumption());
        fuelEconomy(secondCar);
    }

    public static Car getReading(Scanner scan) {
        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();
        return new Car(startKilometers, endKilometers, liters);
    }

    public static void fuelEconomy(Car car) {
        if (car.gasHog()) {
            System.out.println("This car is a gas Hog!");
        } else if (car.economyCar()) {
            System.out.println("This car is an economy car!");
        } else {
            System.out.println("This is an average car!");
        }

    }
}
