package com.example.lab2.stacksQueues.stackCalculator;

import java.util.Stack;

/**
 * Multiplication operation.
 */
public class Multiplication implements IOperation {

    @Override
    public void execute(Stack<Double> stack) {
        double b = stack.pop();
        double a = stack.pop();
        stack.push(a * b);
    }
}
