package io.codelex.blackjack;

public class Card {
    private Suit suit;
    private int blackjackValue;
    private String name;


    public Card(Suit suit, int blackjackValue, String name) {
        this.suit = suit;
        this.blackjackValue = blackjackValue;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getBlackjackValue() {
        return blackjackValue;
    }

    public void setBlackjackValue(int blackjackValue) {
        this.blackjackValue = blackjackValue;
    }

}
