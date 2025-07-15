package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
 public int firstUniqChar(String s) {
        int[] map = new int[26];

        for(char c : s.toCharArray()){
            map[(int)c-97]++;
        }
        for(int i=0;i<s.length();i++)
            if(map[(int)s.charAt(i)-97]==1)
                return i;

        return -1;
    }
}
