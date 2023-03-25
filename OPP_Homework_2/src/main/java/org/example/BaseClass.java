package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Public class BaseClass with param @name
 */
public class BaseClass {
    protected String name;
    private static int defaultIndex;
    private static ArrayList<String> Names;

    static {
        defaultIndex = 1;
        Names = new ArrayList<String>();
    }
    /**
     * Constructor for BaseClass
     * @param name Name object
     */
    public BaseClass(String name) {
        if (name.isEmpty()
                || Character.isDigit(name.charAt(0))
                || BaseClass.Names.indexOf(name) != -1) {
            this.name =
                    String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        BaseClass.Names.add(this.name);
    }

    /**
     * Base constructor for BaseClass
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
}
