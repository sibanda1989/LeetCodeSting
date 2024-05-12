package com.stingtech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    boolean actual;

    @Test
    void testPalindrome1(){
        actual = solution.isPalindrome(121);
        assertTrue(actual);
    }

    @Test
    void testPalindromeEvenInput(){
        actual = solution.isPalindrome(1001);
        assertTrue(actual);
    }

    @Test
    void testPalindromeFalseOdd(){
        actual = solution.isPalindrome(231);
        assertFalse(actual);
    }

    @Test
    void testPalindromeFalseEven(){
        actual = solution.isPalindrome(23156132);
        assertFalse(actual);
    }

    @Test
    void testPalindromeNegative(){
        actual = solution.isPalindrome(-121);
        assertFalse(actual);
    }
}