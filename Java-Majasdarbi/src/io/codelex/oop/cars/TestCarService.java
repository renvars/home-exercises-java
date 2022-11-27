package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestCarService {
    public static final int CARS_TO_GENERATE = 10;

    public static CarService carService = new CarService(addRandomCars());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is the dealership!");
        System.out.println("Some cars will be added automatically but you can do that by hand also");

        while (true) {
            if (mainScreen(in)) {
                mainScreen(in);
            } else {
                break;
            }


        }
    }

    public static boolean mainScreen(Scanner in) {
        Random random = new Random();
        logChoices();
        int choice = in.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Thanks for visiting!");
                return false;

            case 1:
                carService.addCar(createRandomCar());
                System.out.println("Added a random car!");
                break;
            case 2:
                int randomNr = random.nextInt(carService.getCars().size());
                carService.removeCar(carService.getCars().get(randomNr));
                System.out.println("Removed a random car");
                break;
            case 4:
                System.out.println(carService.carsWithV12());
                break;
            case 5:
                System.out.println(carService.carsBefore1999());
                break;
            case 6:
                System.out.println(carService.getMostExpensiveCar());
                break;
            case 7:
                System.out.println(carService.getLeastExpensiveCar());
                break;

            case 8:
                System.out.println(carService.atLeastThreeManufacturers());
                break;
            case 9:
                System.out.print("Is there a car named Toyota:");
                System.out.print(carService.isThereASpecificCar("Toyota"));
                break;
            case 10:
                System.out.println(carService.isThereASpecificManufacturer("Toyota Motor Corp"));
                break;
            case 11:
                System.out.println(carService.manufacturerYearOfEstablishment(LocalDate.of(1980, 1, 1), "<"));
                break;
            case 3:
                carService.listAllCars(carService.getCars());
                break;
            case 12:
                equalityChecker();
                break;

        }
        return true;
    }

    public static void logChoices() {
        System.out.println("===============================================================");
        System.out.println("These are all the options:");
        System.out.println("Type '0' to exit,");
        System.out.println("Type '1' to add a car,");
        System.out.println("Type '2' to remove a car,");
        System.out.println("Type '3' to list all cars,");
        System.out.println("Type '4' to see all cars with 'V12' engines,");
        System.out.println("Type '5' to see cars build before 1999,");
        System.out.println("Type '6' to see the most expensive car,");
        System.out.println("Type '7' to see the least expensive car,");
        System.out.println("Type '8' for cars with >= 3 manufacturers,");
        System.out.println("Type '9' to see if a specific car is here,");
        System.out.println("Type '10' to see a specific manufacturers cars,");
        System.out.println("Type '11' to see cars made by manufacturers in respect to a year,");
        System.out.println("Type '12' to check two car equality before and after changes,");
    }

    public static Car createRandomCar() {
        Random random = new Random();
        ArrayList<Manufacturer> manufacturers = addRandomManufacturers();
        String randomModel = CarHelperClass.MODELS[random.nextInt(CarHelperClass.MODELS.length)];
        String randomName = CarHelperClass.NAMES[random.nextInt(CarHelperClass.NAMES.length)];
        int randomYear = random.nextInt(1900, 2023);
        LocalDate randomYearManufactured = LocalDate.of(randomYear, 1, 1);
        int randomPrice = random.nextInt(10_000, 99_999);
        int randomEngineNr = random.nextInt(Engines.values().length);
        Engines randomEngine = Engines.values()[randomEngineNr];
        return new Car(randomName, randomModel, randomPrice, randomYearManufactured, manufacturers, randomEngine);

    }

    public static ArrayList<Car> addRandomCars() {
        Random random = new Random();
        ArrayList<Car> result = new ArrayList<>();
        //Add total of 5 cars

        for (int i = 0; i < CARS_TO_GENERATE; i++) {
            result.add(createRandomCar());
        }
        return result;
    }

    ;

    public static ArrayList<Manufacturer> addRandomManufacturers() {
        Random random = new Random();
        ArrayList<Manufacturer> result = new ArrayList<>();
        //min - 1, max 4;
        int manufacturerAmnt = random.nextInt(1, 5);
        for (int i = 0; i < manufacturerAmnt; i++) {
            int randomInt = random.nextInt(CarHelperClass.MANUFACTURERS.length);
            String name = CarHelperClass.MANUFACTURERS[randomInt];
            LocalDate year = CarHelperClass.YEAR_OF_ORIGIN[randomInt];
            String country = CarHelperClass.COUNTRY_MANUFACTURER[randomInt];
            result.add(new Manufacturer(name, year, country));
        }
        return result;
    }

    public static void equalityChecker() {
        Car car1 = createRandomCar();
        Car car2 = new Car(car1.getName(), car1.getModel(), 10000, car1.getYearOfManufacturer(), car1.getManufacturers(), car1.getEngine());
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("<><><><><>ONLY PRICE CHANGES<><><><>");
        System.out.println("===========BEFORE CHANGE===========");
        System.out.println("Is equal? : " + car1.equals(car2));
        car2.setPrice(car1.getPrice());
        System.out.println("============AFTER CHANGE===========");
        System.out.println("Is equal? : " + car1.equals(car2));
    }
}
