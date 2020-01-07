package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        if(input == null){
            return null;
        }
        Character[] result = new Character[input.length()];
        for (int index = 0; index < input.length(); index++) {
            Character character = input.charAt(index);
            result[index] = character;
        }

    return result;

    }

    public static Integer[] parseIntegers(String input) {
        if(input == null){
            return null;
        }
        input = input.replace(" ", "");
        Integer[] result = new Integer[input.length()];
        for (int index = 0; index < input.length(); index++) {
            Character character = input.charAt(index);
            result[index] = Integer.parseInt(character.toString());
        }
        return result;
    }

    public static List<String> toList(String[] input) {
        if(input == null){
            return null;
        }

        List<String> result = new ArrayList<>();
        for (String s : input) {
            result.add(s);
        }
        return result;
    }

    public static String[] parseStrings(String input) {
        if(input == null){
            return null;
        }
        return input.split("");
    }
}
