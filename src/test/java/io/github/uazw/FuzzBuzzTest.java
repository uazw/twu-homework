package io.github.uazw;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FuzzBuzzTest {
    private FuzzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FuzzBuzz();
    }

    @Test
    public void shouldReturnFizzBuzzWhenGiven15() {
        //given
        int num = 15;

        //when
        String result = fizzBuzz.fizzBuzz(num);

        //then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void shouldReturnFizzWhenGiven3() {
        //given
        int num = 3;

        //when
        String result = fizzBuzz.fizzBuzz(num);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenGiven5() {
        //given
        int num = 5;

        //when
        String result = fizzBuzz.fizzBuzz(num);

        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void shouldReturn1WhenGiven1() {
        //given
        int num = 1;

        //when
        String result = fizzBuzz.fizzBuzz(num);

        //then
        assertThat(result, is("1"));
    }
}