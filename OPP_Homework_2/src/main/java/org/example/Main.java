package org.example;
//Домашнее задание на закрепление :
//
//        1)Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса.
//        Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.

//        2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//        (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.

//        3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//        списку он препятствий не идет.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int catCount = 0;
        int humanCount = 0;
        int robotCount = 0;

        List<BaseClass> teams = new ArrayList();
        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                    teams.add(new Cat());
                    catCount++;
                    break;
                case 1:
                    teams.add(new Human());
                    humanCount++;
                    break;
                case 2:
                    teams.add(new Robot());
                    robotCount++;
                    break;
            }
            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("Cat count: %d; Human count: %d; Robot count: %d\n\n", catCount, humanCount, robotCount);
    }
}