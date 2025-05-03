package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
        assertEquals(0.0, calculator.add(-1.0, 1.0), 0.0001);
        assertEquals(-5.0, calculator.add(-2.0, -3.0), 0.0001);
    }
    
    @Test
    public void testSubtract() {
        assertEquals(-1.0, calculator.subtract(2.0, 3.0), 0.0001);
        assertEquals(-2.0, calculator.subtract(-1.0, 1.0), 0.0001);
        assertEquals(1.0, calculator.subtract(-2.0, -3.0), 0.0001);
    }
    
    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.0001);
        assertEquals(-1.0, calculator.multiply(-1.0, 1.0), 0.0001);
        assertEquals(6.0, calculator.multiply(-2.0, -3.0), 0.0001);
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0001);
        assertEquals(-1.0, calculator.divide(-1.0, 1.0), 0.0001);
        assertEquals(0.0, calculator.divide(0.0, 3.0), 0.0001);
    }
    
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1.0, 0.0);
        });
    }
}