package com.sunbeam;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        SelectionSort selectionSort = new SelectionSort();
        int comparisons = selectionSort.selectionSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Number of comparisons: " + comparisons);
    }
}
