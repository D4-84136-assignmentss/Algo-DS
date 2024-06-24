package com.sunbeam;

import java.util.HashMap;
import java.util.Map;

public class ModeCalculator {
    public Integer calculateMode(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = array[0];
        int maxCount = frequencyMap.get(mode);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
