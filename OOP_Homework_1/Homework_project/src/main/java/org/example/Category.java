package org.example;

import java.util.ArrayList;

//public class Category extends Product {
public class Category {


    private String catname;
    private ArrayList<Product> catProducts;

    private static int defaultCategoryIndex;
    private static ArrayList<String> categoryNames;

    static {
        defaultCategoryIndex = 1;
        categoryNames = new ArrayList<String>();
    }

    /**
     * Full constructor for Category
     * @param catname Nane of product's category
     */
    public Category(String catname) {
        if ((catname.isEmpty() //Если имя пустое
                || Character.isDigit(catname.charAt(0)))//Или если имя начинается с цифры
                || Category.categoryNames.indexOf(catname) != -1) { //Или если такое имя уже есть
            this.catname =
                    String.format("DefaultCategory_%d", defaultCategoryIndex++);
        } else {
            this.catname = catname;
        }
        Category.categoryNames.add(this.catname); //Добавляем название категории в список категорий
        this.catProducts = new ArrayList<>();

    }

    public Category() {
        this("");
    }

    public static ArrayList<String> getCategoryNames() {
        return categoryNames;
    }
}
