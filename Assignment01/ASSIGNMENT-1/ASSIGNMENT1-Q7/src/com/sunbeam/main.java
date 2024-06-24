package com.sunbeam;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};

        FirstNonRepeatingElement firstNonRepeatingElement = new FirstNonRepeatingElement();
        int result = firstNonRepeatingElement.findFirstNonRepeating(arr);

        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("There is no non-repeating element in the array.");
        }
    }
}
