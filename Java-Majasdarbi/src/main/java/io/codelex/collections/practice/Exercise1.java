package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        String[] origin = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};

        List<String> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, array);
        System.out.println(myArrayList);

        Set<String> myHashSet = new HashSet<>();
        Collections.addAll(myHashSet, array);
        System.out.println(myHashSet);


        Map<String, String> myHashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            myHashMap.put(array[i], origin[i]);
        }
        System.out.println(myHashMap);
    }
}
