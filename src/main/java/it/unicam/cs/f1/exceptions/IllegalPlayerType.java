package it.unicam.cs.f1.exceptions;

public class IllegalPlayerType extends Exception{
    public IllegalPlayerType(String message) {
        super("Illegal player type" + message);
    }
}
