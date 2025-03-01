package my.leetcode;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (k <= 0 || nums.length < k)
            return 0;

        double max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = (double) sum / k;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, (double) sum / k);
        }
        return max;
    }
}
