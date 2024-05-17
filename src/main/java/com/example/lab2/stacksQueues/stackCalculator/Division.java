package com.example.lab2.stacksQueues.stackCalculator;

import java.util.Stack;

/**
 * Division operation.
 */
public class Division implements IOperation {
    @Override
    public void execute(Stack<Double> stack) {
        double b = stack.pop();
        double a = stack.pop();
        stack.push(a / b);
    }
}
