package com.provectus.Session8;

import java.util.Random;
import java.util.logging.Level;


public class Deck1{

    private String[] deck1 = new String[36];

    public String[] fillDeck1(Card1 c){
        int count = 0;
        for (int j = 0; j < c.getCardSuits().length; j++){
            for (int k = 0; k < c.getCardValues().length; k++){
                deck1[count] = c.getCardValues()[k].toString() + " " + c.getCardSuits()[j].toString();
                count++;
            }
        }

        Logger.showFatal();
        Logger.showError();
        Logger.showTrace();

        //PokerMachine1.LOGGER.log(Level.WARNING, "Fill Deck");
        //System.out.println(Arrays.toString(deck));

        return deck1;
    }

    public String[] randomizeDeck1(Deck1 d){
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            int in = random.nextInt(deck1.length);
            int out = random.nextInt(deck1.length);
            String tmpCard = deck1[in];
            deck1[in] = deck1[out];
            deck1[out] = tmpCard;
        }

        Logger.showWarn();
        Logger.showDebug();

        //PokerMachine1.LOGGER.log(Level.INFO, "Shuffle Deck");
        //System.out.println(Arrays.toString(deck));
        return deck1;
    }
}
