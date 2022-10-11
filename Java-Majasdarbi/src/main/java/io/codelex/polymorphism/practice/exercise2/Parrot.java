package io.codelex.polymorphism.practice.exercise2;

public class Parrot implements Sound {
    @Override
    public void playSound() {
        System.out.println("I'm a human not a parrot!");
    }
}
