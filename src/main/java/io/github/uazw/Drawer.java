package io.github.uazw;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Drawer {

    public String drawAHorizontalLine(int num) {
        return repeatSymbol(num, "*").stream().collect(joining(""));
    }

    private List<String> repeatSymbol(int num, String symbol) {
        List<String> result = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            result.add(symbol);
        }
        return result;
    }

    public String drawAVerticalLine(int num) {
        return repeatSymbol(num, "*").stream().collect(joining("\n"));
    }

    public String drawARightTriangle(int num) {
        List<String> rightTriangle = new ArrayList<>(num);
        for (int i = 1; i <= num; i++) {
            rightTriangle.add(drawAHorizontalLine(i));
        }
        return rightTriangle.stream().collect(joining("\n"));
    }

    public String drawALineWithAsterisksCenter(int lengthOfLine, int countOfAsterisks) {
        int spaceCount = (lengthOfLine - countOfAsterisks) / 2;
        String halfOfSpace = repeatSymbol(spaceCount, " ").stream().collect(joining(""));
        String asterisks = repeatSymbol(countOfAsterisks, "*").stream().collect(joining(""));
        return halfOfSpace + asterisks + halfOfSpace;
    }

    public String drawACenterTriangle(int num) {
        List<String> centerTriangle = new ArrayList<>(num);
        for (int i = 1; i <= num; i++) {
            int maxLength = 2 * num - 1;
            centerTriangle.add(drawALineWithAsterisksCenter(maxLength, 2 * i - 1));
        }
        return centerTriangle.stream().collect(joining("\n"));
    }
}
