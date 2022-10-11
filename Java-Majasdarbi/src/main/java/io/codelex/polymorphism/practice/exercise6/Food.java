package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    private int foodQuantity;

    public Food(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }
}
