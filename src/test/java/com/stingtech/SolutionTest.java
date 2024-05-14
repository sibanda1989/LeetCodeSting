package com.stingtech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void twoSum() {
        int[] nums = new int[]{2,7,11,15};
        int[] expected = new int[]{0,1};
        int[] actual = solution.twoSum(nums, 9);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum1(){
        int[] nums = new int[]{3,2,4};
        int[] expected = new int[]{1,2};
        int[] actual = solution.twoSum(nums, 6);
        assertArrayEquals(expected, actual);
    }
    @Test
    void testPalindrome1(){
        boolean actual = solution.isPalindrome(121);
        assertTrue(actual);
    }

    @Test
    void testPalindromeEvenInput(){
        boolean actual = solution.isPalindrome(1001);
        assertTrue(actual);
    }

    @Test
    void testPalindromeFalseOdd(){
        boolean actual = solution.isPalindrome(231);
        assertFalse(actual);
    }

    @Test
    void testPalindromeFalseEven(){
        boolean actual = solution.isPalindrome(23156132);
        assertFalse(actual);
    }

    @Test
    void testPalindromeNegative(){
        boolean actual = solution.isPalindrome(-121);
        assertFalse(actual);
    }

    @Test
    void testPalindromeZero(){
        boolean actual = solution.isPalindrome(0);
        assertTrue(actual);
    }
}