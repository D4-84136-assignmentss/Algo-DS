package com.sunbeam;

public class InsertionSort {
    private int[] array;
    private int comparisons;

    public InsertionSort(int[] array) {
        this.array = array;
        this.comparisons = 0;
    }

    public int sort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Compare key with each element on the left of it until an element smaller than it is found
            while (j >= 0) {
                comparisons++; // Count the comparison
                if (array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                } else {
                    break;
                }
            }
            array[j + 1] = key;
        }
        return comparisons;
    }

    public int[] getSortedArray() {
        return array;
    }
}
