package it.unicam.cs.f1.engine;

import it.unicam.cs.f1.agent.Agent;
import it.unicam.cs.f1.exceptions.TooManyPlayers;
import it.unicam.cs.f1.track.Track;

public class GameEngine {
    private final Track track;
    private final Agent[] agents;
    private boolean playing = true;

    public GameEngine(Track track, Agent[] agents) throws TooManyPlayers {
        this.track = track;
        this.agents = agents;
        setPlayersOnTrack();
    }

    private void setPlayersOnTrack() throws TooManyPlayers {
        // TODO implement later, this method has to put all agents on the track start line
        for (Agent agent : agents) {
            track.addAgent(agent);
        }
    }

    public void run() {
        // TODO implement later
        while(playing){
            // TODO implement later
            // ask each player for a move
            // check if the move is valid
            // move players
            // check for crash
            // print track
            // update playing value
        }
    }
}
