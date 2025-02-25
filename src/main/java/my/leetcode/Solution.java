package my.leetcode;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : nums) {
            first = num < first ? num : first;
            second = num < second && num > first ? num : second;
            if (num > second)
                return true;
        }
        return false;
    }
}