package com.example.lab2.sortingAlgorithms;

import java.util.Arrays;

/**
 * This class contains the implementation of the Bubble Sort algorithm.
 */
public class BubbleSort {
    /**
     * Sorts the given array of integers using the Bubble Sort algorithm.
     *
     * @param array the array to be sorted
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

}
