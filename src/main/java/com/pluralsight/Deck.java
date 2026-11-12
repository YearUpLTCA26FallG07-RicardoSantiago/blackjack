package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
        String[] values ={"2","3","4","5","6","7","8",
                "9","10","Jack","Queen","King","ACE"};

        //Loop to create the cards in the
        //Also add the items to the array list

        for(String suit : suits) {
            for(String value : values){
                Card card = new Card(suit,value);
                cards.add(card);
            }
        }

    }
    // method to shuffles all the cards in the deck
    public void shuffle(){
        Collections.shuffle(cards);
    }

    //Method to deal the top card of the deck (if any left)
    public Card deal() {
        if(cards.size() > 0){
            Card card = cards.remove(0);
            return card;
        } else{
            return null;
        }
    }

    // method to see how many cards left
    public int getSize(){
        return cards.size();
    }


}
