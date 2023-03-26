package org.example;

import java.util.Random;

/**
 * Class for track
 */
public class Track extends BaseBarrier {
    private int length;
    private static Random rnd;

    static {
        rnd = new Random();
    }

    /**
     * Full constructor for Track
     * @param name name of Track
     * @param length length of track
     */
    public Track(String name, int length) {
        super(name);
        this.length = length;
    }

    public Track() {
        this("", Track.rnd.nextInt(100, 500));
    }

    /**
     * Method to get length of track
     * @return length of track
     */
    public int getLength() {
        return length;
    }

    /**
     * Method to get information of track
     * @return name and length
     */
    public String getInfo() {
        return String.format("Track %s length %d;",super.getInfo(), this.getLength());
    }
}
