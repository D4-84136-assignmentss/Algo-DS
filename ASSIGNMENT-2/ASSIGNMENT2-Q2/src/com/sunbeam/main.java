package com.sunbeam;


public class main {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        // Create an instance of InsertionSortDescending
        InsertionSortDescending insertionSort = new InsertionSortDescending(array);

        // Sort the array in descending order and get the number of comparisons
        int comparisons = insertionSort.sort();

        // Get the sorted array
        int[] sortedArray = insertionSort.getSortedArray();

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

        // Print the number of comparisons
        System.out.println("\nNumber of comparisons: " + comparisons);
    }
}
