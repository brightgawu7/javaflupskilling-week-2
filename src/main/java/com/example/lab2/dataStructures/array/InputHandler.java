package com.example.lab2.dataStructures.array;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;

public class InputHandler {

    private final Scanner scanner;

    /**
     * Constructs an InputHandler with the specified scanner.
     *
     * @param scanner the Scanner object to use for input
     */
    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Prompts the user to enter the capacity and returns the valid input as a short.
     *
     * @return the capacity entered by the user
     */
    public short getCapacity() {
        while (true) {
            try {
                System.out.print("Enter the capacity of the student list (maximum " + Short.MAX_VALUE + "): ");
                short capacity = Short.parseShort(scanner.nextLine());
                if (capacity <= 0) {
                    throw new IllegalArgumentException("Capacity must be a positive number.");
                }
                return capacity;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public byte getNextOption(Predicate<Byte> predicate, String errorMessage) {
        while (true) {
            try {
                System.out.print("Choose an option: ");
                byte option = scanner.nextByte();
                if (predicate.test(option))
                    return option;
                System.out.println(errorMessage);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option number.");
                scanner.nextLine();
            }
        }
    }

}
