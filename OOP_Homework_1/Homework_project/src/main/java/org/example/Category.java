package org.example;

import javax.lang.model.type.NullType;
import java.util.ArrayList;

//public class Category extends Product {
public class Category {


    private String catname;
    private ArrayList<Product> catProducts;

    private static int defaultCategoryIndex;
    private static ArrayList<Category> categoryNames;

    static {
        defaultCategoryIndex = 1;
        categoryNames = new ArrayList<Category>();
    }

    /**
     * Full constructor for Category
     *
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
        Category.categoryNames.add(this); //Добавляем название категории в список категорий
        this.catProducts = new ArrayList<>();

    }

    public Category() {
        this("");
    }

    public static ArrayList<Category> getCategoryNames() {
        return categoryNames;
    }

    public void addProductInCategory(Product product) {
        this.catProducts.add(product);
    }

//    public static void removeProduct(Product product) {
//        for (int i = 0; i < categoryNames.size(); i++) {
//            System.out.println("Category: " + categoryNames.get(i).catname);
//            System.out.println("    Products: ");
//            for (int y = 0; y < categoryNames.get(i).catProducts.size(); y++) {
//                System.out.println("    Product " + (y+1) + ": " + categoryNames.get(i).catProducts.get(y).GetInfo());
//            }
//            System.out.println();
//        }
//    }

    public static Product removeProduct(String productName) {
        for (int i = 0; i < categoryNames.size(); i++) {
            for (int y = 0; y < categoryNames.get(i).catProducts.size(); y++) {
                if (categoryNames.get(i).catProducts.get(y).getName().equals(productName)){
                    Product returnProduct = new Product(categoryNames.get(i).catProducts.get(y));
                    categoryNames.get(i).catProducts.remove(y);
                    return returnProduct;
                }
            }
        }
        return null;
    }

    public static void printAllProducts() {
        for (int i = 0; i < categoryNames.size(); i++) {
            System.out.println("Category: " + categoryNames.get(i).catname);
            System.out.println("    Products: ");
            for (int y = 0; y < categoryNames.get(i).catProducts.size(); y++) {
                System.out.println("    Product " + (y+1) + ": " + categoryNames.get(i).catProducts.get(y).GetInfo());
            }
            System.out.println();
        }
    }
}
