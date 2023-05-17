package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Category implements CategoryList, CategoryName{
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
        this.categoryToys = new ArrayList<>();
        this.categoryToys.addAll(categoryToys);
        this.categoryId = defaultIndex++;
    }

    public Category(String categoryName) {
        this(categoryName,new ArrayList<Toy>());
    }

    public Category() {
        this(defaultCategoryNames.get(rnd.nextInt(defaultCategoryNames.size())));
    }

    @Override
    public void setToysList(List<Toy> toys) {
        this.categoryToys.addAll(toys);
        for (int i = 0; i < this.categoryToys.size(); i++){
            this.categoryToys.get(i).setCategory(this.categoryName);
        }
    }

    @Override
    public void setCategoryName(String name) {
        this.categoryName = name;
        if (this.categoryToys.size() != 0){
            for (int i = 0; i < this.categoryToys.size(); i++) {
                this.categoryToys.get(i).setCategory(name);
            }
        }
    }

    @Override
    public String toString(){
        return "Category {ID = " + this.categoryId +
                " categoryName = " + this.categoryName +
                " toyCount = " + this.categoryToys.size() +
                "}";
    }
}
