package io.github.uazw;

import static java.lang.String.valueOf;

public class FuzzBuzz {

    public String fizzBuzz(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return valueOf(num);
        }
    }
}
