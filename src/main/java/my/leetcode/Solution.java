package my.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        Set<Integer> freq = new HashSet<>();
        for (int i : arr)
            count.put(i, count.getOrDefault(i, 1) + 1);
        for (int f : count.values()) {
            if (freq.contains(f))
                return false;
            freq.add(f);
        }
        return true;
    }
}
