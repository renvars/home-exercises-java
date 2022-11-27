package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int price;
    private LocalDate yearOfManufacturer;
    private ArrayList<Manufacturer> manufacturers;
    private Engines engine;

    public Car(String name, String model, int price, LocalDate yearOfManufacturer, ArrayList<Manufacturer> manufacturers, Engines engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacturer = yearOfManufacturer;
        this.manufacturers = manufacturers;
        this.engine = engine;
    }
    //GETTERS AND SETTERS


    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfManufacturer(LocalDate yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public void setEngine(Engines engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && name.equals(car.name) && model.equals(car.model) && yearOfManufacturer.equals(car.yearOfManufacturer) && manufacturers.equals(car.manufacturers) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacturer, manufacturers, engine);
    }
}
