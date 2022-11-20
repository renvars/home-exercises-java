package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Tiger extends Feline {
    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public String toString() {
        String weight = new DecimalFormat("#.#").format(getAnimalWeight());
        return getAnimalType() + "[" + getAnimalName() + "," +
                weight + "," + getLivingRegion() + "," + getFoodEaten() + "]";
    }

    @Override
    public void makeSound() {
        System.out.println("ROAR-RRR!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println(getAnimalType() + " doesn't eat vegetables!");
        } else {
            setFoodEaten(getFoodEaten());
            System.out.println(this);
        }
    }
}
