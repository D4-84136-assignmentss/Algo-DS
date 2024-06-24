package com.sunbeam;

public class nthoccur{

    // Method to find the nth occurrence of an element in an array
    public static int findNthOccurrence(int[] arr, int target, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == n) {
                    return i; // return index of nth occurrence
                }
            }
        }

        return -1; // return -1 if nth occurrence is not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 4, 5, 7, 4, 9, 4};
        int target = 4;
        int n = 3; // Find the 3rd occurrence of target element

        int index = findNthOccurrence(arr, target, n);

        if (index != -1) {
            System.out.println("The " + n + "th occurrence of " + target + " is at index " + index);
        } else {
            System.out.println("The " + n + "th occurrence of " + target + " is not found in the array");
        }
    }
}

