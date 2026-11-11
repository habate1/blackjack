package com.pluralsight;

public class BlackJackApp {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        hand1.deal(deck.deal());
        hand1.deal(deck.deal());

        hand2.deal(deck.deal());
        hand2.deal(deck.deal());

        System.out.println("Hand 1: " + hand1.getValue());
        System.out.println("Hand 2: " + hand2.getValue());

    }

}
