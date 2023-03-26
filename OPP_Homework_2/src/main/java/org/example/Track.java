package org.example;

import java.util.Random;

public class Track extends BaseBarrier {
    private int length;
    private static Random rnd;

    static {
        rnd = new Random();
    }

    public Track(String name, int length) {
        super(name);
        this.length = length;
    }

    public Track() {
        this("", Track.rnd.nextInt(100, 500));
    }

    public int getLength() {
        return length;
    }

    public String getInfo() {
        return String.format("Track %s length %d;",super.getInfo(), this.getLength());
    }
}
