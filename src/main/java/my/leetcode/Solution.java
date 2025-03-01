package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        int operations = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int difference = k - current;
            if (count.containsKey(difference) && count.get(difference) > 0) {
                count.put(difference, count.get(difference) - 1);
                operations++;
            } else {
                count.put(current, count.getOrDefault(current, 0) + 1);
            }
        }
        return operations;
    }
}
