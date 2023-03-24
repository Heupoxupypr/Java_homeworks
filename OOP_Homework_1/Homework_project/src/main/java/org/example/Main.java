package org.example;

//Домашнее задание на закрепление:
//
//        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров.
//          Создать несколько объектов класса Категория.
//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket.
//          Создать несколько объектов класса User.
//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина.
//          (После покупки у пользователя добавляется товар, а из магазина - удаляется)

public class Main {
    public static void main(String[] args) {
        Category fruits = new Category("fruits");
        Category vegetables = new Category("vegetables");
        Category bakery = new Category("bakery");

        User Vasiliy = new User("Vasiliy", "987");
        User Ivan = new User("Ivan");
        User Default = new User();

        fruits.addProductInCategory(new Product("apple", 10.5, 1));
        fruits.addProductInCategory(new Product("orange", 55.9, 100));
        vegetables.addProductInCategory(new Product("potato", 1, 10));
        vegetables.addProductInCategory(new Product("tomato", 5, 50));
        bakery.addProductInCategory(new Product("bread", 0.1, 100));
        bakery.addProductInCategory(new Product("cookies", 5, 20));


//        Product apple = new Product("apple", 10.5, 1, "fruits");
//        Product potato = new Product("potato", 1, 10, "vegetables");
//        Product orange = new Product("orange", 55.9, 100, "fruits");

//        System.out.println(Category.getCategoryNames());
//        System.out.println(User.getUserNames());
        Category.printAllProducts();

        Vasiliy.addToUserBasket("apple");
        Vasiliy.getBasket();

        Category.printAllProducts();
    }
}