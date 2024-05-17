package com.example.lab2.stacksQueues.stackCalculator;


import java.util.Stack;

/**
 * Interface for calculator operations.
 */
public interface IOperation {
    /**
     * Executes the operation using the given stack.
     *
     * @param stack the stack containing operands
     */
    void execute(Stack<Double> stack);

}
