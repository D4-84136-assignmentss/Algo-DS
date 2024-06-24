package com.sunbeam;


public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to add a key to the BST
    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    // Recursive helper method to insert a key into the BST
    private Node insertRecursive(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key);
        }

        // Return the unchanged node pointer
        return root;
    }

    // Method to perform inorder traversal of the BST
    public void inorderTraversal() {
        inorderRecursive(root);
        System.out.println();
    }

    // Recursive helper method to perform inorder traversal
    private void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.key + " ");
            inorderRecursive(root.right);
        }
    }
}

