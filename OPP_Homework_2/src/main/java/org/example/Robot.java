package org.example;

public class Robot extends BaseClass implements Run, Jump{
    public Robot(String name, int maxHeight, int maxDistance) {
        super(name, maxHeight, maxDistance);
    }

    public Robot(String name) {
        super(name);
    }

    public Robot() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format(" Robot name: %s;  Max run distance: %d; Max jump height: %d;",
                super.getName(), super.getMaxRunDistance(), super.getMaxJumpHeight());
    }
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
