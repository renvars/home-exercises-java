package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;

    private int foodEaten;

    public Animal(String animalName, String animalType,
                  double animalWeight, int foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    //Setters and Getters
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten += foodEaten;
    }
    //TO STRING


    public abstract void makeSound();

    public abstract void eat(Food food);
}
