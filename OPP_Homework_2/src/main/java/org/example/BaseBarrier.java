package org.example;

import java.util.ArrayList;
import java.util.Random;

public class BaseBarrier {
    private String name;

    private static int defaultIndex;
    private static ArrayList<String> BarrierNames;

    static {
        defaultIndex = 1;
        BarrierNames = new ArrayList<String>();
    }

    public BaseBarrier(String name) {
        if (name.isEmpty()
                || Character.isDigit(name.charAt(0))
                || BaseBarrier.BarrierNames.indexOf(name) != -1) {
            this.name =
                    String.format("DefaultBarrier_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        BaseBarrier.BarrierNames.add(this.name);
    }

    /**
     * Default constructor for BaseClass
     */
    public BaseBarrier() {
        this("");
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return String.format("name: %s;", this.getName());
    }
}
