package my.leetcode;

class Solution {
    public boolean isMonotonic(int[] nums) {
        Boolean increasing = null;
        for (int i = 0; i < nums.length - 1; i++) {
            int difference = nums[i] - nums[i + 1];
            if (difference != 0) {
                if (increasing == null)
                    increasing = difference > 0;
                if (difference > 0 != increasing)
                    return false;
            }
        }
        return true;
    }
}
