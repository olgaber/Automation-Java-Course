package com.provectus.Session6;

public class PokerMachine {

    private int cardQty = 5;
    private int[] players = new int[4];

    public void dealCards(String[] deck){
        int count = 0;
        for (int i = 0; i < players.length; i++){

            for (int j = 0; j < cardQty; j++){
                System.out.println("Player " + (i + 1) + " receives " + deck[count] + " card");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Card card = new Card();
        Deck deck = new Deck();
        PokerMachine m = new PokerMachine();

        deck.fillDeck(card);
        String[] randomizedDeck  = deck.randomizeDeck(deck);
        m.dealCards(randomizedDeck);
    }
}
