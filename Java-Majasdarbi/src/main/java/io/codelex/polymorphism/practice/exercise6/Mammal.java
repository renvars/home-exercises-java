package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType,
                  double animalWeight, int foodEaten,
                  String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String toString() {
        String weight = new DecimalFormat("#.#").format(getAnimalWeight());
        return getAnimalType() + "[" + getAnimalName() + "," +
                weight + "," + getFoodEaten() + "]";
    }

    public abstract void makeSound();

    public abstract void eat(Food food);
    //getters and setters

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
}
