package com.sunbeam;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> wordCounts;

    public WordCounter() {
        wordCounts = new HashMap<>();
    }

    public void addLine(String line) {
        String[] words = line.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", ""); // Normalize word
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }

    public void printWordCounts() {
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
