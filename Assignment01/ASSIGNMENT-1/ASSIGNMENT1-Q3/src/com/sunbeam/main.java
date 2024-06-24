package com.sunbeam;

public class main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;
        
        // Linear Search
        LinearSearch linearSearch = new LinearSearch();
        int linearComparisons = linearSearch.search(arr, key);
        
        // Binary Search
        BinarySearch binarySearch = new BinarySearch();
        int binaryComparisons = binarySearch.search(arr, key);
        
        System.out.println("Total comparisons made:");
        System.out.println("Linear Search: " + linearComparisons);
        System.out.println("Binary Search: " + binaryComparisons);
    }
}
