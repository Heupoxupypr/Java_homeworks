package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Cat extends BaseClass implements Run, Jump {
    private static int defaultCatIndex;
    private static ArrayList<String> CatNames;

    static {
        defaultCatIndex = 1;
        CatNames = new ArrayList<String>();
    }

    public Cat(String name, int maxHeight, int maxDistance) {
        super(name, maxHeight, maxDistance);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format(" Cat name: %s;  Max run distance: %d; Max jump height: %d;",
                super.getName(), super.getMaxRunDistance(), super.getMaxJumpHeight());
    }

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
