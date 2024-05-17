package com.example.lab2.dataStructures.array;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Main application class for managing students.
 */
public class StudentApp {

    /**
     * Main method to run the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner);
        short capacity = inputHandler.getCapacity();

        IStudentService studentManager = new StudentManager(capacity);
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            byte option = inputHandler.getNextOption(
                    opt -> ((opt >= 1) && (opt <= 5)),
                    "Invalid input. Please enter a valid option number."
            );
            scanner.nextLine();
            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter student name to add: ");
                        String nameToAdd = scanner.nextLine();
                        studentManager.addStudent(nameToAdd);
                        break;
                    case 2:
                        System.out.print("Enter student name to search: ");
                        String nameToSearch = scanner.nextLine();
                        short index = studentManager.searchStudent(nameToSearch);
                        if (index != -1) {
                            System.out.println("Student '" + nameToSearch + "' found at position " + index + ".");
                        } else {
                            System.out.println("Student '" + nameToSearch + "' not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter student name to delete: ");
                        String nameToDelete = scanner.nextLine();
                        studentManager.deleteStudent(nameToDelete);
                        break;
                    case 4:
                        studentManager.displayStudents();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (IllegalStateException | NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
