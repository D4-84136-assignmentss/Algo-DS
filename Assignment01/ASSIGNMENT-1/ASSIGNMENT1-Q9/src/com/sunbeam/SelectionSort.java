package com.sunbeam;

	public class SelectionSort {
	    public int selectionSort(int[] arr) {
	        int n = arr.length;
	        int comparisons = 0;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                comparisons++;
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }

	        return comparisons;
	    }
	}
