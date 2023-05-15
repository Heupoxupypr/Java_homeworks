package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Thing {
    private String name;
    private double weight;
    private int id;
    private static int defaultIndex;
    private static String[] defaultNames = {"bear", "rabbit", "car",
            "train", "crane", "cube",
            "pencil", "marker"};
    private static ArrayList<String> defaultToyNames;
    protected static Random rnd;

    static {
        defaultIndex = 1;
        defaultToyNames = new ArrayList<String>(Arrays.asList(defaultNames));
        rnd = new Random();
    }


    public Thing(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.id = defaultIndex++;
    }

    public Thing() {
        this(defaultToyNames.get(rnd.nextInt(1,defaultToyNames.size())),
                                            rnd.nextInt(1,101));
    }
}
