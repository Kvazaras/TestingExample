package com.example.testingexample;

import java.util.ArrayList;

public class Utils {

    public static String removeExcessiveSpacesFromString(String inputText){
        String[] wordsArray = inputText.split("\\s");
        ArrayList<String> wordsArrayWithoutEmptySpaces = new ArrayList<>();
        for (String word : wordsArray) {
            if(!word.isEmpty()){
                wordsArrayWithoutEmptySpaces.add(word);
            }
        }
        return String.join(" ", wordsArrayWithoutEmptySpaces);
    }

    public static String removeNumbersFromString(String inputText){
        return inputText.replaceAll("[0-9]", "");
    }

    public static String removeLettersFromString(String inputText){
        return inputText.replaceAll("[a-zA-Z]", "");
    }

    public static String changeCharactersToUnicode(String inputText){
        StringBuilder result = new StringBuilder();
        for (char c : inputText.toCharArray()) {
            result.append((int) c);
        }
        return result.toString();
    }
}
