package io.github.uazw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Drawer {

    public String drawALine(int num) {
        return generateAsterisks(num).stream().collect(Collectors.joining(""));
    }

    private List<String> generateAsterisks(int num) {
        List<String> asterisks = new ArrayList(num);
        for (int i = 0; i < num; i++) {
            asterisks.add("*");
        }
        return asterisks;
    }
}
