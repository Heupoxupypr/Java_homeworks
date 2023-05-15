package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Toy {
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


    public Toy(String name, double weight, int id) {
        this.name = name;
        this.weight = weight;
        this.id = id;
        defaultIndex++;
    }

    public Toy() {
        this(defaultToyNames.get(rnd.nextInt(1,defaultToyNames.size())),
                                            rnd.nextInt(1,101), defaultIndex);
    }
}
