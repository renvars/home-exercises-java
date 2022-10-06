package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise7 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Violet");
        colors.add("White");
        colors.add("Black");

        boolean contains = colors.contains("White");
        if (contains) {
            System.out.println("Contains White");
        } else {
            System.out.println("Does not contain White");
        }
    }

}
