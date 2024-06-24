package com.sunbeam;

public class LinearSearch {
    public int search(int[] arr, int key) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == key) {
                System.out.println("Key found at index " + i + " with " + comparisons + " comparisons using Linear Search.");
                return comparisons;
            }
        }
        System.out.println("Key not found with " + comparisons + " comparisons using Linear Search.");
        return comparisons;
    }
}
