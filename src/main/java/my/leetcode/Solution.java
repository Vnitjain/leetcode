package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        int i=0;
        while(i<nums.length){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            i+=2;
        }
        return nums;
    }
}
