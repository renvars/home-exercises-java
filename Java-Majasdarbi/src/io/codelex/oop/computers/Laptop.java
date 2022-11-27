package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private int batteryUsageTime;


    public Laptop(String processor, String ram, String graphicsCard, String company, String model, int batteryUsageTime) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryUsageTime = batteryUsageTime;
    }

    //GETTERS SETTERS

    public String getProcessorLaptop() {
        return this.getProcessor();
    }

    public void setProcessorLaptop(String processor) {
        this.setProcessor(processor);
        ;
    }

    public String getRamLaptop() {
        return this.getRam();
    }

    public void setRamLaptop(String ram) {
        this.setRam(ram);
    }

    public String getGraphicsCardLaptop() {
        return this.getGraphicsCard();
    }

    public void setGraphicsCardLaptop(String graphicsCard) {
        this.setGraphicsCard(graphicsCard);
    }

    public String getCompanyLaptop() {
        return this.getCompany();
    }

    public void setCompanyLaptop(String company) {
        this.setCompany(company);
    }

    public String getModelLaptop() {
        return this.getModel();
    }

    public void setModelLaptop(String model) {
        this.setModel(model);
    }

    public int getBatteryUsageTime() {
        return batteryUsageTime;
    }

    public void setBatteryUsageTime(int batteryUsageTime) {
        this.batteryUsageTime = batteryUsageTime;
    }

    //EQUALS && HASH
    public String toString() {
        return "Laptop={processor='" + getProcessorLaptop() + "',ram='" +
                getRamLaptop() + "',graphics='" + getGraphicsCardLaptop() + "',company='" +
                getCompanyLaptop() + "',model='" + getModelLaptop() + "',batteryLife='" +
                getBatteryUsageTime() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        Computer computer = (Computer) o;
        return batteryUsageTime == laptop.batteryUsageTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryUsageTime);
    }
}
