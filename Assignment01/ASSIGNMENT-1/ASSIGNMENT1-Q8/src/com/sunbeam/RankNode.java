package com.sunbeam;

public class RankNode {
    int value;
    int leftSize;
    RankNode left;
    RankNode right;

    public RankNode(int value) {
        this.value = value;
        this.leftSize = 0;
        this.left = null;
        this.right = null;
    }

    public void insert(int value) {
        if (value <= this.value) {
            if (this.left == null) {
                this.left = new RankNode(value);
            } else {
                this.left.insert(value);
            }
            this.leftSize++;
        } else {
            if (this.right == null) {
                this.right = new RankNode(value);
            } else {
                this.right.insert(value);
            }
        }
    }

    public int getRank(int value) {
        if (value == this.value) {
            return this.leftSize;
        } else if (value < this.value) {
            if (this.left == null) {
                return -1;
            } else {
                return this.left.getRank(value);
            }
        } else {
            if (this.right == null) {
                return -1;
            } else {
                int rightRank = this.right.getRank(value);
                if (rightRank == -1) {
                    return -1;
                } else {
                    return this.leftSize + 1 + rightRank;
                }
            }
        }
    }
}
