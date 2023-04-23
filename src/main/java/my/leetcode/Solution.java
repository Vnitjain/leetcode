package my.leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

//https://leetcode.com/problems/remove-letter-to-equalize-frequency/
class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : word.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map.toString());
        boolean oneUsed = false;
        int initialElement = -1;
        for (int i : map.values()) {
            if (initialElement == -1) {
                initialElement = i;
            }

        }
        return true;
    }
}