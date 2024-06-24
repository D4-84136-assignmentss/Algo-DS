package com.sunbeam;

public class ReverseAndCompare {
    public boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
