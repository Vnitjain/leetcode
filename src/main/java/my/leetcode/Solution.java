package my.leetcode;

/**
 * Brute Force approach:
 * Simple n^2 approach to compare each element with the other elements and find
 * if the sum is a multiple of 24
 * <hr>
 * abc
 * 
 */
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int finalCount = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                int sum = hours[i] + hours[j];
                if (sum % 24 == 0) {
                    finalCount++;
                }
            }
        }
        return finalCount;
    }
}