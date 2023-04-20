package org.example;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new Factory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
