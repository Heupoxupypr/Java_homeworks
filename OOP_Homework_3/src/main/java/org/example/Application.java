package org.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите игру");
        int num = in.nextInt();
        Game game = null;
        switch (num) {
            case 1 -> game = new NumberGame();
            case 2 -> game = new WordGame();
            case 3 -> game = new WordRussianGame();
            default -> System.out.println("такой игры еще не существует");
        }
        assert game != null;
        System.out.println("Введите длину загадываемого слова");
        int size = in.nextInt();
        System.out.println("Введите количество попыток для угадывания");
        int tries = in.nextInt();
        game.start(size, tries);
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("Попытка № " + (AbstractGame.countTry + 1) + "; Всего попыток: " + tries + ".");
            System.out.println("ваш ход");
            String answer = in.next();
            Answer answerGame = game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков", answerGame.getCows(), answerGame.getBulls()));
        }
        System.out.println(game.getGameStatus());
    }
}
