package com.stingtech;

/**
 *Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        //first convert x to a String
        String x_string = String.valueOf(x);

        //loop and compare characters in string
        for (int i = 0; i < ((x_string.length()) / 2); i++){
            if (x_string.charAt(i) != (x_string.charAt(x_string.length()-1-i))){
                return false;
            }
        }
        return true;
    }
}
