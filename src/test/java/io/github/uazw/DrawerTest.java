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
        String draw = drawer.drawAHorizontalLine(num);

        //then
        assertThat(draw, is("*"));
    }

    @Test
    public void shouldReturnEightAsterisksInlineWhenGiven8() {
        //given
        int num = 8;

        //when
        String draw = drawer.drawAHorizontalLine(num);

        //then
        assertThat(draw, is("********"));
    }

    @Test
    public void shouldReturn3AsterisksNotInline() {
        //given
        int num = 3;

        //when
        String draw = drawer.drawAVerticalLine(num);

        //then
        assertThat(draw, is("*\n*\n*"));
    }

    @Test
    public void shouldReturn3lineRightTriangleWhenGiven3() {
        //given
        int num = 3;

        //when
        String draw = drawer.drawARightTriangle(num);

        //then
        assertThat(draw, is("*\n**\n***"));
    }
}