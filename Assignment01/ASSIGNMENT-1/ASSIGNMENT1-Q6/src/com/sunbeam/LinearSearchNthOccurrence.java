package com.sunbeam;

public class LinearSearchNthOccurrence {
    public int searchNthOccurrence(int[] arr, int key, int n) {
        int occurrence = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                occurrence++;
                if (occurrence == n) {
                    return i;
                }
            }
        }

        return -1; // nth occurrence not found
    }
}
