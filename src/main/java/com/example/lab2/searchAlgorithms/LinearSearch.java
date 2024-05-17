package com.example.lab2.searchAlgorithms;

/**
 * This class contain the Linear Search algorithms.
 */
public class LinearSearch {

    /**
     * Performs a linear search on the given array for the specified target element.
     *
     * @param array  the array to search
     * @param target the element to search for
     * @return the index of the target element if found; otherwise, -1
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
