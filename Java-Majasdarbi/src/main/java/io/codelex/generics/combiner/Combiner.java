package io.codelex.generics.combiner;

public class Combiner {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public static <T> Object combineTwoItems(T first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
