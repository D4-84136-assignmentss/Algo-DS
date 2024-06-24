package com.sunbeam;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Count the occurrences of each element
        for (int num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        // Find the first element with a count of 1
        for (int num : arr) {
            if (elementCount.get(num) == 1) {
                return num;
            }
        }

        return -1; // Return -1 if no non-repeating element is found
    }
}
