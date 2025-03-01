package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        int operations = 0;
        nums = Arrays.stream(nums).sorted().toArray();
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                operations++;
                i++;
                j--;
            } else if (sum > k)
                j--;
            else
                i++;
        }
        return operations;
    }
}
