package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

/**
 * Public class BaseClass with param @name
 */
public class BaseClass {
    protected String name;
    protected int maxJumpHeight;
    protected int maxRunDistance;
    private static int defaultIndex;
    private static ArrayList<String> Names;
    protected static Random rnd;

    static {
        defaultIndex = 1;
        Names = new ArrayList<String>();
        rnd = new Random();
    }
    /**
     * Constructor for BaseClass
     * @param name Name object
     */
    public BaseClass(String name, int maxHeight, int maxDistance) {
        if (name.isEmpty()
                || Character.isDigit(name.charAt(0))
                || BaseClass.Names.indexOf(name) != -1) {
            this.name =
                    String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        BaseClass.Names.add(this.name);
        this.maxJumpHeight = maxHeight;
        this.maxRunDistance = maxDistance;
    }

    public BaseClass(String name) {
        this(name, BaseClass.rnd.nextInt(1, 10),
                BaseClass.rnd.nextInt(100, 500));
    }

    /**
     * Default constructor for BaseClass
     */
    public BaseClass() {
        this("");
    }

    /**
     * Method for getting name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method for setting name
     * @param name Name of object
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public String getInfo(){
        return String.format("name: %s;  Max run distance: %d; Max jump height: %d;",
                this.getName(), this.getMaxRunDistance(), this.getMaxJumpHeight());
    }
}
