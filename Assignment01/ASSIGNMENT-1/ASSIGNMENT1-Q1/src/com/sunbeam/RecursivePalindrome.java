package com.sunbeam;

public class RecursivePalindrome {
    public boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(str, left + 1, right - 1);
    }
}
