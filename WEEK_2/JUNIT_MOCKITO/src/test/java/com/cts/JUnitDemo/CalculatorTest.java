package com.cts.JUnitDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    void testDivideByZero() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Division by zero not allowed", ex.getMessage());
    }
}
