package my.leetcode;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeatedNumber = -1, missingNumber = -1;
        int[] visited = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (visited[currentNumber - 1] == 1)
                repeatedNumber = currentNumber;
            else
                visited[currentNumber - 1] = 1;
        }
        for (int i = 0; i < visited.length; i++)
            if (visited[i] == 0)
                missingNumber = i + 1;
        return new int[] { repeatedNumber, missingNumber };
    }
}