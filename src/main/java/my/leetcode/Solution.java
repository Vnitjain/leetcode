package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        for (char c : word1.toCharArray())
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        for (char c : word2.toCharArray())
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        if (!freq1.keySet().equals(freq2.keySet()))
            return false;
        Map<Integer, Integer> freq1Freq = new HashMap<>();
        for (int i : freq1.values()) {
            freq1Freq.put(i, freq1Freq.getOrDefault(i, 0) + 1);
        }
        for (int i : freq2.values()) {
            freq1Freq.put(i, freq1Freq.getOrDefault(i, 0) - 1);
        }
        return freq1Freq.values().stream().allMatch((i) -> i == 0);
    }
}
