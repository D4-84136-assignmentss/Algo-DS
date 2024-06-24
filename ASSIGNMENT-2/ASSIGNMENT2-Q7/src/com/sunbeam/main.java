package com.sunbeam;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Reverse the array using ArrayReverser
        ArrayReverser.reverseArray(array);

        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}
