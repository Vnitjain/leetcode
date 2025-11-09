package my.leetcode;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Integer> remainders = new HashMap<>();
        for (int i = 0; i < hours.length; i++) {
            int remainder = hours[i] % 24;
            if (remainder == 0) {
                finalCount += remainders.getOrDefault(remainder, 0);
            } else {
                finalCount += remainders.getOrDefault(24 - remainder, 0);
            }
            remainders.put(remainder, remainders.getOrDefault(remainder, 0) + 1);
        }
        return finalCount;
    }
}