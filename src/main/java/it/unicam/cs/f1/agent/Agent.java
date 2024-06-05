package it.unicam.cs.f1.agent;

import it.unicam.cs.f1.track.Move;

public interface Agent {
    Move getNextMove();
    char getSymbol();
    String getName();
}
