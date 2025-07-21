package my.leetcode;


public class Solution {
    public int partitionString(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int j = 0,count=0;
        while (j < s.length()) {
            int[] seen = new int[26];
            while (j < s.length()&&seen[(int)s.charAt(j)-97]==0) {
                seen[(int)s.charAt(j)-97]++;
                j++;
            }
            count++;
        }
        return count;
    }
}
