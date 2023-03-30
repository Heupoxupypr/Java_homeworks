package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            charList.add(String.valueOf((char)i));
        }
        System.out.println("Generated charList: " + charList);
        return charList;
    }
}
