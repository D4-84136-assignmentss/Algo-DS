package com.sunbeam;


public class main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Print inorder traversal of the BST
        System.out.print("Inorder traversal of BST: ");
        bst.inorderTraversal();
    }
}
