package io.github.uazw;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;
import static java.util.stream.Collectors.toList;

public class PrimeFactor {

    public List<Integer> generate(int i) {
        List<Integer> factors = factorCalculator(i);
        return factors.stream().filter(this::isPrime).collect(toList());
    }

    private List<Integer> factorCalculator(int input) {
        int max = input;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (input % i == 0) {
                factors.add(i);
                max = input / i;
            }
        }
        return factors;
    }

    private boolean isPrime(int num) {
        if (num != 2) {
            for (int i = 2; i < sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
