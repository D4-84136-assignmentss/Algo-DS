package com.sunbeam;

public class main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 2};
        int key = 2;

        // Find the last occurrence of the key
        int lastIndex = LinearSearch.findLastOccurrence(array, key);
        System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
    }
}
