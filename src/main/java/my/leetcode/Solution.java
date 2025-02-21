package my.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = max(candies);
        final List<Boolean> finalList = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            finalList.add(candies[i]+extraCandies>=max);
        }
        return finalList;
    }

    private int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}