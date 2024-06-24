package com.sunbeam;

public class main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();

        // Add a single line of text
        wordCounter.addLine("Hello world! Hello everyone.");

        // Print word counts for the line
        System.out.println("Word counts for the line:");
        wordCounter.printWordCounts();

        // Reset the word counter
        wordCounter = new WordCounter();

        // Process a file of text
        FileProcessor fileProcessor = new FileProcessor(wordCounter);
        String filename = "sample.txt"; // Replace with your file path
        try {
            fileProcessor.processFile(filename);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Print word counts for the file
        System.out.println("Word counts for the file:");
        wordCounter.printWordCounts();
    }
}
