package io.codelex.classesandobjects.practice.car;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Car firstCar = newCar(scan);
        Car secondCar = newCar(scan);
        firstCar.fillUp(1000, 5);
        System.out.printf("First cars Kilometers per liter are %.2f \n", firstCar.calculateConsumption());
        fuelEconomy(firstCar);
        secondCar.fillUp(1000, 1000);
        System.out.printf("Second cars Kilometers per liter are %.2f \n", secondCar.calculateConsumption());
        fuelEconomy(secondCar);
    }

    public static Car newCar(Scanner scan) {
        double startKilometers;

        System.out.print("Enter startReading reading: ");
        startKilometers = scan.nextDouble();

        return new Car(startKilometers);
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
