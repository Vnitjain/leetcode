package my.leetcode;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        for (int i = 0; i < prefix.length; i++) {
            int j = nums.length - i - 1;
            prefix[i] = i == 0 ? 1 * nums[i] : prefix[i - 1] * nums[i];
            postfix[j] = i == 0 ? 1 * nums[j] : nums[j] * postfix[j + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int pre = i > 0 ? prefix[i - 1] : 1;
            int post = i < nums.length - 1 ? postfix[i + 1] : 1;
            nums[i] = pre * post;
        }
        return nums;
    };
};