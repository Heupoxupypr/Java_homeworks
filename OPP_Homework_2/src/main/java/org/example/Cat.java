package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class for Cat
 */
public class Cat extends BaseClass implements Run, Jump {
    private static int defaultCatIndex;
    private static ArrayList<String> CatNames;

    static {
        defaultCatIndex = 1;
        CatNames = new ArrayList<String>();
    }

    /**
     * Full constructor for Cat
     * @param name name of Cat
     * @param maxHeight max jump height of Cat
     * @param maxDistance max run distance of Cat
     */
    public Cat(String name, int maxHeight, int maxDistance) {
        super(name, maxHeight, maxDistance);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    /**
     * Method for getting info of Cat
     * @return all info of Cat
     */
    public String getInfo() {
        return String.format("Cat %s", super.getInfo());
    }

    /**
     * Method for jump
     * @param height jump height
     * @return true or false
     */
    @Override
    public Boolean Jump(int height) {
        if (height >= 0 && height <= super.maxJumpHeight) {
            System.out.println("Cat " + this.name + " JUMP on " + height + " m!");
            return true;
        } else {
            System.out.println("Cat " + this.name + " CAN'T JUMP on " + height + " m.," +
                    "because max height this cat " + super.maxJumpHeight + "!");
            return false;
        }
    }

    /**
     * Method for run
     * @param distance Run distance
     * @return true or false
     */
    @Override
    public Boolean Run(int distance) {
        if (distance >= 0 && distance <= super.maxRunDistance) {
            System.out.println("Cat " + this.name + " RUN " + distance + " m!");
            return true;
        } else {
            System.out.println("Cat " + this.name + " CAN'T RUN " + distance + " m., " +
                    "because max distance this cat " + super.maxRunDistance + "!");
            return false;
        }
    }
}
