package com.tnsif.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Demo for writing test cases
public class TestMathOperations {

    // Positive number test case
    @Test
    public void testForPositive() {
        Assertions.assertTrue(MathOperations.positiveNumber(5));
    }

    // Negative number test case
    @Test
    public void testForNegative() {
        Assertions.assertFalse(MathOperations.positiveNumber(-3));
    }

    // Zero as input test case
    @Test
    public void testForZero() {
        Assertions.assertFalse(MathOperations.positiveNumber(0));
    }
}