package com.provectus.Session4;

import java.util.Arrays;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        /*
        Написать программу, которая должна имитировать раздачу карт для игры в покер. За столом сидят 4 игрока,
        каждый из них получает на руки 5 карт. Карты должны быть случайными и не повторяться. Формат вывода на экран:
        “Игрок N получает карту <НАЗВАНИЕ КАРТЫ>”
        */

        int cardQty = 5;
        int[] players = new int[4];
        int cardsDeck = 36;
        String[] deck = new String[cardsDeck];

        String[] cardValues = {"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] cardSuits = {"Diamonds", "Hearts", "Clubs", "Spades"};

        //fill deck array
        int count = 0;
        for (int j = 0; j < cardSuits.length; j++){
            for (int k = 0; k < cardValues.length; k++){
                deck[count] = cardValues[k].toString() + " " + cardSuits[j].toString();
                count++;
            }
        }

        //randomize the deck


        //show cards for 4 players
        count = 0;
        for (int i = 0; i < players.length; i++){

            for (int j = 0; j < cardQty; j++){
                System.out.println("Player " + (i + 1) + " receives " + deck[count] + " card");
                count++;
            }
            System.out.println();
        }
    }
}
