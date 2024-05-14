package com.stingtech;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoNums = new int[2];

        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
            if (nums[i] + nums[j] == target){
                twoNums[0] = j;
                twoNums[1] = i;
                break;
            }
            }
        }
        return twoNums;
    }

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
