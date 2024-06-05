package it.unicam.cs.f1.agent;

import it.unicam.cs.f1.track.Move;

public class Bot implements Agent{
    private static char CurrentLastSymbol = 'A';
    private String name;
    private char symbol;

    public Bot(String name) {
        this.name = name;
        this.symbol = CurrentLastSymbol++;
        if (CurrentLastSymbol > 'Z') {
            throw new RuntimeException("Too many bots");
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
