package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] solution = new int[queries.length];
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int j = 0;
            while (j < nums.length) {
                if (sum + nums[j] <= queries[i])
                    sum += nums[j++];
                else
                    break;
            }

            solution[i] = j;
        }
        return solution;
    }
}
