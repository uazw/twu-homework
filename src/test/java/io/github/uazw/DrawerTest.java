package io.github.uazw;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DrawerTest {


    private Drawer drawer;

    @Before
    public void setUp() throws Exception {
        drawer = new Drawer();
    }

    @Test
    public void shouldReturnOneAsteriskWhenGiven1() {
        //given
        int num = 1;

        //when
        String draw = drawer.drawALine(num);

        //then
        assertThat(draw, is("*"));
    }

    @Test
    public void shouldReturnEightAsterisksInlineWhenGiven8() {
        //given
        int num = 8;

        //when
        String draw = drawer.drawALine(num);

        //then
        assertThat(draw, is("********"));
    }
}