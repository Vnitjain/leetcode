package my.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        for (char c : s.toCharArray()) {
            sum += map.get(c);
        }
        return sum;
    }
}
