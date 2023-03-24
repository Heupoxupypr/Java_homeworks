package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public String getLogin() {
        return login;
    }

    private static int defaultUserIndex;
    private static ArrayList<String> userNames;

    static {
        defaultUserIndex = 1;
        userNames = new ArrayList<String>();
    }

    /**
     * Class User for add user
     * @param login Login of user
     * @param password Password of user
     */
    public User(String login, String password) {
        if ((login.isEmpty() //Если логин пустой
                || Character.isDigit(login.charAt(0)))//Или если логин начинается с цифры
                || User.userNames.indexOf(login) != -1) { //Или если такой логин уже есть
            this.login =
                    String.format("DefaultUserName_%d", defaultUserIndex++);
        } else {
            this.login = login;
        }
        User.userNames.add(this.login); //Добавляем название категории в список категорий

        if (password.isEmpty()) {
            this.password = String.format("12345");
        }
        else {
            this.password = password;
        }

        this.basket = new Basket();

    }

    public User(String login) {
        this(login, "");
    }

    public User() {
        this("");
    }

    public static ArrayList<String> getUserNames() {
        return userNames;
    }
    public void addToUserBasket(String product) {
        Product data = Category.removeProduct(product);
//        System.out.println(data.GetInfo());
        if (data!= null)
            this.basket.addProductToBasket(data);

    }

    public void getBasket() {
        System.out.println(this.getLogin() +" Basket :");
        this.basket.getBuyProducts();

    }
}
