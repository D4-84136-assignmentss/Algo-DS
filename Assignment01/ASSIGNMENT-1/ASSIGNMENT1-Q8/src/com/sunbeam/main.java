package com.sunbeam;

public class main {
    public static void main(String[] args) {
        StreamRank streamRank = new StreamRank();

        // Stream of integers
        int[] stream = {5, 1, 4, 4, 5, 9, 7, 13, 3};

        // Track integers in the stream
        for (int value : stream) {
            streamRank.track(value);
        }

        // Get rank of elements
        int[] elementsToFindRank = {1, 3, 4, 13};

        for (int value : elementsToFindRank) {
            int rank = streamRank.getRank(value);
            System.out.println("Rank of " + value + " in the stream is: " + rank);
        }
    }
}
