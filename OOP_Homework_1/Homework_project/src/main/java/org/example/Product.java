package org.example;

import java.util.ArrayList;

/**
 * Class product with
 * name
 * price
 * rating
 */
public class Product {
    private String name;
    private double price;
    private double rating;

    private static int defaultProductIndex;
    private static ArrayList<String> productNames;

    static {
        defaultProductIndex = 1;
        productNames = new ArrayList<String>();
    }

    /**
     * Full constructor for Product
     *
     * @param name   Name of product
     * @param price  Price of product
     * @param rating Raiting of product
     */
    public Product(String name, double price, double rating) {
        if ((name.isEmpty() //Если имя пустое
                || Character.isDigit(name.charAt(0)))//Или если имя начинается с цифры
                || Product.productNames.indexOf(name) != -1) { //Или если такое имя уже есть
            this.name =
                    String.format("DefaultProduct_%d", defaultProductIndex++);
        } else {
            this.name = name;
        }
        Product.productNames.add(this.name); //Добавляем имя продукста в список имен
        this.price = price;
        this.rating = rating;

    }

    // Конструктор копирования
    public Product(Product product)
    {
        this.name = product.name;
        this.price = product.price;
        this.rating = product.rating;


    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name) {
        this(name, 0);
    }

    public Product() {
        this("");
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String GetInfo() {
        return String.format(this.getName() + " " + this.getPrice() + " " + this.getRating());
    }
}
