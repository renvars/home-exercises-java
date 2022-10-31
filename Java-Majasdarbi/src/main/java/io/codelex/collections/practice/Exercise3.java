package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Pink");
        mySet.add("Lavender");

        System.out.println("Should have 5 elements: " + mySet); //Pay attention on order!


        for (String e : mySet) {
            System.out.println(e);
        }


        mySet.clear();
        System.out.println("Should be empty: " + mySet);

        mySet.add("Green");
        mySet.add("Orange");
        mySet.add("Green");
        mySet.add("Purple");

        System.out.println(mySet);
    }

}
