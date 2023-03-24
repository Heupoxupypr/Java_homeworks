package org.example;

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


    /**
     * Full constructor for Product
     *
     * @param name   Name of product
     * @param price  Price of product
     * @param rating Raiting of product
     */
    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String name) {
        this(name, 0);
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product() {
        this("");
    }


}
