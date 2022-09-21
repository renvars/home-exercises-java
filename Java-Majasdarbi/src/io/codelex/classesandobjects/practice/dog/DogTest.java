package io.codelex.classesandobjects.practice.dog;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        max.setMother(lady);
        max.setFather(rocky);
        coco.setMother(molly);
        coco.setFather(buster);
        rocky.setMother(molly);
        rocky.setFather(sam);
        buster.setMother(lady);
        buster.setFather(sparky);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(max);
        dogs.add(coco);
        dogs.add(rocky);
        dogs.add(buster);
        for (int i = 1; i < dogs.size(); i++) {
            System.out.println("Father :" + dogs.get(i - 1).fathersName());
            System.out.println("Same Mother :" + dogs.get(i).hasSameMother(dogs.get(i - 1)));
        }

    }
}
