package com.pluralsight;

public class Main {

    public static void main(String[] args){

        //Make a deck
        Deck deck = new  Deck();
        //Make how many hands
        Hand hand1 = new Hand();

        // shuffle deck
        deck.shuffle();

        // deal 5 cards
        for(int i = 0; i < 5; i++) {
// get a card from the deck
            Card card = deck.deal();
// deal that card to the hand
            hand1.deal(card);
            card.flip();
            System.out.println(card.getValue());
        }
        int handValue = 0;
        handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }
}
