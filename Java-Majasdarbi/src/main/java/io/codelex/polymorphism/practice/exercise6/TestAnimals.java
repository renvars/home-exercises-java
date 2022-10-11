package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAnimals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Mammal> animals = new ArrayList<>();
        while (true) {
            Mammal mammal = getMammal(in);
            if (mammal == null) {
                animals.forEach(animal -> System.out.println(animal));
                break;
            }
            mammal.makeSound();
            Food food = getFood(in);
            if (food == null) {
                animals.forEach(animal -> System.out.print(animal));
                break;
            }

            animals.add(mammal);
            mammal.eat(food);
        }
    }

    public static Food getFood(Scanner in) {
        String[] input = in.nextLine().split(" ");
        int quantity = Integer.parseInt(input[1]);
        if (input[0].equals("Meat")) {
            return new Meat(quantity);
        } else if (input[0].equals("Vegetable")) {
            return new Vegetable(quantity);
        }
        return null;
    }

    public static Mammal getMammal(Scanner in) {
        String[] input = in.nextLine().split(" ");
        String mammal = input[0];
        if (mammal.equals("Zebra")) {
            return new Zebra(input[1], input[0], Double.parseDouble(input[2]), 0, input[3]);
        } else if (mammal.equals("Cat")) {
            return new Cat(input[1], input[0], Double.parseDouble(input[2]), 0, input[3], input[4]);
        } else if (mammal.equals("Tiger")) {
            return new Tiger(input[1], input[0], Double.parseDouble(input[2]), 0, input[3]);
        } else if (mammal.equals("Mouse")) {
            return new Mouse(input[1], input[0], Double.parseDouble(input[2]), 0, input[3]);
        }
        return null;
    }
}
