package com.pluralsight;

public class Player {
    private String playerName;
    private Hand hand;

    public Player(String player) {
        this.playerName = player;
        this.hand = new Hand();
    }

    public String getPlayer() {
        return playerName;
    }

    public Hand getHand() {
        return hand;
    }
}
