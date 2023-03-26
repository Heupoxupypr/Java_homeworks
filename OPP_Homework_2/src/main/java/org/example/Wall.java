package org.example;

import java.util.Random;

public class Wall {
    private int height;
    private static Random rnd;

    static {
        rnd = new Random();
    }

    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
        this(Wall.rnd.nextInt(10,50));
    }

    public int getHeight() {
        return height;
    }

    public String getInfo(){
        return String.format("Wall height;", this.getHeight());
    }
}
