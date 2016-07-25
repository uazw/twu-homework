package io.github.uazw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Drawer {

    public String drawAHorizontalLine(int num) {
        return generateAsterisks(num).stream().collect(joining(""));
    }

    private List<String> generateAsterisks(int num) {
        List<String> asterisks = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            asterisks.add("*");
        }
        return asterisks;
    }

    public String drawAVerticalLine(int num) {
        return generateAsterisks(num).stream().collect(joining("\n"));
    }

    public String drawARightTriangle(int num) {
        List<String> rightTriangle = new ArrayList<>(num);
        for (int i = 1; i <= num; i++) {
            rightTriangle.add(drawAHorizontalLine(i));
        }


        return rightTriangle.stream().collect(joining("\n"));
    }
}
