package io.codelex.loops.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number to square start: ");
        int start = scanner.nextInt();
        System.out.print("Number to square end: ");
        int end = scanner.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        //Create arrayList
        for (int i = 1; i <= end; i++) {
            arrList.add(i);
        }
        //print from arrayList
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.size(); j++) {
                int nr = arrList.get(j) + i;
                int res = nr % 5 == 0 ? 5 : nr % 5;
                System.out.print(res);
            }
            System.out.print("\n");
        }

    }
}
