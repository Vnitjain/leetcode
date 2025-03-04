package my.leetcode;

public class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] postfix = new int[length];
        for (int i = 0; i < length; i++)
            prefix[i] = i == 0 ? 0 + nums[i] : prefix[i - 1] + nums[i];
        for (int i = length - 1; i > -1; i--)
            postfix[i] = i == length - 1 ? 0 + nums[i] : nums[i] + postfix[i + 1];
        for (int i = 0; i < length; i++) {
            int pref = i == 0 ? 0 : prefix[i - 1];
            int postf = i == length - 1 ? 0 : postfix[i + 1];
            if (pref == postf)
                return i;
        }
        return -1;
    }
}
