package io.codelex.oop.cars;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class CarService {
    private ArrayList<Car> cars = new ArrayList<>();

    public CarService(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void listAllCars(ArrayList<Car> carArrayList) {
        System.out.println("List of all cars :");
        for (Car car : carArrayList) {
            System.out.println(car);
        }
    }

    public ArrayList<Car> carsWithV12() {
        ArrayList<Car> carsV12 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngine() == Engines.V12) {
                carsV12.add(car);
            }
        }
        if (carsV12.size() == 0) {
            System.out.println("No cars with a V12 engine!");
        }
        return carsV12.size() == 0 ? null : carsV12;

    }

    public ArrayList<Car> carsBefore1999() {
        ArrayList<Car> carsBefore = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacturer().isBefore(LocalDate.of(1999, 1, 1))) {
                carsBefore.add(car);
            }
        }
        return carsBefore;
    }

    public Car getMostExpensiveCar() {
        int mostExpensivePrice = 0;
        Car mostExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() > mostExpensivePrice) {
                mostExpensivePrice = car.getPrice();
                mostExpensiveCar = car;

            }
        }
        return mostExpensiveCar;
    }

    public Car getLeastExpensiveCar() {
        int leastExpensivePrice = cars.get(0).getPrice();
        Car leastExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() < leastExpensivePrice) {
                leastExpensivePrice = car.getPrice();
                leastExpensiveCar = car;

            }
        }
        return leastExpensiveCar;
    }

    public ArrayList<Car> atLeastThreeManufacturers() {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturers().size() >= 3) {
                carArrayList.add(car);
            }
        }
        return carArrayList;
    }

    public boolean isThereASpecificCar(String name) {
        for (Car car : cars) {
            if (car.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Car> isThereASpecificManufacturer(String name) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (Car car : cars) {
            for (int i = 0; i < car.getManufacturers().size(); i++) {
                if (car.getManufacturers().get(i).getName().equals(name)) {
                    carArrayList.add(car);
                }
            }
        }
        return carArrayList;
    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }

    public ArrayList<Car> manufacturerYearOfEstablishment(LocalDate year, String operator) {

        ArrayList<Car> carArrayList = new ArrayList<>();
        for (Car car : cars) {

            int manYear = car.getYearOfManufacturer().getYear();
            if (operator.equals("<")) {
                if (manYear < year.getYear()) {
                    carArrayList.add(car);
                }
            } else if (operator.equals(">")) {
                if (manYear > year.getYear()) {
                    carArrayList.add(car);
                }
            } else if (operator.equals("<=")) {
                if (manYear <= year.getYear()) {
                    carArrayList.add(car);
                }
            } else if (operator.equals(">=")) {
                if (manYear >= year.getYear()) {
                    carArrayList.add(car);
                }
            } else if (operator.equals("==")) {
                if (manYear == year.getYear()) {
                    carArrayList.add(car);
                }
            } else if (operator.equals("!=")) {
                if (manYear != year.getYear()) {
                    carArrayList.add(car);
                }
            }

        }
        return carArrayList;
    }
}
