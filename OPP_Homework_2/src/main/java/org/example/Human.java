package org.example;

/**
 * Class for Human
 */
public class Human extends BaseClass implements Run, Jump{
    /**
     * Full constructor for Human
     * @param name name of Human
     * @param maxHeight max jump height of Human
     * @param maxDistance max run distance of Human
     */
    public Human(String name, int maxHeight, int maxDistance) {
        super(name, maxHeight, maxDistance);
    }

    public Human(String name) {
        super(name);
    }
    public Human() {
        super();
    }

    /**
     * Method for getting info of Human
     * @return all info of Human
     */
    @Override
    public String getInfo() {
        return String.format("Human  %s", super.getInfo());
    }

    /**
     * Method for jump
     * @param height jump height
     * @return true or false
     */
    @Override
    public Boolean Jump(int height) {
        if (height >= 0 && height <= super.maxJumpHeight) {
            System.out.println("Human " + this.name + " JUMP on " + height + " m!");
            return true;
        } else {
            System.out.println("Human " + this.name + " CAN'T JUMP on " + height + " m.," +
                    "because max height this Human " + super.maxJumpHeight + "!");
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
            System.out.println("Human " + this.name + " RUN " + distance + " m!");
            return true;
        } else {
            System.out.println("Human " + this.name + " CAN'T RUN " + distance + " m., " +
                    "because max distance this Human " + super.maxRunDistance + "!");
            return false;
        }

    }
}
