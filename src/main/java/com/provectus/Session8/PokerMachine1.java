package com.provectus.Session8;

//import java.util.logging.Level;

public class PokerMachine1 {

    private int cardQty = 5;
    private int[] players = new int[4];

    //static final Logger LOGGER = Logger.getLogger(PokerMachine1.class.getName());

    public void dealCards1(String[] deck){
        int count = 0;
        for (int i = 0; i < players.length; i++){

            for (int j = 0; j < cardQty; j++){
                System.out.println("Player " + (i + 1) + " receives " + deck[count] + " card");
                count++;
            }
            System.out.println();
        }

        Logger.showInfo();
        Logger.showOff();
        //LOGGER.log(Level.INFO, "Deal Cards");
    }

    public static void main(String[] args) {
        Card1 card1 = new Card1();
        Deck1 deck1 = new Deck1();
        PokerMachine1 m1 = new PokerMachine1();

        deck1.fillDeck1(card1);
        String[] randomizedDeck1  = deck1.randomizeDeck1(deck1);
        m1.dealCards1(randomizedDeck1);
    }
}
