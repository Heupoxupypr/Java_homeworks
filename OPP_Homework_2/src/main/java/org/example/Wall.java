package org.example;

import java.util.Random;

public class Wall extends BaseBarrier {
    private int height;
    private static Random rnd;

    static {
        rnd = new Random();
    }

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public Wall() {
        this("", Wall.rnd.nextInt(1, 10));
    }

    public int getHeight() {
        return height;
    }

    public String getInfo() {
        return String.format("Wall %s height %d;", super.getInfo(), this.getHeight());
    }
}
