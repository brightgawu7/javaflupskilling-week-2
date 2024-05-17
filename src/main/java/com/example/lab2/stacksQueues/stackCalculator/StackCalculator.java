package com.example.lab2.stacksQueues.stackCalculator;

import java.util.Scanner;

public class StackCalculator {

    /**
     * Main method to run the stack-based calculator.
     *
     * @param args command-line arguments
     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression (e.g., 1 + 3 + 5): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] tokens = input.split(" ");
        try {
            for (String token : tokens) {
                if (isNumeric(token)) {
                    calculator.pushOperand(Double.parseDouble(token));
                } else {
                    calculator.pushOperation(OperationFactory.getOperation(token));
                }
            }

            // Perform all operations
            while (!calculator.getOperations().isEmpty()) {
                calculator.executeOperation();
            }

            System.out.println("Result: " + calculator.getResult());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Checks if the given string is numeric.
     *
     * @param str the string to check
     * @return true if the string is numeric, false otherwise
     */
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
