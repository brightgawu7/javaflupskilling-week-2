package com.example.lab2.stacksQueues.stackCalculator;

import java.util.Stack;

/**
 * Calculator class.
 */
public class Calculator {

    private final Stack<Double> stack;
    private final Stack<IOperation> operations;


    /**
     * Constructs a new Calculator with empty stacks.
     */
    public Calculator() {
        this.stack = new Stack<>();
        this.operations = new Stack<>();
    }


    /**
     * Pushes an operand onto the stack.
     *
     * @param operand the operand to push
     */
    public void pushOperand(double operand) {
        stack.push(operand);
    }

    /**
     * Pushes an operation onto the operations stack.
     *
     * @param operation the operation to push
     */
    public void pushOperation(IOperation operation) {
        operations.push(operation);
    }

    /**
     * Executes the top operation on the stack.
     */
    public void executeOperation() {
        if (!operations.isEmpty()) {
            IOperation operation = operations.pop();
            operation.execute(stack);
        } else {
            throw new IllegalStateException("No operations to execute");
        }
    }

    /**
     * Gets the result from the stack.
     *
     * @return the result
     */
    public double getResult() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("No result available");
        }
        return stack.peek();
    }

    /**
     * Returns the operations stack.
     *
     * @return the operations stack
     */
    public Stack<IOperation> getOperations() {
        return operations;
    }
}
