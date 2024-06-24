package com.sunbeam;

public class main {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        heapSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void heapSort(int[] array) {
        MinHeap minHeap = new MinHeap(array.length);

        // Insert all elements into the min heap
        for (int item : array) {
            minHeap.insert(item);
        }

        // Extract elements from the min heap and put them back into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = minHeap.extractMin();
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
