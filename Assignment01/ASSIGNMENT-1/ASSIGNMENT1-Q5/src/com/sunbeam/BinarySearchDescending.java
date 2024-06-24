package com.sunbeam;

public class BinarySearchDescending {
    public int search(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0;

        while (left <= right) {
            comparisons++;
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                System.out.println("Key found at index " + mid + " with " + comparisons + " comparisons using Binary Search.");
                return mid;
            }

            if (arr[mid] > key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Key not found with " + comparisons + " comparisons using Binary Search.");
        return -1;
    }
}
