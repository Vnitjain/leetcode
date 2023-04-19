package my.leetcode;

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        long start = 0, end = num;
        while (end >= start) {
            long current = ((int) ((end - start) / 2)) + start;
            if (current * current < num) {
                start = ++current;
            } else if (current * current > num) {
                end = --current;
            } else {
                return true;
            }
        }
        return false;
    }
}