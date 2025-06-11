package org.example;

public class Calculator {

    public int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return numberOne / numberTwo;
    }
}