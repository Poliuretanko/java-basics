package com.curiositas.java.basics.session5.examples.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    @Test
    public void testSum() {
        Math math = new Math();
        int x = 1;
        int y = 2;
        int result = math.sum(x, y);
        assertEquals(3, result);
    }

    @Test
    public void testBrokenSum() {
        Math math = new Math();
        long x = 1;
        long y = 2;
        long result = math.sum(x, y);
        assertEquals(3, result);
    }

    @Test
    public void testDivisionOn0NotCheckingException() {
        Math math = new Math();
        int x = 1;
        int y = 0;
        math.division(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionOn0CheckingException() {
        Math math = new Math();
        int x = 1;
        int y = 0;
        math.division(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionOn0CheckingExceptionFail() {
        Math math = new Math();
        int x = 1;
        int y = 1;
        math.division(x, y);
    }
}
