package org.example;

/**
 * Class for robot
 */
public class Robot extends BaseClass implements Run, Jump{
    /**
     * Full constructor for Robot
     * @param name name of Robot
     * @param maxHeight max jump height of Robot
     * @param maxDistance max run distance of Robot
     */
    public Robot(String name, int maxHeight, int maxDistance) {
        super(name, maxHeight, maxDistance);
    }

    public Robot(String name) {
        super(name);
    }

    public Robot() {
        super();
    }

    /**
     * Getting info of Robot
     * @return all params of Robot
     */
    @Override
    public String getInfo() {
        return String.format("Robot  %s", super.getInfo());
    }

    /**
     * Method for jump
     * @param height jump height
     * @return true or false
     */
    @Override
    public Boolean Jump(int height) {
        if (height >= 0 && height <= super.maxJumpHeight) {
            System.out.println("Robot " + this.name + " JUMP on " + height + " m!");
            return true;
        } else {
            System.out.println("Robot " + this.name + " CAN'T JUMP on " + height + " m.," +
                    "because max height this Robot " + super.maxJumpHeight + "!");
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
            System.out.println("Robot " + this.name + " RUN " + distance + " m!");
            return true;
        }  else {
            System.out.println("Robot " + this.name + " CAN'T RUN " + distance + " m., " +
                    "because max distance this Robot " + super.maxRunDistance + "!");
            return false;
        }
    }
}
