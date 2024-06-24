package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    private WordCounter wordCounter;

    public FileProcessor(WordCounter wordCounter) {
        this.wordCounter = wordCounter;
    }

    public void processFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCounter.addLine(line);
            }
        }
    }
}
