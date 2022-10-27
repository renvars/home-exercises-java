package io.codelex.classesandobjects.practice.dog;

import java.util.Objects;

public class Dog {
    private final String name;
    private final String sex;
    private String father;
    private String mother;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setFather(Dog father) {
        this.father = father.name;
    }

    public void setMother(Dog mother) {
        this.mother = mother.name;
    }


    public String toString() {
        return "Name : " + this.name + ", Sex : " + this.sex;
    }

    public String fathersName() {
        return Objects.requireNonNullElse(this.father, "Unknown");
    }

    public boolean hasSameMother(Dog otherDog) {
        return this.mother.equals(otherDog.mother);
    }
}
