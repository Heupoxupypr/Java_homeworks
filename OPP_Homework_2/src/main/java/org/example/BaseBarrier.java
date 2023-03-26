package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * Base class for barrier
 */
public class BaseBarrier {
    private String name;

    private static int defaultIndex;
    private static ArrayList<String> BarrierNames;

    static {
        defaultIndex = 1;
        BarrierNames = new ArrayList<String>();
    }

    /**
     * Full constructor for base barrier params
     * @param name Name of barrier
     */
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

    /**
     * Getting name of barrier
     * @return name of barrier
     */
    public String getName() {
        return name;
    }

    /**
     * Getting info of base params of barrier
     * @return base params of barrier
     */
    public String getInfo(){
        return String.format("name: %s;", this.getName());
    }
}
