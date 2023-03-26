package org.example;

import java.util.Random;

public class Track {
    private int length;
    private static Random rnd;

    static {
        rnd = new Random();
    }

    public Track(int length) {
        this.length = length;
    }

    public Track() {
        this(Track.rnd.nextInt(100,500));
    }

    public int getLength() {
        return length;
    }

    public String getInfo(){
        return String.format("Wall height;", this.getLength());
    }
}
