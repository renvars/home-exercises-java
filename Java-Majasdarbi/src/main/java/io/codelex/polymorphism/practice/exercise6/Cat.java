package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, String animalType,
               double animalWeight, int foodEaten,
               String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public String toString() {
        String weight = new DecimalFormat("#.#").format(getAnimalWeight());
        return getAnimalType() + "[" + getAnimalName() + "," + getBreed() + "," +
                weight + "," + getLivingRegion() + "," + getFoodEaten() + "]";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(food.getFoodQuantity());
        System.out.println(this);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
