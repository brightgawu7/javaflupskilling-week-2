package com.example.lab2.stacksQueues.queueScheduler;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages a queue of tasks in a first-in-first-out (FIFO) manner.
 */
public class TaskScheduler {
    private Queue<Task> taskQueue;

    /**
     * Constructs an empty TaskScheduler.
     */
    public TaskScheduler() {
        this.taskQueue = new LinkedList<>();
    }

    /**
     * Adds a task to the queue.
     *
     * @param task the task to be added
     */
    public void addTask(Task task) {
        taskQueue.offer(task);
        System.out.println("Added task: " + task);
    }

    /**
     * Removes the task at the front of the queue.
     * If the queue is empty, prints a message indicating no tasks to remove.
     */
    public void removeTask() {
        Task removedTask = taskQueue.poll();
        if (removedTask != null) {
            System.out.println("Removed task: " + removedTask);
        } else {
            System.out.println("No tasks to remove.");
        }
    }

    /**
     * Displays all tasks currently in the queue.
     * If the queue is empty, prints a message indicating no tasks in the queue.
     */
    public void displayTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks in the queue.");
        } else {
            System.out.println("Current tasks in the queue:");
            for (Task task : taskQueue) {
                System.out.println("- " + task);
            }
        }
    }

}
