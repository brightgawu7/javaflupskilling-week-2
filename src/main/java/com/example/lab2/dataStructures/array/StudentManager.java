package com.example.lab2.dataStructures.array;

import java.util.NoSuchElementException;

public class StudentManager implements IStudentService {
    private final short capacity;
    private final String[] students;
    private short count = 0;

    /**
     * Constructs a StudentManager with a specified capacity.
     *
     * @param capacity the maximum number of students that can be added
     */
    public StudentManager(short capacity) {
        this.capacity = capacity;
        this.students = new String[capacity];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addStudent(String name) throws IllegalStateException {
        if (count >= capacity) {
            throw new IllegalStateException("Cannot add student: list is full.");
        }
        students[count++] = name;
        System.out.println("Student '" + name + "' added.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public short searchStudent(String name) {
        for (short i = 0; i < count; i++) {
            if (students[i] != null && students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void deleteStudent(String name) throws NoSuchElementException {
        int index = searchStudent(name);
        if (index == -1) {
            throw new NoSuchElementException("Cannot delete student: '" + name + "' not found.");
        }

        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[--count] = null;
        System.out.println("Student '" + name + "' deleted.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void displayStudents() {
        if (count == 0) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student List:");
            for (short i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }

        }
    }
}
