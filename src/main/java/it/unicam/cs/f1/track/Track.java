package it.unicam.cs.f1.track;

import it.unicam.cs.f1.agent.Agent;
import it.unicam.cs.f1.exceptions.TooManyPlayers;

public class Track {
    private final TrackTile[][] track;

    public Track(TrackTile[][] track) {
        this.track = track;
    }

    public TrackTile getTile(int x, int y) {
        return track[x][y];
    }

    public void setTile(int x, int y, TrackTile tile) {
        // used to add obstacles or car crashes
        track[x][y] = tile;
    }

    public int getWidth() {
        return track.length;
    }

    public int getHeight() {
        return track[0].length;
    }

    public void addAgent(Agent agent) throws TooManyPlayers {
        // TODO implement later, this method has to put the agent on the track start line
        // Note: may throw exception, too many players for the start line
    }
}
