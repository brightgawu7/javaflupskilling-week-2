package com.example.lab2.dataStructures.array;

import java.util.NoSuchElementException;

/**
 * Interface for student operations.
 */
public interface IStudentService {

    /**
     * Adds a student to the list.
     *
     * @param name the name of the student to add
     * @throws IllegalStateException if the student list is full
     */
    void addStudent(String name) throws IllegalStateException;


    /**
     * Searches for a student by name.
     *
     * @param name the name of the student to search
     * @return the index of the student if found, -1 otherwise
     */
    short searchStudent(String name);


    /**
     * Deletes a student by name.
     *
     * @param name the name of the student to delete
     * @throws NoSuchElementException if the student is not found
     */
    void deleteStudent(String name) throws NoSuchElementException;

    /**
     * Displays all students.
     */
    void displayStudents();
}
