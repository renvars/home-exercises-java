package io.codelex.polymorphism.practice.exercise1;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> cars = getCars();
        printFastestCar(cars);

    }

    public static void printFastestCar(List<Car> cars) {
        for (int i = 0; i < 10; i++) {
            cars.forEach(Car::speedUp);
            if (i == 3) {
                cars.stream().filter(car -> car instanceof Boost).forEach(car -> ((Boost) car).useNitrousOxideEngine());
            }
            int max = 0;
            Car maxCar = null;
            for (Car car : cars) {
                if (Integer.parseInt(car.showCurrentSpeed()) > max) {
                    max = Integer.parseInt(car.showCurrentSpeed());
                    maxCar = car;
                }
            }
            assert maxCar != null;
            System.out.println("Max car is " + maxCar.getName() + " and the speed is " + max);
        }
    }

    public static ArrayList<Car> getCars() {
        ArrayList<Car> cars = new ArrayList<>();
        Bmw bmw = new Bmw("BMW");
        Audi audi = new Audi("AUDI");
        Lada lada = new Lada("LADA");
        Lexus lexus = new Lexus("LEXUS");
        Tesla tesla = new Tesla("TESLA");
        Toyota toyota = new Toyota("TOYOTA");
        cars.add(bmw);
        cars.add(audi);
        cars.add(lada);
        cars.add(lexus);
        cars.add(tesla);
        cars.add(toyota);
        return cars;
    }
}
