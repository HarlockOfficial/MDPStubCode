package it.unicam.cs.f1.agent;

import it.unicam.cs.f1.track.Move;

public class Player implements Agent{
    private static int CurrentLastSymbol = 0;
    private String name;
    private char symbol;

    public Player(String name) {
        this.name = name;
        this.symbol = ("" + CurrentLastSymbol++).charAt(0);
        if (CurrentLastSymbol > 9) {
            throw new RuntimeException("Too many players");
        }
    }

    @Override
    public Move getNextMove() {
        // TODO implement later, gotta check what a move is first
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
