package it.unicam.cs.f1.exceptions;

public class TooManyPlayers extends Exception{
    public TooManyPlayers(String message) {
        super("Too many players" + message);
    }
}
