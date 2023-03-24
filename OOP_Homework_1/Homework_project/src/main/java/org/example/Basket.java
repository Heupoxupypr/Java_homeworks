package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> buyProducts;

    /**
     * Class Basket for class User
     */
    public Basket() {
        this.buyProducts = new ArrayList<>();
    }

    public void addProductToBasket(Product product) {
        this.buyProducts.add(product);
    }

    public void getBuyProducts() {
        for (int i = 0; i < this.buyProducts.size(); i++) {

            System.out.println("    Product " + (i + 1) + ": " + this.buyProducts.get(i).GetInfo());

        }
        System.out.println();
//        System.out.println(this.buyProducts.toString());
    }
}
