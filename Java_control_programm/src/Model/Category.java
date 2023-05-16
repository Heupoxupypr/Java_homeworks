package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Category {
    private int categoryId;
    private String categoryName;
    private List<Toy> categoryToys;
    private static int defaultIndex;
    private static String[] defaultNames = {"Bears", "Rabbits", "Cars",
            "TrainS", "Cranes", "Cubes",
            "Pencils", "Markers"};
    private static ArrayList<String> defaultCategoryNames;
    private static ArrayList<String> Names;
    protected static Random rnd;

    static {
        defaultIndex = 1;
        defaultCategoryNames = new ArrayList<String>(Arrays.asList(defaultNames));
        Names = new ArrayList<String>();
        rnd = new Random();
    }

    public Category(String categoryName, List<Toy> categoryToys) {
        if (categoryName.isEmpty() ||
                Character.isDigit(categoryName.charAt(0)) ||
                Category.Names.indexOf(categoryName) != -1){
            this.categoryName = String.format("CategoryDefaultName_%d", defaultIndex);
        }
        else {
            this.categoryName = categoryName;
            Category.Names.add(this.categoryName);
        }
        this.categoryToys.addAll(categoryToys);
        this.categoryId = defaultIndex++;
    }

    public Category(String categoryName) {
        this(categoryName,new ArrayList<Toy>());
    }

    public Category() {
        this(defaultCategoryNames.get(rnd.nextInt(defaultCategoryNames.size())));
    }
}
