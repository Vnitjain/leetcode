package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; --i) {
            int s1 = nums[i], s2 = nums[i + 1], s3 = nums[i + 2];
            if (s1 + s2 > s3) {
                return s1 + s2 + s3;
            }
        }
        return 0;
    }
}
