package my.leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i : nums)
            arr[i - 1] = 1;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0)
                result.add(i + 1);
        return result;
    }
}