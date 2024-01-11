package my.leetcode;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int p1 = 0, p2 = height.length - 1;
        while (p1 < p2) {
            int left = height[p1];
            int right = height[p2];
            maxArea = Math.max(maxArea, Math.min(left, right) * (p2 - p1));
            if (left > right)
                p2--;
            else
                p1++;

        }
        return maxArea;
    }
}