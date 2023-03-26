package org.example;

public class Human extends BaseClass implements Run, Jump{
    public Human(String name, int maxHeight, int maxDistance) {
        super(name, maxHeight, maxDistance);
    }

    public Human(String name) {
        super(name);
    }
    public Human() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format(" Human  %s", super.getInfo());
    }

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
