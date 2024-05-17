package com.example.lab2.stacksQueues.queueScheduler;

import java.util.Scanner;

public class TaskSchedulerApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskScheduler taskScheduler = new TaskScheduler();

    /**
     * Main method to run the task scheduler application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        while (true) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    removeTask();
                    break;
                case "3":
                    displayTasks();
                    break;
                case "4":
                    exitApp();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Prints the main menu options to the console.
     */
    private static void printMenu() {
        System.out.println("\nTask Scheduler");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. Display Tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Prompts the user to enter a task description and adds the task to the scheduler.
     * If the description is empty, prints an error message.
     */
    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        if (description.isEmpty()) {
            System.out.println("Task description cannot be empty.");
        } else {
            Task task = new Task(description);
            taskScheduler.addTask(task);
        }
    }

    /**
     * Removes the task at the front of the queue.
     */
    private static void removeTask() {
        taskScheduler.removeTask();
    }

    /**
     * Displays all tasks currently in the queue.
     */
    private static void displayTasks() {
        taskScheduler.displayTasks();
    }

    /**
     * Exits the application, closing the scanner and printing a goodbye message.
     */
    private static void exitApp() {
        System.out.println("Exiting Task Scheduler. Goodbye!");
        scanner.close();
    }
}
