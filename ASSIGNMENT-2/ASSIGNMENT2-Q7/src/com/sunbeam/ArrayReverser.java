package com.sunbeam;

public class ArrayReverser {
    public static void reverseArray(int[] array) {
        Stack stack = new Stack(array.length);

        // Push elements of array onto stack
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        // Pop elements from stack to reverse the array
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
}
