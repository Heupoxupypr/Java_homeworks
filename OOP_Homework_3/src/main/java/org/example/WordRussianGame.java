package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 1072; i <= 1103; i++) {
            charList.add(String.valueOf((char) i));
        }
        System.out.println("Generated charList: " + charList);
        return charList;
    }
}
