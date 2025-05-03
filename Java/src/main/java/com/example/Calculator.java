package com.example;

/**
 * A simple calculator class that provides basic arithmetic operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers.
     *
     * @param a first number
     * @param b second number
     * @return sum of the numbers
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts the second number from the first.
     *
     * @param a first number
     * @param b second number
     * @return difference of the numbers
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers.
     *
     * @param a first number
     * @param b second number
     * @return product of the numbers
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divides the first number by the second.
     *
     * @param a first number
     * @param b second number
     * @return quotient of the division
     * @throws IllegalArgumentException if the second number is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}