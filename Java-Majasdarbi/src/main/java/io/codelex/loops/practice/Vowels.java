package io.codelex.loops.practice;

public class Vowels {


    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Traditional for Loop start:");
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }

        System.out.println("For each Loop start:");
        for (char vowel : vowels) {
            System.out.println(vowel);
        }

    }

}
