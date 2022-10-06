package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        ArrayList<String> myArray = new ArrayList<>();

        //TODO: Add 10 values to list
        for (int i = 1; i <= 10; i++) {
            myArray.add("W".repeat(i));
        }
        //TODO: Add new value at 5th position
        myArray.add(4, "FifthValue");
        //TODO: Change value at last position (Calculate last position programmatically)
        myArray.set(myArray.size() - 1, "LastChange");
        //TODO: Sort your list in alphabetical order
        Collections.sort(myArray);
        //TODO: Check if your list contains "Foobar" element
        boolean foobar = myArray.contains("Foobar");
        System.out.println("Contains 'Foobar': " + foobar);
        //TODO: Print each element of list using loop
        for (String el : myArray) {
            System.out.println(el);
        }
    }

}
