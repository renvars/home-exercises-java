package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("Iaaaa, Iaaaa (Zebra btw)");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(getAnimalType() + " does not eat meat!");
        } else {
            setFoodEaten(food.getFoodQuantity());
            System.out.println(this);
        }
    }
}