package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {
    private final String name;
    private final String model;
    private int price;
    private final LocalDate yearOfManufacturer;
    private ArrayList<Manufacturer> manufacturers;
    private final Engines engine;

    public Car(String name, String model, int price, LocalDate yearOfManufacturer, ArrayList<Manufacturer> manufacturers, Engines engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacturer = yearOfManufacturer;
        this.manufacturers = manufacturers;
        this.engine = engine;
    }
    //GETTERS AND SETTERS

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturers(ArrayList<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public ArrayList<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public Engines getEngine() {
        return engine;
    }

    public String toString() {
        StringBuilder res = new StringBuilder("Car:{name=\"" + name + "\",model=\""
                + model + "\",price=\""
                + price + "\",yearOfManufacture=\""
                + yearOfManufacturer + "\",engineType=\""
                + engine + "\",manufacturers=\"{");
        for (Manufacturer m : manufacturers) {
            res.append(m.toString());
        }
        res.append("}\n");
        return res.toString();
    }
}
