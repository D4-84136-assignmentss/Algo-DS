package com.sunbeam;


public class BST {
    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;

    public BST() {
        root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.value + " ");
            inOrderTraversalRecursive(node.right);
        }
    }
}
