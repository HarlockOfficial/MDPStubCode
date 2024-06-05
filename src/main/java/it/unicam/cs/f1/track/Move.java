package it.unicam.cs.f1.track;

public class Move {
    private Coordinate source;
    private Coordinate target;

    public Move(Coordinate source, Coordinate target) {
        this.source = source;
        this.target = target;
    }

    public Coordinate getSource() {
        return source;
    }

    public Coordinate getTarget() {
        return target;
    }
}
