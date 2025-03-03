package my.leetcode;

public class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, maxCount = Integer.MIN_VALUE, zeroCount = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0)
                zeroCount++;

            while (zeroCount > 1) {
                if (nums[i] == 0)
                    zeroCount--;
                i++;
            }
            maxCount = Math.max(maxCount, j - i);
        }
        return maxCount;
    }
}
