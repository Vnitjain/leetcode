package my.leetcode;

public class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, zeroCount = 0;
        int max = Integer.MIN_VALUE;
        while (j < nums.length) {
            int currentNumber = nums[j];
            if (currentNumber == 0)
                zeroCount++;

            while (zeroCount > k) {
                if (nums[i] == 0)
                    zeroCount--;
                i++;
            }
            max = Math.max(max, j - i + 1);

            j++;
        }
        return max;
    }
}
