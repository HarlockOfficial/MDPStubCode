package it.unicam.cs.f1.track;

public enum TrackTile {
    START('_'), FINISH('_'), WALL('#'), ROAD('.'), OBSTACLE('x');

    private final char symbol;

    TrackTile(char symbol) {
        this.symbol = symbol;
    }

    public static TrackTile valueOf(char symbol) {
        for (TrackTile tile : TrackTile.values()) {
            if (tile.symbol == symbol) {
                return tile;
            }
        }
        return null;
    }

    public char getSymbol() {
        return symbol;
    }
}
