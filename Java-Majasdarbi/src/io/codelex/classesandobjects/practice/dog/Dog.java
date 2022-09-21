package io.codelex.classesandobjects.practice.dog;

import java.util.Objects;

public class Dog {
    String name;
    String sex;
    String father;
    String mother;

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
        System.out.println("Name : " + this.name + ", Sex : " + this.sex);
        return null;
    }

    public String fathersName() {
        return Objects.requireNonNullElse(this.father, "Unknown");
    }

    public boolean hasSameMother(Dog otherDog) {
        if (this.mother.equals(otherDog.mother)) {
            return true;
        } else {
            return false;
        }
    }
}
