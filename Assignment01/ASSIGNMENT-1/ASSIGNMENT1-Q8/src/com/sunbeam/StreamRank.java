package com.sunbeam;

public class StreamRank {
    private RankNode root;

    public StreamRank() {
        this.root = null;
    }

    public void track(int value) {
        if (this.root == null) {
            this.root = new RankNode(value);
        } else {
            this.root.insert(value);
        }
    }

    public int getRank(int value) {
        if (this.root == null) {
            return -1;
        } else {
            return this.root.getRank(value);
        }
    }
}
