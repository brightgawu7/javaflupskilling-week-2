package com.example.lab2.searchAlgorithms;

/**
 * This class contains the implementation of the Recursive Binary Search algorithm.
 */
public class RecursiveBinarySearch {
    /**
     * Performs a recursive binary search on the given sorted array for the specified target element.
     *
     * @param array  the sorted array to search
     * @param target the element to search for
     * @param left   the left boundary of the search range
     * @param right  the right boundary of the search range
     * @return the index of the target element if found; otherwise, -1
     */
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target is not found
        }

        int middle = left + (right - left) / 2;

        // Check if the target is present at mid
        if (array[middle] == target) {
            return middle; // Return the index of the target element
        }

        // If target is greater, ignore the left half
        if (array[middle] < target) {
            return binarySearchRecursive(array, target, middle + 1, right);
        } else {
            // If target is smaller, ignore the right half
            return binarySearchRecursive(array, target, left, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
