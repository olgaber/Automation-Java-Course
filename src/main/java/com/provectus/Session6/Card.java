package com.provectus.Session6;

public class Card {

    private String[] cardValues = {"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private String[] cardSuits = {"Diamonds", "Hearts", "Clubs", "Spades"};

    public String[] getCardSuits() {
        return cardSuits;
    }
    public String[] getCardValues() {
        return cardValues;
    }
}
