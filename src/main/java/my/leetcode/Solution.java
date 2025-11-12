package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE, numL = nums.length;
        if (numL <= k)
            return nums[numL - 1] - nums[0];

        for (int i = 0; i < numL - k + 1; i++) {
            int newDiff = nums[i + k - 1] - nums[i];
            min = Math.min(min, newDiff);
        }
        return min;
    }
}