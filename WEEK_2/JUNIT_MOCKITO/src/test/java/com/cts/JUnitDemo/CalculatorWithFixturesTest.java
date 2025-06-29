package com.cts.JUnitDemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorWithFixturesTest {

    private Calculator calculator;

    // Setup method - runs before each test
    @BeforeEach
    void setUp() {
        calculator = new Calculator();  // Arrange
        System.out.println(">> Setup Calculator");
    }

    // Teardown method - runs after each test
    @AfterEach
    void tearDown() {
        System.out.println("<< Cleanup Calculator\n");
    }

    @Test
    void testAdd() {
        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero not allowed", exception.getMessage());
    }
}
