package my.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> finalList = new HashSet<>();
        List<Integer> tempList = new ArrayList<>();
        traverse(0, tempList, finalList, Integer.MIN_VALUE, nums);
        return new ArrayList<>(finalList);
    }

    private void traverse(int currentIndex, List<Integer> tempList, Set<List<Integer>> finalList, int prev,
            int[] nums) {
        if (tempList.size() > 1)
            finalList.add(new ArrayList<>(tempList));
        for (int i = currentIndex; i < nums.length; i++) {
            if (nums[i] >= prev) {
                tempList.add(nums[i]);
                traverse(i + 1, tempList, finalList, nums[i], nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}