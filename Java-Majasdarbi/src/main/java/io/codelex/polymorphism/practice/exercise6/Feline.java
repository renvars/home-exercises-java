package io.codelex.polymorphism.practice.exercise6;

public abstract class Feline extends Mammal {

    public Feline(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    public abstract void makeSound();

    public abstract void eat(Food food);
}
