package com.sunbeam;


public class main {
    public static void main(String[] args) {
        String testStr = "madam";

        ReverseAndCompare reverseAndCompare = new ReverseAndCompare();
        System.out.println("Reverse and Compare: " + reverseAndCompare.isPalindrome(testStr));

        TwoPointer twoPointer = new TwoPointer();
        System.out.println("Two Pointer: " + twoPointer.isPalindrome(testStr));

        RecursivePalindrome recursivePalindrome = new RecursivePalindrome();
        System.out.println("Recursive: " + recursivePalindrome.isPalindrome(testStr));
    }
}
