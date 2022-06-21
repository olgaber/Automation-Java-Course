package com.provectus.Session6;

import java.util.Arrays;
import java.util.Random;

public class Deck {

    private String[] deck = new String[36];

    public String[] fillDeck(Card c){
        int count = 0;
        for (int j = 0; j < c.getCardSuits().length; j++){
            for (int k = 0; k < c.getCardValues().length; k++){
                deck[count] = c.getCardValues()[k].toString() + " " + c.getCardSuits()[j].toString();
                count++;
            }
        }
        //System.out.println(Arrays.toString(deck));
        return deck;
    }
    public String[] randomizeDeck(Deck d){
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            int in = random.nextInt(deck.length);
            int out = random.nextInt(deck.length);
            String tmpCard = deck[in];
            deck[in] = deck[out];
            deck[out] = tmpCard;
        }
        //System.out.println(Arrays.toString(deck));
        return deck;
    }
}
