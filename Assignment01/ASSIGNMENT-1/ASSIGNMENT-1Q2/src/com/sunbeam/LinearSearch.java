package com.sunbeam;

public class LinearSearch {

    // Method to find the last occurrence of the key
    public static int findLastOccurrence(int[] array, int key) {
        int lastIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

}
