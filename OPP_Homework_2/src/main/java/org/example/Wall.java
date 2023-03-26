package org.example;

import java.util.Random;

/**
 * Class for Wall
 */
public class Wall extends BaseBarrier {
    private int height;
    private static Random rnd;

    static {
        rnd = new Random();
    }

    /**
     * Full constructor for Wall
     * @param name Wall name
     * @param height Wall height
     */
    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public Wall() {
        this("", Wall.rnd.nextInt(1, 10));
    }

    /**
     * Getting height of wall
     * @return return wall height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Method to get information of wall
     * @return name and length
     */
    public String getInfo() {
        return String.format("Wall %s height %d;", super.getInfo(), this.getHeight());
    }
}
