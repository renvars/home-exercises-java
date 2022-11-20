package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private String dimensions;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, String dimensions, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + (numberOfCopies * costPerCopy);
    }

    public String toString() {
        String res = super.toString();
        res += " Poster ad: dimensions=" + dimensions + "," +
                "Fee=" + fee + "," +
                "NumberOfCopies=" + numberOfCopies + "," +
                "costPerCopy=" + costPerCopy + "," +
                "totalCost=" + cost() + "\n";
        return res;
    }

    //Getters and Setters
    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getCostPerCopy() {
        return costPerCopy;
    }

    public void setCostPerCopy(int costPerCopy) {
        this.costPerCopy = costPerCopy;
    }
}
