package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> mySet = new HashSet<>();

        while (true) {
            System.out.print("Enter a name: ");
            String name = in.nextLine();
            if (name.length() == 0) {
                break;
            }
            mySet.add(name);
        }
        System.out.println("Unique name list contains : " + mySet);
    }
}
