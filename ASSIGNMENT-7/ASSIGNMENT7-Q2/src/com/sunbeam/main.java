package com.sunbeam;

public class main {

    public static void main(String[] args) {
        ModeCalculator modeCalculator = new ModeCalculator();

        // Test case 1: Normal array
        int[] array1 = {1, 2, 2, 3, 4, 4, 4, 5};
        Integer mode1 = modeCalculator.calculateMode(array1);
        System.out.println("Mode of array1: " + (mode1 != null ? mode1 : "No mode"));

        // Test case 2: Another array
        int[] array2 = {7, 7, 7, 3, 3, 3, 4, 4};
        Integer mode2 = modeCalculator.calculateMode(array2);
        System.out.println("Mode of array2: " + (mode2 != null ? mode2 : "No mode"));

        // Test case 3: Array with all unique elements
        int[] array3 = {1, 2, 3, 4, 5};
        Integer mode3 = modeCalculator.calculateMode(array3);
        System.out.println("Mode of array3: " + (mode3 != null ? mode3 : "No mode"));

        // Test case 4: Empty array
        int[] array4 = {};
        Integer mode4 = modeCalculator.calculateMode(array4);
        System.out.println("Mode of array4: " + (mode4 != null ? mode4 : "No mode"));

        // Test case 5: Null array
        int[] array5 = null;
        Integer mode5 = modeCalculator.calculateMode(array5);
        System.out.println("Mode of array5: " + (mode5 != null ? mode5 : "No mode"));
    }
}
