package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit(){
// only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }
    public String getValue(){
// only return the value if the card is face up
        if(isFaceUp){
// this is the string value of the card
// i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue(){
// only return the value if the card is face up
        if(isFaceUp){
            switch (this.value.toUpperCase()) {
                case "2" ->2;
                case "3" ->
                case "4" ->
                case "5" ->
                case "6" ->
                case "7" ->
                case "8" ->
                case "9" ->
                case "J" ->
                case "Q" ->
                case "K" ->
                case "A" ->
                case "" ->
                case "" ->
            }



//
// A = 11
// K, Q, J = 10
// all numeric cards are equal to their face value
        } else {
            return 0;
        }
        return 0;
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip() {
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        if (isFaceUp) {
            return value + "of" + suit;
        } else {
            return "Face Down Card";
        }
    }
}
