package my.leetcode;

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int start = 0, end = num;
        while (end >= start) {
            int current = ((int) ((end - start) / 2)) + start;
            if (current * current < num) {
                start = current + 1;
            } else if (current * current > num) {
                end = current - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}