package my.leetcode;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] solution = new int[2];
        int[] visited = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (visited[currentNumber - 1] == 1)
                solution[0] = currentNumber;
            else
                visited[currentNumber - 1] = 1;
        }
        for (int i = 0; i < visited.length; i++)
            if (visited[i] == 0)
                solution[1] = i + 1;
        return new int[] { solution[0], solution[1] };
    }
}