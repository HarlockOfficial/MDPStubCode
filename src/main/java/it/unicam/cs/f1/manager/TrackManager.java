package it.unicam.cs.f1.manager;

import it.unicam.cs.f1.track.Track;
import it.unicam.cs.f1.track.TrackTile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrackManager implements Manager<Track> {
    private final String pathToTrack;

    public TrackManager(String pathToTrack) {
        this.pathToTrack = pathToTrack;
    }

    public Track load() {
        try {
            File myFile = new File(this.pathToTrack);
            Scanner myReader = new Scanner(myFile);
            int rows = Integer.parseInt(myReader.nextLine());
            int columns = Integer.parseInt(myReader.nextLine());

            TrackTile[][] track = new TrackTile[rows][columns];
            for (int i = 0; i < rows; i++) {
                String line = myReader.nextLine().toLowerCase();
                for (int j = 0; j < columns; j++) {
                    track[i][j] = TrackTile.valueOf(line.charAt(j));
                }
            }
            myReader.close();
            return new Track(track);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
