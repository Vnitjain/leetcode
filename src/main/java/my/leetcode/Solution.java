package my.leetcode;

import java.util.Stack;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < nums.length) {
            if (stack.size() == 3)
                return true;
            while (!stack.empty() && stack.peek() > nums[i]) {
                stack.pop();
            }
            stack.add(nums[i++]);
        }
        return stack.size() >= 3;
    }
}