package io.github.uazw;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

public class PrimeFactorTest {

    @Test
    public void shouldReturnEmptyListWhenGiven1() {
        //given
        PrimeFactor primeFactor = new PrimeFactor();

        //when
        List<Integer> primeFactors = primeFactor.generate(1);

        //then
        assertThat(primeFactors.size(), is(0));
    }

    @Test
    public void shouldReturnListLengthIs3WhenGiven30() {
        //given
        PrimeFactor primeFactor = new PrimeFactor();

        //when
        List<Integer> primeFactors = primeFactor.generate(30);

        //then
        assertThat(primeFactors.size(), is(3));
        assertThat(primeFactors, hasItems(2, 3, 5));
    }

    @Test
    public void shouldReturnListLengthIs2WhenGiven35() {
        //given
        PrimeFactor primeFactor = new PrimeFactor();

        //when
        List<Integer> primeFactors = primeFactor.generate(35);

        //then
        assertThat(primeFactors.size(), is(2));
        assertThat(primeFactors, hasItems(5, 7));
    }
}