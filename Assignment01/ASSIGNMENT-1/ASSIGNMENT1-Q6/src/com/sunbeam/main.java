package com.sunbeam;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 2, 6};
        int key = 2;
        int n = 3;

        LinearSearchNthOccurrence linearSearch = new LinearSearchNthOccurrence();
        int result = linearSearch.searchNthOccurrence(arr, key, n);

        if (result != -1) {
            System.out.println("The " + n + "rd occurrence of " + key + " is at index: " + result);
        } else {
            System.out.println("The " + n + "rd occurrence of " + key + " is not found in the array.");
        }
    }
}
