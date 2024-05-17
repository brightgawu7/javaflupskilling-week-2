package com.example.lab2.sortingAlgorithms;

import java.util.Arrays;

/**
 * This class contains the implementation of the Selection Sort algorithm.
 */
public class SelectionSort {

    /**
     * Sorts the given array of integers using the Selection Sort algorithm.
     *
     * @param array the array to be sorted
     */
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
