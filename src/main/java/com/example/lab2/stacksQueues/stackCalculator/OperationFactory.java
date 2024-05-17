package com.example.lab2.stacksQueues.stackCalculator;

/**
 * Factory for creating operations based on the input.
 */
public class OperationFactory {

    /**
     * Returns an operation based on the given operator string.
     *
     * @param operator the operator string
     * @return the corresponding operation
     */
    public static IOperation getOperation(String operator) {
        return switch (operator) {
            case "+" -> new Addition();
            case "-" -> new Subtraction();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
