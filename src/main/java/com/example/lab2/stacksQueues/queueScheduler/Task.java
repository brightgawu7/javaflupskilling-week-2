package com.example.lab2.stacksQueues.queueScheduler;

/**
 * Represents a task with a description.
 */
public class Task {
    private final String description;

    /**
     * Constructs a Task with the given description.
     *
     * @param description the description of the task
     */
    public Task(String description) {
        this.description = description;
    }

    /**
     * Returns the description of the task.
     *
     * @return the description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the string representation of the task.
     *
     * @return the description of the task
     */
    @Override
    public String toString() {
        return description;
    }

}
