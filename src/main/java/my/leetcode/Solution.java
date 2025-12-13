package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] prefix = new int[nums.length + 1];
        Arrays.sort(nums);
        for (int i = 1; i < prefix.length; i++)
            prefix[i] = prefix[i - 1] + nums[i - 1];

        for (int i = 0; i < queries.length; i++) {
            int j = 0;
            while (j < prefix.length) {
                if (prefix[j] <= queries[i])
                    j++;
                else
                    break;
            }
            queries[i] = j - 1;
        }
        return queries;
    }
}
