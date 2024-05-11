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
}