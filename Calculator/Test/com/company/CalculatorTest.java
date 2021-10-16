package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculate() {
        assertEquals(Calculator.sum(2, 3), 5);
    }

    @Test
    public void star() {
        assertEquals(Calculator.sub(13, 3), 10);
    }

    @Test
    public void wer() {
        assertEquals(2,Calculator.div(10, 5), 0);
    }

    @Test
    public void operation() {
        assertEquals(Calculator.mull(2, 5), 10);
    }

    @Test
    public void construction() {
        assertEquals(25,Calculator.construction(5,2 ),0);
    }

    @Test
    public void cs() {
        assertEquals(1,Calculator.remainder(5, 2), 0.01);
    }
}