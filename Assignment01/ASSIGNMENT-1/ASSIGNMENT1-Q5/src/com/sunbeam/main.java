package com.sunbeam;

public class main {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int key = 70;

        BinarySearchDescending binarySearch = new BinarySearchDescending();
        int result = binarySearch.search(arr, key);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
