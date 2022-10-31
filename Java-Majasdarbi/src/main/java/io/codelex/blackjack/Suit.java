package io.codelex.blackjack;

import java.util.Arrays;
import java.util.stream.Stream;

public enum Suit {
    DIAMOND("DIAMOND"),
    HEART("HEART"),
    SPADE("SPADE"),
    CLUB("CLUB");
    private final String name;

    private Suit(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

    public static Suit returnSuitValue(String s) {
        for (int i = 0; i < Suit.values().length; i++) {
            Suit suit = Suit.values()[i];
            if (s.toUpperCase().equals(suit.name)) {
                return Suit.values()[i];
            }
        }
        return null;
    }
}
